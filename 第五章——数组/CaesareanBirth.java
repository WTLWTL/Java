//例5-7：模拟医师剖腹产手术过程，先切开部位后缝合
public class CaesareanBirth
{
	public static void main(String args[])
	{
		int i;
		String []operate = {"腹壁","子宫壁","羊膜囊","脐带"};
		System. out. println("剖腹产手术基本流程：");
		for(i=0;i<operate.length-1;i++)
			System. out. print("切开"+operate[i]+"—>");
		System. out. print("取出婴儿"+"—>");
		System. out. print("剪断"+operate[i]+"—>");
		System. out. print("消毒"+"—>");
		System. out. print("缝合"+operate[i]+"断端"+"—>");
		for(i=operate.length-2;i>=0;i--)
		{
			System. out. print("缝合"+operate[i]);
			if(i!=0)
			System. out. print("—>");
		}
	}
}