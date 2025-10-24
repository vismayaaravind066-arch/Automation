package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {
	public void verifySimplealert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simple=driver.findElement(By.id("alertButton"));
		simple.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void verifyConfirmalert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirm=driver.findElement(By.id("confirmButton"));
		confirm.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}
	public void verifyPromptalert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement prompt=driver.findElement(By.id("promtButton"));
		prompt.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("vismaya");
		al.accept();
		
	}

	public static void main(String[] args) {
		HandlingAlert alert=new HandlingAlert();
		alert.initialiseBrowser();
		//alert.verifySimplealert();
		//alert.verifyConfirmalert();
		alert.verifyPromptalert();     
	
		
		
		
		// TODO Auto-generated method stub

	}

}
