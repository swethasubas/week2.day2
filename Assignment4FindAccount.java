package week2.Day2.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4FindAccount {

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
        
        //6.Click on Find Accounts
        driver.findElement(By.linkText("Find Accounts")).click();
		 
		//7.Enter AccountName as "Credit Limited Account" 
       // WebElement AccountName = driver.findElement(By.name("accountName"));
        WebElement AccountName = driver.findElement(By.xpath("//form[@id='ext-gen116']//input[@name='accountName']"));
        AccountName.sendKeys("Credit Limited Account");
        
		//8. Click on Find Accounts using xpath Locator
		WebElement findaccount = driver.findElement(By.xpath("//div[@class = 'x-panel-footer x-panel-footer-noborder']//button")); 
        findaccount.click();
        
		//9. Click on the edit Button
        driver.findElement(By.linkText("Credit Limited Account")).click();
        driver.findElement(By.linkText("Edit")).click();		 
        
		//10. Get the Text of Account Name and verify 
		String acctname = driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value");
		System.out.println("Account name is " +acctname);
		if(acctname.equals("Credit Limited Account"))
			System.out.println("Name is verified");
        
		//11. Get the Text of Description
		String descr = driver.findElement(By.xpath("//textarea [@name='description']")).getText();
		System.out.println("Description is " +descr);
        
		//12. Get the title of the page and verify it.
		String title = driver.getTitle();
		System.out.println("Title of the page is " +title);

	}

}
