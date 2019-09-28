public class ExampleOfStringBuffer
{
	public static void main(String args[])
	{
		/*
		StringBuffer str = new StringBuffer("内科副主任医师");
		str.delete(0,3);//删除str下标为0~2的字符,此时结果为“主任医师”
		str.insert(0,"外科");//在str下标为0的位置插入字符串“外科”，此时str为“外科主任医师”
		str.replace(2,4,"主治");//替换字符串中下标为2~3（4-1）的部分,此时结果为“外科主治医师”
		//在末尾添加字符串“门诊”
		str.append("门诊");//str：外科主治医师门诊
		str.delete(0,str.length());//删除字符串str的全部字符；str.length(),注意括号
		System. out. println(str.length);//此时输出的字符串长度为0
		*/
		
		//String 和StringBuffer类的区别
		String str = new String("surgeon");
		StringBuffer strbuf = new StringBuffer("x-ray");
		String dstr = str.replace("on","ry");
		strbuf.replace(0,1,"X");
		System. out. println(strbuf);//输出结果为“X-ray”，结果被修改
		System. out. println(str);//输出结果为“surgeon”，str对象不变
		System. out. println(dstr);//输出结果为surgery，dstr是str.repalce("on","ry")的结果
	}
}