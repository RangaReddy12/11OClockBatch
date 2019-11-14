package nov12;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handle1 {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		//get parent window id or currently loaded id
		String parent=driver.getWindowHandle();
		System.out.println("paerent id::"+parent);
//click on help and Privacy
driver.findElement(By.partialLinkText("Help")).click();	
driver.findElement(By.partialLinkText("Priva")).click();
driver.findElement(By.partialLinkText("Terms")).click();
//get collection all window opened by selenium
Set<String>allwindows=driver.getWindowHandles();
System.out.println("all window ids::"+allwindows);
for(String each:allwindows)
{
	//parent window should not be equal to each window
if(!parent.equals(each))
{
String pagetitle=driver.switchTo().window(each).getTitle();
Thread.sleep(5000);
System.out.println(pagetitle);
Thread.sleep(5000);
driver.close();
Thread.sleep(5000);
}
}
//switch back to parent
driver.switchTo().window(parent);
Thread.sleep(5000);
driver.findElement(By.name("identifier")).sendKeys("pranga2010");
Thread.sleep(5000);
driver.close();
}
}











