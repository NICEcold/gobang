package ������ִ��;

import ����.*;
import �����ӿ�.*;
import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame{

	public MyJFrame() {
		//���ð���
		 setTitle("������");
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(3);
	     setBounds(350,100,850,700);
		//���ò���
		 setLayout(new BorderLayout());
		 JTextArea jt=new JTextArea("\nһ\n��\n��\nʤ\n��\n!");
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
