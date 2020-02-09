//医院接口（hospital）
package hospital_pack;
public interface Hospital{
	String name = "GDPUHospital";
	String addr = "guangzhou";
	public void department();
}
//内科类（InternalMedicine）
package hospital_pack.intermedic;
import  hospital_pack.Hospital;
public class InternalMedicine implements Hospital{
	public void department(){
		System. out. println("本院内科有：消化内科，心内科，肾内科，肿瘤内科，内分泌科，神经内科等");
	}
}
//外科类(SurgicalDepartment)
package hospital_pack.surgdepart;
import hospital_pack.Hospital;
public class SurgicalDepartment implements Hospital{
	public void department(){
		System. out. println("本院外科有骨外科，普外科，泌尿外科，脑外科，心胸外科，烧伤外科等");
	}
}

//运行类(FirtHospital)
package hospital_pack;
import hospital_pack.intermedic.InternalMedicine;//导入InternalMedicine类
import hospital_pack.surgdepart.SurgicalDepartment;//导入SurgicalDepartment类
public class FirstHospital{
	public static void main(String args[]){
		Hospital hos = new InternalMedicine();
		Hospital hos1 = new SurgicalDepartment();
		System. out. println("医院名称："+hos.name);
		System. out. println("医院地址："+hos1.addr);
		hos.department();
		hos1.department();
	}
}
