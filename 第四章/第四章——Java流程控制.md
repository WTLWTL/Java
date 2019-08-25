# 第四章——Java流程控制

## 顺序结构及可视化输入输出

Java中数据的输入输出可以借助于JOptionPane类的showInputDialog()方法和showMessageDialog()方法

```java
import javax. swing. JOptionPane;
	public class BloodPressure{
			public static void main(String args[])
			{
				double systolicPressure,diastolicPressure;
				String str;
				str = JOptionPane. showInputDialog("请输入收缩压：");
				systolicPressure = Double. parseDouble(str);   //string转换为double
				str = JOptionPane. showInputDialog("请输入舒张压：");
				diastolicPressure = Double. parseDouble(str);
				JOptionPane. showMessageDialog(null,"您的收缩压："+systolicPressure);
				JOptionPane. showMessageDialog(null,"你的舒张压："+diastolicPressure);
				System. out. println("用语句System. out. println的输出显示在这个地方.");
				System. out. println("您的收缩压："+systolicPressure+"您的舒张压："+diastolicPressure);
			}
	}
```

行为调用JOptionPane类的相关方法实现可视化输入输出，要导入javax.swing包中的JOptionPane类

代码

`import javax. swing. JOptionPane`

## 选择结构

- 单分支选择语句（if语句）

  ```java
  	str = JOptionPane. showInputDialog("单位是mmHg还是千帕\n请分别用1，2表示");
  	if (Integer. parseInt(str)==2){
  						systolicPressure=30*systolicPressure/4;
  						diastolicPressure=30*diastolicPressure/4;
  				}
  	JOptionPane. showMessageDialog(null,"您的收缩压："+systolicPressure+"mmHg");
  	JOptionPane. showMessageDialog(null,"你的舒张压："+diastolicPressure+"mmHg");
  ```

- 双分支选择结构（if...else)

  ```java
  double pp;
  pp=systolicPressure-diastolicPressure;
  if(pp<20||pp>60){
  					System. out. println("脉压差过大或者过小，如果不是输入错误，请及时到医院就诊");
  				}
  				else{
  					System. out. println("脉压差正常。"+"可继续判断血压差是否正常");
  				}
  ```

- 用嵌套的if语句实现多分支选择结构

  ```java
  if((systolicPressure>=160)&&(diastolicPressure>=115))
  						System. out. println("您是重度高血压，需要立即就医");
  else
  		if((systolicPressure>=160)&&(diastolicPressure>=105))
  						System. out. println("您是中度高血压，请及时与医生联系");
  		else
  				if((systolicPressure>=141)&&(diastolicPressure>=91))
  						System. out. println("您是轻度高血压，要放松心情，注意日常饮食和休息");
  				else
  					if((systolicPressure>=90)&&(diastolicPressure>=61))
  						System. out. println("您的血压正常，继续保持良好的生活习惯");
  					else
  						System. out. println("您是低血压，请及时与医生联系");
  				
  			}
  	}
  ```

  ----
  
  > 2019.08.08
  
  ### 将百分制成绩转换为等级制
  
  输入百分制成绩score,显示对其的评定
  
  | 百分制       | 等级制 |
  | ------------ | ------ |
  | score>=90    | 优秀   |
  | 80<=score<90 | 良好   |
  | 70<=score<80 | 中     |
  | 60<=score<70 | 及格   |
  | score<60     | 不及格 |

```java
import javax. swing. JOptionPane;
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
```

- switch语句

  ```java
  switch(表达式){
      case vaule1: 语句序列1;
          break;
      case vaule2: 语句序列2;
          break;
      ...
     	default ； 语句序列
  }
  ```

  注：表达式的值只能是简单数据类型的值（如字符型，整型，短整型，字节型)，不能是其他类型

  ### BMI值得评定
  
  ```java
  import javax. swing. JOptionPane;
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
  ```

  ----
  
  > 2019.08.25
  
  ## 循环结构
  
  ```java
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
  ```
  
  ### while语句
  
  语法格式
  
  ```java
  while(表达式){
  循环体
  }
  ```
  
  例：
  
  ```java
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
  ```
  
  ```java
  //编写程序，读入一组整数并计算其和，输入数字“0”则表示输入结束
  import javax. swing. JOptionPane;
  public class Sum_uncertain_while{
  	public static void main(String args[]){
  		int sum=0,data;
  		String s;
  		s = JOptionPane. showInputDialog(null,"输入一个整数:");//show,非showing
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
  ```
  
  ### do...while语句
  
  语法格式
  
  ```java
  do{
  循环体
  }while（表达式）
  ```
  
  ```java
  //编写程序，读入一组整数并计算其和，输入数字“0”则表示输入结束
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
  ```
  
  ### for语句
  
  例：编程输出一个如图所示的九九乘法表
  
  ![](D:\桌面\Java\Java\第四章\九九乘法表.jpg)

```java
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
```

## 跳转语句

1. continue语句

   终止本次循环，跳过循环体的其余部分，直接转向循环条件判断

   ```java
   //输出100-500间所有能被3和7整除的数（核心代码）
   for(n =100;n<=500;n++){
       if(n%3!=0||n%7!=0)//不能被3或7整除时
           continue;
       System. out. print(n+"  ");
   }
   ```

2. break语句

   从一个语句体的内部跳出去

   