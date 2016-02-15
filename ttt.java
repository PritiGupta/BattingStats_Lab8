import java.util.Arrays;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class ttt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int  count,max;
		
	int [] elements ={3,7,3,5,6,8,7,5,3,2,1,0,0,1,1,1,7,8,9,15};
	/**		Arrays.sort(elements);
		int[]elements2 = new int[elements.length + 1];
		for(int index: elements){
		{
			
			//count+= count;
		}
			//System.out.println(Arrays.));
		}
		
		*/
	 max=17;
	
	 for(int x:elements){//max number
		 
		 if (x> max){
		max = x	;	
		}
	 } 
		 int[]freq = new int[max+1];
		
		 for(int x:elements){
			 freq[x]++;
		 }
		 for(int i=0;i<freq.length;i++){
			 
			 System.out.println("freq is" + i+ "is = " + freq[i]);
		 }
	 }
	
	
	}

