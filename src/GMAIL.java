import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GMAIL {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\T\\geckodriver.exe");
		
		WebDriver  driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("meravali143");
		
		

	}

}
