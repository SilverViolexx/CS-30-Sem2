package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class TicTacToe {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel whoGoes = new JLabel("");
		whoGoes.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		whoGoes.setForeground(new Color(0, 0, 128));
		whoGoes.setBounds(81, 24, 264, 28);
		panel.add(whoGoes);
		
		JButton tL = new JButton("");
		tL.setBounds(92, 63, 78, 78);
		panel.add(tL);
			
		JButton tC = new JButton("");
		tC.setBounds(173, 63, 78, 78);
		panel.add(tC);
		
		JButton tR = new JButton("");
		tR.setBounds(256, 63, 78, 78);
		panel.add(tR);
		
		JButton cR = new JButton("");
		cR.setBounds(256, 142, 78, 78);
		panel.add(cR);
		
		JButton cC = new JButton("");
		cC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cC.setBounds(173, 142, 78, 78);
		panel.add(cC);
		
		JButton cL = new JButton("");
		cL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cL.setBounds(92, 142, 78, 78);
		panel.add(cL);
		
		JButton bL = new JButton("");
		bL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bL.setBounds(92, 223, 78, 78);
		panel.add(bL);
		
		JButton bC = new JButton("");
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bC.setBounds(173, 223, 78, 78);
		panel.add(bC);
		
		JButton bR = new JButton("");
		bR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bR.setBounds(256, 223, 78, 78);
		panel.add(bR);
		
		topRow = int[] ;
		int[] centerRow = {};
		int[] botRow = {};
		int[] topCol = {};
		int[] centerCol = {};
		int[] botCol = {};
		int[] leftDiag = {};
		int[] rightDiag = {};
		
		
		
		String[] player = {"X", "O"};
		
		
		
		for (int i = 1; i < 9; i++)
		{
			
			
			if (i % 2 != 0) 
			{
				whoGoes.setText("It is PLayer 1's turn!");
				tL.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tL.setText(player[i]);
						topRow.add(1);
					}
				});
				tC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tC.setText(player[i]);
						topRow[1] = 1;
					}
				});
				tR.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tR.setText(player[i]);
						topRow[3] = 1;
					}
				});
				tR.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				
				continue;
				
				
				
			}
			
			else if (i % 2 == 0) 
			{
				whoGoes.setText("It is PLayer 2's turn!");
				tL.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tL.setText(player[i]);
						topRow[0] = 2;
					}
				});
				tC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tC.setText(player[i]);
						topRow[1] = 2;
					}
				});
				tR.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tR.setText(player[i]);
						topRow[3] = 2;
					}
				});
				tR.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				
				continue;
				
				
				
			}
		 
			if ()
		
		
		
		}
		
		
	}
}
