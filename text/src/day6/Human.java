package day6;

public class Human {
	private int years;
	private int a[];//���Զ����������ͣ�
	Object j=new Object();
	
	

	public int getYears() {
		return years;
		
		
	}

	public void setYears(int years) {
		this.years = years;
	}
	public void charge()
	{
		if(this.years<=5)
			System.out.println("��Ʊ");
			else if(this.years<=18)
				System.out.println("��Ʊ");
			else System.out.println("ȫƱ");
	}

}
