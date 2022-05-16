package week2.Day2.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4CreateLead {

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
        
        //5. Click on Leads Button
        driver.findElement(By.linkText("Leads")).click();
        
        //6. Click on create Lead Button
        driver.findElement(By.linkText("Create Lead")).click();
        
        //7. Enter CompanyName using id Locator
        WebElement CompanyName= driver.findElement(By.id("createLeadForm_companyName"));
        CompanyName.sendKeys("TestCompany Name");
        
        //8. Enter FirstName using id Locator
        WebElement FirstName= driver.findElement(By.id("createLeadForm_firstName"));
        FirstName.sendKeys("TestFirst Name");
        
        
        //9. Enter LastName using id Locator
        WebElement LastName= driver.findElement(By.id("createLeadForm_lastName"));
        LastName.sendKeys("TestLast Name");
        
        //10. Click on create Lead Button Using name Locator
        driver.findElement(By.name("submitButton")).click();
        
        //11. Get the Title of the resulting Page
        String title = driver.getTitle();
        System.out.println("Title of the page is : " +title);
        
        //12.close the browser
        driver.close();
        
         

	}

}
