package Book;

import java.util.Date;
import java.util.Scanner;

public class Text {
	static int bianhao=1;
	public static void main(String[] args) {
		
		menu();
	}
	public static void menu()
	{
		Date date=new Date();
		Scanner sc=new Scanner(System.in);
		
		Book[] book=new Book[3];
		book[0]=new Book(1,"JAVA�̳�",30.6,30);
		book[1]=new Book(2,"JSPָ��",42.1,40);
		book[2]=new Book(3,"SSH�ܹ�",47.3,15);
		
		OrderItem[] orderitem=new OrderItem[3];
		System.out.println("        ͼ���б�                  ");
		System.out.println("ͼ����    ͼ������    ͼ�鵥��    ������� ");
		System.out.println("------------------------------------");
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i].getBookId()+"        "+book[i].getBookName()+"         "+book[i].getPrice()+"         "+book[i].getStorage());		
		}
		System.out.println("------------------------------------");
		try {
		for (int i = 0; i <3; i++) {
			
		
		System.out.println("������ͼ����ѡ��ͼ�飺");
		int change1=sc.nextInt();
		if(!(change1==1||change1==2||change1==3))
			error();
		System.out.println("������Ҫ�����ͼ��������");
		int change2=sc.nextInt();
		if(!((Integer.toString(change2).matches("[0-9]+"))&&!(Integer.toString(change2).matches("[0]+"))&&(change2<=book[change1-1].getStorage())))
			error();
		
		orderitem[i]=new OrderItem(book[change1-1].getBookName(),book[change1-1].getPrice(),change2);
		
		}
		
		System.out.println("                    ͼ�鶩��                  ");
		System.out.print("ͼ�鶩���ţ� ");
		System.out.println("000000"+bianhao);
		System.out.println("ͼ������               ��������                  ͼ�鵥��");
		System.out.println("---------------------------------------");
		double sum=0;
		for(int i=0;i<3;i++)
		{
			System.out.println(orderitem[i].getBookName()+"                  "+orderitem[i].getNum()+"                       "+orderitem[i].getPrice());
			sum+=orderitem[i].getNum()*orderitem[i].getPrice();
		}
		System.out.println("---------------------------------------");
		System.out.println("�����ܶ"+sum);
		System.out.println(date);
		sc.close();
		bianhao++;
		
		}
		catch(Exception e)
		{
			error();
		}
		
		
	}
	public static void error()
	{
		System.out.println("��������������");
		menu();
	}

}
