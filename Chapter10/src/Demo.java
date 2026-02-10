import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Demo {

	private JFrame frame;
	private JTextField fName;
	private JTextField lName;
	private JComboBox school;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		fName = new JTextField();
		fName.setBackground(new Color(249, 242, 255));
		fName.addKeyListener(new KeyAdapter() {
			//Override OG text
			public void keyTyped(KeyEvent e) 
			{
				if(fName.getText().equals("First Name: "))
					fName.setText("");
			}
		});
		fName.setFont(new Font("Serif", Font.BOLD, 15));
		fName.setForeground(new Color(64, 0, 128));
		fName.setText("First Name: ");
		fName.setColumns(10);
		
		lName = new JTextField();
		lName.setBackground(new Color(249, 242, 255));
		lName.addKeyListener(new KeyAdapter() {
			//Override OG text
			public void keyTyped(KeyEvent e) {
				if(lName.getText().equals("Last Name: "))
					lName.setText("");
			}
		});
		lName.setFont(new Font("Serif", Font.BOLD, 15));
		lName.setForeground(new Color(64, 0, 128));
		lName.setText("Last Name: ");
		lName.setColumns(10);
		
		JComboBox grade = new JComboBox();
		grade.setBackground(new Color(249, 242, 255));
		grade.setForeground(new Color(64, 0, 128));
		grade.setFont(new Font("Serif", Font.BOLD, 15));
		grade.setModel(new DefaultComboBoxModel(new String[] {"Select Grade Level:", "10", "11", "12"}));

		
		school = new JComboBox();
		school.setBackground(new Color(249, 242, 255));
		school.setModel(new DefaultComboBoxModel(new String[] {"Select Your School:", "Crescent", "Western", "Pearson", "Churchill"}));
		school.setForeground(new Color(64, 0, 128));
		school.setFont(new Font("Serif", Font.BOLD, 15));
		
		JTextArea dis = new JTextArea();
		dis.setFont(new Font("Serif", Font.BOLD, 15));
		dis.setForeground(new Color(64, 0, 128));
		dis.setBackground(new Color(249, 242, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		
		JButton submit = new JButton("Submit");
		submit.setBackground(new Color(249, 242, 255));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fn = fName.getText();
				String ln = lName.getText();
				String grd = "";
				String schl = "";
					
				
				//Grade level
				if(grade.getSelectedItem().equals("12"))
				{
					grd = "12";
				}
				else if(grade.getSelectedItem().equals("11"))
				{
					grd = "11";
				}
				else
				{
					grd = "10";
				}
				
				//School
				if(school.getSelectedItem().equals("Crescent"))
				{
					schl = "Crescent";
				}
				else if(school.getSelectedItem().equals("Pearson"))
				{
					schl = "Pearson";
				}
				else if(school.getSelectedItem().equals("Western"))
				{
					schl = "Western";
				}
				else
				{
					schl = "Churchill";
				}
				
				//Display information
				dis.setText(" " + fn + " " + ln
						+ " is in grade " + grd
						+ " and goes to "
						+ schl + ".");
						
			}
			
		});
		submit.setFont(new Font("Serif", Font.BOLD, 15));
		submit.setForeground(new Color(64, 0, 128));
		submit.setToolTipText("");
		
		
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(submit, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(dis, Alignment.LEADING)
								.addComponent(school, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(fName, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lName, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
								.addComponent(grade, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(194, Short.MAX_VALUE))))
		);
		
		
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(fName, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(lName, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(grade, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(school, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(dis, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(submit, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(104))
		);
		panel.setLayout(gl_panel);
	}
}
