package text1;

import java.util.Scanner;



/**
 * ������ͱ��ʽ
 * �����������+ - * / % ++ -- += -=
 * �߼��������& | ! && || 
 * ��ϵ�������> < != <= >= ==
 * λ�������   & | ^ ~
 * ��Ԫ�������  ? :
 */
public class Text2 {

	public static void main(String[] args) {
	
		
	
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num<1000||num>9999)
			System.out.println("�������ֲ���ȷ");
		else {
		
		int a=num/1000;
		int b=num%1000/100;
		int c=num%100/10;
		int d=num%10;
		
		int result =a+b+c+d;
		System.out.println(result);
		if(result>=20)
			System.out.println("һ�Ƚ�");
		else if(result%11==0&&result>20)
			System.out.println("�صȽ�");
		else
			System.out.println("û�н�");
		}
		s.close();
	}
		
	
	
	/**
	 * ��������
	 * �û�����һ����λ�������������Ƿ��н���
	 * �н�����
	 * ����λ�ϵ��������>=20 ��һ�Ƚ�
	 * �����ӽ����11�ı����Ҵ�Լ20��  �صȽ�
	 */
	
		
		
	

}
