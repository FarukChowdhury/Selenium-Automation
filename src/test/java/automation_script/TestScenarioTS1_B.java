package automation_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScenarioTS1_B {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver= new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		
		Thread.sleep(10000);
		
		driver.manage().window().maximize();
		
		//System.out.println("Current title is: "+driver.getTitle());
		WebElement UN = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		UN.clear();
		UN.sendKeys("Admin");
		
		WebElement PW = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		PW.clear();
		PW.sendKeys("admin123");
		
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		
		Thread.sleep(5000);
		WebElement directory = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a"));
		//System.out.println("Catch directory--------"+directory);
		directory.click();
		System.out.println("directory click done--------");
		
		Thread.sleep(5000);
		WebElement Text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		Text.sendKeys("ch");
		
		Thread.sleep(5000);
		WebElement drpLocationEle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div"));
		drpLocationEle.click();                                  
		
		//Select drpLocation = new Select(drpLocationEle);
		//drpLocation.selectByVisibleText("HQ - CA, USA"); 
		Thread.sleep(1000);
		WebElement drpLocationOpt = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[3]"));
		drpLocationOpt.click();                                   
		
		Thread.sleep(5000);		
		WebElement srcbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		srcbtn.click();
		System.out.println("Location Search done--------");
		
		Thread.sleep(5000);
		WebElement drpdwn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		drpdwn.click();
		
		Thread.sleep(1000);
		WebElement drpUserEle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
		drpUserEle.click();
		//Select drpUser = new Select(drpUserEle);
		//drpUser.selectByVisibleText("Logout"); 
		System.out.println("User Log out successfully--------");
	}

}
