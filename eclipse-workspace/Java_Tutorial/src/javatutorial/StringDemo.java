package javatutorial;

public class StringDemo {
	
	private static float floatVar = 200;
	//private static Object intVar = 2;
	//private static Object stringVar = 3;

	public static void main(String args[])
	{
		char[] helloArray = {'b', 'a', 'b', 'u'};
		
		String helloString = new String(helloArray);
		
		System.out.println(helloString);
		
		System.out.printf("The value of the float variable is %f", floatVar);
	}

}
