import java.util.ArrayList;
public class MethodOfArrayList{
	public static void main(String args[])
	{
		int i;
		//建立一个空的的列表，用于存储字符串
		ArrayList<String>section = new ArrayList<String>();
		section.add("内科");section.add("外科");
		section.add("妇科");section.add("骨科");
		section.add(2,"五官科");//添加字符串到下标为2的位置，其他元素顺次后移
		section.remove(3);//删除下标为3的元素（第四个元素），其后元素依次前移
		//输出列表中所有元素
		for(i=0;i<section.size();i++)
			System. out. print(section.get(i)+" ");
		System. out. println();
	}
}