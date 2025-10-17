package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElements extends Base{
	
	public void verifyCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
		WebElement message= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("vismaya");
		
		WebElement showbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showbutton.isDisplayed());
		System.out.println(showbutton.isEnabled());
		showbutton.click();
		WebElement yourtext=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourtext.getText());
		WebElement gettotalbutton=driver.findElement(By.id("button-two"));
		System.out.println(gettotalbutton.getTagName());
		
		System.out.println(showbutton.getCssValue("background-color"));
		
		
		
		
		
	}

	public static void main(String[] args) {
	    WebElements element= new WebElements();
	    element.initialiseBrowser();
	    element.verifyCommands();
		// TODO Auto-generated method stub

	}

}
