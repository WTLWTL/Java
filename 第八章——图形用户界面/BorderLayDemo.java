import java.awt.*;
import javax.swing.*;
public class BorderLayDemo extends JFrame{
	private JButton myButton1,myButton2,myButton3,myButton4,myButton5;
	public BorderLayDemo(){
		super("�߽粼��");
		setBounds(50,50,300,120);
		setLayout(new BorderLayout());//���ô���Ϊ�߽粼��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		myButton1=new JButton("���߰�ť");
		myButton2=new JButton("�ϱ߰�ť");
		myButton3=new JButton("���߰�ť");
		myButton4=new JButton("���߰�ť");
		myButton5=new JButton("�м䰴ť"); 
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