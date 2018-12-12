package 界面;

import 参数接口.*;
import 界面.*;
import 判断.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class MyLi  extends MouseAdapter implements MyInterface
{
	private Judge j;
	private MyPanel panel;
	private Graphics2D g;
	 
	private int x,y;
	private int num = 1;
	
	public MyLi (MyPanel panel)
	{
		this.panel = panel;
		g = (Graphics2D)this.panel.getGraphics();
	}
	public void mouseReleased(MouseEvent e) 
	{ 
		if(num%2 != 0 ) {
		//取得坐标
		x = e.getX();
		y = e.getY();
		
		g.setColor(Color.black);
		 
		
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
			}
		}       
		        array[row][coloum] = num;
				g.fillOval(x, y, Size, Size);
				j = new Judge(row,coloum);
				j.judge();
				num++;
				computerPaint(row,coloum);
			 } 
		
	}
	public void computerPaint(int m,int  n) {
		for(int coloum=m+(int)(Math.random()*7)-3,row=m+(int)(Math.random()*7)-3;;coloum=m+(int)(Math.random()*7)-3,row=m+(int)(Math.random()*7)-3) {
		if(num%2 == 0 ) {
		x = X+coloum*Size-Size/2;
		y = Y+row*Size-Size/2;
		if(row < Row && row>=0&&coloum < Coloum&&coloum>=0) {
		if(array[row][coloum] == 0) {
		g.setColor(Color.white);
		try {
		Thread.sleep(800);}
		catch(InterruptedException e) {}
		g.fillOval(x, y, Size, Size);
		j = new Judge(row,coloum);
		j.judge();
		array[row][coloum] = num;
		num++;
		break;}
		else continue;}
		else continue;
	     }
		}
		}
	}