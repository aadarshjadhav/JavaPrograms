package diwalitest5;

public class StringSomething {

		public static void main(String[] args) {
			String str1 = "something";
			String str2 = str1.intern();
			String str3 = new String("something");
			String str5 = new String("something");
			String str4 = str3.intern();
			String str6 = new String();
			str6 = str5.intern();
			
//			System.out.println(str2 == str4);
//			System.out.println(str2.hashCode() == str3.hashCode());
			
			System.out.println("str1 hashcode:" + str1.hashCode());
			System.out.println("str2 hashcode:" + str2.hashCode());
			System.out.println("str3 hashcode:" + str3.hashCode());
			System.out.println("str4 hashcode:" + str4.hashCode());
			System.out.println("str5 hashcode:" + str5.hashCode());
			System.out.println(str4 == str6);
			
			
			System.out.println("str1 intern:" + str1.intern());
			System.out.println("str2 intern:" + str2.intern());
			System.out.println("str3 intern:" + str3.intern());
			System.out.println("str4 intern:" + str4.intern());
			System.out.println("str5 intern:" + str5.intern());
			
		} 


}
