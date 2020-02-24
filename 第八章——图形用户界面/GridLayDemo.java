import java.awt.*;
import javax.swing.*;
public class GridLayDemo extends JFrame{
	private String names[]={"按钮1","按钮2","按钮3","按钮4","按钮5","按钮6"};
	public GridLayDemo(){
		super("网格布局");
		setBounds(50,50,300,120);
		setLayout(new GridLayout(3,3));//设置三行三列网格布局
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		for(int i=0;i<names.length;i++){
			add(new JButton(names[i]));//依次添加各个按钮
		}
	}
	public static void main(String[] args)
	{
		GridLayDemo f=new GridLayDemo();
	}
}