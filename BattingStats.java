import java.math.BigDecimal;
import java.util.*;

//import AtBat.Result;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class BattingStats {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] batter = null;
		int batCount;
		int numAtBat = 0;
		int sum = 0;
		int numOfBatters = 0;
		BigDecimal bd = null,bds = null;
		Scanner scan = new Scanner(System.in);
		int cols,i;

		System.out.println("*******Welcome to the Grand Circus Batting & Slugging Caclulator*********");
		System.out.println("*************************************************************************");
		System.out.println("Please enter number of batters: ");
					
			numOfBatters = getValidInt(scan);
			 batter = new int[numOfBatters][];
                       
			 for (i = 0; i <numOfBatters; i++) {
					System.out.println("Please enter a  number of at Bats");
					numAtBat = getValidInt(scan);
				 batter[i] = new int[numAtBat];//for each batter take the num of AtBats and accordingly make the array cols 
				System.out.println("0=OUT,1 =SINGLE, 2 = DOUBLE,3 = TRIPLE,4 = HOMERUN ");
				batCount = 0;
				for (cols = 0; cols < numAtBat; cols++) {
					
						System.out.println("Result for At Bat:" + cols + " = ");
						batter[i][cols] = getValidInt(scan);
					
					if (batter[i][cols] > 0 && batter[i][cols] <= numAtBat) {
						batCount++;// counter for #of nonzero AtBats
						sum = sum + batter[i][cols];//calculating the total # of runs
							
					}else
						sum = sum +batter[i][cols];
					}
					double batAv = battingAve(batCount, numAtBat);
					double slugPer = sluggingPercent(sum, numAtBat);
					bd = new BigDecimal(batAv);//using BigDecimal for decimal precision
					bds = new BigDecimal(slugPer);
					//rounding up after the 3rd decimal place
					System.out.println("Batting Average:" + bd.setScale(3, BigDecimal.ROUND_UP));
					System.out.println("Slugging percentage:" + bds.setScale(3, BigDecimal.ROUND_UP));
					System.out.println("*************************************************************************");
					System.out.println();
					
			}
				System.out.println("bye bye");	
				scan.close();//exiting after printing the stats for # of batters
				System.exit(0);
			}
		//validates integer input
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

	
		
	

}
