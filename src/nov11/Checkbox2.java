package nov11;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox2 {
public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
//get collection of check boxes in a page	
List<WebElement>Olist=table.findElements(By.tagName("input"));
System.out.println("no of checkboxes are::"+Olist.size());
for(int i=0;i<Olist.size();i++)
{
	Olist.get(i).click();
	for(int j=0;j<Olist.size();j++)
	{
	System.out.println("checked"+"---"+Olist.get(j).getAttribute("checked")+Olist.get(j).getAttribute("value"));		
	}
}
Thread.sleep(5000);
driver.quit();
	}

}












