package nov5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_geturl {
public static void main(String[] args)throws Throwable {
	WebDriver dr=new ChromeDriver();
	dr.get("http://google.com");
	dr.manage().window().maximize();
	String strurl="https://";
	String acturl=dr.getCurrentUrl();
	//verify url starts with https://
	if(acturl.startsWith(strurl))
	{
	System.out.println("Url is Secured::"+strurl+"  "+acturl);
	}
	else
	{
	System.out.println("Url is Not Secured::"+strurl+"  "+acturl);
	}
	Thread.sleep(5000);
	dr.close();
}
}







