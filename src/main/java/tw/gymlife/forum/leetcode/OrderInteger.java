package tw.gymlife.forum.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 反轉數字順序   陣列、排序
public class OrderInteger {

	public static void main(String[] args) {
		Integer a[] = {1,2,3,4,5};
		int temp;
		for(int i=0; i < a.length -1 ; i++ ) {
			for(int j = i+1 ; j < a.length ; j++) {
				if(a[j] > a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		Arrays.asList(a).stream().forEach(System.out::println);
	}

}
