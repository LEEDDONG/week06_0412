package MethodTest1;

import java.util.Scanner;

public class MethodTest4 {
	static int Add(int n1,int n2)
	{
		int result =n1+n2;
		return result;
	}
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		int n1=0,n2=0;
		while(true) {
		 
		System.out.print("�����Է�:");
		n1=s1.nextInt();
		System.out.println("�����Է�2:");
		n2=s1.nextInt();
		
		int result=Add(n1,n2);
		System.out.println(result);
		
		System.out.print("����Ͻðڽ��ϱ�?(y/n)");
		String c=s1.next();
		if(c.equals("n"))
		{
			System.out.println("���α׷� ����!");
			break;
		}
		
		}
	}
}