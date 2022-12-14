package SndAutoPag;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;




public class sndLoginTest extends sndBasicAutomationC {
	sndLoginPage loginpg=new sndLoginPage();
	
	@Test

	public void login () throws InterruptedException, IOException{
		
		PageFactory.initElements(driver, loginpg);
	
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SndAutomate\\src\\test\\java\\sndExcel\\Book1.xlsx");
		XSSFWorkbook worbook=new XSSFWorkbook	(file);
		XSSFSheet sheet=worbook.getSheet("Sheet1");
	
		
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++) {
		XSSFRow row =sheet.getRow(i);
		 
		String Username=(String)row.getCell(0).getStringCellValue();
		String Password=(String)row.getCell(1).getStringCellValue();
       
		sndLoginPage.username.clear();
		sndLoginPage.username.sendKeys (Username);
		sndLoginPage.password.clear();
		sndLoginPage.password.sendKeys (Password);
		sndLoginPage.loginButton.click();
		Thread.sleep(2500);
	
		
//		loginpg.username.sendKeys("admin@gmail.com");
//		loginpg.password.sendKeys("admin");
//		loginpg.loginButton.click();
		
		}
		
	}


}
