class Doctor{
	String name;
	Doctor(String name)
	{
		this.name=name;
	}
	public void treatPatient(String P){
		System. out. println("医生"+this.name+"治好"+P);
	}
}

class Surgeon extends Doctor{
	Surgeon(String name)
	{ 
		super(name);	//调用父类的构造方法
	}
		public void treatPatient(String P){
			System. out. println("外科医生"+this.name+"治疗"+P);
		} 
		public void treatPatient(int T)
		{
			System. out. println("外科医生"+this.name+"治好"+T+"人");
		}
}
public class ploymorphism{
	public static void main(String[] args){
		Doctor d=new Doctor("张仲景");
		Surgeon s = new Surgeon("白求恩");
		d.treatPatient("王华");
		s.treatPatient("王华");
		s.treatPatient(2);
		d=s;
		d.treatPatient("王华");
	}
	
}