package J201432029;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Example6 {

	static void solution(int[] a) {

		int index =0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 !=0 && a[i] % 3 !=0) {
				a[index] = a[i];
				index++;
			}
		}
		
		for(int i=index; i<a.length; i++) {
			a[i] = -1;
		}
		
		
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[30];
		for (int i = 0; i < 30; ++i)
			a[i] = random.nextInt(8) + 1;
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}
