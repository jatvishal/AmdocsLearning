package io.learning.lambda;
import java.util.Arrays;
public class SortingLambda {

	public static void main(String[] args) {
		int[] arr = {10,7,18,9,65,32,9,2,5,6};
		lambdaSort();
		Arrays.sort(arr);
		System.out.print("\nsorting using normal function\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void lambdaSort() {
		String[] fruits = {"mango","apple","banana","orange"};
//		Arrays.sort(fruits, Comparator.comparingInt(String::length));
//		Arrays.sort(fruits,(String a, String b)->a.length()-b.length());
		Arrays.sort(fruits,(a, b) -> {return Integer.signum(a.length()-b.length());});
		System.out.print("\nsorting using lambda function\n");
		System.out.print(Arrays.toString(fruits));
//		for(int i=0;i<fruits.length;i++)
//		{
//			System.out.print(fruits[i]+" ");
//		}
	}
}
