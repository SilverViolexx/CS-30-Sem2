package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;

public class StudentSemesterAverage {

	private JFrame frame;
	private JTextField enterN;
	private JTextField enterGrade;
	private JTextField enterG2;
	private JTextField enterSem;
	private JTextField enterG1;
	private JTextField enterG3;
	private JTextField enterG4;
	private JScrollPane scrollPane;
	private JTextArea displayInfo;
	private String studentN, level, sem;
	private double grd1, grd2, grd3, grd4, avg;
	private File textFile;
	private FileReader reads;
	private BufferedReader readFile;
	private FileWriter writes;
	private BufferedWriter writeFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAverage window = new StudentSemesterAverage();
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
	public StudentSemesterAverage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 596, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea prompt = new JTextArea();
		prompt.setFont(new Font("Calibri", Font.BOLD, 15));
		prompt.setText("Student Name:\r\nGrade Level:\r\nSemester Number:\r\nGrade 1:\r\nGrade 2:\r\nGrade 3:\r\nGrade 4:");
		prompt.setBounds(74, 10, 176, 144);
		panel.add(prompt);
		
		enterN = new JTextField();
		enterN.setFont(new Font("Calibri", Font.PLAIN, 15));
		enterN.setBackground(SystemColor.inactiveCaptionBorder);
		enterN.setBounds(300, 10, 228, 20);
		panel.add(enterN);
		enterN.setColumns(10);
		
		enterGrade = new JTextField();
		enterGrade.setFont(new Font("Calibri", Font.PLAIN, 15));
		enterGrade.setBackground(SystemColor.inactiveCaptionBorder);
		enterGrade.setColumns(10);
		enterGrade.setBounds(300, 30, 228, 20);
		panel.add(enterGrade);
		
		enterG2 = new JTextField();
		enterG2.setFont(new Font("Calibri", Font.PLAIN, 15));
		enterG2.setBackground(SystemColor.inactiveCaptionBorder);
		enterG2.setColumns(10);
		enterG2.setBounds(300, 90, 228, 20);
		panel.add(enterG2);
		
		enterSem = new JTextField();
		enterSem.setFont(new Font("Calibri", Font.PLAIN, 15));
		enterSem.setBackground(SystemColor.inactiveCaptionBorder);
		enterSem.setColumns(10);
		enterSem.setBounds(300, 50, 228, 20);
		panel.add(enterSem);
		
		enterG1 = new JTextField();
		enterG1.setFont(new Font("Calibri", Font.PLAIN, 15));
		enterG1.setBackground(SystemColor.inactiveCaptionBorder);
		enterG1.setColumns(10);
		enterG1.setBounds(300, 70, 228, 20);
		panel.add(enterG1);
		
		enterG3 = new JTextField();
		enterG3.setFont(new Font("Calibri", Font.PLAIN, 15));
		enterG3.setBackground(SystemColor.inactiveCaptionBorder);
		enterG3.setColumns(10);
		enterG3.setBounds(300, 110, 228, 20);
		panel.add(enterG3);
		
		enterG4 = new JTextField();
		enterG4.setFont(new Font("Calibri", Font.PLAIN, 15));
		enterG4.setBackground(SystemColor.inactiveCaptionBorder);
		enterG4.setColumns(10);
		enterG4.setBounds(300, 130, 228, 20);
		panel.add(enterG4);
		
		JLabel avgDis = new JLabel("Average: ");
		avgDis.setFont(new Font("Calibri", Font.BOLD, 15));
		avgDis.setBounds(77, 152, 228, 20);
		panel.add(avgDis);
		
		JButton saveFile = new JButton("Save To File");
		
		saveFile.setVerticalAlignment(SwingConstants.TOP);
		saveFile.setBackground(SystemColor.inactiveCaptionBorder);
		saveFile.setFont(new Font("Calibri", Font.BOLD, 15));
		saveFile.setForeground(new Color(0, 0, 0));
		saveFile.setBounds(86, 296, 115, 23);
		panel.add(saveFile);
		
