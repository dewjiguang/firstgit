package day7;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		System.out.println("������Ҫ¼�������");
		Scanner s=new Scanner(System.in);
		
	
	Score sc=new Score(s.nextInt());
	s.close();
	sc.ifsmall60();
	sc.printf();
	Text2.function4();

	}
	
}
