package SndAutoPag;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sndLoginPage {
	@FindBy(id="email")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="mui-1")
	public static WebElement loginButton;

}
