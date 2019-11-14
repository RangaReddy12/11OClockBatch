package nov11;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Radibutton1 {
public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		//get collection of radio buttons boxes in a page
List<WebElement>Olist=driver.findElements(By.name("group1"));
System.out.println("no of radio buttons are::"+Olist.size());
for(int i=0;i<Olist.size();i++)
{
	String radioname=Olist.get(i).getAttribute("value");
	System.out.println(radioname);
	Olist.get(i).click();
	Thread.sleep(5000);
	}
Thread.sleep(5000);
driver.quit();
	}

}
