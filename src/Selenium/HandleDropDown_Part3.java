package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown_Part3 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\fffffffffffffffffffffff\\chromedriver.exe");
	  driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://www.facebook.com/r.php");	//enter url
		driver.manage().window().maximize(); //maximize window
		
		
	//	String xpathday = "//select[@id ='day']//options";
		//String xpathMonth = "//select[@id ='month']//options";
		String xpathMonth="//*[@id='month']";
		//String xpathYear = "//select[@id ='Year']//options";
		
		selectValueFromDropDown(xpathMonth , "Dec");
		//selectValueFromDropDown(xpathday , "16");
		//selectValueFromDropDown(xpathYear , "1996");
		
		
	}
		
	public static void selectValueFromDropDown(String xpathValue , String value) {
		
		List<WebElement> monthList =driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());
		
		for (int i=0;i<monthList.size();i++) {
			
				if(monthList.get(i).getText().equals(value)){
					monthList.get(i).click();
					break;
				}
		
		
		
		
		}
		
		
		
	}

}
