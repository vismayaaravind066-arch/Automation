package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileupload extends Base{
	public void fileUploadusingsendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload ");
		WebElement fileupload=driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("C:\\Users\\VISMAYA ARAVIND\\git\\Automation\\AutomationCourse\\src\\test\\resources\\Vismaya hr.pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void fileUploadusingrobot() throws AWTException
	{
		driver.navigate().to(" https://www.ilovepdf.com/pdf_to_word");
		WebElement filerobot=driver.findElement(By.id("pickfiles"));
		filerobot.click();
		StringSelection s=new StringSelection("C:\\Users\\VISMAYA ARAVIND\\git\\Automation\\AutomationCourse\\src\\test\\resources\\Vismaya hr.pdf"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot robot=new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
	}

	public static void main(String[] args) {
		HandlingFileupload upload=new HandlingFileupload();
		upload.initialiseBrowser();
	//	upload.fileUploadusingsendkeys();
		try {
			upload.fileUploadusingrobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
