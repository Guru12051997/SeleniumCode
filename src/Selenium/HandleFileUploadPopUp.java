package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\fffffffffffffffffffffff\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("http://html.com/input-type-file/");

		driver.findElement(By.xpath("//*[@name='fileupload']")).sendKeys("give path ");
		
	}

}
