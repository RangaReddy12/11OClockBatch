package qedge.oct28;
public class Demo1 {
public static void main(String[] args) {
		try{
		//first block of code
		int x=900,y=0,z;
		z=x/y;
		System.out.println(z);
		}catch(Throwable t)
		{
		System.out.println(t.getMessage());//it will print error
//t.printStackTrace();//it will print both error and exception
		}
		//second block of code
		double a=457,b=3,c;
		c=a/b;
		System.out.println(c);
//Third block of code
	int a1=300,b1=870,c1;
	c1=a1+b1;
	System.out.println(c1);
	}
}

