package Sessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();*/
		
		/*Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert myalert1 = driver.switchTo().alert();
	myalert1.sendKeys("Text");
	myalert1.accept();*/
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth111");
	
		driver.get("sbdbforums");
		
		driver.get("Google.com");
		
		
		
			
		
			
		
	}

}
