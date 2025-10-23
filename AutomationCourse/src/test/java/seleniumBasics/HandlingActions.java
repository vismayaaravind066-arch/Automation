package seleniumBasics;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	public void verifyDraganddrop()
	{
		driver.navigate().to(" https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}
	public void verifyKeyboardaction() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		HandlingActions action= new HandlingActions(); 
		action.initialiseBrowser();
		//action.verifyRightclick();
		//action.verifyMousehover();
		//action.verifyDraganddrop();
		try {
			action.verifyKeyboardaction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
