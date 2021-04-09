package arithmetic.recursion;

import java.util.Scanner;

public class Training1_求阶乘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		Scanner input = new Scanner(System.in);
		//特别的注意，控制台输入的整型不能超过13并且不包含13，因为整型的数值范围有限
		//而int类型在32位机和64位机最大范围为-2147483648~2147483647，超出范围，建议使用更大的数据类型。
		int n = input.nextInt();
		//求给定整数n的阶乘，方法回调
		int sum = multSum(n);
		System.out.println("给定数值的阶乘：" + sum);
		
		//求阶乘之和
		int result = Sum(n);
		System.out.println("整数1 ~ n的阶乘之和：" + result);
		*/
		
		//求解比12还大的数值阶乘并且不能超过21不包含21
		Scanner inputs = new Scanner(System.in);
		long sums = multiSum(inputs.nextInt());
		System.out.println("求解比12大的阶乘数值：" + sums);
	}
	
	public static int multSum(int n) {
		if(n == 1)return 1;
		return n * multSum(n - 1);
	}
	
	//求阶乘之和，12以内的包含12，结果是正确的
	public static int Sum(int n) {
		int result = 1;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			result *= i;
			sum += result;
		}
		return sum;
	}
	
	public static long multiSum(int n) {
		if(n == 1)return 1;
		return n * multiSum(n - 1);
	}
}
