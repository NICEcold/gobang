package 界面;

import 参数接口.*;
import 判断.*;
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
		//取得坐标
		x = e.getX();
		y = e.getY();
		//计算行列
		int row = (y-Y+Size/2)/Size;
		int coloum = (x-X+Size/2)/Size;
		
		if(row < Row && coloum < Coloum)
		{
			if(array[row][coloum] == 0)
			{
				//确定在数组的位置
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