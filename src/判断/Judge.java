package �ж�;

import �����ӿ�.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Judge implements MyInterface{
	private JFrame frame;
	private int x,y;
	private int count;
	
	public Judge(int x,int y)
	{
		this.x = x;
		this.y = y;
		count = 1;
		frame = new JFrame();
		frame.setTitle("���");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		frame.setBounds(500,300,450,300);
	}
	
	public void judge()
	{
//		System.out.println(array[x][y]);
		count = 1;
		//������
		for(int i = x+1; i < Coloum; i++)
		{
			if(array[i][y] != 0 )
			{
				if((array[x][y]%2) == (array[i][y]%2))
				{
					count++;
				}else break;
			}else break;
		}
		for(int i = x-1; i >= 0; i--)
		{
			if(array[i][y] != 0 )
			{
				if((array[x][y]%2) == (array[i][y]%2))
					count++;
				else break;
			}else break;
		}
		if(count>=5)
		{
			if(array[x][y]%2 != 0)
			{
				JLabel label = new JLabel("����ʤ����������");
				label.setPreferredSize(new Dimension(400,250));
				label.setFont(new Font("����",1,50));
				frame.add(label);
				frame.setVisible(true);
			}else 
			{
				JLabel label = new JLabel("����ʤ����������");
				label.setPreferredSize(new Dimension(400,250));
				label.setFont(new Font("����",1,50));
				frame.add(label);
				frame.setVisible(true);
			}
			return ;
		}
		count = 1;
		//������
		for(int i = y+1; i < Row; i++)
		{
			if(array[x][i] != 0 )
			{
				if((array[x][y]%2) == (array[x][i])%2)
					count++;
				else break;
			}else break;
		}
		for(int i = y-1; i >= 0; i--)
		{
			if(array[x][i] != 0 )
			{
				if(array[x][y]%2 == array[x][i]%2)
					count++;
				else break;
			}else break;
		}
		if(count>=5)
		{
			if(array[x][y]%2 != 0)
			{
				JLabel label = new JLabel("����ʤ����������");
				label.setPreferredSize(new Dimension(400,250));
				label.setFont(new Font("����",1,50));
				frame.add(label);
				frame.setVisible(true);
			}else 
			{
				JLabel label = new JLabel("����ʤ����������");
				label.setPreferredSize(new Dimension(400,250));
				label.setFont(new Font("����",1,50));
				frame.add(label);
				frame.setVisible(true);
			}
			return ;
		}
	
		count = 1;
		//б���飨�����Ͻǵ����½ǣ�
		for(int i = x-1,j = y-1;i>=0&&j>=0; i--,j--)
		{
			if(array[i][j] != 0 )
			{
				if((array[x][y]%2) == (array[i][j]%2))
					count++;
				else break;
			}else break;
		}
		for(int i = x+1,j = y+1;i<Coloum&&j<Row; i++,j++)
		{
			if(array[i][j] != 0 )
			{
				if((array[x][y]%2) == (array[i][j]%2))
					count++;
				else break;
			}else break;
		}
		if(count>=5)
		{
			if(array[x][y]%2 != 0)
			{
				JLabel label = new JLabel("����ʤ����������");
				label.setPreferredSize(new Dimension(400,250));
				label.setFont(new Font("����",1,50));
				frame.add(label);
				frame.setVisible(true);
			}else 
			{
				JLabel label = new JLabel("����ʤ����������");
				label.setPreferredSize(new Dimension(400,250));
				label.setFont(new Font("����",1,50));
				frame.add(label);
				frame.setVisible(true);
			}
			return ;
		}
		count = 1;
		//б���飨�����½ǵ����Ͻǣ�
		for(int i = x-1,j = y+1;i>=0&&j<Row; i--,j++)
		{
			if(array[i][j] != 0 )
			{
				if((array[x][y]%2) == (array[i][j]%2))
					count++;
				else break;
			}else break;
		}
		for(int i = x+1,j = y-1;i<Coloum&&j>=0; i++,j--)
		{
			if(array[i][j] != 0 )
			{
				if((array[x][y]%2) == (array[i][j]%2))
					count++;
				else break;
			}else break;
		}
		if(count>=5)
		{
			if(array[x][y]%2 != 0)
			{
				JLabel label = new JLabel("����ʤ����������");
				label.setPreferredSize(new Dimension(400,250));
				label.setFont(new Font("����",1,50));
				frame.add(label);
				frame.setVisible(true);
			}else 
			{
				JLabel label = new JLabel("����ʤ����������");
				label.setPreferredSize(new Dimension(400,250));
				label.setFont(new Font("����",1,50));
				frame.add(label);
				frame.setVisible(true);
			}
			return ;
		}
	}
}