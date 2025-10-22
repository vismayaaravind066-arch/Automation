package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class HandlingFrames extends Base {
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframe=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement framehandling=driver.findElement(By.id("sampleHeading"));
		System.out.println(framehandling.getText());
		driver.switchTo().defaultContent();
		
	}

	public static void main(String[] args) {
		HandlingFrames frame=new HandlingFrames();
		frame.initialiseBrowser();
		frame.verifyFrames();
		
		
		// TODO Auto-generated method stub

	}

}
