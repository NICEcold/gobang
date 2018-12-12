package ����;

import �����ӿ�.*;
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
		//������������
		for(int i = 0; i < Row; i++)//��
		{
			gg.drawLine(X, Y+i*Size, X+Size*(Coloum-1), Y+i*Size);
		}
		for(int i = 0; i < Coloum; i++)//��
		{
			gg.drawLine(X+i*Size, Y, X+i*Size, Y+Size*(Row-1));
		}
		//��������
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
