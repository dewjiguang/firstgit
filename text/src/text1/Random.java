package text1;


import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		System.out.println(Math.random());
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int random=(int)(Math.random()*10);
		if(a%1000/100==random)
		{
			System.out.println("�н�");
		}
		else
			System.out.println("û�н�"+"randomΪ��"+random+"�ҵ�ֵΪ��"+a%1000/100);
	}

}
