package text;

public class Text4 {
public static void main(String[] args) {
	Mythread m=new Mythread(Integer.toString(1));
	Mythread n=new Mythread(Integer.toString(2));
	m.start();
	n.start();
	
	
}
}

class Mythread extends Thread
{
	String s;
	public  Mythread(String s)
	{
		System.out.println("���캯��");
		this.s=s;
	}
	int a;
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			
			System.out.println("�����߳�"+s+"�ĵ�"+i+"������");
		}
	}
}


