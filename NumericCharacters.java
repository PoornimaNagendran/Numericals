package guvipractise;
import java.util.Scanner;
public class NumericCharacters {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Count numeric characters");
System.out.println("Enter the string");
int count=0;
String a=s.nextLine();
for(int i=0;i<a.length();i++)
{
	if(a.charAt(i)>47 && a.charAt(i)<58)
	{
		count++;
	}
}
System.out.println("Count is "+count);
	}

}
