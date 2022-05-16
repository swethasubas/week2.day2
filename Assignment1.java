package week2.Day2.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		
		//Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		//Enter Password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		//Click login button
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		//Get the title of the page and print
        String title = driver.getTitle();
		System.out.println(title);
		
		//Click on Log Out
        driver.findElement(By.linkText("Log Out")).click();
        
        //Close the browser (use -driver.close())
        driver.close();		
	}

}
