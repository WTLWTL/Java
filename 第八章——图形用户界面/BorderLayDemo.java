import java.awt.*;
import javax.swing.*;
public class BorderLayDemo extends JFrame{
	private JButton myButton1,myButton2,myButton3,myButton4,myButton5;
	public BorderLayDemo(){
		super("边界布局");
		setBounds(50,50,300,120);
		setLayout(new BorderLayout());//设置窗口为边界布局
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		myButton1=new JButton("东边按钮");
		myButton2=new JButton("南边按钮");
		myButton3=new JButton("西边按钮");
		myButton4=new JButton("北边按钮");
		myButton5=new JButton("中间按钮"); 
		add("East",myButton1);
		add("South",myButton2);
		add("West",myButton3);
		add("North",myButton4);
		add("Center",myButton5);
		}
		public static void main(String[] args){
			BorderLayDemo f =new BorderLayDemo();
		}	
}