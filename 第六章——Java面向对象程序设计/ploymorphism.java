class Doctor{
	String name;
	Doctor(String name)
	{
		this.name=name;
	}
	public void treatPatient(String P){
		System. out. println("ҽ��"+this.name+"�κ�"+P);
	}
}

class Surgeon extends Doctor{
	Surgeon(String name)
	{ 
		super(name);	//���ø���Ĺ��췽��
	}
		public void treatPatient(String P){
			System. out. println("���ҽ��"+this.name+"����"+P);
		} 
		public void treatPatient(int T)
		{
			System. out. println("���ҽ��"+this.name+"�κ�"+T+"��");
		}
}
public class ploymorphism{
	public static void main(String[] args){
		Doctor d=new Doctor("���پ�");
		Surgeon s = new Surgeon("�����");
		d.treatPatient("����");
		s.treatPatient("����");
		s.treatPatient(2);
		d=s;
		d.treatPatient("����");
	}
	
}