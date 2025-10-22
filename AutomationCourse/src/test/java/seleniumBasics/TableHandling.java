package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table=driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(table.getText());
		WebElement row=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(row.getText());
		WebElement column=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]/td[1]"));
		System.out.println(column.getText());
	}

	public static void main(String[] args) {
		TableHandling handle=new TableHandling();
		handle.initialiseBrowser();
		handle.verifyTable();
		// TODO Auto-generated method stub

	}

}
