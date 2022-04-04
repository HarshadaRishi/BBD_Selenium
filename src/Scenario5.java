import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario5 
{

	public static void main(String[] args) 
	{

		// MicrosoftEdge
		System.setProperty("webdriver.edge.driver","C:\\Users\\Harshu\\Downloads\\edgedriver_win64\\edgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		
		driver1.manage().window().maximize();
		driver1.navigate().to("https://www.myntra.com");
		driver1.findElement(By.xpath("//body/div/div/div/header/div/nav/div/div[2]/div[1]/a[1]")).click();
		driver1.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//picture[1]//img[1]")).click();
		driver1.findElement(By.className("sort-sortBy")).click();
		driver1.findElement(By.className("sort-label")).click();
		driver1.findElement(By.xpath("//div[5]//ul[1]//li[2]//label[1]//div[1]")).click();
		driver1.findElement(By.xpath("//div[7]//ul[1]//li[4]//label[1]")).click();
		driver1.findElement(By.xpath("//div[5]//ul[1]//li[2]//label[1]")).click();		
		driver1.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]")).click();
		driver1.findElement(By.cssSelector("div div div div div div div div div div div div:nth-child(1) span:nth-child(1)")).click();
		driver1.findElement(By.xpath("//body/div[@id='mountRoot']/div/div[@class='application-base']/main[@class='search-base']/div[@class=' row-base']/div[@class='search-rightContainer column-base']/div[@id='desktopSearchResults']/div[@class='search-searchProductsContainer row-base']/section/ul[@class='results-base']/li[2]/div[4]/span[1]")).click();
		
		
	}

}
