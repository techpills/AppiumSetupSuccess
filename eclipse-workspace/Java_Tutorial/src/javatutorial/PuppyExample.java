package javatutorial;

public class PuppyExample {
	
	int puppyAge;
	
	public PuppyExample(String name)
	{
		System.out.println("Name chosen is " +name);
	}
	
	public void setAge(int age)
	{
		puppyAge = age;
	}
	
	public int getAge( )
	{
		System.out.println("Puppy age is " +puppyAge);
		return puppyAge;
		
	}

	public static void main(String args[])
	{
		PuppyExample pe = new PuppyExample("Viknesh");
		
		pe.setAge(2);
		
		pe.getAge();
		
		System.out.println("Variable Value of int "+pe.puppyAge);
	}
}
