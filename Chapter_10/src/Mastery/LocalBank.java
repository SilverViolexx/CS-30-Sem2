package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;

public class LocalBank {

	private JFrame frame;
	private JTextField fNameDis, lNameDis, balanceDis, accNumDis, wAmtDis, dAmtDis;
	private JButton submit;
	private JLabel resultDis;
	private String fName, lName, accID, result;
	private double balance;

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
		frame.setBounds(100, 100, 450, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		resultDis = new JLabel("");
		resultDis.setForeground(new Color(0, 0, 128));
		resultDis.setFont(new Font("Calibri", Font.BOLD, 15));
		resultDis.setBounds(27, 183, 399, 66);
		panel.add(resultDis);
		
		submit = new JButton("Submit");
		submit.setFont(new Font("Calibri", Font.BOLD, 20));
		submit.setForeground(new Color(0, 0, 128));
		submit.setVisible(false);
		
		Bank action = new Bank();
		
		submit.setBounds(27, 259, 133, 28);
		panel.add(submit);
		JComboBox prompt = new JComboBox();
		prompt.setBackground(SystemColor.inactiveCaptionBorder);
		
		prompt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hideBoxes();
				
				override(fNameDis, "First Name:");
				override(lNameDis, "Last Name:");
				override(balanceDis, "Starting Balance:");
				override(accNumDis, "Account ID:");
				override(wAmtDis, "Withdraw Amount:");
				override(dAmtDis, "Deposit Amount:");
				
				
				if (prompt.getSelectedItem().equals("Add An Account")) {
					fNameDis.setVisible(true);
					lNameDis.setVisible(true);
					balanceDis.setVisible(true);
					resultDis.setVisible(true);
					submit.setVisible(true);
					
				
					submit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						fName = fNameDis.getText();
						lName = lNameDis.getText();
						balance = Double.parseDouble(balanceDis.getText());
						accID = action.addAccount(fName, lName, balance);
						resultDis.setText("Account created. Account ID is: " + accID);
						}
					});
				}
				else if (prompt.getSelectedItem().equals("Remove An Account")) {
					accNumDis.setVisible(true);
					resultDis.setVisible(true);
					submit.setVisible(true);
					
					submit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						accID = accNumDis.getText();
		
						result = action.deleteAccount(accID);
						resultDis.setText(result);
						}
					});
					
				}
				else if (prompt.getSelectedItem().equals("Withdraw")) {
					accNumDis.setVisible(true);
					wAmtDis.setVisible(true);
					resultDis.setVisible(true);
					submit.setVisible(true);
					
					submit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						accID = accNumDis.getText();
						balance = Double.parseDouble(wAmtDis.getText());
		
						result = action.transaction(2, accID, balance);
						resultDis.setText(result);
						}
					});
					
				}
				else if (prompt.getSelectedItem().equals("Deposit")) {
					accNumDis.setVisible(true);
					dAmtDis.setVisible(true);
					resultDis.setVisible(true);
					submit.setVisible(true);
					
					submit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						accID = accNumDis.getText();
						balance = Double.parseDouble(dAmtDis.getText());
		
						result = action.transaction(1, accID, balance);
						resultDis.setText(result);
						}
					});
					
				}
				else if (prompt.getSelectedItem().equals("Check Balance")) {
					accNumDis.setVisible(true);
					resultDis.setVisible(true);
					submit.setVisible(true);
					
					submit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						accID = accNumDis.getText();
		
						result = action.checkBalance(accID);
						resultDis.setText(result);
						}
					});
					
				}
			}
		});
		prompt.setFont(new Font("Calibri", Font.BOLD, 20));
		prompt.setForeground(new Color(0, 0, 128));
		prompt.setModel(new DefaultComboBoxModel(new String[] {"Please Choose An Option:", "Add An Account", "Remove An Account", "Withdraw", "Deposit", "Check Balance"}));
		prompt.setBounds(27, 27, 250, 28);
		panel.add(prompt);
		
		
		fNameDis = new JTextField();
		fNameDis.setText("First Name:");
		fNameDis.setForeground(new Color(0, 0, 128));
		fNameDis.setFont(new Font("Calibri", Font.BOLD, 15));
		fNameDis.setBounds(27, 75, 255, 28);
		panel.add(fNameDis);
		fNameDis.setColumns(10);
		fNameDis.setVisible(false);
		
		lNameDis = new JTextField();
		lNameDis.setText("Last Name:");
		lNameDis.setForeground(new Color(0, 0, 128));
		lNameDis.setFont(new Font("Calibri", Font.BOLD, 15));
		lNameDis.setColumns(10);
		lNameDis.setBounds(27, 113, 255, 28);
		panel.add(lNameDis);
		lNameDis.setVisible(false);
		
		balanceDis = new JTextField();
		balanceDis.setText("Starting Balance:");
		balanceDis.setForeground(new Color(0, 0, 128));
		balanceDis.setFont(new Font("Calibri", Font.BOLD, 15));
		balanceDis.setColumns(10);
		balanceDis.setBounds(27, 149, 255, 28);
		panel.add(balanceDis);
		balanceDis.setVisible(false);
		
		accNumDis = new JTextField();
		accNumDis.setText("Account ID:");
		accNumDis.setForeground(new Color(0, 0, 128));
		accNumDis.setFont(new Font("Calibri", Font.BOLD, 15));
		accNumDis.setColumns(10);
		accNumDis.setBounds(27, 75, 255, 28);
		panel.add(accNumDis);
		accNumDis.setVisible(false);
		
		
		
		
		wAmtDis = new JTextField();
		wAmtDis.setText("Withdraw Amount:");
		wAmtDis.setForeground(new Color(0, 0, 128));
		wAmtDis.setFont(new Font("Calibri", Font.BOLD, 15));
		wAmtDis.setColumns(10);
		wAmtDis.setBounds(27, 113, 255, 28);
		panel.add(wAmtDis);
		wAmtDis.setVisible(false);
		
		dAmtDis = new JTextField();
		dAmtDis.setText("Deposit Amount:");
		dAmtDis.setForeground(new Color(0, 0, 128));
		dAmtDis.setFont(new Font("Calibri", Font.BOLD, 15));
		dAmtDis.setColumns(10);
		dAmtDis.setBounds(27, 113, 255, 28);
		panel.add(dAmtDis);
		dAmtDis.setVisible(false);
		
	}
	public void hideBoxes() {
		fNameDis.setVisible(false);
		lNameDis.setVisible(false);
		balanceDis.setVisible(false);
		//resultDis.setVisible(false);
		//submit.setVisible(false);
		accNumDis.setVisible(false);
		wAmtDis.setVisible(false);
		dAmtDis.setVisible(false);
			
		fNameDis.setText("First Name:");
		lNameDis.setText("Last Name:");
		balanceDis.setText("Starting Balance:");
		resultDis.setText("");
		accNumDis.setText("Account ID:");
		wAmtDis.setText("Withdraw Amount:");
		dAmtDis.setText("Deposit Amount:");
		
		for (ActionListener al : submit.getActionListeners()) {
			submit.removeActionListener(al);
		}
	}
	
	public void override(JTextField area, String ogPrompt) {
		area.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (area.getText().equals(ogPrompt)) {
					area.setText("");
				}
			}
		});
	}
}