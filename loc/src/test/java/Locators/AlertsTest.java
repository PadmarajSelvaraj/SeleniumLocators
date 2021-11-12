package Locators;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsTest {

	@Test
	public void AlertOperations() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.navigate().to("http://leafground.com/home.html");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@class ='wp-categories-icon svg-image']/following::h5[8]")).click();
		
		
	    driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button")).click();
		
	    Alert alertWindow = driver.switchTo().alert();
	    
	    //Press Ok to accept
	    alertWindow.accept();
	    
	    driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button")).click();
	    
	    
	    
	    driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button")).click();
	    
       Alert alertCancel = driver.switchTo().alert();
	    
	    //Press dismiss to cancel
	    alertWindow.dismiss();
	    
	    
	    driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button")).click();
	    
        Alert alertprompt = driver.switchTo().alert();
	    
        //Send keys to prompt box
        
        
	    
        alertprompt.sendKeys("Padmaraj Training institute");
        alertprompt.accept();
        
        //handle line breaks
        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/button")).click();
        
        Alert Linebreaks = driver.switchTo().alert();
        
        
        System.out.println(Linebreaks.getText());
        
        Linebreaks.accept(); 
        //Sweet alert
        driver.findElement(By.xpath("//*[@id='btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button")).click();
        
		
        
		}

	}
		  


