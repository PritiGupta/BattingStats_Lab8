import java.util.Scanner;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class AtBat {

	
	Result resultParam;
	//String basesEarned;

	public enum Result{
			
			OUT, SINGLE, DOUBLE, TRIPLE, HOMERUN
		}

	public static int getValidInt(Scanner scan) {
		while(!scan.hasNextInt()){//use hasNexInt to check if input # is a integer
			System.out.println("Please enter a valid number");
			scan.nextLine();
		}
			int number = scan.nextInt();
			scan.nextLine();
			return number;
}
   	//calculates batting average= #of non zero runs AtBat / # of AtBat
	public static double battingAve(int batAt, int batAtNum) {

		double batterAverage = (double)batAt / (double)batAtNum;//casting int to double
		
		return batterAverage;

	}
//calculates slugging percentage = total num of runs / # of AtBat
	public static double sluggingPercent(int sumOfRuns, int batAtNum) {
		double sluggerPercent = (double)sumOfRuns / (double)batAtNum;
		return sluggerPercent;

	}