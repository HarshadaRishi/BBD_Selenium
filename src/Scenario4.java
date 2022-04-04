import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com");
		driver.findElement(By.xpath("//body/div/div/div/header/div/nav/div/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//picture[1]//img[1]")).click();

		driver.findElement(By.className("sort-sortBy")).click();
		driver.findElement(By.className("sort-label")).click();
	//	driver.findElement(By.xpath("1")).click();
		
		//driver.findElement(By.xpath("//div[4]//ul[1]//li[8]//label[1]")).click();
		driver.findElement(By.xpath("//div[5]//ul[1]//li[2]//label[1]//div[1]")).click();
		driver.findElement(By.xpath("//div[7]//ul[1]//li[4]//label[1]")).click();
		driver.findElement(By.xpath("//div[5]//ul[1]//li[2]//label[1]")).click();
		
		driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]")).click();
		driver.findElement(By.cssSelector("div div div div div div div div div div div div:nth-child(1) span:nth-child(1)")).click();
			
		
		driver.findElement(By.xpath("//body/div[@id='mountRoot']/div/div[@class='application-base']/main[@class='search-base']/div[@class=' row-base']/div[@class='search-rightContainer column-base']/div[@id='desktopSearchResults']/div[@class='search-searchProductsContainer row-base']/section/ul[@class='results-base']/li[2]/div[4]/span[1]")).click();
		
		
		
		

	}

}
