package shop;

import java.util.Scanner;

public class CustomerManager {
	public static void addcustomer(Customer[] cu, Scanner sc) {
		System.out.println("���������գ�");
		String birth = sc.next();
		System.out.println("��������֣�");
		int count = sc.nextInt();
		Customer c = new Customer(birth, count);
		boolean temp = false;

		for (int i = 0; i < cu.length; i++) {
			if (cu[i] == null) {
				cu[i] = c;
				temp = true;
				break;
			}

		}
		if (temp == false)
			System.out.println("��������Ӵ���");

	}

	public static void changeCustomer(Customer[] customer, Scanner sc) {
		System.out.println("************************");
		System.out.println("1.�޸Ļ�Ա����");
		System.out.println("�޸Ļ�Ա����");
		System.out.println("************************");
		System.out.println("��ѡ���������֣�");
		int number = sc.nextInt();
		switch (number) {

		case 1: {
			System.out.println("�������Ա�ţ�");
			int num = sc.nextInt();
			System.out.println("���������գ�");
			String birth = sc.next();
			int temp = 0;
			for (int i = 0; i < customer.length; i++) {
				if (customer[i] == null) {
					temp = i;
					break;
				}
			}
			for (int i = 0; i < temp; i++) {
				if (customer[i].getNum() == num) {

					customer[i].setBirth(birth);
				} else
					System.out.println("���޴˺�");

			}
			break;

		}

		case 2: {
			int num = sc.nextInt();
			int count = sc.nextInt();
			int temp = 0;
			for (int i = 0; i < customer.length; i++) {
				if (customer[i] == null) {
					temp = i;
					break;
				}
			}
			for (int i = 0; i < temp; i++) {
				if (customer[i].getNum() == num) {
					customer[i].setCount(count);

				} else
					System.out.println("���޴˺�");

			}
			break;
		}
		}

	}

	

	public static void showAllCustomer(Customer[] customer) {
		int temp = 0;
		for (int i = 0; i < customer.length; i++) {
			if (customer[i] == null) {
				temp = i;
				break;
			}
		}
		System.out.println("��Ա��                     ����                            ����");
		System.out.println("--------------|----------------|----------------|");
		for (int i = 0; i < temp; i++) {
			System.out.print("      " + customer[i].getNum() + "              ");
			System.out.print(customer[i].getBirth() + "             ");
			System.out.print(customer[i].getCount());
			System.out.println();
		}

	}

	public static void showCustomer(Customer[] customer, Scanner sc) {
		System.out.println("������Ҫ��ѯ�Ļ�Ա�ţ�");
		int num=sc.nextInt();
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getNum() == num) {
				System.out.println("��Ա��                     ����                            ����");
				System.out.println(customer[i].getNum());
				break;
			}

		}
		System.out.println("����");
	}

}
