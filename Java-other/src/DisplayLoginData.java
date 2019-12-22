import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayLoginData {

	public static void main(String[] args) {
		List<LoginData> data = new ArrayList<LoginData>();
		data.add(new LoginData("username", "password"));
		data.add(new LoginData("username1", "password2"));
		WebDriver dr = new FirefoxDriver();
		dr.get("http://newtours.demoaut.com/mercurysignon.php");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for (LoginData data1 : data) {
			dr.findElement(By.name("userName")).clear();
			dr.findElement(By.name("userName")).sendKeys(data1.get_username());
			System.out.println(data1.get_username());
			dr.findElement(By.name("password")).clear();
			dr.findElement(By.name("password")).sendKeys(data1.get_password());
			System.out.println(data1.get_password());
			dr.findElement(By.name("login")).click();
			boolean var1 = dr.findElement(By.name("login")).isEnabled();
			if (var1 == false) {
				System.out.println("login is enabled");
			} else {
				System.out.println("login is disabled");
			}
			boolean var2 = dr.findElement(By.name("login")).isEnabled();
			if (var1 == true) {
				System.out.println("login is enabled");
			} else {
				System.out.println("login is disabled");
			}
		}
		dr.close();
		dr.quit();

	}
}
