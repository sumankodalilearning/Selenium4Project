package demo;

public class ExceptionHandlingDemo2 {
	
	public static void main(String[] args) {
	try {
		demo();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		
	}		
		
		public static void demo() throws Exception {
			System.out.println("Hello World!");
			
			throw new Exception("This is not a valid operation");
			//int i = 1/0; --> you can uncomment and comment above statement
			//System.out.println("Completed"); --> this statement will not be reachable
		}
}

