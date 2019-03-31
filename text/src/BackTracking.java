import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BackTracking {
	public static void main(String[] args) {

	int n=3;
	int leftnum=n,rightnum=n;//�����ź������Ŷ�����n��
	ArrayList<String> results=new ArrayList<String>();//���ڴ�Ž�ռ�
	parentheses("", results, leftnum, rightnum);
	for(String s:results)
		System.out.println(s);
	Map<Integer,Integer> set=new HashMap<Integer,Integer>();
	set.put(1, 2);
	set.put(1,3);
	for (Integer string : set.keySet()) {
		System.out.println(set.get(string));
	}

	}
	public static void parentheses(String sublist, ArrayList<String> results, int leftnum, int rightnum){
		if(leftnum==0&&rightnum==0)//����
			results.add(sublist);
		if(rightnum>leftnum)//ѡ������������ڲ�ͬ��if˳������Ľ��˳���ǲ�һ���ģ����ǹ���һ���Ľ�ռ�
			parentheses(sublist+")", results, leftnum, rightnum-1);
		if(leftnum>0)
			parentheses(sublist+"(", results, leftnum-1, rightnum);
		
	}
}
