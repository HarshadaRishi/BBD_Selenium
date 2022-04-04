import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario5A 
{

	public static void main(String[] args) 
	{
		//Firefox 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Harshu\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		
		driver2.manage().window().maximize();
		driver2.navigate().to("https://www.myntra.com");
		driver2.findElement(By.xpath("//body/div/div/div/header/div/nav/div/div[2]/div[1]/a[1]")).click();
		driver2.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//picture[1]//img[1]")).click();
		driver2.findElement(By.className("sort-sortBy")).click();
		driver2.findElement(By.className("sort-label")).click();
		driver2.findElement(By.xpath("//div[5]//ul[1]//li[2]//label[1]//div[1]")).click();
		driver2.findElement(By.xpath("//div[7]//ul[1]//li[4]//label[1]")).click();
		driver2.findElement(By.xpath("//div[5]//ul[1]//li[2]//label[1]")).click();		
		driver2.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]")).click();
		driver2.findElement(By.cssSelector("div div div div div div div div div div div div:nth-child(1) span:nth-child(1)")).click();
		driver2.findElement(By.xpath("//body/div[@id='mountRoot']/div/div[@class='application-base']/main[@class='search-base']/div[@class=' row-base']/div[@class='search-rightContainer column-base']/div[@id='desktopSearchResults']/div[@class='search-searchProductsContainer row-base']/section/ul[@class='results-base']/li[2]/div[4]/span[1]")).click();
		

	}

}
