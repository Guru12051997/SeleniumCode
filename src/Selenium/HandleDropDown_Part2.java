package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown_Part2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\fffffffffffffffffffffff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://www.facebook.com/r.php");	//enter url
		driver.manage().window().maximize(); //maximize window
		driver.findElement(By.name("firstname")).sendKeys("Sweta");
	
		driver.findElement(By.name("lastname")).sendKeys("DasMohapatra");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8984569102");
		
		driver.findElement(By.id("password_step_input")).sendKeys("1234556");
		
		//Another Merthod

		WebElement Day =driver.findElement(By.id("day"));
		WebElement Month=driver.findElement(By.id("month"));
		WebElement Year=driver.findElement(By.id("year"));
		
      //selectByIndex
		
	/*	Select select = new Select(Day);
		select.selectByIndex(15);
	    Select select1 = new Select(Month);
		select1.selectByIndex(11);
	    Select select2 = new Select(Year);
		select2.selectByIndex(26);*/
		
		//IsMultiple
		Select select = new Select(Day);
		Select select1 = new Select(Month);
		Select select2 = new Select(Year);
		System.out.println(select.isMultiple());
		
		//GetOptions
		//days
	List<WebElement> listdays =	select.getOptions();
	System.out.println(listdays.size());
	
	for(int i = 0;  i<listdays.size();i++) {
		String value =listdays.get(i).getText();
   System.out.println(value);
   
   if (value.equals("19")) {
	   listdays.get(i).click();
	   break;
   }
   
   
   
	}
	
	List<WebElement> listMonths =	select1.getOptions();
	System.out.println(listMonths.size());
	
	for(int j = 0;  j<listMonths.size();j++) {
		String value1 =listMonths.get(j).getText();
    System.out.println(value1);
    if (value1.equals("Dec")) {
    	listMonths.get(j).click();
	   break;}
		//IN SELENIUM WEBPAGE ALL ARE STRINGS ONLY........
	}
	
	//year
	List<WebElement> listYears =	select2.getOptions();
 	System.out.println(listYears.size());
 	
 	for(int k = 0;  k<listYears.size();k++) {
     String value12 =listYears.get(k).getText();
     System.out.println(value12);	
		
      if (value12.equals("1996")) {
    	  listYears.get(k).click();
	   break;
		
 	
		
   }
		
}	
		
		
	}

}
