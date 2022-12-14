package SndAutoPag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class sndBasicAutomationC {
	 
	public static WebDriver driver;
	@BeforeMethod
	public void main() {

	 driver=new ChromeDriver();	
	
	System.setProperty("webDriver.chrome.driver","C:\\Program Files\\webdriver_selenium\\chromedriver.exe");

	driver.manage().window().maximize();
	driver.get("http://transport-hub-qa-release.com.s3-website.ap-south-1.amazonaws.com/");
	
	
	}
}