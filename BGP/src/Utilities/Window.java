package Utilities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JPanel
{
	private final int WIDTH = 600;
	private final int HEIGHT = 600;
	
	JFrame frame = new JFrame();	
	
	public Window()
	{
		frame.setTitle("Title");
		//frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);

		frame.add(this);
		frame.addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				
			}

			public void keyReleased(KeyEvent e)
			{
				
			}

			public void keyPressed(KeyEvent e)
			{
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
				{
					System.exit(0);
				}
			}
		});
		frame.setVisible(true);
	}

	public void paintComponent(Graphics g)
	{
		repaint();
	}
}

















