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

import javax. swing. JOptionPane;
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