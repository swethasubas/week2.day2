package week2.Day2.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        //1. Launch URL "http://leaftaps.com/opentaps/control/login"
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        
        //2. Enter UserName and Password Using Id Locator
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Demosalesmanager");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        
        //3. Click on Login Button using Class Locator
        WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
        loginbutton.click();
        
        //4. Click on CRM/SFA Link
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        //5. Click on Accounts Button
        driver.findElement(By.linkText("Accounts")).click();
        
        //6. Click on Create Account
        driver.findElement(By.linkText("Create Account")).click();
        
        //7. Select preferred currency as Indian Rupee using SelectByValue
       
        
		//8. Enter the Description text as "NRI Account"
        WebElement description = driver.findElement(By.xpath("//textarea[@name = 'description']"));
        description.sendKeys("NRI Account");
        
        
		//9. Enter LocalName Field Using Xpath Locator
        WebElement localName = driver.findElement(By.xpath("//input[@id= 'groupNameLocal']"));
        localName.sendKeys("TestLocal Name");  
        
		//10. Enter SiteName Field Using Xpath Locator
        WebElement sitename = driver.findElement(By.xpath("//input[@id= 'officeSiteName']"));
        sitename.sendKeys("TestSite Name");   
        
		//11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
        WebElement revenue = driver.findElement(By.xpath("(//table[@class= 'fourColumnForm']//input)[5]"));
        revenue.sendKeys("50000"); 
		
		//12. Click  Create Account using Xpath Locator
        driver.findElement(By.xpath("(//form [@id='createAccountForm']//input)[25]")).click(); 
                
		//13. Get the Text of Error Message Displayed (hint: Red Texts)
        String error = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
        System.out.println("Error Message :" +error);
        
        //14   close the browser
        driver.close();
        
	}

}
