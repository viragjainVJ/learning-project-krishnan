public class DeadlockSolved {
   public static Object Lock1 = new Object();
   public static Object Lock2 = new Object();
   
   public static void main(String args[]) {
	   TD1 T1 = new TD1();
	   TD2 T2 = new TD2();
      T1.start();
      T2.start();
   }
   
   private static class TD1 extends Thread {
	   public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 1: Holding lock 1...");
	            
	            try {
	               Thread.sleep(10);
	            } catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2...");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 1: Holding lock 1 & 2...");
	            }
	         }
	      }
   }
   private static class TD2 extends Thread {
	   public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 2: Holding lock 1...");
	           
	            try {
	               Thread.sleep(10);
	            } catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 2...");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 2: Holding lock 1 & 2...");
	            }
	         }
	      }
	   } 
}
