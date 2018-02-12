
public class TestTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accept a double from command line
		Double salaryDb1 = new Double(args[0]);
		if(salaryDb1.isNaN()) {
			System.out.println("Salary is notvalid: " + salaryDb1);

		} else {
		double salary = salaryDb1.doubleValue();
		
		String salaryStr = String.valueOf(salary);
		
		System.out.println(salaryStr);

		
		

	}

}
}
