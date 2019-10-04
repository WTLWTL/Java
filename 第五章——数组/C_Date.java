class C_Date{
	//定义成员变量
    private int year;
   	private int month=1;
    private int day = 1;
    //定义构造方法
    public C_Date(int y,int m,int d){
        year = y;
        month =m;
        day = d;
    }
    //定义成员方法
    public void setDate(int year, int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
}