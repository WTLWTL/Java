//��5-7��ģ��ҽʦ�ʸ����������̣����п���λ����
public class CaesareanBirth
{
	public static void main(String args[])
	{
		int i;
		String []operate = {"����","�ӹ���","��Ĥ��","���"};
		System. out. println("�ʸ��������������̣�");
		for(i=0;i<operate.length-1;i++)
			System. out. print("�п�"+operate[i]+"��>");
		System. out. print("ȡ��Ӥ��"+"��>");
		System. out. print("����"+operate[i]+"��>");
		System. out. print("����"+"��>");
		System. out. print("���"+operate[i]+"�϶�"+"��>");
		for(i=operate.length-2;i>=0;i--)
		{
			System. out. print("���"+operate[i]);
			if(i!=0)
			System. out. print("��>");
		}
	}
}