package automation_script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		
		WebDriverManager.firefoxdriver().clearDriverCache().setup();
		WebDriver driver= new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(5000);
				
		System.out.println("Current title is: "+driver.getTitle());
		WebElement UN = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		UN.clear();
		UN.sendKeys("Admin");
		
		WebElement PW = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		PW.clear();
		PW.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		
		//Thread.sleep(5000);
		
		System.out.println("User Logged in successfully--------");

	}

}
