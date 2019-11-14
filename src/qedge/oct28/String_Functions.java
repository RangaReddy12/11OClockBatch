package qedge.oct28;
public class String_Functions {
	public static void main(String[] args) {
		String str="avaj esitcarp esaelp";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
		reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}
