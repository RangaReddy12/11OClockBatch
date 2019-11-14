package nov8;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Listbox3 {
public static void main(String[] args)throws Throwable {
		String Expyear="2000";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
Select yearlistbox=new Select(driver.findElement(By.id("year")));

List<WebElement>Olist=yearlistbox.getOptions();
System.out.println("no of items are::"+Olist.size());
for(int i=1;i<Olist.size();i++)
{
	String actitems=Olist.get(i).getText();
	System.out.println(actitems);
	Thread.sleep(200);
if(Expyear.equalsIgnoreCase(actitems))
{
itemexist=true;
break;//to exit loop when item equal to actual items
}
}
//itemexist contains true or false if it true condition execute
//if it false else part executes
if(itemexist)
	
{
System.out.println("Item found in Listbox::"+Expyear);
}
else
{
System.out.println("Item not found in Listbox::"+Expyear);
}
driver.close();
}
}










