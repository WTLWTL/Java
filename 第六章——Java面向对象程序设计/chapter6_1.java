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
	public int getYaar(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
}