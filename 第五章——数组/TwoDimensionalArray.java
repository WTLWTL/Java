//例5-4 各行长度不同的二维数组的初始化和元素的引用
public class TwoDimensionalArray
{
	public static void main(String args[])
	{
		int [][]intArray = {{12,23,34},{6,8},{132,354,671,539}};
		int i,j;
		for(i=0;i<intArray.length;i++)
		{
			for(j=0;j<intArray[i].length;j++)//注意是intArray[i]的长度
			System. out. print(intArray[i][j] + "\t");
			System. out. println();	
		}
	}
}