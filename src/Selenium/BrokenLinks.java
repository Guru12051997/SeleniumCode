package Selenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\fffffffffffffffffffffff\\chromedriver.exe");	
				WebDriver driver = new ChromeDriver(); //launch chrome
				
				driver.manage().window().maximize(); //maximize window
				driver.manage().deleteAllCookies(); //delete all the cookies
				
				//dynamic wait
			//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("https://www.amazon.in");
				List <WebElement> linkList=driver.findElements(By.tagName("a"));
				linkList.addAll(driver.findElements(By.tagName("img")));
				System.out.println("full links " +linkList.size());
				System.out.println("..............................");
				
				List <WebElement> activeLinks =new ArrayList<WebElement>();
				
				for(int i=0;i<linkList.size();i++) {
					if(linkList.get(i).getAttribute("href") != null && (! linkList.get(i).getAttribute("href").contains("javascript"))) {
						activeLinks.add(linkList.get(i));
				}
				}
				System.out.println("links and images" + activeLinks.size());
				
				//3.check 
				for (int j=0; j<activeLinks.size();j++) {
					HttpsURLConnection connection = (HttpsURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
					connection.connect();
				String res =	connection.getResponseMessage();
					connection.disconnect();
					System.out.println(activeLinks.get(j).getAttribute("href") + "----->" + res);
					
				}}
				}
