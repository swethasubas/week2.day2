package week2.Day2.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Link.html");
        
        //Go to Home Page
        driver.findElement(By.linkText("Go to Home Page")).click();
        
        //Find where am supposed to go without clicking me?
        //driver.findElement(By.partialLinkText("Find where am supposed to go")).sendKeys(Keys.ENTER);
        
        
        WebElement brokenlink = driver.findElement(By.partialLinkText("Verify am I broken?"));
        brokenlink.click();
        
      
        
        
	}

}
