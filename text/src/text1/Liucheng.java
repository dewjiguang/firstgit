package text1;
import java.util.Scanner;

public class Liucheng {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		function1(a);
		function2(a);
		sc.close();
		
	}
	 public static void function1(int a)
	{
		if(a>90)
			System.out.println("����");
		else
			System.out.println("����");
	}
	static void function2(int a)
	{
		if(a>90)
			System.out.println("����");
		else if (a<60)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("nothing");
		}
			
	}

}
