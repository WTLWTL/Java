//�����¡���java���̿��ƴ���

/*import javax. swing. JOptionPane;
public class Score{
	public static void main(String args[]){
		int score;
		String str;
		str = JOptionPane. showInputDialog("Enter a mark");
		score = Integer.parseInt(str);
		if(score>100||score<0)
		{
			JOptionPane. showMessageDialog(null,"�ɼ����ܳ���100��С��0");
		}
		else
		{
			if(score>=90)
			str="����";
			if(score>=80&&score<=90)
			str="����";
			if(score>=70&&score<80)
			str="��";
			if(score>=60&&score<70)
			str="����";
			if(score<60)
			str="������";
			JOptionPane.showMessageDialog(null,"�ɼ�"+str);
		}
	}
}
*/

/*import javax. swing. JOptionPane;
public class Bmi{
	public static void main(String args[]){
		float weight,height,bmi;
		String str;
		str = JOptionPane. showInputDialog("��������������");
		weight = Float. parseFloat(str);
		str = JOptionPane. showInputDialog("�������������");
		height = Float. parseFloat(str);
		if(weight>0&&height>0){
		bmi = weight/height/height;
		if(bmi<18.5f)
		str="�������ع���";
		if(bmi>=18.5f&&bmi<=23.9f)
		str = "������������";
		if(bmi>=24.0f&&bmi<=27.9f)
		str="������";
		if(bmi>=28)
		str = "�����ڷ���";
		JOptionPane. showMessageDialog(null,str);
	}
		else
		JOptionPane. showMessageDialog(null,"��������ݱ������0");
	}
}
*/

/*
//�Һ����ͳ��
import javax. swing. JOptionPane;
public class Outpatient_flow{
	public static void main(String args[])
	{
		int n1=0,n2=0,n3=0,n4=0;
		int num;
		String str;
		do{
			str = JOptionPane. showInputDialog("������Һ���");
			num = Integer.parseInt(str);
			if(num>=0&&num<=4)
			{
				switch(num)
				{
					case 1:
								n1+=1;break;
					case 2:
								n2+=1;break;
					case 3:
								n3+=1;break;
					case 4:
								n4+=1;break;
				}
			}
			else
			JOptionPane. showMessageDialog(null,"�������");
		}while (num!=0);
		System. out. println("����1����������Ϊ:"+n1);
		System. out. println("����2����������Ϊ:"+n2);
		System. out. println("����3����������Ϊ:"+n3);
		System. out. println("����4����������Ϊ:"+n4);
	}
}
*/

/*
//��whileѭ����1+2+3+...+99+100���ۼӺ�
public class Sum_while{
	public static void main(String[] args){
		int sum=0,n=1;
		while(n!=101){
			sum+=n;
			n++; 
		}
		System. out. println(+sum);
	}
}
*/

/*
//��д���򣬶���һ��������������ͣ��������֡�0�����ʾ�������
import javax. swing. JOptionPane;
public class Sum_uncertain_while{
	public static void main(String args[]){
		int sum=0,data;
		String s;
		s = JOptionPane. showInputDialog(null,"����һ������:");
		data = Integer.parseInt(s);
		while(data!=0)
		{
			sum+=data;
			s = JOptionPane. showInputDialog(null,"����һ������:");
			data = Integer.parseInt(s);
		}
		JOptionPane. showMessageDialog(null,"��Ϊ��"+sum);
	}
}
*/

/*
//do...while ���
import javax. swing. JOptionPane;
public class Sum_uncertain_do{
	public static void main(String args[])
	{
		int sum=0,data;
		String s;
		s = JOptionPane. showInputDialog(null,"����һ������");
		data = Integer. parseInt(s);
		do{
			sum+=data;
			s = JOptionPane. showInputDialog(null,"����һ������");
			data=Integer. parseInt(s);
		}while(data!=0);
		JOptionPane. showMessageDialog(null,"��Ϊ"+sum);
	}
}
*/

/*
//�žų˷���
public class Multiplication_table{
	public static void main(String args[])
	{
		int i,j;
		System. out. print("*  |");
		for(i=1;i<=9;i++){	//��ӡ��ͷ
			if(i==1)
			System. out. print(" "+i);
			else
			System. out. print("  "+i);
		}
		System. out. println();	//���ڻ���
		System. out. println("---|--------------------------");
		for(i=1;i<=9;i++){
			System. out. print(i+"  | ");
			for(j=1;j<=i;j++){
			if(i*j<10)
			System. out. print(" "+i*j+" ");
			else
		System. out. print(i*j+" ");
		}
			System. out. println();
		}
	}
}

*/

import java. util.Scanner;
public class SearchNum{
	public static void main(String args[]){
		int []Nums = {60,40,20,10,8,6,4,2};
		Scanner sc = new Scanner(System.in);
		System. out. println("����������Ҫ��ѯ�����ֲ��س�");
		int numSearch = sc.nextInt();
		sc.close();
		boolean flag = false;
		for(int i=0;i<Nums.length;i++){
			if(numSearch == Nums[i])
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			System. out. println("�б����з��ϲ�ѯ����������");
		else
			System. out. println("�б����޷��ϲ�ѯ����������");
}
}