package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		System.out.println(a);//[I@3feba861
		System.out.println(Arrays.toString(a));

	}

}
