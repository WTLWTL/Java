//��5-4 ���г��Ȳ�ͬ�Ķ�ά����ĳ�ʼ����Ԫ�ص�����
public class TwoDimensionalArray
{
	public static void main(String args[])
	{
		int [][]intArray = {{12,23,34},{6,8},{132,354,671,539}};
		int i,j;
		for(i=0;i<intArray.length;i++)
		{
			for(j=0;j<intArray[i].length;j++)//ע����intArray[i]�ĳ���
			System. out. print(intArray[i][j] + "\t");
			System. out. println();	
		}
	}
}