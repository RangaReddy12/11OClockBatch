package nov7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsingXapth {
public static void main(String[] args)throws Throwable {
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://orangehrm.qedgetech.com/");
driver.manage().window().maximize();
//store username textbox into webelement
WebElement username=driver.findElement(By.xpath("//input[@id="
		+ "'txtUsername']"));
username.clear();
Thread.sleep(3000);
username.sendKeys("Admin1");
Thread.sleep(3000);
//store password textbox
WebElement password=driver.findElement(By.xpath("//input[@id="
		+ "'txtPassword']"));
password.clear();
Thread.sleep(3000);
password.sendKeys("Qedge123!@#");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
Thread.sleep(5000);
//verify url contains dashboard
if(driver.getCurrentUrl().contains("dash"))
{
System.out.println("Login success");
}
else
{
	//get error message
String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();	
System.out.println(message+"  "+"Login fail");
}
Thread.sleep(5000);
driver.close();
}
}














