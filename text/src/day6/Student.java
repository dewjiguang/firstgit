package day6;

public class Student {
	 private String name;
	private int age;
	private String sex;
	Student(String name,int age,String sex)
	{
		this.age=age;
		this.sex=sex;
		this.name=name;
	}
	Student()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void study()
	{
		System.out.println("������"+name+"�Ա�"+sex+"���䣺"+age+"��ѧϰ");
	}
	public void eat()
	{
		System.out.println("������"+name+"�Ա�"+sex+"���䣺"+age+"�ڳԷ�");
	}
	public static void function()
	{
		System.out.println("����һ����̬�ķ���");
	}

}
