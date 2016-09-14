/**
* The Array Sum program implements a simple sum for the given array
*
* @author  vignan cheruku
* @version 1.0
*/
import java.util.ArrayList;
import java.util.Scanner;
public class ArraySum {
	
	static int sum(ArrayList<Integer> arrayList){
		int i, sum=0;
		for(i=0;i<arrayList.size();i++){
			sum = sum + arrayList.get(i);
		}
		return sum;
	}
	

	public static void main(String args[]){
		
	//Implementation for to calculate sum for given n number	
	System.out.println("How many integers would you like to add ");
	Scanner numSc = new Scanner(System.in);
	int num = numSc.nextInt();
	ArrayList<Integer> arraylist = new ArrayList<Integer>();	
	
	System.out.println("please insert number of Integers for Sum ");
	Scanner numSc1 = new Scanner(System.in);
	while(arraylist.size()<=num-1)
	{
	 int i = numSc1.nextInt();
	 arraylist.add(i);  
	}
	
	int total= sum(arraylist);
	System.out.println("Total is "+total);

	numSc1.close();

}
}
