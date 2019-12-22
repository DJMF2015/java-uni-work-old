import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.List;
import java.util.Scanner;
public class DisplayData {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://bbc.com");
		//driver.get("file:///C:/Users/640780/Downloads/Cognizant%20Careers.htm");

		  List<WebElement> elements = driver.findElements(By.tagName("a")); 
		  for (int i = 0; i < elements.size(); i++) {
		   System.out.println(elements.get(i).getAttribute("href"));
		int lncount = elements.size();
		List<WebElement> elements1 = driver.findElements(By.xpath("//input[@id='Industries']"));
		int lncount2 = elements1.size();
		List<WebElement> elements11 = driver.findElements(By.xpath("//a[div[2]/div[2]/ul/li[3]/a]"));
	   int lncount3 = elements11.size();
	 //  List<WebElement> elements111 = driver.findElements(By.xpath("//a[contains(text(), 'Learn More']"));
	 //  int lncount4 = elements111.size();
	   int lncount5 = lncount2+lncount3;
	
		System.out.println("links is:"+ lncount);
		System.out.println( lncount5);
		//driver.quit();
		// for (WebElement element : allelements)
	/*	WebElement var2 = driver.findElement(By.xpath("//input[@id='Cemail']"));
		var2.sendKeys("David123");
		WebElement var3 = driver.findElement(By.xpath("//input[@id='Corg']"));
		var3.sendKeys("cognizant");
		WebElement var4 = driver.findElement(By.xpath("//input[@id='Cphone']"));
		var4.sendKeys("67567123");
		String dropdown = driver.findElement(By.tagName("//input[@id=Industries']")).getText();

		System.out.println("display select element:\t"+dropdown);
	
		System.out.println("Successful" + var1 + var2);
		*/
	}
	}
}
