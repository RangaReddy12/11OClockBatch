package nov13;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handle3 {
public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
//get parent id
String parent=driver.getWindowHandle();
System.out.println(parent);
//get collection of window opened by selenium
Set<String>allwindows=driver.getWindowHandles();
System.out.println(allwindows);
Iterator<String>x=allwindows.iterator();
while(x.hasNext())
{
String child=x.next();
if(!parent.equals(child))
{
String pagetitle=driver.switchTo().window(child).getTitle();
driver.manage().window().maximize();
Thread.sleep(5000);
System.out.println(pagetitle);
driver.close();
Thread.sleep(5000);
}
}
//switch back to parent
driver.switchTo().window(parent);
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
Thread.sleep(5000);
driver.findElement(By.name("userType")).click();
Thread.sleep(5000);
driver.close();
	}

}














