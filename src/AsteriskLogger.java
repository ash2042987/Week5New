/*
 * 3.Create two classes that implement the Logger interface
a.AsteriskLogger
b.SpacedLogger
4.The log method on the AsteriskLogger should print out the String it receives 
between 3 asterisks on either side of the String (e.g. if the String passed in is 
“Hello”, then it should print ***Hello*** to the console.
5.The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
 with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
 */
public class AsteriskLogger implements Logger {

	@Override
	public void LogMethod(String input) {
		// dont forget asterisks 
		String result = "";
		result = "***" + input + "***";
		System.out.println(result);
	}

	@Override
	public void ErrorMethod(String input) {
		// need a BOX!
		int size = input.length();
		String line1 = "***";
		String line2 = "***";
		String line3 = "***";
		for(int i = 0; i< input.length(); i++){
			line1 += "*";
			line2 += input.charAt(i);
			line3 += "*";
	}
		line1 += "***";
		line2 += "***";
		line3 += "***";
		
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
}
}

