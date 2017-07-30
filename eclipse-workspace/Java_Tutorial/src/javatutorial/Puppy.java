package javatutorial;

public class Puppy {
	
	public Puppy(String name)
	{
		System.out.println("Passed name :" +name);
		
	}
	
	public Puppy()
	{
		System.out.println("Passed name :");
		
	}

	
	public static void main(String args[])
	{
		Puppy myPuppy = new Puppy("Tommy");
		String name = "viknesh";
		System.out.println("Passed name :" +name );
		//Puppy myPuppy1 = new Puppy("Viknesh");
		
	}
}
