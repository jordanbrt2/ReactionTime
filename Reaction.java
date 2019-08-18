import java.util.Scanner;

/*
 A program that records your reaction time to input something 
 
 Inspired by reaction time taken in sprinting for 100M to record false starts 
 */
public class Reaction {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("On your marks");
		// Slows down the rate of code in milliseconds 
		Thread.sleep(1000);
		System.out.println("Get set");
		Thread.sleep(1000);
		System.out.println("GO!");
		
		
		// Starts time
		
		long StartTime = System.currentTimeMillis();
		
		// Get user input 
		Scanner scan = new Scanner(System.in);
		scan.next();
		
		long StopTime = System.currentTimeMillis();
		
		long ReactionTime = StopTime - StartTime;
		
		
		System.out.println("Your reaction time is " +ReactionTime + " seconds");
		
		
		
		
		
	  
		

	}

}
