package Question2;

public class Loan  {
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof TemporaryEmployee) {
			
			TemporaryEmployee p=(TemporaryEmployee)employeeObj;
			double lone=(0.15*p.getSalary());
			
			return lone;
		}else {
			PermanentEmployee p=(PermanentEmployee)employeeObj;
			double lone=(0.10*p.getSalary());
			
			return lone;
		}
		}
		
	private Loan() {
		
	}
   
   public static Loan getAObject(){
	   Loan lone=new Loan();
	   return lone;
	   }


}
