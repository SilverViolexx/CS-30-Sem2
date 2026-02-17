import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.ListCellRenderer;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MetricConversion 
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MetricConversion window = new MetricConversion();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConversion() 
	{
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel prompt = new JLabel("Select A Conversion Type");
		prompt.setBounds(32, 78, 184, 14);
		prompt.setFont(new Font("Serif", Font.BOLD, 15));
		prompt.setForeground(new Color(64, 0, 128));
		panel.add(prompt);
		
		JLabel title = new JLabel("Metric Coversion");
		title.setBounds(32, 11, 209, 36);
		title.setFont(new Font("Serif", Font.BOLD, 25));
		title.setForeground(new Color(64, 0, 128));
		panel.add(title);
		
		JLabel ans = new JLabel("");
		ans.setFont(new Font("Serif", Font.BOLD, 15));
		ans.setForeground(new Color(64, 0, 128));
		ans.setBounds(32, 143, 249, 20);
		panel.add(ans);
		
		JComboBox convert = new JComboBox();
		convert.setBounds(32, 103, 184, 29);
		convert.setBackground(new Color(249, 242, 255));
		convert.setForeground(new Color(64, 0, 128));
		convert.setFont(new Font("Serif", Font.PLAIN, 14));
		convert.setModel(new DefaultComboBoxModel(new String[] {"Inches To Centimeters", "Feet To Meters", "Gallons To Meters", "Pounds To Kilograms"}));
		panel.add(convert);
		convert.setFocusable(false);
		
		/*
		convert.setRenderer(new DefaultRendererComponent()
		{
			public Component getListCellRendererComponent(JList<? extends E> list, E value, int index, boolean isSelected, boolean cellHasFocus) 
			{ 
				super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
				if (isSelected) 
				{
					list.setBackground(new Color (white));
					list.setForeground(new Color(64, 0, 128));
				}
				else 
				{
					list.setForeground(new Color(64, 0, 128));
					list.setBackground(new Color(249, 242, 255));
				}        
			}
		}
		*/
		
		
		
		
		convert.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(convert.getSelectedItem().equals("Inches To Centimeters"))
				{
					ans.setText("1 inch = 2.54 centimeters");
				}
				else if(convert.getSelectedItem().equals("Feet To Meters"))
				{
					ans.setText("1 foot = 0.3048 meters");
				}
				else if(convert.getSelectedItem().equals("Gallons To Meters"))
				{
					ans.setText("1 gallon = 4.5461 litres");
				}
				else
				{
					ans.setText("1 pound = 0.4536 kilograms");
				}
			}
		});
			
		
	}
}
