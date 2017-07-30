package javatutorial;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayList1 {
	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();

		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("https://www.facebook.com");
		al.add("https://www.google.com");
		al.add("http://www.techyvicky.com");
		al.add("http://www.qafreaks.com");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
			//driver.get(al.get(i));
			//Thread.sleep(3000);
		}
		System.out.println(al);
		
		for(String url : al)
		{
			//driver.get(url);
		}
		
		boolean result = al.isEmpty();
		
		if(al.size() != 0)
		{
			System.out.println("Array list is not empty");
		}
		
		Iterator itr = al.listIterator();
		while(itr.hasNext())
				{
			System.out.println(itr.next());
		}
		
		String[] itemArray = new String[al.size()];
		String[] returnedArray = al.toArray(itemArray);
		
		for(String s : returnedArray)
		System.out.println(s);
		
		
	}

}
