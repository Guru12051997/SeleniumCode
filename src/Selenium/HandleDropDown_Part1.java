package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown_Part1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\fffffffffffffffffffffff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://www.facebook.com/r.php");	//enter url
		driver.manage().window().maximize(); //maximize window
		
		driver.findElement(By.name("firstname")).sendKeys("Sweta");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("DasMohapatra");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("8984569102");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("1234556");
		
		//handle drop box:
		
		
		WebElement Day =driver.findElement(By.id("day"));
		WebElement Month=driver.findElement(By.id("month"));
		WebElement Year=driver.findElement(By.id("year"));
		
		String dob ="16-Dec-1996";
		String dobArr[] =dob.split("-");
		
		
		selectValueFromDropDown(Day,dobArr[0]);
		Thread.sleep(2000);
		selectValueFromDropDown(Month,dobArr[1]);
		Thread.sleep(2000);
		selectValueFromDropDown(Year,dobArr[2]);
		Thread.sleep(2000);
		
		//selectValueFromDropDown(Day,"16");
		//selectValueFromDropDown(Month,"Dec");
		//selectValueFromDropDown(Year,"1996");
		
		
		/*	Select select = new Select(Day);
		select.selectByVisibleText("16");
		Thread.sleep(2000);
		Select select1 = new Select(Month);
		select1.selectByVisibleText("Dec");
		Thread.sleep(2000);
		Select select2 = new Select(Year);
		select2.selectByVisibleText("1996");
		
	//	driver.findElement(By.id("u_0_4_K0")).click();*/
		
		//2.generic method
		driver.close();
	}
		
		public static void selectValueFromDropDown( WebElement element , String value) {
			Select select = new Select(element);
			select.selectByVisibleText(value);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

