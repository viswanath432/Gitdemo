package Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		String ActualTitle = driver.getTitle();
		
		if(ActualTitle.equals("Your Store"))
		{
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	
		if(ActualTitle.equals("Your Store updated"))
		{
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}

	}

}
