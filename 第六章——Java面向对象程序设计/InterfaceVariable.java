//����ӿ�AddI
interface AddI{int add(int a,int b);};
//����ӿ�SubI
interface SubI{int sub(int a,int b);};

//ʵ����AddI��SubI�����ӿ�
public class InterfaceVariable implements AddI,SubI{
	//ʵ�ֽӿ�AddI�ķ���
	public int add(int a,int b){
		return a+b;
	}
	//ʵ�ֽӿ�SubI�ķ���
	public int sub(int a,int b){
		return a-b;
	}
	//��ʵ�ֽӿڵķ���
	public int mul(int a,int b){
		return a*b;
	}
	public static void main(String args[]){
		//AddI���͵�pָ��InterfaceVariabled����
		AddI p=new InterfaceVariable();
		System. out. println("20+10="+p.add(20,10));//AddI ����add����������
		//System. out. println("20+10="+p.sub(20,10));//AddI��û��sub����������
		//System. out. println("20+10="+p.mul(20,10));//AddI��û��mul����������

		System. out. println("20+10="+((InterfaceVariable)p).sub(20,10));
		System. out. println("20x10="+((InterfaceVariable)p).mul(20,10));
	}
}