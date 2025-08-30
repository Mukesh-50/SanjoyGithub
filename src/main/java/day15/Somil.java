package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Somil {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.id("email1")).sendKeys("somiljain@gmail.com");
		

	}

}
