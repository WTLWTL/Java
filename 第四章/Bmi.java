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