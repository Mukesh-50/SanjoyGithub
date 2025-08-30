package day17_listInDetail;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumList {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		List<WebElement> mylist=driver.findElements(By.id(""));

		mylist.get(0).click();
		
		mylist.get(1).sendKeys("");
		
		mylist.get(2).isDisplayed();
		
		Set<String> windows=driver.getWindowHandles();
		
	}

}
