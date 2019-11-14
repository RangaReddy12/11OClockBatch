package nov5;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class getCommands {
public static void main(String[] args) throws Throwable{
		HtmlUnitDriver driver=new HtmlUnitDriver();
		//launch url
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		//print title of the page and length of title
String pagetitle=driver.getTitle();
System.out.println("page title is::"+pagetitle);
System.out.println("page title length is::"+pagetitle.length());
//print url of the page and length of url
String strurl=driver.getCurrentUrl();
System.out.println("url of the page::"+strurl);
System.out.println("url length of the page::"+strurl.length());
Thread.sleep(5000);

	}

}










