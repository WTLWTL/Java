//4��סԺ���ߣ�һ�������β������¡���ƶ�ά���鱣����Щ����
import java.util.Scanner;	//����java.util����Scanner�࣬���ڼ�������
public class Temperature
{
	public static void main(String args[])
	{
		int i,j;
		double [][]t = new double [4][3];
		Scanner scan = new Scanner(System.in);
		//��������
		System. out .println("            �������    1  2  3  4  ");
		for(i=0;i<3;i++)
			{
				System. out. println("��"+ (i+1) +"��������:");
				for(j=0;j<4;j++)
				t[j][i] = scan. nextDouble();//j:���߱�ţ�i�����²����������
			}
			//�������
			System. out. println();
			System. out. println("ȫ�����¼�¼��");
			System. out. println("\t\t��һ��\t�ڶ���\t������");
			for(i=0;i<4;i++)
			{
				System. out. print("��"+(i+1)+"�ˣ�\t");
				for(j=0;j<3;j++)
					{
						System. out. print(t[i][j]+" ");		
				}
				System. out. println();
				}
	}	
}