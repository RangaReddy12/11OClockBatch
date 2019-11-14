package nov4;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webtour {
public static void main(String[] args)throws Throwable {
//create object for broswer class
	ChromeDriver driver=new ChromeDriver();
	//launch url
driver.get("http://newtours.demoaut.com");
driver.manage().window().maximize();
Thread.sleep(5000);
//click on registewr link
driver.findElement(By.partialLinkText("REG")).click();
Thread.sleep(5000);
//fill register form
driver.findElement(By.name("firstName")).sendKeys("rita");
driver.findElement(By.name("lastName")).sendKeys("meta");
driver.findElement(By.name("phone")).sendKeys("4578945124");
driver.findElement(By.name("userName")).sendKeys("rita@gmail.com");
driver.findElement(By.name("address1")).sendKeys("Hyderabad");
driver.findElement(By.name("address2")).sendKeys("ameerpet");
driver.findElement(By.name("city")).sendKeys("hyderabad");
driver.findElement(By.name("state")).sendKeys("TS");
driver.findElement(By.name("postalCode")).sendKeys("800078");
driver.findElement(By.name("country")).sendKeys("INDIA");
driver.findElement(By.name("email")).sendKeys("Ritameta");
driver.findElement(By.name("password")).sendKeys("Ritameta12345");
driver.findElement(By.name("confirmPassword")).sendKeys("Ritameta12345");
driver.findElement(By.name("register")).click();
Thread.sleep(5000);
driver.quit();
}
}















