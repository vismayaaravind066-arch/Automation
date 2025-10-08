package seleniumBasics;

public class BrowserAndNavigationCommands extends Base {
	public void browserCommand()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String source=driver.getPageSource();
		//System.out.println(source);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
	}
	public void navigationCommand()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		BrowserAndNavigationCommands command = new BrowserAndNavigationCommands();
		command.initialiseBrowser();
		//command.browserCommand();
		command.navigationCommand();
		
		// TODO Auto-generated method stub

	}

}
