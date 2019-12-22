import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class OneDriver {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("h	ttps://www.google.com/");
		String title = driver.getTitle();
		System.out
				.println("Print the title of web page Successful: \t" + title);
		List<WebElement> allelements = driver.findElements(By.xpath("//input"));
		int lncount = allelements.size();
		driver.quit();

		Scanner s1 = new Scanner(System.in);
		int varcount = s1.nextInt();
		System.out.println("Count number of links\t" + lncount);
		if (varcount == lncount)
		// for (WebElement element : allelements)
		{
			System.out.println("thatis conrrect");
		
		} else {
			System.out.println("that is wrong!");
		}
	}
}
