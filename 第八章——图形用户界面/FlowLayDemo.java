import java.awt.*;
import javax.swing.*;
public class FlowLayDemo extends JFrame{
	private JButton myButton1,myButton2,myButton3,myButton4,myButton5;
	public FlowLayDemo(){
		super("��ʽ����");
		setBounds(50,50,300,140);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		myButton1=new JButton("��ť1");
		myButton2=new JButton("��ť2");
		myButton3=new JButton("��ť3");
		myButton4=new JButton("��ť4");
		myButton5=new JButton("��ť5");
		add(myButton1);//����ť��ӵ�ҳ��
		add(myButton2);
		add(myButton3);
		add(myButton4);
		add(myButton5);		
	}
	public static void main(String[] args)
	{
		FlowLayDemo f = new FlowLayDemo();
	}
}