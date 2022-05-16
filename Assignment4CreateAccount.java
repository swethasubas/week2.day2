package week2.Day2.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4CreateAccount {

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
        
        //7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
        WebElement accountname = driver.findElement(By.xpath("//input[@id= 'accountName']"));
        accountname.sendKeys("Debit Limited Account0001");
        
        //8. Enter DEscriptiion as "Selenium Automation Tester"
        WebElement description = driver.findElement(By.xpath("//textarea[@name = 'description']"));
        description.sendKeys("Selenium Automation Tester");
        
        
        //9. Enter LocalName Field Using Xpath Locator
        WebElement localName = driver.findElement(By.xpath("//input[@id= 'groupNameLocal']"));
        localName.sendKeys("TestLocal Name");     
        
        
        //10. Enter SiteName Field Using Xpath Locator
        WebElement sitename = driver.findElement(By.xpath("//input[@id= 'officeSiteName']"));
        sitename.sendKeys("TestSite Name");        
        
        //11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
        WebElement revenue = driver.findElement(By.xpath("(//table[@class= 'fourColumnForm']//input)[5]"));
        revenue.sendKeys("10000");
        
        //14. Click on Create Account using Xpath Locator
        driver.findElement(By.xpath("(//form [@id='createAccountForm']//input)[25]")).click(); 
        
        //15.Close the browser
        driver.close();
 

		
	}

}
