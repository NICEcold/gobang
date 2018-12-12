package 五子棋执行;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Begin extends JFrame implements ActionListener{
	Image img=Toolkit.getDefaultToolkit().getImage("图片/beijing.jpg");
	JButton jb1=new JButton("好友对弈");
	JButton jb2=new JButton("人机大战");
	JButton jb3=new JButton("退出");
	MyJFrame jf;
	MyJf myjf;
	public   void init() {
		setLayout(null);
		setTitle("开始游戏");
		setBounds(400,400,430,600);
		setResizable(false);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(3);
	    Mypanel mp=new Mypanel();
	    mp.setBounds(0,0,430,600);
	    add(mp);
		jb1.setFont(new Font("楷体",0,30));
		jb1.setForeground(Color.RED);
		jb1.setBounds(120,140,160,30);
		add(jb1);
		jb2.setFont(new Font("楷体",0,30));
		jb2.setForeground(Color.RED);
		jb2.setBounds(120,240,160,30);
		add(jb2 );
		jb3.setFont(new Font("楷体",0,30));
		jb3.setForeground(Color.RED);
		jb3.setBounds(120,340,160,30);
		add(jb3  );
		setVisible(true);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	class Mypanel extends JPanel  {
		public void paint(Graphics g) {
		g.drawImage(img,0,0, 430, 600,this);
	}
		}
	public void actionPerformed(ActionEvent e) {
		if((JButton)e.getSource()==jb1)
		    jf=new MyJFrame();
		else if((JButton)e.getSource()==jb2)
			  myjf=new MyJf();
		else
			System.exit(0);
	}
public static void main(String[] args) {
	Begin begin=new Begin();
	begin.init();
}

}
