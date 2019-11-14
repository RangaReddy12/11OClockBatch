package nov14;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class frame1 {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
	//click on login
driver.findElement(By.xpath("//li[@class='_26Vr']")).click();
//get collections of frames
List<WebElement>oframes=driver.findElements(By.tagName("iframe"));
System.out.println("no of frames are::"+oframes.size());
Thread.sleep(5000);
//switch to frame
driver.switchTo().frame(0);
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='wallet-container-new qr-bg-white']/qr-code-login/div[2]/div[2]/div[3]/span")).click();
Thread.sleep(5000);
driver.findElement(By.name("username")).sendKeys("pranga2010@gmail.com");
Thread.sleep(5000);
driver.findElement(By.name("password")).sendKeys("test554342");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='loginForm']/div/md-content/button/span")).click();
//come out frame
driver.switchTo().defaultContent();
//click on close 
driver.findElement(By.xpath("//a[@class='_2iSj']")).click();
Thread.sleep(5000);
//clcik on gold link in webpage
driver.findElement(By.xpath("//body[@class='customBody']/div[@id='app']/div/div[@class='FgQ9 _1YYJ _3H6b']/div[@class='LmcT']/div[@class='_2sG9']/ul/li[3]/a[1]/img[1]")).click();
Thread.sleep(5000);
driver.close();
	}

}










