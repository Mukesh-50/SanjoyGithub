package day10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDemo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
		
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("http://www.gmail.com");
		driver1.quit();
		
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.33.0");
		driver2.quit();
	}

}
