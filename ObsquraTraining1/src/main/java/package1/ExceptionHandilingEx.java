package package1;

public class ExceptionHandilingEx {
	public static void main(String args[]) {
		int a=10;
		try {
		System.out.println(a/0);
		}
		catch(Exception e) {
		//catch(ArithmeticException e) -- can also be used like this		{
			System.out.println("Division by 0 is not possible");
		}
		
	}

}
