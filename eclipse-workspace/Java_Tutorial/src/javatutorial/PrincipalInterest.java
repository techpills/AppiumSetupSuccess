package javatutorial;

public class PrincipalInterest {
	
		public static void main(String args[])
		{
			double principal;
			double rate;
			double interest;
			
			principal = 17000;
			rate = 0.025;
			interest = principal * rate;
			
			principal = principal + interest;
			
			System.out.print("Interest earned for the Principal Amount of 17000 is ");
			System.out.println(interest);
			
			System.out.print("The Principal amount after added interest is ");
			System.out.println(principal);
			
			
		}

}
