package javasessions;

import java.util.ArrayList;

public class DynamicArrays {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.size());

		list.add(100);
		list.add(10.5);
		list.add('s');
		list.add("Shahana");
		// list.add(new ar[] { 1, 2, 3 });
		System.out.println(list.size());
		System.out.println(list.get(3));

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		marks.add(500);
		// int a = Integer.parseInt(String.valueOf(ch));
		System.out.println(marks);
		for(int i=0;i<marks.size();i++) {
			System.out.println("--"+marks.get(i)+"--");
		}
		
		for(int i:marks) {
			System.out.println("$$"+i+"$$");
		}
		
		System.out.println("---------------------------");
		
		System.out.println(marks.indexOf(300));;//2
		System.out.println(marks.subList(2,4));
	}

}
