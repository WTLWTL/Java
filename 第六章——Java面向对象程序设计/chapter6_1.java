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


//�¶ȼ���
class C_Thermometer{
	private double vaule;	//�¶ȼ���ʾ��ֵ�����϶ȣ�
	public C_Thermometer(){	//���췽��
		vaule = 25.0;
	}
	public void reSet(){	//�¶ȼƸ�λ
		value = 30.0;
	}
	public double measure(){	//��������
		value = 36+(Math.random()*100%7);	//ʹ������������汻����������ֵ	
		return value;
	}
	public void measure(C_Patient pa){	//�������·�������
		pa.setTemperature(measure());
	}
	public double getValue(){	
		return value;	//��ȡ�¶ȼ�ֵ
	}
}


class C_Patient{//������Ķ���
	public static int patientcount;
	String name;
	String sex;
	private C_Date birthday;
	double temperature;
	String prescription;//����
	public C_Patient(String name,String sex){//���췽��
		this.name = name;
		this.sex = sex;
		this.birthday = new C_Date();
		patientcount++;
	}
	public C_Patient(String name,String sex,C_Date date){//���췽������
		this.name = name;
		this.sex = sex;
		this.birthday = date;
		patientcount++;
	}
	public static int getPatientCount(){ //��ȡ�ܲ�������
		return C_Patient.patientcount;
	}
	public void setTemperature(double temperature){	//��д��������
		this.temperature = temperature;
	}
	public void setPrescription(String prescription){	//��д����
		this.prescription = prescription;
	}
	public String getName(){	//��ȡ��������
		return name;
	}
	public String getSex(){	//��ȡ�����Ա�
		return sex;
	}
	public double getTemperature(){	//��ȡ��������
		return temperature;
	}
	public C_Date getBirthday(){	//��ȡ���˵ĳ�������
		return birthday;
	}
	public String getPrescription(){	//��ȡ����
		return prescription;
	}
}