//��5-9��Arrays�ೣ�÷�����Ӧ��
import java.util.Arrays;
public class MethodArrays
{
	public static void main(String args[])
	{
		int []a1 = new int[]{3,4,5,6};
		int []a2 = new int[]{3,4,5,6};
		System. out. println("����a1������a2�Ƿ����"+Arrays.equals(a1,a2));
		//����a1���飬����һ���µ�b����
		int b[] = Arrays.copyOf(a1,6);
		System. out. println("����a1��b�Ƿ����"+Arrays.equals(a1,b));
		System. out. println("ԭ����b���飺" + Arrays.toString(b));//���b�����Ԫ��
		Arrays.fill(b,2,5,1);//��1�������b[2]~b[4]
		System. out. println("�滻���b���飺" + Arrays.toString(b));//����滻���b����
		Arrays.sort(b);//������b��������
		System. out. println("����������b" + Arrays.toString(b));//���ܵ���java�ķ�����
		int n=3;
		System. out. print("��ֵ"+n+"������b�е��±��ǣ�" + Arrays.binarySearch(b,n));
	}
}