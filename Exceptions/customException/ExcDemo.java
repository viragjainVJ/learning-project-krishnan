import java.util.Scanner;

public class ExcDemo{
	 static void validateInput(int number) throws InvalidInputException {
	        if(number>100){
	            throw new InvalidInputException("Input is greater than 100");
	        }else{
	            System.out.println("The provided input is valid");
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number less than 100 :  ");
	        int number = scanner.nextInt();
	        try{
	            validateInput(number);
	        }catch(InvalidInputException e){
	           System.out.println(e);
	        }
	    }
	}

	class InvalidInputException extends Exception{
		String str1;
		InvalidInputException(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException Occurred: "+str1) ;
		   } 
	    
}
