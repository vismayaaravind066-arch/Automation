package seleniumBasics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	public void verifyRightclick()
	{
		WebElement other=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.contextClick(other).build().perform();
		
	}
	public void verifyMousehover()
	{
		WebElement other=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.moveToElement(other).build().perform();
	
	}

	public static void main(String[] args) {
		HandlingActions action= new HandlingActions();
		action.initialiseBrowser();
		//action.verifyRightclick();
		action.verifyMousehover();
		// TODO Auto-generated method stub

	}

}
