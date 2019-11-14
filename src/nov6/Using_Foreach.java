package nov6;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_Foreach {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://amzon.com");
		driver.manage().window().maximize();
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("no of links are::"+links.size());
for(WebElement each:links)
{
	String linkname=each.getText();
	String linkurl=each.getAttribute("href");
	System.out.println(linkname+"\n"+linkurl);
			
}
}


}














