//ͳ��������50�����ϵĻ��ߣ���������ߵ�����
public class PatientsElderThanFifty{
	public static void main(String args[]){
		String name[]={"�Ű���","��С��","���о�","��ΰ","�����","��СȪ"};
		int []age={52,11,74,15,36,60};
		int i,count=0;
		System. out. println("50�����ϻ��ߣ�");
		for(i=0;i<age.length;i++){
			if(age[i]>50)
			{
				count++;
				System. out. print(name[i]+" ");
			}
		}
		System. out. println("\n50�����ϵĻ���������"+count);
		
	}
}