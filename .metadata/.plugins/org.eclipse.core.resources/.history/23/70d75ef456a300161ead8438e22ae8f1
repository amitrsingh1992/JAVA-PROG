
import java.util.Scanner;

public class Triple{
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("Please Enter the no. of Elements");
		int size = n.nextInt();
		int count = 0;
		int array[] = new int[size];
		//taking array of numbers from user
		for(int i=0;i<size;i++){
			System.out.println("Please enter element at position "+(i+1));
			array[i] = n.nextInt();
		}
		
		//to find triples
		for(int i=0;i<size-2;i++){
			for(int j=i+1;j<size-1;j++){
				for(int k=j+1;k<size;k++){
					if(array[i]+array[j]+array[k] == 0){
						System.out.println("Triples are :"+array[i]+" "+array[j]+" "+array[k]);
						count ++;
					}
				}
			}
		}
		if(count != 0)
			System.out.println("Total number of Tripels in given list is: "+count);
		else
			System.out.println("Triples are Not Present");
		n.close();
	}
}