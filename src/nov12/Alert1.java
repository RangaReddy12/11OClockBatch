package nov12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert1 {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//click on login button
driver.findElement(By.name("login")).click();
Thread.sleep(5000);
//get alert message
String alertmessage=driver.switchTo().alert().getText();
System.out.println(alertmessage);
Thread.sleep(5000);
//accepct alert
driver.switchTo().alert().accept();
Thread.sleep(5000);
driver.quit();
	}

}
