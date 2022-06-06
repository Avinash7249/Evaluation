package Question3;

import java.util.Scanner;
public class Demo {
	
	void showDetails(Month m){
		
		try {
		
		if(m==m.january) {
			System.out.println("This is the 1st Month of the Year January");
		}
		else if(m==m.february) {
			System.out.println("This is the 2nd Month of the Year February");
		}
		else if(m==m.march) {
			System.out.println("This is the 3rd Month of the Year March");
		}
		else if(m==m.april) {
			System.out.println("This is the 4th Month of the Year April");
		}
       else if(m==m.may) {
    	   System.out.println("This is the 5th Month of the Year May");
		}
       else if(m==m.june) {
    	   System.out.println("This is the 6th Month of the Year June");
		}
       else if(m==m.july) {
    	   System.out.println("This is the 7th Month of the Year July");
		}
       else if(m==m.august) {
    	   System.out.println("This is the 8th Month of the Year Agust");
		}
       else if(m==m.september) {
    	   System.out.println("This is the 9th Month of the Year September");
		}
       else if(m==m.october) {
    	   System.out.println("This is the 10th Month of the Year October");
		}
       else if(m==m.november) {
    	   System.out.println("This is the 11th Month of the Year November");
		}
       else if(m==m.december) {
    	   System.out.println("This is the 12th Month of the Year December");
		}
		
		}
		catch(IllegalArgumentException e) {
			System.out.println("Invalid Month Name");
		}
		
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Month Name");
		
		String m=sc.next();
		
		String month=m.toLowerCase();
		
		
		try {
			Month m1=Month.valueOf(month);
			Demo d=new Demo();
			d.showDetails(m1);
			
		
		}
		catch(IllegalArgumentException a) {
			System.out.println("Invalid Month Name");
		}
	}

}
