//��5-1����֪ҽԺĳ��ÿ�����ҵĻ��������ҳ����컼�����Ŀ���

public class MaxOfPatientNumber{
	public static void main(String args[]){
		String []section = {"�ڿ�","���","����","����","��ǻ��","�ǿ�"};
		//��������ʼ��String������section���洢��������
		int [] amount = {60,27,42,63,19,31};
		for(int i=0;i<6;i++)
			System. out. println(section[i]+":"+amount[i]);
		int index=0;
		for(int i=0;i<amount.length;i++)
			{
				if(amount[i]>amount[index])
				index=i;
			}//�ҳ�amount����������±꣬��index����
			System. out. println("���컼������������:"+section[index]+" ����Ϊ:"+amount[index]);
	}
}