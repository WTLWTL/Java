//统计年龄在50岁以上的患者，并输出患者的姓名
public class PatientsElderThanFifty{
	public static void main(String args[]){
		String name[]={"张爱民","李小华","王中军","赵伟","孙大庆","何小泉"};
		int []age={52,11,74,15,36,60};
		int i,count=0;
		System. out. println("50岁以上患者：");
		for(i=0;i<age.length;i++){
			if(age[i]>50)
			{
				count++;
				System. out. print(name[i]+" ");
			}
		}
		System. out. println("\n50岁以上的患者人数："+count);
		
	}
}