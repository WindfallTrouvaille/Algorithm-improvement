package arithmetic.recursion;

import java.util.Scanner;

public class Training1_��׳� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		Scanner input = new Scanner(System.in);
		//�ر��ע�⣬����̨��������Ͳ��ܳ���13���Ҳ�����13����Ϊ���͵���ֵ��Χ����
		//��int������32λ����64λ�����ΧΪ-2147483648~2147483647��������Χ������ʹ�ø�����������͡�
		int n = input.nextInt();
		//���������n�Ľ׳ˣ������ص�
		int sum = multSum(n);
		System.out.println("������ֵ�Ľ׳ˣ�" + sum);
		
		//��׳�֮��
		int result = Sum(n);
		System.out.println("����1 ~ n�Ľ׳�֮�ͣ�" + result);
		*/
		
		//����12�������ֵ�׳˲��Ҳ��ܳ���21������21
		Scanner inputs = new Scanner(System.in);
		long sums = multiSum(inputs.nextInt());
		System.out.println("����12��Ľ׳���ֵ��" + sums);
	}
	
	public static int multSum(int n) {
		if(n == 1)return 1;
		return n * multSum(n - 1);
	}
	
	//��׳�֮�ͣ�12���ڵİ���12���������ȷ��
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
