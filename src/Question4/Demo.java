package Question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	
	public static void main(String[] args) {
		Customer customer=new Customer();
		
    	Demo d=new Demo();
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter name");
    	String name=sc.nextLine();
    	customer.setUsername(name);
    	
    	System.out.println("Enter Mobile number");
    	String mobile=sc.nextLine();
    	customer.setMobileNumber(mobile);
    	
    	System.out.println("Enter Password");
    	String pass=sc.nextLine();
    	customer.setPassword(pass);
    	
    	System.out.println("Enter E-Mail");
    	String email=sc.nextLine();
    	customer.setEmail(email);
		
		if((Pattern.matches("[6789]{1}\\d{9}", mobile))
				&& (Pattern.matches("[a-zA-Z]{3,8}", name))
				&&(Pattern.matches("[a-zA-Z0-9]{3,8}", pass))
				&&(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email))) {
			
			
			 System.out.println("the customer name is :"+customer.getUsername());
			    System.out.println("the customer Mobile Number is :"+customer.getMobileNumber());
			    System.out.println("The Password is :"+customer.getPassword());
			    System.out.println("E-Mail is :"+customer.getEmail());	
			
	}else {
		 System.out.println("validation error ");
	}
		
	}

}
