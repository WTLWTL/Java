//���������ĳ�������У����Ƕ���ĳ�������ɡ�����һ�ָ��ӵ��������ͣ������������ݣ����һ����������ݽ��в����ķ�����Method����
class C_Date	
{
	private int year;//��
	private int month = 1;//��
	private int day = 1;//��
	public C_Date()				//���췽�����޲���
	{
			year=1900;
	}
	public C_Date(int y,int m,int d);//���췽��������
	{
		year = y;
		month = m;
		day = d;
	}
	public void setDate(int year,int month,int day){	//�������ڵ���-��-��
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