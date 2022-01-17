package Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\fffffffffffffffffffffff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("//https://www.hyrtutorials.com/p/window-handles-practice.html");
       driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
       driver.manage().window().maximize();
       driver.findElement(By.id("newWindowBtn")).click();
    
    
       Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
    //parent id
        String parentWindowId = it.next();
        System.out.println(parentWindowId);
    //child id
        String childWindowId = it.next();
        System.out.println(childWindowId);
    
        driver.switchTo().window(childWindowId);
        driver.manage().window().maximize();
        driver.findElement(By.id("firstName")).sendKeys("gurubhai");
        driver.findElement(By.id("lastName")).sendKeys("munu");
        Thread.sleep(1000);
        driver.close();
    
   // driver.switchTo().defaultContent();
      
         driver.switchTo().window(parentWindowId);
         Thread.sleep(5000);
         driver.findElement(By.id("newTabsBtn")).click();
         Thread.sleep(1000);
        // driver.quit();
         
         
         //tab
        /* Set<String> handles1 = driver.getWindowHandles();
         Iterator<String> itt = handles.iterator();
         String TabWindowId1 = it.next();
         System.out.println(TabWindowId1);*/

         ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
         //switch to parent tab
         driver.switchTo().window(newTb.get(0));
         System.out.println("Page title of parent tab: " + driver.getTitle());
         
         //switch to middle window
         driver.switchTo().window(newTb.get(1));
         System.out.println("Page title of middle window: " + driver.getTitle());
         
         //lastwindows
         driver.switchTo().window(newTb.get(2));
         System.out.println("Page title of last window: " + driver.getTitle());
         
         driver.quit();

         
         
         
         
         
         
         
         
         
         
	}

}
