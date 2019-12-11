package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login 
{

	void TC1()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\$riv@lli\\geckodriver.exe");
	String bpath = "http://apps.qaplanet.in/qahrm/login.php";
	//WebDriver driver= new FirefoxDriver();
	WebDriver driver; 
	driver = new FirefoxDriver();
	driver.get(bpath);
	
	//initializing user name and password
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	
	// 
	if(driver.getTitle().equals("OrangeHRM"))
	
	
		System.out.println("Pass");
	
	else 
		
			System.out.println("Fail");
		
	
	}
}