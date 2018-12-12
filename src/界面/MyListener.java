package ����;

import �����ӿ�.*;
import �ж�.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyListener extends MouseAdapter implements MyInterface
{
	private Judge j;
	private MyPanel panel;
	private Graphics2D g;
	 
	private int x,y;
	private int num = 1;
	
	public MyListener(MyPanel panel)
	{
		this.panel = panel;
		g = (Graphics2D)this.panel.getGraphics();
		 
	}
	
	public void mouseReleased(MouseEvent e) 
	{
		//ȡ������
		x = e.getX();
		y = e.getY();
		//��������
		int row = (y-Y+Size/2)/Size;
		int coloum = (x-X+Size/2)/Size;
		
		if(row < Row && coloum < Coloum)
		{
			if(array[row][coloum] == 0)
			{
				//ȷ���������λ��
				x = X+coloum*Size-Size/2;
				y = Y+row*Size-Size/2;
					
 			if(num%2 != 0 )
				{
				g.setColor(Color.black);
				}else
				{
					g.setColor(Color.white);
				}
				array[row][coloum] = num;
				
				g.fillOval(x, y, Size, Size);
				j = new Judge(row,coloum);
				j.judge();

				num++;
			 }
		}
	}
}