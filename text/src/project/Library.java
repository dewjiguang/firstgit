package project;

import java.util.Scanner;

/**
 * 	ͼ�����ϵͳ��ͼ��(�������۸����ߣ�״̬) ״̬--�ɽ���  �ѽ��
 *  1.�˵��б�
 *  2.ͼ�����
 *  3.ͼ��ɾ��
 *  4.ͼ�����
 *  5.ͼ���б�
 *  6.ͼ����ϸ
 *  7.�������
 *  8.�˳�ϵͳ
 *  
 *  String[] bookName = new String[10]; 
 *  String[] authors = new String[10]; 
 *  float[] price = new float[10]; 
 *  byte[] state = new byte[10];
 */
public class Library {
	private static Scanner sc = new Scanner(System.in);
	
	private final static int COUNT = 10;
	private final static int STATE_LEND = 2;	//�ѽ���
	private final static int STATE_NOTLEND = 1;	//δ����
	//��������
	private static String[] bookNames = new String[COUNT];
	private static String[] authors = new String[COUNT];
	private static float[] prices = new float[COUNT];
	private static byte[] states = new byte[COUNT];
	
	public static void main(String[] args) {
		System.out.println("******************************");
		System.out.println("****��ӭʹ��ͼ�����ϵͳ!*****");
		System.out.println("******************************");
		
		menu();
	}
	
	/**
	 * 	�˵�
	 */
	public static void menu() {
		System.out.println("\n*****��ѡ����********");
		System.out.println("1.���ͼ��");
		System.out.println("2.�޸�ͼ��");
		System.out.println("3.ɾ��ͼ��");
		System.out.println("4.ͼ���б�");
		System.out.println("5.ͼ����ϸ");
		System.out.println("6.����ͼ��");
		System.out.println("7.�黹ͼ��");
		System.out.println("8.�˳�ϵͳ");
		
		int select = sc.nextInt();
		switch (select) {
		case 1:	// ���ͼ��
			add();
			break;
		case 2: // �޸�ͼ��
			update();
			break;
		case 3: // ɾ��ͼ��
			delate();
			break;

		
		case 4: // ͼ���б�
			list();
			break;
		case 5: // ͼ����ϸ
			information();

			break;
		case 6: // ����
			lent();

			break;
		case 7: // �黹
			back();

			break;
		default:
			break;
		}
	}
	
	/**
	 * 	���ͼ��
	 */
	public static void add() {
		//�Ȳ���ͼ��λ��  ͬʱ�鿴�Ƿ�����
		int index = -1;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i]==null) {//��λ��Ϊ��λ
				index = i;
			
				break;
			}
		}
		
		//���û����
		if (index != -1) {
			System.out.println("������������");
			String bookname = sc.next();

			for (int i = 0; i < bookNames.length; i++) {
				if (bookname.equals(bookNames[i])) {
					System.out.println("��Ǹ�������Ѵ���");
					menu();
				}
			}
			bookNames[index] = bookname;
			System.out.println("���������ߣ�");
			authors[index] = sc.next();
			System.out.println("������۸�");
			prices[index] = sc.nextFloat();
			states[index] = STATE_NOTLEND;//

			System.out.println("ͼ����ӳɹ���");
		}else {//�Ѿ�����
			System.out.println("���������");
		}
		
		//���ò˵�
		menu();
	}
	/**
	 * 	�޸�ͼ��
	 */
	public static void update() {
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====���Ϊ�գ�=======");
			System.out.println("�޸�ʧ��");
		}else{
			System.out.println("������Ҫ�޸ĵ�ͼ�����ƣ�");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				try {
				if(bookNames[i].equals(name))
					{num=i;
					break;
					}
				}
				catch(NullPointerException e)
				{
					System.out.println("δ�ҵ���");
					menu();
				}
			}
			if (num == -1)
				System.out.println("δ�ҵ�");
			else {
				bookNames[num] = name;
				System.out.println("������۸�");
				float price = sc.nextFloat();
				prices[num] = price;
				System.out.println("����������");
				String author = sc.nextLine();
				authors[num] = author;
				System.out.println("�޸����");

			}
		}
		
		menu();
		
	}
	public static void delate()
	{
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====���Ϊ�գ�=======");
		}else{
			System.out.println("������Ҫɾ����ͼ�����ƣ�");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				try {
				if(bookNames[i].equals(name))
					{num=i;
					break;
					}
				}
				catch(NullPointerException e)
				{
					System.out.println("δ�ҵ���");
					menu();
				}
			}
			if (num == -1)
				System.out.println("δ�ҵ�");
			else {
				bookNames[num] = null;;	
				prices[num] = 0.0f;	
				authors[num] = null;

			}
		}
		System.out.println("ɾ�����");
		menu();
	}
	public static void lent()
	{
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====���Ϊ�գ�=======");
		}else{
			System.out.println("������Ҫ���ĵ�ͼ�����ƣ�");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				
				if(bookNames[i].equals(bookNames[i]))
					{num=i;
					break;
					}
				}
			

			if (num == -1)
				System.out.println("δ�ҵ�");
			else {
				states[num] = 2;;	
				

			}
			System.out.println("�������");
		}
		
		menu();
	}
	public static void back()
	{

		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====���Ϊ�գ�=======");
		}else{
			System.out.println("������Ҫ�黹��ͼ�����ƣ�");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				
				if(name.equals(bookNames[i]))
					{num=i;
					break;
					}
				
				
			}
			if (num == -1)
				System.out.println("δ�ҵ�");
			else {
				states[num] = 2;
				

			}
			System.out.println("�黹���");
		}
		
		menu();
	}
	public  static void information()
	{
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====���Ϊ�գ�=======");
		}else{
			System.out.println("������Ҫ�鿴��ͼ�����ƣ�");
			String name=sc.next();
			int num=-1;
			for(int i=0;i<bookNames.length;i++)
			{
				
				if(name.equals(bookNames[i]))
					{num=i;
					break;
					}
				
			}
			if (num == -1)
				System.out.println("δ�ҵ�");
			else {
				System.out.println("��ͼ����ϸ��Ϣ���£�");
				System.out.println("������"+bookNames[num]);
				System.out.println("�۸�"+prices[num]);
				System.out.println("���ߣ�"+authors[num]);
				if(states[num]==1)
				{
				System.out.println("״̬��δ��");
				}
				else
				{
					System.out.println("״̬���ѽ�");
					}

			}
		}
		System.out.println();
		menu();
	}
	/**
	 * 	ͼ���б�
	 */
	public static void list() {
		System.out.println("************	ͼ���б�	 ************"); 
		//�鿴�Ƿ�Ϊ��
		boolean isEmpty = true;
		for (int i = 0; i < bookNames.length; i++) {
			if(bookNames[i] != null) {
				isEmpty = false;
			}
		}
		
		if(isEmpty) {
			System.out.println("=====���Ϊ�գ�=======");
		}else{
			System.out.println("ͼ������\tͼ��۸�\tͼ������\t״̬");
			//��Ϊ��
			for (int i = 0; i < bookNames.length; i++) {
				if(bookNames[i]==null) {
					//
					continue;
				}
				String status = states[i]==STATE_LEND ? "�ѽ��" : "�ɽ���";
				System.out.println(bookNames[i]+"\t"+prices[i]+"\t"+authors[i]+"\t"+status);
			}
		}
		
		//���Բ˵�
		menu();
	}
}