import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.yahoo.com/");
		List<WebElement> links=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/ol[2]/li[1]/div[1]/div[1]/ul[1]/li[1]"));		
		
		for(WebElement allinks:links)
		{
			System.out.println("The number of links is: "+links.size());
			System.out.println(allinks.getText()+"-"+allinks.getAttribute("href"));			
		}

		//driver.close();
		driver.quit();
	}

}
