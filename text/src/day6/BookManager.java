package day6;

import java.util.Scanner;

public class BookManager {

	//������
	static Book[] books = new Book[10];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
	
	public void start() {
		System.out.println("*************************");
		System.out.println("*******��ӭʹ��ͼ�����ϵͳ***");
		System.out.println("*************************");
	}
	
	public static void add() {
		System.out.println("������������");
		String bookName = sc.next();
		System.out.println("���������ߣ�");
		String author = sc.next();
		System.out.println("������۸�");
		float price = sc.nextFloat();
		
		//���Է�װ��������
		Book book = new Book(bookName,author,price);
		
		boolean isFull = true;
		//�ҳ���λ
		for (int i = 0; i < books.length; i++) {
			if(books[i]==null) {
				isFull = false;
				books[i] = book; //�����������
				break;
			}
		}
		
		if(isFull) {
			System.out.println("���ʧ�ܣ�������");
		}else {
			System.out.println("***��ӳɹ���*****");
		}
		menu();
	}
	public static void delate()
	{
		System.out.println("������Ҫɾ����������");
		String input=sc.next();
		boolean ifdelate=false;
		int i=0;
		for(Book s:books)
		{
			if(books[i]!=null&&i<10)
				{
				if(s.getBookName().equals(input))
				{
					books[i]=null;
					ifdelate=true;
					break;
				}
				
				i++;
			}
			else continue;
		}
		if(ifdelate)
			System.out.println("ɾ���ɹ�");
		else
			System.out.println("ɾ��ʧ��");
		menu();
	
	}
	public static void search()
	{
		System.out.println("������Ҫ��ѯ��������");
		String input=sc.next();
		
		for(Book b:books)
		{
			if(b.getBookName().equals(input))
			{
				System.out.println("������ϸ��Ϣ���£�");
				System.out.print("������"+b.getBookName()+"\t���ߣ�"+b.getAuthor()+"�۸�"+b.getPrice()+"״̬��");
				if(b.getState()==1)
					System.out.println("�ѽ��");
				else
					System.out.println("δ���");
				break;
			}
		}
		menu();
	}
	/**
	 * 	�б�
	 */
	public static void list() {
		System.out.println("ͼ����\t����\t�۸�\t״̬");
		for (Book book : books) {
			if(book==null) {
				continue;
			}
			String name = book.getBookName();
			String author = book.getAuthor();
			float price = book.getPrice();
			byte state = book.getState();
			System.out.println(name+"\t"+author+"\t"+price+"\t"+state);
		}
		menu();
	}
	public static void change()
	{
		
	}
	public static void menu()
	{
		System.out.println("--------------------------");
		System.out.println("1.¼���鼮��Ϣ");
		System.out.println("2.ɾ���鼮��Ϣ");
		System.out.println("3.�����鼮��Ϣ");
		System.out.println("4.��ʾ�鼮��Ϣ");
		System.out.println("5.�����鼮��Ϣ");
		System.out.println("6.�˳��鼮��Ϣ");
		System.out.println("--------------------------");
		
		System.out.println("������Ҫ���еĲ���");
		switch (sc.nextInt()) {
		case 1:
			add();
			break;
		case 2:
			delate();
			break;
		case 3:
			search();
			break;
		case 4:
			list();
			break;
		case 5:
			change();
			break;
		case 6:
			
			break;

		default:
			System.out.println("��������");
			menu();
			break;
		}
		
	}
}

/**
 * 	ͼ����
 *
 */
class Book{
	public static final byte STATE_LEND = 1;
	public static final byte STATE_NOTLEND = 2;
	private String bookName;
	private String author;
	private float price;
	private byte state;
	
	public Book(String bookName,String author,float price,byte state) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.state = state;
	}
	public Book(String bookName,String author,float price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.state = STATE_NOTLEND;
	}
	public Book() {}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public byte getState() {
		return state;
	}
	public void setState(byte state) {
		this.state = state;
	}
}
