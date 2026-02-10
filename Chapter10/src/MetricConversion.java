import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListCellRenderer;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
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
		panel.setBackground(SystemColor.text);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Metric Coversion");
		title.setFont(new Font("Serif", Font.BOLD, 25));
		title.setForeground(new Color(64, 0, 128));
		title.setBounds(20, 11, 209, 36);
		panel.add(title);
		
		JComboBox convert = new JComboBox();
		convert.setBackground(SystemColor.textHighlight);
		convert.setForeground(new Color(64, 0, 128));
		convert.setFont(new Font("Serif", Font.PLAIN, 14));
		convert.setModel(new DefaultComboBoxModel(new String[] {"Inches To Centimeters", "Feet To Meters", "Gallons To Meters", "Pounds To Kilograms"}));
		convert.setBounds(20, 103, 184, 29);
		panel.add(convert);
		
		convert.setSelectionBackground();
		
		JLabel prompt = new JLabel("Select A Conversion Type");
		prompt.setFont(new Font("Serif", Font.BOLD, 15));
		prompt.setForeground(new Color(64, 0, 128));
		prompt.setBounds(20, 78, 184, 14);
		panel.add(prompt);
	}
}
