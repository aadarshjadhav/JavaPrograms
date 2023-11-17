package diwalitest5;

public class FinalStringConcat {
	
		public static void main(String[] args) {
			String s1 = "something";
			final String s2 = "anything";
			String s3 = "something".concat(s2);
			System.out.println("s3: "+ s3);
			String s4 = "something".concat("anything");
			System.out.println("s4: "+ s4);
			
			System.out.println(s3 == s4);
			
			String s5 = "something" + (s2);
			System.out.println("s5: "+ s5);
			String s6 = "something" + "anything";
			System.out.println("s6: "+ s6);
			
			System.out.println(s5 == s6);
		
			
	}


}
