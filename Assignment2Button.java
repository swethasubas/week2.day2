package week2.Day2.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Button.html");
        
        //Click button to travel home page
        driver.findElement(By.id("home")).click();
        driver.navigate().back();
        
        //Find position of button (x,y)
        Point location = driver.findElement(By.xpath("//button[@id ='bmposition']")).getLocation();
        String position = location.toString();
        System.out.println("The position of the Button is " +position);
             
        //Find button color
        String cssValue = driver.findElement(By.xpath("//button[@id ='color']")).getCssValue("background-color");
        System.out.println("The Color of the Button is " +cssValue);
        
        //Find the height and width
        Dimension size = driver.findElement(By.xpath("//button[@id ='size']")).getSize();
        String HeightandWidth = size.toString();
        System.out.println("Height and Width is " +HeightandWidth);
               

	}

}
