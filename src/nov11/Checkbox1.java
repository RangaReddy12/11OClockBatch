package nov11;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox1 {
public static void main(String[] args)throws Throwable{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/checkbox_1.html");
	driver.manage().window().maximize();
	//get collection of check boxes in a page
List<WebElement>checkbox=driver.findElements(By.tagName("input"));
System.out.println("no of checkboxes are::"+checkbox.size());
for(int i=0;i<checkbox.size();i++)
{
//verify checkbox active or not
boolean value=checkbox.get(i).isSelected();
System.out.println(value);
//print name of each checkbox stored into value property
String checkboxname=checkbox.get(i).getAttribute("value");
System.out.println(checkboxname);
System.out.println(checkbox.get(i).getAttribute("checked"));
//uncheck checkbox which is already active
if(checkbox.get(i).isSelected())
{
	//uncheck checkbox
checkbox.get(i).click();
}
else
{
	//check which are not active
	checkbox.get(i).click();
}
Thread.sleep(5000);
}
	
driver.quit();
	}

}











