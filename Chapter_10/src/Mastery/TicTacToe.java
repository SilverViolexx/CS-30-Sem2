package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	private JFrame frame;
	private JLabel promptDis;
	private JButton[][] grid;
	private String currPlayer;
	private int turnNum;
	private boolean stillPlay;
	private JButton reset;

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
		frame.setBounds(100, 100, 450, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		promptDis = new JLabel("Player X's Turn");
		promptDis.setVerticalAlignment(SwingConstants.BOTTOM);
		promptDis.setHorizontalAlignment(SwingConstants.CENTER);
		promptDis.setFont(new Font("Calibri", Font.BOLD, 30));
		promptDis.setForeground(new Color(0, 0, 128));
		promptDis.setBounds(88, 21, 257, 48);
		panel.add(promptDis);
		
		JPanel tttPanel = new JPanel();
		tttPanel.setBounds(82, 69, 274, 236);
		panel.add(tttPanel);
		tttPanel.setLayout(new GridLayout(3, 3));
		
		reset = new JButton("Play Again");
		reset.setFont(new Font("Calibri", Font.BOLD, 20));
		reset.setForeground(new Color(0, 0, 128));
		reset.setBounds(143, 315, 141, 32);
		panel.add(reset);
		reset.setVisible(false);
		
		currPlayer = "X";
		turnNum = 0;
		stillPlay = true;
		grid = new JButton[3][3];
		
		for (int rows = 0; rows < 3; rows ++) {
			for (int cols = 0; cols < 3; cols ++) {
				JButton spot = new JButton("");
				spot.setFont(new Font("Calibri", Font.BOLD, 20));
				spot.setForeground(new Color(0, 0, 128));
				
				grid[rows][cols] = spot;
				tttPanel.add(spot);
				
				final int r = rows;
				final int c = cols;
				
				spot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (spot.getText().equals("") && stillPlay) {
							whoGoes(spot, r, c);
						}
					}
				});				
			}
		}	
	}
	public void whoGoes (JButton spot, int rows, int cols) {
		spot.setText(currPlayer);
		
		turnNum ++;
		
		if (checkWinner(rows, cols)) {
			promptDis.setText("Player " + currPlayer + " Wins!");
			stillPlay = false;
			reset.setVisible(true);
			restartGame();
		}
		else if (turnNum == 9) {
			promptDis.setText("It's A Tie!");
			stillPlay = false;
			reset.setVisible(true);
			restartGame();
		}
		else {
			if (currPlayer.equals("X") && stillPlay == true) {
				currPlayer = "O";
				promptDis.setText("Player " + currPlayer + "'s Turn");
			}
			else {
				currPlayer = "X";
				promptDis.setText("Player " + currPlayer + "'s Turn");
			}
		}
	}
	
	private boolean checkWinner(int rows, int cols) {
		String checkSpot = grid[rows][cols].getText();
		
		if (grid[rows][0].getText().equals(checkSpot) &&
			grid[rows][1].getText().equals(checkSpot) &&	
			grid[rows][2].getText().equals(checkSpot)) {
			return true;
		}
		else if (grid[0][cols].getText().equals(checkSpot) &&
			grid[1][cols].getText().equals(checkSpot) &&	
			grid[2][cols].getText().equals(checkSpot)) {
			return true;
		}
		else if (grid[0][0].getText().equals(checkSpot) &&
			grid[1][1].getText().equals(checkSpot) &&	
			grid[2][2].getText().equals(checkSpot)) {
			return true;
		}
		else if (grid[0][2].getText().equals(checkSpot) &&
			grid[1][1].getText().equals(checkSpot) &&	
			grid[2][0].getText().equals(checkSpot)) {
			return true;
		}
		return false;
	}
	
	private void restartGame() {
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int rows = 0; rows < 3; rows ++) {
					for (int cols = 0; cols < 3; cols ++) {
						grid[rows][cols].setText("");
					}
				}
				
				currPlayer = "X";
				turnNum = 0;
				stillPlay = true;
				promptDis.setText("Player X's Turn");
				
				reset.setVisible(false);
			}
		});
	}
}
