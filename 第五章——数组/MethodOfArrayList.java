import java.util.ArrayList;
public class MethodOfArrayList{
	public static void main(String args[])
	{
		int i;
		//����һ���յĵ��б����ڴ洢�ַ���
		ArrayList<String>section = new ArrayList<String>();
		section.add("�ڿ�");section.add("���");
		section.add("����");section.add("�ǿ�");
		section.add(2,"��ٿ�");//����ַ������±�Ϊ2��λ�ã�����Ԫ��˳�κ���
		section.remove(3);//ɾ���±�Ϊ3��Ԫ�أ����ĸ�Ԫ�أ������Ԫ������ǰ��
		//����б�������Ԫ��
		for(i=0;i<section.size();i++)
			System. out. print(section.get(i)+" ");
		System. out. println();
	}
}