public class classA{
	public int i=1;	//实例变量
	public static int ii=10;//类变量
	public String Omethod() //实例方法
	{	
		return "Omethod";
	}
	public static String Smethod(){	//类方法
		return "Smethod";
	}
	public static void main(String[] args){	//main是类方法
		classA a = new classA();
		System. out. println(a.ii);	//类方法中允许访问类变量，允许
		System. out. println(classA.ii);//类方法中访问类变量，允许
		System. out. println(a.Smethod());//类方法中调用类方法，允许
		System. out. println(classA.Smethod());//类方法中调用类方法，允许
		
		
		//System. out. println(i);	//类方法中直接访问实例变量，不允许
		//System. out. println(Omethod());//类方法中直接调用实例方法，不允许
		
		System. out. println(a.i);//通过实例访问实例变量，允许
		System. out. println(a.Omethod());//通过实例调用实例方法，允许
		
	}
}