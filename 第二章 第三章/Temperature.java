/*
//已知一个单精度浮点型的变量x=12.34，分别求出它的整数部分和小数部分并显示出来
public class Test1
{
	public static void main(String args[])
	{
		float x = 12.34f;
		int integerPart = (int)x;
		float decimalPart = x-integerPart;
		System. out. println("整数部分为"+integerPart);
		System. out. println("小数部分为"+decimalPart);
	}
	}
*/


/*
//求87，72，93的和与平均分
public class Score
{
	public static void main(String args[])
	{
		int chinese = 87,math = 72,english = 93;
		float total=chinese+math+english,aver;
		aver = total/3;
		System. out. println("总分为"+total);
		System. out. println("平均分为"+aver);
	}
}
*/


//已知摄氏温度转换为华氏温度的公式为：f=9/5c+32，病人体温为37.8，求为多少华氏度
public class Temperature
{
	public static void main(String args[])
	{
		float c=37.8f,f;
		f=9*c/5+32;
		System. out. println("体温为"+f);
	}
}