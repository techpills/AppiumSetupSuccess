package javatutorial;

import javatutorial.FreshJuice.FreshJuiceSize;

class FreshJuice {
	
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
	FreshJuiceSize size;
}
public class FreshJuiceTest
{
	private FreshJuiceSize size;

	public static void main(String arg[])
	{
		FreshJuiceTest juice = new FreshJuiceTest();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		  System.out.println("Size: " + juice.size);
		
	}

}