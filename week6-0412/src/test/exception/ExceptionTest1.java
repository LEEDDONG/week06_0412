package test.exception;
import java.util.Scanner;
public class ExceptionTest1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("*����(���������� ��)�Է�:");
		int n1=s.nextInt();
		System.out.print("*�и�(������ ��)�Է�:");
		int n2=s.nextInt();
		try {
		System.out.printf("%d��%d=%d",n1,n2,n1/n2);
	
		}
		catch(ArithmeticException e)//catch(ArithmeticException e)���迡 ����
		{
			System.out.println("!!������ ������ �������� �и� 0�̸� �ȵ˴ϴ�.");
			System.out.println("*�и�(������ ��)�Է�:");
			n2=s.nextInt();
			System.out.printf("%d ��%d=%d",n1,n2,n1/n2);
		}finally {
			System.out.println("���α׷� ����");
		}
		}
}
