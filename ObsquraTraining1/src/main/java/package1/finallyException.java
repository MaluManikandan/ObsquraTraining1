package package1;

public class finallyException {
	public static void main(String args[]) {
		//System.out.println(a[5]);
		
		 int b[] = new int[5];
		
		try {
		System.out.println(b[5]);
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array length exceeded"+e);
		}*/
		catch(Exception e) {
			System.out.println("Array"+e);
		}
		
		finally {
			System.out.println("final code");
		}
		
	}

}
