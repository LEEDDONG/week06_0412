package test.exception;
import java.util.Scanner;
public class ExceptionTest3 {
	static void inputTest()throws Exception {
		
		Scanner s=new Scanner(System.in);
		int n1=0 ,n2=0;
	

			
			System.out.print("*����(���������� ��)�Է�:");
			n1=s.nextInt();
			System.out.print("*�и�(������ ��)�Է�:");
			n2=s.nextInt();
		System.out.printf("%d��%d=%d",n1,n2,n1/n2);
	
		}
	public static void main(String[] args)
	{
		try {
			inputTest();
		}catch(Exception  e) {
			System.out.println("������ 0���� ���������� Ȯ��");
			System.out.println("�Է°��� ������ �´��� Ȯ��");
		}
	}
		
		
		
}

