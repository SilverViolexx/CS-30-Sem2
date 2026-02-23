package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 450, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		class grid implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				
				String gridPost = e.getActionCommand();
				
				if (gridPost.equals("pop")) {
					tL.setText("X");
				}
				
				
				
			}
		}
				
		JButton tL = new JButton("");
		tL.setActionCommand("pop");
		tL.addActionListener(new grid());
	
		
		
		tL.setBounds(92, 34, 78, 78);
		panel.add(tL);
		
		JButton tC = new JButton("");
		tC.setBounds(173, 34, 78, 78);
		panel.add(tC);
		
		JButton tR = new JButton("");
		tR.setBounds(256, 34, 78, 78);
		panel.add(tR);
		
		JButton cR = new JButton("");
		cR.setBounds(256, 113, 78, 78);
		panel.add(cR);
		
		JButton cC = new JButton("");
		cC.setBounds(173, 113, 78, 78);
		panel.add(cC);
		
		JButton cL = new JButton("");
		cL.setBounds(92, 113, 78, 78);
		panel.add(cL);
		
		JButton bL = new JButton("");
		bL.setBounds(92, 194, 78, 78);
		panel.add(bL);
		
		JButton bC = new JButton("");
		bC.setBounds(173, 194, 78, 78);
		panel.add(bC);
		
		JButton bR = new JButton("");
		bR.setBounds(256, 194, 78, 78);
		panel.add(bR);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
