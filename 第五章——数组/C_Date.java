class C_Date{
	//�����Ա����
    private int year;
   	private int month=1;
    private int day = 1;
    //���幹�췽��
    public C_Date(int y,int m,int d){
        year = y;
        month =m;
        day = d;
    }
    //�����Ա����
    public void setDate(int year, int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
}