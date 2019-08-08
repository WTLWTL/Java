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
  
  百分制成绩|等级制成绩
  
  -：|：-
  
  score>=90|优秀
  
  80=<score<=90|良好
  
  70<=score<=80|中
  
  60=<score<=70|及格
  
  score<60|不及格

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

  

  

