/*
 * 9.Create a class named App that has a main method.
10.In this class instantiate an instance of each of your logger classes that implement the Logger interface.
 */
public class App {

	public static void main(String[] args) {
		
		AsteriskLogger aLogger = new AsteriskLogger();
		aLogger.LogMethod("Hello");
		aLogger.ErrorMethod("Error:Hello");
		
		SpacedLogger sLogger = new SpacedLogger();
		sLogger.LogMethod("Hello");
		sLogger.ErrorMethod("Hello");
	}

}
