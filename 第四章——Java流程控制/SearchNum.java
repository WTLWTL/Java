//第四章——java流程控制代码

/*import javax. swing. JOptionPane;
public class Score{
	public static void main(String args[]){
		int score;
		String str;
		str = JOptionPane. showInputDialog("Enter a mark");
		score = Integer.parseInt(str);
		if(score>100||score<0)
		{
			JOptionPane. showMessageDialog(null,"成绩不能超过100或小于0");
		}
		else
		{
			if(score>=90)
			str="优秀";
			if(score>=80&&score<=90)
			str="良好";
			if(score>=70&&score<80)
			str="中";
			if(score>=60&&score<70)
			str="及格";
			if(score<60)
			str="不及格";
			JOptionPane.showMessageDialog(null,"成绩"+str);
		}
	}
}
*/

/*import javax. swing. JOptionPane;
public class Bmi{
	public static void main(String args[]){
		float weight,height,bmi;
		String str;
		str = JOptionPane. showInputDialog("请输入您的体重");
		weight = Float. parseFloat(str);
		str = JOptionPane. showInputDialog("请输入您的身高");
		height = Float. parseFloat(str);
		if(weight>0&&height>0){
		bmi = weight/height/height;
		if(bmi<18.5f)
		str="您的体重过低";
		if(bmi>=18.5f&&bmi<=23.9f)
		str = "您的体重正常";
		if(bmi>=24.0f&&bmi<=27.9f)
		str="您超胖";
		if(bmi>=28)
		str = "您属于肥胖";
		JOptionPane. showMessageDialog(null,str);
	}
		else
		JOptionPane. showMessageDialog(null,"输入的数据必须大于0");
	}
}
*/

/*
//挂号情况统计
import javax. swing. JOptionPane;
public class Outpatient_flow{
	public static void main(String args[])
	{
		int n1=0,n2=0,n3=0,n4=0;
		int num;
		String str;
		do{
			str = JOptionPane. showInputDialog("输入科室号码");
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
			JOptionPane. showMessageDialog(null,"输入出错");
		}while (num!=0);
		System. out. println("科室1的门诊流量为:"+n1);
		System. out. println("科室2的门诊流量为:"+n2);
		System. out. println("科室3的门诊流量为:"+n3);
		System. out. println("科室4的门诊流量为:"+n4);
	}
}
*/

/*
//用while循环求1+2+3+...+99+100的累加和
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
//编写程序，读入一组整数并计算其和，输入数字“0”则表示输入结束
import javax. swing. JOptionPane;
public class Sum_uncertain_while{
	public static void main(String args[]){
		int sum=0,data;
		String s;
		s = JOptionPane. showInputDialog(null,"输入一个整数:");
		data = Integer.parseInt(s);
		while(data!=0)
		{
			sum+=data;
			s = JOptionPane. showInputDialog(null,"输入一个整数:");
			data = Integer.parseInt(s);
		}
		JOptionPane. showMessageDialog(null,"和为："+sum);
	}
}
*/

/*
//do...while 语句
import javax. swing. JOptionPane;
public class Sum_uncertain_do{
	public static void main(String args[])
	{
		int sum=0,data;
		String s;
		s = JOptionPane. showInputDialog(null,"输入一个整数");
		data = Integer. parseInt(s);
		do{
			sum+=data;
			s = JOptionPane. showInputDialog(null,"输入一个整数");
			data=Integer. parseInt(s);
		}while(data!=0);
		JOptionPane. showMessageDialog(null,"和为"+sum);
	}
}
*/

/*
//九九乘法表
public class Multiplication_table{
	public static void main(String args[])
	{
		int i,j;
		System. out. print("*  |");
		for(i=1;i<=9;i++){	//打印表头
			if(i==1)
			System. out. print(" "+i);
			else
			System. out. print("  "+i);
		}
		System. out. println();	//用于换行
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
		System. out. println("请输入您想要查询的数字并回车");
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
			System. out. println("列表中有符合查询条件的数字");
		else
			System. out. println("列表中无符合查询条件的数字");
}
}