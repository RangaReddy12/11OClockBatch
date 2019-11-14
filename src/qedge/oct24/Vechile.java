package qedge.oct24;
public class Vechile {//class name

public void method1()//non static method
	{
System.out.println("Method1");	
	}
public void method2()//non static method
	{
	System.out.println("method2");
	
	}
	public static void main(String[] args) {//main method
//creating reference object for non static methods		
		Vechile x=new Vechile();
	x.method1();
	x.method2();
	}
}

