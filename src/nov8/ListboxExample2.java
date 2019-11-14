package nov8;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ListboxExample2 {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://newto.com");
		driver.manage().window().maximize();
//store listbox into select class
Select yearlistbox=new Select(driver.findElement(By.id("year")));
//verify list box is single or multi selection
boolean value=yearlistbox.isMultiple();
System.out.println("verify listbox single or multiple slection::"+value);
//get collection of items in listbox
List<WebElement>Olist=yearlistbox.getOptions();
System.out.println("no of items are::"+Olist.size());
for(int i=1;i<Olist.size();i++)
{
String itemname=Olist.get(i).getText();
System.out.println(itemname);
Thread.sleep(100);
Olist.get(i).click();
}
Thread.sleep(6000);
driver.close();
	}

}













