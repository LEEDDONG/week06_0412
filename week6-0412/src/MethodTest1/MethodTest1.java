package MethodTest1;

public class MethodTest1 {

	

		static void printHead(char c,int cnt) {
			for(int i = 0;i<cnt;i++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		
		public static void main(String[] args)
		{
			printHead('★',30);
			System.out.println("유한대학겨 컴퓨터 소프트웨어공학과");
			printHead('★',30);
			System.out.println("기본적인 사용자정의 메소드를 작성합니다");
			printHead('★',30);
		}
	}


