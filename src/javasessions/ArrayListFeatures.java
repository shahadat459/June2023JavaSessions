package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		System.out.println(marks);
		System.out.println(marks.size());
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		System.out.println(marks);
		System.out.println(marks.size());//4
		System.out.println(marks.get(2));//300
		marks.remove(2);
		System.out.println(marks);
		System.out.println(marks.size());//3
		System.out.println(marks.get(2));//400
		
		ArrayList<String> emp = new ArrayList<String>(Arrays.asList("Muaviya","Ali","Ayesha","Umar","Abu Bakr","Usman"));
		System.out.println(emp.size());
		System.out.println(emp.get(2));
		emp.add("Akola");
		emp.add("Maharashtra");
		System.out.println(emp.get(7));
		System.out.println(emp.size());
		emp.remove(7);
		System.out.println(emp);
		emp.add(1,"Hasan");
		System.out.println(emp);
		emp.add(8,"Husain");
		emp.add("Abbas");
		System.out.println(emp);
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		System.out.println(nList);
		//System.out.println(nList.size());
		nList.add(105);
		nList.add(20);
		nList.add(3000);
		nList.add(4);
		nList.add(404);
		nList.add(114);
		System.out.println(nList);
		//sorting ascending order
		Collections.sort(nList);
		System.out.println(nList);
		//Sorting descending order
		Collections.reverse(nList);
		System.out.println(nList);
		
		//Static Array Sorting
		int test[]= {10,2,2000,0,50,80000};
		System.out.println(Arrays.toString(test));
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		
		ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(10, "Sailani Sarkar"));
		System.out.println(myList.size());
		System.out.println(myList);
		
		
		
		

	}

}
