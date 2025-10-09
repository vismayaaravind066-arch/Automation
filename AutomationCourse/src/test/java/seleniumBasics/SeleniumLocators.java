package seleniumBasics;

import org.openqa.selenium.By;

public class SeleniumLocators extends Base {
	public void verifyLocators()
	{
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
