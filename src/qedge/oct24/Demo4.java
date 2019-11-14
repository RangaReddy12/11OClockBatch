package qedge.oct24;
public class Demo4 {
public static String verifystrings(String str1,String str2)
{
	String res="";
	if(str1.equals(str2))
	{
	res="String are equal";
	}
	else
	{
	res="String are not equal";
	}
	return res;
	
}
public static boolean compare(int x,int y)
{
	if(x==y)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
String result=Demo4.verifystrings("Dont sleep", "Dont sleep");
System.out.println(result);
	boolean resu=Demo4.compare(100, 100);
	System.out.println(resu);
		}
}
