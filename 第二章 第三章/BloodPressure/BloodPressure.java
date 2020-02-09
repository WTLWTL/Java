public class BloodPressure
{
	public static void main(String args[])
	{
		String suffererId = "1503012";
		int 收缩压 = 160;
		int 舒张压 = 92;
		int 患者数 = 0;
		患者数+=1;
		char 诊断 = 'H';
		double 单价1=26.5d;
		String 药名1 = "艾司唑仑";
		double 单价2 = 13.2d;
		String 药名2 = "复方利血平";
		int 数量1,数量2;
		数量1=2;
		数量2=6;
		double 划价 = 单价1*数量1+单价2*数量2;
		System. out. println("患者编号为："+suffererId);
		System. out. println("患者收缩压为："+收缩压);
		System. out. println("患者舒张为："+舒张压);
		System. out. println("患者血压诊疗效果："+诊断);
		System. out. println("所开药品及数量:"+药名1+数量1+";"+药名2+数量2);//?
		System. out. println("药品总价为："+划价);
		System. out. println("患者数为"+患者数);
		}
	}