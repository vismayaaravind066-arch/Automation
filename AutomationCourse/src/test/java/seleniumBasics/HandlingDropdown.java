package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {
	public void verifyDropdown() 
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.id("dropdowm-menu-1"));
		
		
		Select select=new Select(dropdown1);
		//select.selectByIndex(2);
		//select.selectByValue("java");
		select.selectByVisibleText("C#");   
		
		
	}
	
	public void verifyCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check=driver.findElement(By.xpath("//input[@value='option-2']"));
		check.click();
	}
	public void verifyCheckboxbutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio=driver.findElement(By.xpath("//input[@value='yellow']"));
		radio.click();
		System.out.println(radio.isSelected());
	
	}
	
	

	public static void main(String[] args) {
		HandlingDropdown element=new HandlingDropdown();
		element.initialiseBrowser();
		//element.verifyDropdown();
		//element.verifyCheckbox();
		element.verifyCheckboxbutton();
		// TODO Auto-generated method stub

	}

}
