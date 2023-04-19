package test.dynamic.array;

public class DynamicArrayTest {

	public static void main(String[] args) {
		int[][]darr=new int[3][];
		int cnt=1;
		//행
		darr[0]=new int[2];
		darr[1]=new int[5];
		darr[2]=new int[3];
		for(int i=0;i<darr.length;i++)
		{
			
			//열
			for(int j=0;j<darr[i].length;j++)
			{
				darr[i][j]=cnt++;
			}
		}
		//출력
		for(int i=0;i<darr.length;i++)
		{
			for(int j=0;j<darr[i].length;j++)
			{
				System.out.print(darr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
