import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginDisplay {

	public static void main(String[] args) {
	
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.cognizant.com/careers");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//a[@id='Industries']")).click();
		dr.findElement(By.xpath("//a[@id='Industries']")).click();
		boolean var1 = dr.findElement(By.xpath("//a[@id='Industries']")).isEnabled();
		//WebElement enabled = dr.findElement(By.xpath("//html[@id='careers-page']/body/div[3]/section/div[2]/div/ul/li/a']"));
		if (var1 ==true) {
			System.out.println("login is enabled");
		} else {
			System.out.println("login is disabled");
		
				dr.close();dr.quit();
		}
	}
		
	}

