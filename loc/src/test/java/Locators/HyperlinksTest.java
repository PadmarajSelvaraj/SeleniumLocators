package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HyperlinksTest  {
	
	@Test
	public void HyperlinkOperation() {
		
		WebDriverManager.firefoxdriver().setup(); 
		webetesting
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://leafground.com/home.html");
		
                driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@class ='wp-categories-icon svg-image']/following::h5[2]")).click();
		//click link as linktext
		WebElement HomePage = driver.findElement(By.linkText("Go to Home Page"));
		
		HomePage.click();
		driver.navigate().back();
		//Verify link color 
		String linkcolore = driver.findElement(By.linkText("Go to Home Page")).getCssValue("color");
		
		String hexcolor = Color.fromString(linkcolore).asHex();
		
		System.out.println(hexcolor);
		
		
		//Find where it go without clicking
		
		String destination = driver.findElement(By.partialLinkText(" without clicking me?")).getAttribute("href");
			
		System.out.println(destination);
		
		//Verify broken link
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
        
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		if(title.contains("404")) {
			
			System.out.println("Link is broken");
		}
		
		driver.navigate().back();
		
		// Refreshing to ovoid stale element exception
		driver.navigate().refresh();
		
		
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
		  int count = driver.findElements(By.tagName("a")).size();
		  
		  System.out.println(count);
		  
		  driver.quit();
		 
	}
	  
	 	
}
