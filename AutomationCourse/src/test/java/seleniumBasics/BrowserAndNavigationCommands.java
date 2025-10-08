package seleniumBasics;

public class BrowserAndNavigationCommands extends Base {
	public void browserCommand()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String source=driver.getPageSource();
		System.out.println(source);
	}

	public static void main(String[] args) {
		BrowserAndNavigationCommands command = new BrowserAndNavigationCommands();
		command.initialiseBrowser();
		command.browserCommand();
		
		// TODO Auto-generated method stub

	}

}
