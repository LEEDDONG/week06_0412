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

			
			System.out.print("*분자(나누어지는 수)입력:");
			n1=s.nextInt();
			System.out.print("*분모(나누는 수)입력:");
			n2=s.nextInt();
		System.out.printf("%d÷%d=%d",n1,n2,n1/n2);
	
		}
		catch(ArithmeticException e)//catch(ArithmeticException e)시험에 나옴
		{
			System.out.println("!!정수를 정수로 나눌때는 분모가 0이면 안됩니다.");
			System.out.println("*분모(나누는 수)입력:");
			n2=s.nextInt();
			System.out.printf("%d ÷%d=%d",n1,n2,n1/n2);
		}catch(InputMismatchException e)
		{
			System.out.println("!!! 정수만 입력해야합니다.");
		}
		finally {
			System.out.println("프로그램 종료");
		}
		}
}
