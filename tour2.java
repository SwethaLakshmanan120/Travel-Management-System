package abc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tour1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JTextArea textArea_1;
	static JTextArea textArea;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tour1 frame = new tour1();
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
	public tour1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1210, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 22, 551, 500);
		contentPane.add(scrollPane);
		
		 textArea = new JTextArea();
		textArea.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
		scrollPane.setViewportView(textArea);
		textArea.append("\n\t What To Expect \n"
				+ "\nDay 1  Chennai to Cochin 1 Stop"
				+ " \nDay 2 Cochin to Munnar 1 Stop "
				+ "\nDay 3 Munnar to Vagamon 1 Stop "
				+ "\nDay 4  Vagomon to Varkala 1 Stop"
				+ "\nDay 5 Allapey to Allapey 1 Stop "
				+ " \nDay 6 Depart Chennai 1 Stop "
				);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(611, 22, 551, 500);
		contentPane.add(scrollPane_1);
		
		textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new done().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(531, 566, 126, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					kerala sf1 = new kerala();
				sf1.setVisible(true);
				SwingUtilities.windowForComponent(btnNewButton_1).dispose();}
				catch(Exception rt) {
					rt.printStackTrace();				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(110, 560, 110, 29);
		contentPane.add(btnNewButton_1);
		textArea_1.append("\n\tHotels And Accomdations:\n"
				+ "\nHotel Cochin Legacy in Cochin"
				+"\nHotel Hill view  in Munnar"
				+"\nZostel Hotel in Vagamon"
				+ "\nAryavilla Heritage in Varkala"
				+ "\nSri Krishna House Boat in Allapey\n"
				+ "\nBREAKFAST INCLUDED......");
	}

}
