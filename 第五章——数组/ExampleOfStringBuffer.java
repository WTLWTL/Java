public class ExampleOfStringBuffer
{
	public static void main(String args[])
	{
		/*
		StringBuffer str = new StringBuffer("�ڿƸ�����ҽʦ");
		str.delete(0,3);//ɾ��str�±�Ϊ0~2���ַ�,��ʱ���Ϊ������ҽʦ��
		str.insert(0,"���");//��str�±�Ϊ0��λ�ò����ַ�������ơ�����ʱstrΪ���������ҽʦ��
		str.replace(2,4,"����");//�滻�ַ������±�Ϊ2~3��4-1���Ĳ���,��ʱ���Ϊ���������ҽʦ��
		//��ĩβ����ַ��������
		str.append("����");//str���������ҽʦ����
		str.delete(0,str.length());//ɾ���ַ���str��ȫ���ַ���str.length(),ע������
		System. out. println(str.length);//��ʱ������ַ�������Ϊ0
		*/
		
		//String ��StringBuffer�������
		String str = new String("surgeon");
		StringBuffer strbuf = new StringBuffer("x-ray");
		String dstr = str.replace("on","ry");
		strbuf.replace(0,1,"X");
		System. out. println(strbuf);//������Ϊ��X-ray����������޸�
		System. out. println(str);//������Ϊ��surgeon����str���󲻱�
		System. out. println(dstr);//������Ϊsurgery��dstr��str.repalce("on","ry")�Ľ��
	}
}