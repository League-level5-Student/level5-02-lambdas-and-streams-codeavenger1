package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				String str = new StringBuffer(s).reverse().toString();
				System.out.println(str);
			}
		}, "watermelon");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) ->{
			for (int i = 0; i < s.length(); i++) {
				String str = "";
				str = str;
				System.out.println(str);
			}
		}, "watermelon");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) ->{
			for (int i = 0; i < s.length(); i++) {
				String str = "";
				str += s.charAt(i) + ".";
				System.out.println(str);
			}
		}, "watermelon");
		
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
