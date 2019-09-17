//4名住院患者，一天中三次测量体温。设计二维数组保存这些数据
import java.util.Scanner;	//导入java.util包的Scanner类，用于键盘输入
public class Temperature
{
	public static void main(String args[])
	{
		int i,j;
		double [][]t = new double [4][3];
		Scanner scan = new Scanner(System.in);
		//按列输入
		System. out .println("            患者序号    1  2  3  4  ");
		for(i=0;i<3;i++)
			{
				System. out. println("第"+ (i+1) +"次量体温:");
				for(j=0;j<4;j++)
				t[j][i] = scan. nextDouble();//j:患者标号，i：体温测量次数编号
			}
			//按行输出
			System. out. println();
			System. out. println("全天体温记录：");
			System. out. println("\t\t第一次\t第二次\t第三次");
			for(i=0;i<4;i++)
			{
				System. out. print("第"+(i+1)+"人：\t");
				for(j=0;j<3;j++)
					{
						System. out. print(t[i][j]+" ");		
				}
				System. out. println();
				}
	}	
}