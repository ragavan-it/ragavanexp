package Launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowsar {
	
	public static void chromelaunch() {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\inherit exp\\Drivers" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
	public static void main(String[] args) {
		chromelaunch();
	}

}

