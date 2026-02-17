import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SemesterAvg {

	private JFrame frame;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField average;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
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
		panel.setToolTipText("");
		panel.setForeground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel gradePrompt = new JLabel("Enter The First Grade:");
		gradePrompt.setFont(new Font("Serif", Font.BOLD, 15));
		gradePrompt.setForeground(new Color(64, 0, 128));
		gradePrompt.setBounds(21, 29, 165, 20);
		panel.add(gradePrompt);
		
		JLabel gradePrompt2 = new JLabel("Enter The Second Grade:");
		gradePrompt2.setForeground(new Color(64, 0, 128));
		gradePrompt2.setFont(new Font("Serif", Font.BOLD, 15));
		gradePrompt2.setBounds(21, 82, 178, 20);
		panel.add(gradePrompt2);
		
		JLabel gradePrompt3 = new JLabel("Enter The Third Grade:");
		gradePrompt3.setForeground(new Color(64, 0, 128));
		gradePrompt3.setFont(new Font("Serif", Font.BOLD, 15));
		gradePrompt3.setBounds(21, 138, 165, 20);
		panel.add(gradePrompt3);
		
		grade1 = new JTextField();
		grade1.setForeground(new Color(64, 0, 128));
		grade1.setFont(new Font("Serif", Font.BOLD, 15));
		grade1.setBounds(236, 27, 165, 28);
		panel.add(grade1);
		grade1.setColumns(10);
		
		JButton submit = new JButton("Average");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g1 = grade1.getText();
				String g2 = grade2.getText();
				String g3 = grade3.getText();
				
				double avg = (Double.parseDouble(g1) + Double.parseDouble(g2) + Double.parseDouble(g3)) / 3;
				
				
				
				
				//ROUND TO 2 DECIMALS
				average.setText(" Your average is: " + Math.round(avg));
				
			}
		});
		submit.setForeground(new Color(64, 0, 128));
		submit.setFont(new Font("Serif", Font.BOLD, 15));
		submit.setBounds(21, 196, 156, 33);
		panel.add(submit);
		
		grade2 = new JTextField();
		grade2.setForeground(new Color(64, 0, 128));
		grade2.setFont(new Font("Serif", Font.BOLD, 15));
		grade2.setColumns(10);
		grade2.setBounds(236, 84, 165, 28);
		panel.add(grade2);
		
		grade3 = new JTextField();
		grade3.setForeground(new Color(64, 0, 128));
		grade3.setFont(new Font("Serif", Font.BOLD, 15));
		grade3.setColumns(10);
		grade3.setBounds(236, 140, 165, 28);
		panel.add(grade3);
		
		average = new JTextField();
		average.setForeground(new Color(64, 0, 128));
		average.setFont(new Font("Serif", Font.BOLD, 15));
		average.setColumns(10);
		average.setBounds(191, 196, 156, 33);
		panel.add(average);
	}
}
