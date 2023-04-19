package MethodTest1;

import java.util.Scanner;

public class MethodTest3 {
	static void printAdd(int n1,int n2)
	{
		int result =n1+n2;
		System.out.printf("%d+%d=%d\n",n1,n2,result);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(true) {
		 
		System.out.print("정수입력:");
		int n1=s.nextInt();
		System.out.println("정수입력2:");
		int n2=s.nextInt();
		printAdd(n1,n2);
		System.out.print("계속하시겠습니까?(y/n)");
		String c=s.next();
		if(c.equals("n"))
		{
			break;
		}
		
		}
	}
	
}
