package nov4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login_Usingchrome {
public static void main(String[] args)throws Throwable {
	//Create instance object foe webdriver
	WebDriver driver=new FirefoxDriver();
	//launch url in browser
	driver.get("http://primusbank.qedgetech.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("TxtuI")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	Thread.sleep(3000);
	//we can click button in two ways as shown below
	//driver.findElement(By.id("login")).click();
	driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	
	driver.close();
	}

}










