//ҽԺ�ӿڣ�hospital��
package hospital_pack;
public interface Hospital{
	String name = "GDPUHospital";
	String addr = "guangzhou";
	public void department();
}
//�ڿ��ࣨInternalMedicine��
package hospital_pack.intermedic;
import  hospital_pack.Hospital;
public class InternalMedicine implements Hospital{
	public void department(){
		System. out. println("��Ժ�ڿ��У������ڿƣ����ڿƣ����ڿƣ������ڿƣ��ڷ��ڿƣ����ڿƵ�");
	}
}
//�����(SurgicalDepartment)
package hospital_pack.surgdepart;
import hospital_pack.Hospital;
public class SurgicalDepartment implements Hospital{
	public void department(){
		System. out. println("��Ժ����й���ƣ�����ƣ�������ƣ�����ƣ�������ƣ�������Ƶ�");
	}
}

//������(FirtHospital)
package hospital_pack;
import hospital_pack.intermedic.InternalMedicine;//����InternalMedicine��
import hospital_pack.surgdepart.SurgicalDepartment;//����SurgicalDepartment��
public class FirstHospital{
	public static void main(String args[]){
		Hospital hos = new InternalMedicine();
		Hospital hos1 = new SurgicalDepartment();
		System. out. println("ҽԺ���ƣ�"+Hos.name);
		System. out. println("ҽԺ��ַ��"+Hos1.addr);
		hos.department();
		hos1.department();
	}
}
