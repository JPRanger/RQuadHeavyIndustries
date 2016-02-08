package RQuadHeavyIndustriesScheduler;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		/*Create components*/
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{82, 82, 82, 0};
		gbl_contentPane.rowHeights = new int[]{66, 66, 66, 66, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton calendarButton = new JButton("Calendar");
		calendarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				new Calendar();
				contentPane.getParent();
			}
		});
		
		GridBagConstraints gbc_calendarButton = new GridBagConstraints();
		gbc_calendarButton.anchor = GridBagConstraints.SOUTH;
		gbc_calendarButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_calendarButton.insets = new Insets(0, 0, 5, 5);
		gbc_calendarButton.gridx = 1;
		gbc_calendarButton.gridy = 0;
		contentPane.add(calendarButton, gbc_calendarButton);
		
		JRadioButton nameButton = new JRadioButton("Name");
		GridBagConstraints gbc_nameButton = new GridBagConstraints();
		gbc_nameButton.anchor = GridBagConstraints.SOUTHEAST;
		gbc_nameButton.insets = new Insets(0, 0, 5, 5);
		gbc_nameButton.gridx = 0;
		gbc_nameButton.gridy = 1;
		contentPane.add(nameButton, gbc_nameButton);
		
		JRadioButton dateButton = new JRadioButton("Date");
		GridBagConstraints gbc_dateButton = new GridBagConstraints();
		gbc_dateButton.anchor = GridBagConstraints.SOUTH;
		gbc_dateButton.insets = new Insets(0, 0, 5, 5);
		gbc_dateButton.gridx = 1;
		gbc_dateButton.gridy = 1;
		contentPane.add(dateButton, gbc_dateButton);
		
		JRadioButton wkIDButton = new JRadioButton("Work ID");
		GridBagConstraints gbc_wkIDButton = new GridBagConstraints();
		gbc_wkIDButton.anchor = GridBagConstraints.SOUTHWEST;
		gbc_wkIDButton.insets = new Insets(0, 0, 5, 0);
		gbc_wkIDButton.gridx = 2;
		gbc_wkIDButton.gridy = 1;
		contentPane.add(wkIDButton, gbc_wkIDButton);
		
		JTextField searchField = new JTextField("Search");
		GridBagConstraints gbc_searchField = new GridBagConstraints();
		gbc_searchField.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchField.insets = new Insets(0, 0, 5, 5);
		gbc_searchField.gridx = 1;
		gbc_searchField.gridy = 2;
		contentPane.add(searchField, gbc_searchField);
		
		JButton searchButton = new JButton("Search");
		GridBagConstraints gbc_searchButton = new GridBagConstraints();
		gbc_searchButton.anchor = GridBagConstraints.NORTH;
		gbc_searchButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchButton.insets = new Insets(0, 0, 0, 5);
		gbc_searchButton.gridx = 1;
		gbc_searchButton.gridy = 3;
		contentPane.add(searchButton, gbc_searchButton);
	}

}
