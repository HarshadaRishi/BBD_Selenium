import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.yahoo.com/");
		List<WebElement> links=driver.findElements(By.xpath("//body/div[@id='purple-syc']/div[@id='bd']/ol/li/div/div/ul/li/div[2]"));
		System.out.println("The number of links is: "+links.size());
		
		
		for(WebElement allinks:links)
		//for(int i=0;i<links.size();i++)
		{
			System.out.println(allinks.getText()+"-"+allinks.getAttribute("href"));
			
		//	System.out.println(i+":"+links.get(i).getText());
			
			
		}
		
		
		//driver.close();
		
		
		
	}

}
