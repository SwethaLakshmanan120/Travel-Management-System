package abc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class tamilnadu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JTextField textField;
	static JComboBox comboBox;
	static JComboBox comboBox_1;
	static JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tamilnadu frame = new tamilnadu();
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
	public tamilnadu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1194, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new booking_package().setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					pack sf1 = new pack();
				sf1.setVisible(true);
				SwingUtilities.windowForComponent(btnNewButton_1).dispose();}
				catch(Exception rt) {
					rt.printStackTrace();				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(109, 551, 128, 40);
		contentPane.add(btnNewButton_1);
		btnNewButton.setBounds(795, 521, 138, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("TRAVERSE TAMIL NADU");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel.setBounds(236, 11, 638, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chidambaram - Kumbakonam - Thanjavur - Madurai - Rameswaram");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		lblNewLabel_1.setBounds(204, 88, 695, 66);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("- Trichy - Mahabalipuram - Kanchipuram in 8 Days (from Chennai)");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(214, 123, 695, 66);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Travellers");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(183, 283, 128, 35);
		contentPane.add(lblNewLabel_2);
		
		comboBox = new JComboBox<>();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(408, 280, 93, 31);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("Vehicle");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(185, 358, 128, 35);
		contentPane.add(lblNewLabel_2_1);
		
		 comboBox_1 = new JComboBox<>();
		comboBox_1.setModel(new DefaultComboBoxModel<>(new String[] {"sedan -AC", "SUV-AC"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setBounds(408, 358, 138, 35);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(185, 428, 128, 35);
		contentPane.add(lblNewLabel_2_1_1);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(408, 428, 154, 31);
		contentPane.add(dateChooser);
		
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Total Amount");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(352, 527, 160, 35);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(542, 527, 119, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		calculateButton.setBounds(408, 470, 154, 35);
		contentPane.add(calculateButton);
		
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numOfTravellers = Integer.parseInt(comboBox.getSelectedItem().toString());
				int totalAmount = numOfTravellers * 40000;
				textField.setText(Integer.toString(totalAmount));
			}
		});
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon("C:\\Users\\Muthurajan\\Downloads\\santhoshsivan-iLaQ0F3l0Fw-unsplash.jpg"));
		image.setBounds(0, 0, 1228, 663);
		contentPane.add(image);
	}
}
