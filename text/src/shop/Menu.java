package shop;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Menu {
	public static int mainmenu(Scanner sc)
	{
		System.out.println("            ��ӭʹ���������ع������ϵͳ");
		System.out.println("*****************************************");
		System.out.println("            1.�ͻ�����ϵͳ");
		System.out.println("            2.�������");
		System.out.println("            3.�������");
		System.out.println("            4.ע��");
		System.out.println("*****************************************");
		System.out.print("��ѡ���������֣�");
		int a=sc.nextInt();
		
		return a;
	}
	public static int customermenu(Scanner sc)
	{
		System.out.println(" �������ع������ϵͳ>�ͻ���Ϣ����");
		System.out.println("*****************************************");
		System.out.println("            1.��ʾ���пͻ���Ϣ");
		System.out.println("            2.��ӿͻ���Ϣ");
		System.out.println("            3.�޸Ŀͻ���Ϣ");
		System.out.println("            4.��ѯ�ͻ���Ϣ");
		System.out.println("*****************************************");
		System.out.print("��ѡ���������ֻ򰴡�n�������ϼ��˵���");
		String st=sc.next();
		if(st.equals( "n")) {
			
			return 0;
		}
		else if(st.matches("[1-4]"))
			return Integer.parseInt(st);
		else if(st.matches("n")){
			
			return 0;
			
		}
		else {
			System.out.println("��������");
	
			return 0;
		}
	}
	public static void buymenu(Goods[] goods,Customer[] cu,Scanner sc) {
		System.out.println("�������ع������ϵͳ���������������������");
		System.out.println("**********************************");
		System.out.println("��ѡ�������Ʒ��");
		System.out.println("1.addidas����Ь");
		System.out.println("2.Kapa����ȹ");
		System.out.println("3.������");
		System.out.println("4.addidasT����");
		System.out.println("5.NIKE�˶�Ь");
		System.out.println("6.KAPA����");
		System.out.println("7.KAPAT��");
		System.out.println("**********************************");
		System.out.print("�������Ա�ţ�");
		int num=sc.nextInt();
		for (Customer customer : cu) {
			if(customer==null)
				break;
			else if(customer.getNum()==num)
			{
				System.out.println("��������Ʒ��ţ�");
				int bianhao=sc.nextInt();
				for (Goods good : goods) {
					if(good==null)break;
					if(good.getNum()==(bianhao))
					{
						System.out.println("��������Ŀ��");
						int count =sc.nextInt();
						System.out.println("*****************��Ʒ�嵥***********************");
						System.out.println("            ��Ʒ               ����                 ����                   ���");
						System.out.println();
						System.out.println(good.getName()+"         "+good.getMoney()+"                   "+count+"                   "+"��"+good.getMoney()*count);
						System.out.println("*********************************************");
						System.out.println("�ۿ�   0.9");
						System.out.println("����ܼƣ���"+good.getMoney()*count*0.9);
						System.out.println("���ι�������û���Ϊ��"+(int)(good.getMoney()*count*0.9/100));
						customer.setCount((int)(good.getMoney()*count*0.9/100)+customer.getCount());
						System.out.println("����ʣ�����Ϊ��"+customer.getCount());
						break;
					}
					
				}
			}
			
		}
		System.out.println("�Ƿ��������Y/N");
		String newtemp=sc.next();
		if(newtemp.equals("Y")||newtemp.equals("y"))
			buymenu(goods, cu, sc);
		else return;
			
		
	
	}

}
