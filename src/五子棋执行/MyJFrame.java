package 五子棋执行;

import 界面.*;
import 参数接口.*;
import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame{

	public MyJFrame() {
		//设置版面
		 setTitle("五子棋");
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(3);
	     setBounds(350,100,850,700);
		//设置布局
		 setLayout(new BorderLayout());
		 JTextArea jt=new JTextArea("\n一\n局\n决\n胜\n负\n!");
			jt.setBackground(Color.GRAY);
			jt.setPreferredSize( new Dimension(150,0));
			jt.setFont(new Font("Dialog",Font.BOLD+Font.ITALIC,50));
			jt.setForeground(Color.CYAN);
		 add(jt,BorderLayout.EAST);
		 MyPanel pl=new MyPanel();
		 add(pl,BorderLayout.CENTER);
		 setVisible(true);
		 MyListener listener = new MyListener(pl);
		 pl.addMouseListener(listener);
		
	}
	 
}
