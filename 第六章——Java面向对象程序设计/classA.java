public class classA{
	public int i=1;	//ʵ������
	public static int ii=10;//�����
	public String Omethod() //ʵ������
	{	
		return "Omethod";
	}
	public static String Smethod(){	//�෽��
		return "Smethod";
	}
	public static void main(String[] args){	//main���෽��
		classA a = new classA();
		System. out. println(a.ii);	//�෽����������������������
		System. out. println(classA.ii);//�෽���з��������������
		System. out. println(a.Smethod());//�෽���е����෽��������
		System. out. println(classA.Smethod());//�෽���е����෽��������
		
		
		//System. out. println(i);	//�෽����ֱ�ӷ���ʵ��������������
		//System. out. println(Omethod());//�෽����ֱ�ӵ���ʵ��������������
		
		System. out. println(a.i);//ͨ��ʵ������ʵ������������
		System. out. println(a.Omethod());//ͨ��ʵ������ʵ������������
		
	}
}