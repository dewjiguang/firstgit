package car_rental;

import java.util.Scanner;

public class Text {
	static {
		System.out.println("��̬��");
	}
	{
		System.out.println("�Ǿ�̬��");
	}
	
	Text()
	{
		System.out.println("���췽��");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Text t=new Text();
		
		
		menu();
		
	}
	
	public static void menu()
	{

		
		Car smallcar=new SmallCar();
		Car bigcar=new BigCar();
		Rental rent=new Rental();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("********��ӭ�����ڷ��������޹�˾********");
		System.out.println("1���γ�    2���ͳ�");
		System.out.println("��ѡ����Ҫ���޵��������ͣ�");
		try {
		int model=sc.nextInt();
		
		if(model==1)
		{
			System.out.println("��ѡ����Ҫ���޵�����Ʒ�ƣ�");
			System.out.println("1,����x6    2.����550i");
			System.out.println("3.���������   4.���GL8");
			int singal=sc.nextInt();
			if(!(singal==1||singal==2||singal==3||singal==4))
				error();
			System.out.println("��ѡ����Ҫ���޵�������");
			String days=sc.next();
			if(!((days.matches("[0-9]+"))&&!(days.matches("[0]+"))))
				error();
			
			int day=Integer.parseInt(days);
			double count=smallcar.calRent(day);
			rent.rent_Smallcar(singal,day,count);
			
			
			
		}
		else if(model==2)
		{
			System.out.println("��ѡ����Ҫ���޵�����Ʒ�ƣ�1.����   2.��");
			int singal=sc.nextInt();
			if(!(singal==1||singal==2))
				error();
			System.out.println("��ѡ����Ҫ���޵�������λ����1.16��   2.34��");
			int seat=sc.nextInt();
			if(!(singal==1||singal==2))
				error();
			System.out.println("��������Ҫ���޵�������");
			int day=sc.nextInt();
			double count=bigcar.calRent(day);
			rent.rent_Bigcar(singal, seat, day, count);
			sc.close();
		}
		else 
			error();
		}
		catch(Exception e) {error();}
	
	}
	
	
	public static void error()
	{
		System.out.println("�����������������룡");
		menu();
	}
	


}
