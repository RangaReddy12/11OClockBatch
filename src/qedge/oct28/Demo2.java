package qedge.oct28;
class Demo2 {
public static void main(String[] args) throws Throwable {
String str1="Sleep";
String str2="sleep";
if(str1.equals(str2))
{
System.out.println("Strings are equal");
}
else
{
	try{
throw new Error("Strings are not equal");
	}catch(Throwable t)
	{
		System.out.println(t.getMessage());
	}
}
}
}
