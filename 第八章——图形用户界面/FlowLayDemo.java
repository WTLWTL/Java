import java.awt.*;
import javax.swing.*;
public class FlowLayDemo extends JFrame{
	private JButton myButton1,myButton2,myButton3,myButton4,myButton5;
	public FlowLayDemo(){
		super("流式布局");
		setBounds(50,50,300,140);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		myButton1=new JButton("按钮1");
		myButton2=new JButton("按钮2");
		myButton3=new JButton("按钮3");
		myButton4=new JButton("按钮4");
		myButton5=new JButton("按钮5");
		add(myButton1);//将按钮添加到页面
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