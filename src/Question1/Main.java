package Question1;
 import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		
		 for(int i=0;i<size;i++) {
			 
			 System.out.println("Enter the elements in the array");
			 
			 arr[i]=sc.nextInt();
			 
		 }
		
		try {
		System.out.println("Enter the index of the array element you want to access");
		
		int index=sc.nextInt();
		
		System.out.println("The array element at index"+ index +  "="  +arr[index] );
		
		System.out.println("The array element successfully accessed");
		}
		
		catch(ArrayIndexOutOfBoundsException ar){
			System.out.println(ar);
		}
		
		catch(NumberFormatException nu) {
			System.out.println(nu);
		}

	}

}
