//例5-6：根据挂号顺序（即数组中的元素下标顺序）输出各科室的患者姓名
public class OrderOfPatient{
	public static void main(String args[])
	{
		//创建并初始化一个存放挂号数据的String类二维数组patientToday
		String [][]patientToday = 
		{
			{"45138","张爱民","内科"},{"00416","李晓华","儿科"},
			{"9","王中军","外科"},{"12","赵伟","儿科"},
			{"23","孙大庆","内科"},{"00545","何小泉","内科"},
			{"23254","陈敏仪","口腔科"},{"12312","周武","骨科"}
		};
		//创建并初始化一个存放医院科室名称的String类一维数组section
		String []section={"内科","外科","妇科","儿科","口腔科","骨科"};
		for(int i=0;i<section.length;i++)
		{
			int n=0;
			System. out. print(section[i]+":");
			for(int j=0;j<patientToday.length;j++)
			if(section[i]==patientToday[j][2])	//if(patientToday[j][2].equals(section[i]))//判断二者是否相等，即患者是否在本科室挂号
			System. out. print((++n)+"-"+patientToday[j][1]+" ");
			System. out. println();
		}
	}
}