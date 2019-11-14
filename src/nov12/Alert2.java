package nov12;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert2 {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/promp.html");
		driver.manage().window().maximize();
//click on me button
driver.findElement(By.xpath("/html/body/fieldset/button")).click();
Alert alert=driver.switchTo().alert();
Thread.sleep(5000);
//get alert message
String alertmessage=alert.getText();
System.out.println("text in alert::"+alertmessage);
Thread.sleep(5000);
//enter some text in alert window
alert.sendKeys("Akhilesh");
Thread.sleep(5000);
//Accept alert
alert.accept();
Thread.sleep(5000);
//get message in web page
String message=driver.findElement(By.id("promptdemo")).getText();
System.out.println("text in webpage::"+message);
Thread.sleep(5000);
driver.close();
	}

}






