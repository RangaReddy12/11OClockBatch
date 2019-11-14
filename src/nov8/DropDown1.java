package nov8;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown1 {
public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/Multi.html");
driver.manage().window().maximize();
Select listbox=new Select(driver.findElement(By.name("multiSelection")));
boolean value=listbox.isMultiple();
System.out.println(value);
listbox.selectByIndex(0);
Thread.sleep(3000);
listbox.selectByIndex(3);
Thread.sleep(3000);
listbox.selectByIndex(1);
Thread.sleep(3000);
listbox.selectByIndex(5);
Thread.sleep(3000);
listbox.selectByIndex(6);
Thread.sleep(3000);
listbox.selectByIndex(2);
Thread.sleep(3000);
//count no of items selected
List<WebElement>olist=listbox.getAllSelectedOptions();
System.out.println("no of items selected::"+olist.size());
for(int i=0;i<olist.size();i++)
{
	String itemname=olist.get(i).getText();
	System.out.println(itemname);
}
listbox.deselectByIndex(0);
Thread.sleep(4000);
listbox.deselectByIndex(3);
Thread.sleep(4000);
listbox.deselectByIndex(5);
Thread.sleep(4000);
listbox.deselectAll();
Thread.sleep(4000);
driver.close();

	}

}














