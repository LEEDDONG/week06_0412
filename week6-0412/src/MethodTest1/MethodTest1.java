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
			printHead('��',30);
			System.out.println("���Ѵ��а� ��ǻ�� ����Ʈ������а�");
			printHead('��',30);
			System.out.println("�⺻���� ��������� �޼ҵ带 �ۼ��մϴ�");
			printHead('��',30);
		}
	}


