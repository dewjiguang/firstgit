package shop;

import java.util.Scanner;

public class Test {
	public static Customer[] customer;
	public static Goods[] goods;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		customer=new Customer[20];
		goods=new Goods[20];
		
		customer[0]=new Customer("08/05",2000);
		customer[1]=new Customer("07/13",4000);
		customer[2]=new Customer("06/26",5000);
		customer[3]=new Customer("04/08",2200);
		customer[4]=new Customer("08/16",1000);
		customer[5]=new Customer("12/23",3000);
		customer[6]=new Customer("12/21",1910080);//Ԥ������
		
		goods[0]=new Goods("addidas�˶�Ь", (int)(Math.random()*100));
		goods[1]=new Goods("Kapa����ȹ", (int)(Math.random()*100));
		goods[2]=new Goods("������", (int)(Math.random()*100));
		goods[3]=new Goods("addidasT��", (int)(Math.random()*100));
		goods[4]=new Goods("NIKE�˶�Ь", (int)(Math.random()*100));
		goods[5]=new Goods("KAPA����", (int)(Math.random()*100));
		goods[6 ]=new Goods("KAPAT��", (int)(Math.random()*100));
	

		while(true)
		{
			switch(Menu.mainmenu(sc)) {
			case 1:{
				switch(Menu.customermenu(sc))
				{
				case 0:System.out.println("��������");
				case 1:CustomerManager.showAllCustomer(customer);break;
				case 2:CustomerManager.addcustomer(customer,sc);break;
				case 3:CustomerManager.changeCustomer(customer,sc);break;
				case 4:CustomerManager.showCustomer(customer, sc);break;
				}break;
			}
			case 2:{
				Menu.buymenu(goods, customer, sc);
			}break;
		
			
			}
			
		}
		
	}

}
