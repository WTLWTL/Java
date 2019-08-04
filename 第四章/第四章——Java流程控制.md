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

##选择结构

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

  