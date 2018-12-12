package 界面;

import 参数接口.*;
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel implements MyInterface{
 
	public MyPanel()
	{
		setBackground(Color.LIGHT_GRAY);
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D gg = (Graphics2D) g;
		//画出整个棋盘
		for(int i = 0; i < Row; i++)//行
		{
			gg.drawLine(X, Y+i*Size, X+Size*(Coloum-1), Y+i*Size);
		}
		for(int i = 0; i < Coloum; i++)//列
		{
			gg.drawLine(X+i*Size, Y, X+i*Size, Y+Size*(Row-1));
		}
		//画出棋子
		for(int i = 0; i < array.length; i++)
			for(int j = 0; j < array[i].length; j++)
			{
				if(array[i][j] != 0)
				{
					if(array[i][j]%2 != 0)
					{
						gg.setColor(Color.black);
					}else
					{
						gg.setColor(Color.white);
					}
					int x = Y+j*Size-Size/2;
					int y = X+i*Size-Size/2;
					gg.fillOval(x, y, Size, Size);
				}
			}
	}
}
