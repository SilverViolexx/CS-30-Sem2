package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LocalBank {

	private JFrame frame;
	private JTextField DInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
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
	public LocalBank() {
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
		panel.setBackground(SystemColor.controlLtHighlight);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel prompt = new JLabel("Select An Action:");
		prompt.setFont(new Font("Verdana", Font.BOLD, 15));
		prompt.setForeground(new Color(0, 0, 128));
		prompt.setBounds(26, 11, 156, 20);
		panel.add(prompt);
		
		JComboBox options = new JComboBox();
		options.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (options.getSelectedItem().equals("Deposit")) {
					DInput = new JTextField();
					DInput.setForeground(new Color(0, 0, 128));
					DInput.setFont(new Font("Verdana", Font.PLAIN, 15));
					DInput.setBounds(26, 121, 211, 26);
					panel.add(DInput);
					DInput.setColumns(10);
		
					JLabel DPrompt = new JLabel("Amount To ");
					DPrompt.setForeground(new Color(0, 0, 128));
					DPrompt.setFont(new Font("Verdana", Font.PLAIN, 15));
					DPrompt.setBounds(26, 90, 156, 20);
					panel.add(DPrompt);		
					
					
				}
				
			}
		});

		options.setBackground(SystemColor.inactiveCaptionBorder);
		options.setFont(new Font("Verdana", Font.PLAIN, 15));
		options.setModel(new DefaultComboBoxModel(new String[] {"Deposit", "Withdraw", "Check Balance", "Add An Account", "Remove An Account"}));
		options.setForeground(new Color(0, 0, 128));
		options.setBounds(26, 42, 211, 22);
		panel.add(options);
		
		
	}
}
