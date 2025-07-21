package Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://practice.expandtesting.com/dynamic-table");
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		List<WebElement> rows  =driver.findElements(By.xpath("//table[@class ='table table-striped']/tbody/tr"));
		//System.out.println(rows.size());
		for(int r=1;r<=rows.size();r++)
		{
		WebElement name = driver.findElement(By.xpath("//table[@class ='table table-striped']/tbody/tr["+r+"]//td[1]"));
			System.out.println(name.getText());
			if(name.getText().equals("Systems")) {
		String CPUload  = driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
		String value  = driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
			if (value.contains(CPUload))
			{
				System.out.println("CPUload is matched with value");
			}
			else {
				System.out.println("CPUload is not matched with value");
			}
			break;
			}
			
			
		}
		
			
		
		

	}

}
