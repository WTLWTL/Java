//在面向对象的程序设计中，类是对象的抽象与归纳。它是一种复杂的数据类型，不但包含数据，而且还包含对数据进行操作的方法（Method）。
class C_Date	
{
	private int year;//年
	private int month = 1;//月
	private int day = 1;//天
	public C_Date()				//构造方法，无参数
	{
			year=1900;
	}
	public C_Date(int y,int m,int d);//构造方法的重载
	{
		year = y;
		month = m;
		day = d;
	}
	public void setDate(int year,int month,int day){	//设置日期的年-月-日
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
}


//温度计类
class C_Thermometer{
	private double vaule;	//温度计显示的值（摄氏度）
	public C_Thermometer(){	//构造方法
		vaule = 25.0;
	}
	public void reSet(){	//温度计复位
		value = 30.0;
	}
	public double measure(){	//测量体温
		value = 36+(Math.random()*100%7);	//使用随机函数仿真被测量者体温值	
		return value;
	}
	public void measure(C_Patient pa){	//测量体温方法重载
		pa.setTemperature(measure());
	}
	public double getValue(){	
		return value;	//读取温度计值
	}
}


class C_Patient{//病人类的定义
	public static int patientcount;
	String name;
	String sex;
	private C_Date birthday;
	double temperature;
	String prescription;//处方
	public C_Patient(String name,String sex){//构造方法
		this.name = name;
		this.sex = sex;
		this.birthday = new C_Date();
		patientcount++;
	}
	public C_Patient(String name,String sex,C_Date date){//构造方法重载
		this.name = name;
		this.sex = sex;
		this.birthday = date;
		patientcount++;
	}
	public static int getPatientCount(){ //读取总病人人数
		return C_Patient.patientcount;
	}
	public void setTemperature(double temperature){	//填写病人体温
		this.temperature = temperature;
	}
	public void setPrescription(String prescription){	//填写处方
		this.prescription = prescription;
	}
	public String getName(){	//获取病人姓名
		return name;
	}
	public String getSex(){	//获取病人性别
		return sex;
	}
	public double getTemperature(){	//获取病人体温
		return temperature;
	}
	public C_Date getBirthday(){	//获取病人的出生日期
		return birthday;
	}
	public String getPrescription(){	//获取处方
		return prescription;
	}
}