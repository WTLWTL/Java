//��5-1����֪ҽԺĳ��ÿ�����ҵĻ��������ҳ����컼�����Ŀ���
/*public class MaxOfPatientNumber{
	public static void main(String args[]){
		String [] section = {"�ڿ�","���","����","����","��ǻ��","�ǿ�"};
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
}*/


//��5-3��ʹ��5-1�Ŀ������ƺͻ������������ݣ����ݻ���������С��������������ƺ���Ӧ����
public class SelectionSort
{
	public static void main(String args[])
	{
			String []section={"�ڿ�","���","����","����","��ǻ��","�ǿ�"};
			int []amount = {60,27,42,63,19,31};
			String tempString;
			int i,j,iMin,tempInt;
			//ѡ������
			
			//�������1
			/*	for(i=0;i<amount.length-1;i++)
			{
				iMin=i;
				for(j=i+1;j<amount.length;j++)	//for��if��������
				{
						if(amount[j]<amount[iMin])//if amount[i]>amount[j]
					{
					iMin=j;
					tempInt=amount[i];amount[i]=amount[iMin];amount[iMin]=tempInt;
					tempString=section[i];section[i]=section[iMin];section[iMin]=tempString;
					}
				}
			}*/
			
			for(i=0;i<amount.length-1;i++)//Ϊʲô��amount.length-1
			{
				iMin=i;
				for(j=i+1;j<amount.length;j++)
				if(amount[j]<amount[iMin])//if amount[i]>amount[j]
					iMin=j;
			tempInt=amount[i];amount[i]=amount[iMin];amount[iMin]=tempInt;
			tempString=section[i];section[i]=section[iMin];section[iMin]=tempString;
	}
			System. out. println("���һ�����������");
			for(i=0;i<6;i++)
			System. out. println(section[i]+":"+amount[i]);
	}
}