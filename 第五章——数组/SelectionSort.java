//例5-1：已知医院某天每个科室的患者数，找出当天患者最多的科室
/*public class MaxOfPatientNumber{
	public static void main(String args[]){
		String [] section = {"内科","外科","妇科","儿科","口腔科","骨科"};
		//声明并初始化String类数组section，存储科室名称
		int [] amount = {60,27,42,63,19,31};
		for(int i=0;i<6;i++)
			System. out. println(section[i]+":"+amount[i]);
		int index=0;
		for(int i=0;i<amount.length;i++)
			{
				if(amount[i]>amount[index])
				index=i;
			}//找出amount数组中最大下标，以index保存
			System. out. println("当天患者人数最多的是:"+section[index]+" 人数为:"+amount[index]);
	}
}*/


//例5-3：使用5-1的科室名称和患者人数的数据，根据患者人数从小到大输出科室名称和相应人数
public class SelectionSort
{
	public static void main(String args[])
	{
			String []section={"内科","外科","妇科","儿科","口腔科","骨科"};
			int []amount = {60,27,42,63,19,31};
			String tempString;
			int i,j,iMin,tempInt;
			//选择排序
			
			//错误代码1
			/*	for(i=0;i<amount.length-1;i++)
			{
				iMin=i;
				for(j=i+1;j<amount.length;j++)	//for和if都无括号
				{
						if(amount[j]<amount[iMin])//if amount[i]>amount[j]
					{
					iMin=j;
					tempInt=amount[i];amount[i]=amount[iMin];amount[iMin]=tempInt;
					tempString=section[i];section[i]=section[iMin];section[iMin]=tempString;
					}
				}
			}*/
			
			for(i=0;i<amount.length-1;i++)//为什么是amount.length-1
			{
				iMin=i;
				for(j=i+1;j<amount.length;j++)
				if(amount[j]<amount[iMin])//if amount[i]>amount[j]
					iMin=j;
			tempInt=amount[i];amount[i]=amount[iMin];amount[iMin]=tempInt;
			tempString=section[i];section[i]=section[iMin];section[iMin]=tempString;
	}
			System. out. println("科室患者人数排序：");
			for(i=0;i<6;i++)
			System. out. println(section[i]+":"+amount[i]);
	}
}