package Algorithmn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pro_阶乘非零数字 {
	/**
	 * 题目：P0505
	 * 一个整数n的阶乘可以写成n!，它表示从1到n这n个整数的乘积。阶乘的增长速度非常快，例如，13！就已经比较大了，已经无法存放在一个整型变量中；
	 * 而35！就更大了，它已经无法存放在一个浮点型变量中。因此，当n比较大时，去计算n!是非常困难的。幸运的是，在本题中，我们的任务不是去计算n!，
	 * 而是去计算n
	 * !最右边的那个非0的数字是多少。例如，5！=1*2*3*4*5=120，因此5!最右边的那个非0的数字是2。再如，7！=5040，因此7！最右
	 * 边的那个非0的数字是4。再如，15！=1307674368000，因此15！最右边的那个非0的数字是8。
	 * 
	 * 请编写一个程序，输入一个整数n(0<n<=100)，然后输出n!最右边的那个非0的数字是多少。
	 * @param args
	 */
	private static int result;// 存放阶乘值最右边的那个非零值

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();// 存放n的阶乘值

		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		//print(numberToArray(sum));
		//System.out.println();
		result = printNumber(numberToArray(sum));
		System.out.printf("%d",result);
	}

	private static List<Integer> numberToArray(int n) {
		List<Integer> list = new ArrayList<Integer>();
		if (n >= 1 && n < 10) {
			int a = n;
			list.add(a);
		} else {
			int i = 0;
			while (n != 0) {
				i = n % 10;
				list.add(i);
				n /= 10;
				i++;
			}
		}
		return list;
	}

	private static void print(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i != list.size() - 1) {
				System.out.print(list.get(i) + " ");
			} else
				System.out.print(list.get(i));
		}
	}

	private static int printNumber(List<Integer> list) {

		int sum = 0;
		if (sum == list.size() - 1)
			return list.get(0);
		else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == 0) {
					sum = list.get(i + 1);
				}
			}
		}
		return sum;

	}
}