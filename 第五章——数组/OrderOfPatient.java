//��5-6�����ݹҺ�˳�򣨼������е�Ԫ���±�˳����������ҵĻ�������
public class OrderOfPatient{
	public static void main(String args[])
	{
		//��������ʼ��һ����ŹҺ����ݵ�String���ά����patientToday
		String [][]patientToday = 
		{
			{"45138","�Ű���","�ڿ�"},{"00416","������","����"},
			{"9","���о�","���"},{"12","��ΰ","����"},
			{"23","�����","�ڿ�"},{"00545","��СȪ","�ڿ�"},
			{"23254","������","��ǻ��"},{"12312","����","�ǿ�"}
		};
		//��������ʼ��һ�����ҽԺ�������Ƶ�String��һά����section
		String []section={"�ڿ�","���","����","����","��ǻ��","�ǿ�"};
		for(int i=0;i<section.length;i++)
		{
			int n=0;
			System. out. print(section[i]+":");
			for(int j=0;j<patientToday.length;j++)
			if(section[i]==patientToday[j][2])	//if(patientToday[j][2].equals(section[i]))//�ж϶����Ƿ���ȣ��������Ƿ��ڱ����ҹҺ�
			System. out. print((++n)+"-"+patientToday[j][1]+" ");
			System. out. println();
		}
	}
}