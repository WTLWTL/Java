//例5-1：已知医院某天每个科室的患者数，找出当天患者最多的科室

public class MaxOfPatientNumber{
	public static void main(String args[]){
		String []section = {"内科","外科","妇科","儿科","口腔科","骨科"};
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
}