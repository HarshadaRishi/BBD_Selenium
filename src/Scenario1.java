import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://qatechhub.com/");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		System.out.println("Current URL: "+driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
		
	}

}
