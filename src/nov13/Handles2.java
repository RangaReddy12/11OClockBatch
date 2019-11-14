package nov13;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handles2 {
public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();		
//click on flight,stay,rail
driver.findElement(By.id("flight")).click();
driver.findElement(By.id("stayIcon")).click();
driver.findElement(By.xpath("//label[contains(text(),'RAIL DRISHTI')]")).click();
ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
System.out.println(brw);
//switch to stay window
String title1=driver.switchTo().window(brw.get(2)).getTitle();
Thread.sleep(5000);
System.out.println(title1);
driver.close();
Thread.sleep(5000);
//switch to stay flight
String title2=driver.switchTo().window(brw.get(3)).getTitle();
Thread.sleep(5000);
System.out.println(title2);
driver.close();
Thread.sleep(5000);
//switch to stay parent
String title3=driver.switchTo().window(brw.get(0)).getTitle();
Thread.sleep(5000);
System.out.println(title3);
driver.close();
Thread.sleep(5000);

	}

}














