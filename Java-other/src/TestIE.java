import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIE {

public static void main(String[] args) throws Exception{
DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
System.setProperty("webdriver.ie.driver", "D://UK//Selenium Software//IEDriverServer_Win32_2.53.0//IEDriverServer.exe");
		//it i used to initialise the IE driver
//D:\UK\Selenium Softwares\IEDriverServer_Win32_2.53.0		
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("http://www.google.com/");
		System.out.println("Driver loaded successfully");
	}

}
