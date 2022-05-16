package week2.Day2.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/checkbox.html");
        
        //Select the languages that you know?  Parent-->Child  (//div[@class ='example']/input)[1]   Attribute based collections(//input [@type ='checkbox'])[1]
        driver.findElement(By.xpath("(//div[@class ='example']/input)[1]")).click();       
        
        //Confirm Selenium is checked 
        boolean selected = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println(selected);
        
        //DeSelect only checked
        List<WebElement> findElements = driver.findElements(By.xpath("//label[text() = 'DeSelect only checked']/following-sibling::input"));
        for(WebElement valueinlist: findElements)
        {
        	boolean checktrue =valueinlist.isSelected();
            if(checktrue)
        	{ 
            	valueinlist.click();
            }
        
        }
              
        //Select all below checkboxes 
        List<WebElement> findElements2 = driver.findElements(By.xpath("//label[text() = 'Select all below checkboxes ']/following-sibling::input"));
        for(WebElement valueinlist1: findElements2) {
        	valueinlist1.click();
        }

	}

}
