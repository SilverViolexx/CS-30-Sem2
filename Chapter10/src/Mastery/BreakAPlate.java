package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel plateDis = new JLabel("");
		plateDis.setBounds(37, 34, 368, 114);
		panel.add(plateDis);
		
		JLabel reward = new JLabel("");
		reward.setForeground(new Color(0, 0, 128));
		reward.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		reward.setBounds(167, 225, 107, 98);
		panel.add(reward);
		
		ImageIcon ogPlate = new ImageIcon ("../Chapter10/src/Mastery/plate.png");
		ImageIcon plate2 = new ImageIcon ("../Chapter10/src/Mastery/2 Broken Plates.png");
		ImageIcon plate3 = new ImageIcon ("../Chapter10/src/Mastery/3 Broken Plates.png");
		ImageIcon placeHolder = new ImageIcon ("../Chapter10/src/Mastery/placeholder.png");
		ImageIcon plush = new ImageIcon ("../Chapter10/src/Mastery/tiger.png");
		ImageIcon sticker = new ImageIcon ("../Chapter10/src/Mastery/sticker.png");
		
		JLabel prizePrompt = new JLabel("");
		prizePrompt.setHorizontalAlignment(SwingConstants.CENTER);
		prizePrompt.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		prizePrompt.setForeground(new Color(0, 0, 64));
		prizePrompt.setBounds(109, 204, 213, 23);
		panel.add(prizePrompt);
		
		plateDis.setIcon(ogPlate);
		reward.setIcon(placeHolder);
		
		
		JButton startGame = new JButton("Start");
		startGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int ran1 = r.nextInt(0,2);
				int ran2 = r.nextInt(0,2);	
				int ran3 = r.nextInt(0,2);	
				int total = ran1 + ran2 + ran3;
				startGame.setText("Play Again");
			
				if (total == 3) {
					plateDis.setIcon(plate3);
					reward.setIcon(plush);
					prizePrompt.setText("You win a prize!");
				}
				else if (total == 2) {
					plateDis.setIcon(plate2);
					reward.setIcon(sticker);
					prizePrompt.setText("You win a prize!");
				}
				else {
					plateDis.setIcon(ogPlate);
					prizePrompt.setText("You missed, nice try!");
					reward.setIcon(placeHolder);
				}
				
				
				
			}
		});
		startGame.setBackground(SystemColor.inactiveCaptionBorder);
		startGame.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		startGame.setForeground(new Color(0, 0, 128));
		startGame.setBounds(152, 167, 132, 34);
		panel.add(startGame);
		
		
		
		
		
		
	}
}
