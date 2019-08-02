public class Diagnosis
{
	public static void main(String args[])
	{
	final String HOSPITALID="0015";//常量名通常全部使用大写字母，以便同变量相区分,final:该变量一旦被初始化便不可改变
	String suffererId="1503052";//变量名通常全部使用小写字母，如果有多个单词，则首字母小写，其后单词首字母大写，其余字母小写
	String suffererName="李明";
	String suffererBirthday="19581208";
	int suffererAge=51;
	boolean suffererMarry = true;
	char suffererSex='男';
	double suffererSalary=5265.5;
	System. out. println("医院代码:"+HOSPITALID);
	System. out. println("患者ID="+suffererId) ;
	System. out. println("姓名="+suffererName);
	System. out. println("出生日期="+suffererBirthday);
	System. out. println("年龄="+suffererAge);
	System. out. println("婚姻状况="+suffererMarry);
	System. out. println("性别="+suffererSex);
	System. out. println("月均收入="+suffererSalary);
		}	
}
//错误：中文括号错误：非法字符: '\uff08'