public class Racer implements Runnable{
	
	
	public static String winner;

	public void race() {
		
		for(int dist = 1;dist<=100;dist++)
		{
			System.out.println("Distance covered by:" +Thread.currentThread().getName()+" is: "+dist+" meters");
			boolean isRaceWon=this.isRaceWon(dist);
			if(isRaceWon) {
				break;
			}
		}
		
	}
		

	public boolean isRaceWon(int tdist)
	{
		boolean isRaceWon= false;
		if((Racer.winner==null)&&(tdist==100))
		{
			String winnerName=Thread.currentThread().getName();
			Racer.winner=winnerName;
			System.out.println("Winner: "+Racer.winner);
			isRaceWon = true;
		}
		else if(Racer.winner==null) {
			isRaceWon= false;}
			else if(Racer.winner!=null) {
				isRaceWon=true;
			}
		return isRaceWon;
		}

	@Override
	public void run() {
		this.race();
		// TODO Auto-generated method stub
		
	}
	}
	
