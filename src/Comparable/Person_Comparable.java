package Comparable;

import java.util.Arrays;

public class Person_Comparable {
	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("ȫ�浿", 18), new Person("�Ӳ���", 22), new Person("����ġ", 23) };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
