package dvd;

import java.util.Scanner;

public class Dvdmanager {
	static int bianhao=0;
	Scanner sc=new Scanner(System.in);
	
	static Dvd dvd=new Dvd();//ͷ���
	public void add(){//�����µĶ������ӵ��������
		System.out.println("������DVD������:");
		String name=sc.nextLine();
		
		/*
		 * Dvd d1 = Tool.lastdvdindex(dvd).getIndex();
		 * 
		 * // Dvd d2 = new Dvd(bianhao,name);
		 */
		//d1 = d2;
		 Dvd d2 = new Dvd(bianhao,name);
		 
		Dvd  d1 = Tool.lastdvdindex(dvd) ;//.getIndex();
		
	}

}
