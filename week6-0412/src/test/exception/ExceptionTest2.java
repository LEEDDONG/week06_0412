package test.exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest2 {
	static void inputTest() {
		
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n1=0 ,n2=0;
		try {

			
			System.out.print("*����(���������� ��)�Է�:");
			n1=s.nextInt();
			System.out.print("*�и�(������ ��)�Է�:");
			n2=s.nextInt();
		System.out.printf("%d��%d=%d",n1,n2,n1/n2);
	
		}
		catch(ArithmeticException e)//catch(ArithmeticException e)���迡 ����
		{
			System.out.println("!!������ ������ �������� �и� 0�̸� �ȵ˴ϴ�.");
			System.out.println("*�и�(������ ��)�Է�:");
			n2=s.nextInt();
			System.out.printf("%d ��%d=%d",n1,n2,n1/n2);
		}catch(InputMismatchException e)
		{
			System.out.println("!!! ������ �Է��ؾ��մϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
		}
}
