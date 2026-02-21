package Skillbuilder;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll window = new Roll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel dicePic1 = new JLabel("");
		dicePic1.setBounds(91, 31, 123, 122);
		panel.add(dicePic1);
		
		JLabel dicePic2 = new JLabel("");
		dicePic2.setBounds(224, 31, 123, 122);
		panel.add(dicePic2);
		
		ImageIcon d1 = new ImageIcon("../Chapter10/src/Skillbuilder/dice1.png");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/Skillbuilder/dice2.png");
		ImageIcon d3 = new ImageIcon("../Chapter10/src/Skillbuilder/dice3.png");
		ImageIcon d4 = new ImageIcon("../Chapter10/src/Skillbuilder/dice4.png");
		ImageIcon d5 = new ImageIcon("../Chapter10/src/Skillbuilder/dice5.png");
		ImageIcon d6 = new ImageIcon("../Chapter10/src/Skillbuilder/dice6.png");
		
		
		JButton sub = new JButton("Roll Dice");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int ran1 = r.nextInt(0,6);
				int ran2 = r.nextInt(0,6);	
				ImageIcon[] dieList = {d1, d2, d3, d4, d5, d6};
				
				dicePic1.setIcon(dieList[ran1]);
				dicePic2.setIcon(dieList[ran2]);
			}
		});
		sub.setBackground(new Color(240, 240, 255));
		sub.setForeground(new Color(0, 0, 128));
		sub.setFont(new Font("Serif", Font.BOLD, 15));
		sub.setBounds(163, 183, 112, 35);
		panel.add(sub);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
