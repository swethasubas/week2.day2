package week2.Day2.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;   

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Editbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
         driver.get("http://leafground.com/pages/Edit.html");  
         
         //Enter your email address
         WebElement findElement = driver.findElement(By.id("email"));
         findElement.sendKeys("testleaf@gmail.com");
         
         //Append a text and press keyboard tab
         WebElement findElement2 = driver.findElement(By.xpath("//input[@value ='Append ']"));
         findElement2.sendKeys("Selenium");
         
         //Get default text entered
         String text = driver.findElement(By.xpath("//input[@value ='TestLeaf']")).getAttribute("value");
         System.out.println(text);
     
         //Clear the text
         driver.findElement(By.xpath("//input[@value ='Clear me!!']")).clear();
         
         //Confirm that edit field is disabled
         boolean enabled = driver.findElement(By.xpath("//input [@disabled ='true']")).isEnabled();
         System.out.println(enabled);
	}
	
}
