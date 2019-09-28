//例5-9：Arrays类常用方法的应用
import java.util.Arrays;
public class MethodArrays
{
	public static void main(String args[])
	{
		int []a1 = new int[]{3,4,5,6};
		int []a2 = new int[]{3,4,5,6};
		System. out. println("数组a1和数组a2是否相等"+Arrays.equals(a1,a2));
		//复制a1数组，生成一个新的b数组
		int b[] = Arrays.copyOf(a1,6);
		System. out. println("数组a1和b是否相等"+Arrays.equals(a1,b));
		System. out. println("原来的b数组：" + Arrays.toString(b));//输出b数组的元素
		Arrays.fill(b,2,5,1);//用1填充数组b[2]~b[4]
		System. out. println("替换后的b数组：" + Arrays.toString(b));//输出替换后的b数组
		Arrays.sort(b);//对数组b进行排序
		System. out. println("排序后的数组b" + Arrays.toString(b));//感受到了java的方便性
		int n=3;
		System. out. print("数值"+n+"在数组b中的下标是：" + Arrays.binarySearch(b,n));
	}
}