		JButton viewFile = new JButton("View File Contents");
		viewFile.setVerticalAlignment(SwingConstants.TOP);
		viewFile.setForeground(Color.BLACK);
		viewFile.setFont(new Font("Calibri", Font.BOLD, 15));
		viewFile.setBackground(SystemColor.inactiveCaptionBorder);
		viewFile.setBounds(206, 296, 155, 23);
		panel.add(viewFile);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(37, 176, 514, 109);
		panel.add(scrollPane);
		
		displayInfo = new JTextArea();
		displayInfo.setLineWrap(true);
		displayInfo.setBackground(SystemColor.inactiveCaptionBorder);
		displayInfo.setFont(new Font("Calibri", Font.PLAIN, 15));
		scrollPane.setViewportView(displayInfo);
		
		JButton deleteFile = new JButton("Clear Entire File");
		deleteFile.setVerticalAlignment(SwingConstants.TOP);
		deleteFile.setForeground(Color.BLACK);
		deleteFile.setFont(new Font("Calibri", Font.BOLD, 15));
		deleteFile.setBackground(SystemColor.inactiveCaptionBorder);
		deleteFile.setBounds(364, 296, 148, 23);
		panel.add(deleteFile);
		
		
		
		
		
		
		textFile = new File("C:\\Users\\38207518\\git\\CS-30-Sem2\\Chapter11\\src\\Mastery\\GradeBook.txt");
		DecimalFormat df = new DecimalFormat("#0.00");
		
		saveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentN = enterN.getText().toUpperCase();
				level = enterGrade.getText();
				sem = enterSem.getText();
				grd1 = Double.parseDouble(enterG1.getText());
				grd2 = Double.parseDouble(enterG2.getText());
				grd3 = Double.parseDouble(enterG3.getText());
				grd4 = Double.parseDouble(enterG4.getText());
				
				avg = (grd1 + grd2 + grd3 + grd4) /4;
				
				try {					
					writes = new FileWriter(textFile, true);
					writeFile = new BufferedWriter(writes);
					

					writeFile.write("Student Name: " + studentN + ", Grade Level: " + level + ", Semester Number: " + sem + ", Grade 1: " + grd1 +
							", Grade 2: " + grd2 + ", Grade 3: " + grd3 + ", Grade 4: " + grd4 + ", Average: " + df.format(avg) + "\n");
					
					writeFile.close();
					writes.close();
					displayInfo.setText("Data Written");
					clearBox();
				}
				
				catch (FileNotFoundException e1){
				    	System.out.println("File doesn't exist.");
						System.err.println("FileNotFOundException: " + e1.getMessage());
				}
				catch (IOException e1) {
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + e1.getMessage());
				}
				
			}
		});
		
		viewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					reads = new FileReader(textFile);
					readFile = new BufferedReader(reads);
					clearBox();
					
					String eachLine, newLine = "";
					
					while ((eachLine = readFile.readLine()) != null) {
						newLine = newLine + eachLine + "\n";
						displayInfo.setText(newLine);
					}	
					
					readFile.close();
					reads.close();
				}
				catch (FileNotFoundException e1){
			    	System.out.println("File doesn't exist.");
					System.err.println("FileNotFOundException: " + e1.getMessage());
				}
				catch (IOException e1) {
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + e1.getMessage());
				}
				
			}
		});
		
		deleteFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					writes = new FileWriter(textFile);
				writeFile = new BufferedWriter(writes);
				
				
				writeFile.write("");
				
				writeFile.close();
				writes.close();
				
				}
				catch (FileNotFoundException e1){
			    	System.out.println("File doesn't exist.");
					System.err.println("FileNotFOundException: " + e1.getMessage());
				}
				catch (IOException e1) {
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + e1.getMessage());
				}
			}
		});
		
		
	}
	
	public void clearBox() {
		enterN.setText("");
		enterGrade.setText("");
		enterG2.setText("");
		enterSem.setText("");
		enterG1.setText("");
		enterG3.setText("");
		enterG4.setText("");
	}
}
