import java.util.Arrays;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class arrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameList = {"John","Adam","paul"}; 
		String[] nameList2 = new String[3];

		for(int i = 0; i<=nameList2.length;i++)
		{
			nameList2[i]="";
		}
		for(String str:nameList)//for each string inside nameList print;will print the whole array.
		{
			System.out.println(str);
			
		}
		int [] elements = {1,2,3,4,5,8};
		int sum=0;
		for(int x:elements){
			sum+= x;
		}
		int [] elements2 = new int[1000];
		
		Arrays.fill(elements2, -1);
		elements = Arrays.copyOf(elements2, elements2.length);
		}
		
		
	}
