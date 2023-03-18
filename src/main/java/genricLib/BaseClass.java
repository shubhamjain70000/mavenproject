package genricLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	WebDriver driver=null;

	@BeforeSuite
	public void BS()
	{
		System.out.println("database connection");
	}
	@BeforeClass
	public void BC()
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Launch the browser");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("login to application");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("logout from application");
	}
	@AfterClass
	public void AC()
	{
		driver.close();
		System.out.println("close the browser");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("close database connection");
	}

}
