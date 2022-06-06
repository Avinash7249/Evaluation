package Question2;

public class Main {

	public static void main(String[] args) {
		
		try {
		
		Loan loan=Loan.getAObject();
		PermanentEmployee pe=new PermanentEmployee(123,"Ram",1500);
		
		System.out.println("Permanent Employee :"+loan.calculateLoanAmount(pe));
		
		TemporaryEmployee te=new TemporaryEmployee(444,"raj",1000,1500);
		
		
		System.out.println("Temporary  Employee  :"+loan.calculateLoanAmount(te));
		
		System.out.println("By passing as null value  :"+loan.calculateLoanAmount(null));
		}catch(NullPointerException e) {
			System.out.println("By passing as null value error");
		}
	}

}
