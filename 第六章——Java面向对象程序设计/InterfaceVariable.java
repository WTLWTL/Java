//定义接口AddI
interface AddI{int add(int a,int b);};
//定义接口SubI
interface SubI{int sub(int a,int b);};

//实现了AddI和SubI两个接口
public class InterfaceVariable implements AddI,SubI{
	//实现接口AddI的方法
	public int add(int a,int b){
		return a+b;
	}
	//实现接口SubI的方法
	public int sub(int a,int b){
		return a-b;
	}
	//非实现接口的方法
	public int mul(int a,int b){
		return a*b;
	}
	public static void main(String args[]){
		//AddI类型的p指向InterfaceVariabled对象
		AddI p=new InterfaceVariable();
		System. out. println("20+10="+p.add(20,10));//AddI 中有add方法，允许
		//System. out. println("20+10="+p.sub(20,10));//AddI中没有sub方法，出错
		//System. out. println("20+10="+p.mul(20,10));//AddI中没有mul方法，出错

		System. out. println("20+10="+((InterfaceVariable)p).sub(20,10));
		System. out. println("20x10="+((InterfaceVariable)p).mul(20,10));
	}
}