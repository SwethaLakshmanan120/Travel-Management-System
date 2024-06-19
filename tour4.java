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

public class tour4 extends JFrame {

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
					tour4 frame = new tour4();
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
	public tour4() {
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
				+ "\nDay 1  Chennai to Taj Mahal "
				+ " \nDay 2 Taj Mahal to Itmad-ud-Daulah's Tomb  "
				+ "\nDay 3 Itmad-ud-Daulah's Tomb to Akbar's Tomb  "
				+ "\nDay 4  Akbar's Tomb to Chini Ka Rauza "
				+ "\nDay 5  Chini Ka Rauza to Ram Bagh  "
				+ "\nDay 6  Ram Bagh  to  Taj Nature Walk"
				+ " \nDay 7 Depart Chennai  "
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
		btnNewButton.setBounds(521, 554, 135, 34);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					agra sf1 = new agra();
				sf1.setVisible(true);
				SwingUtilities.windowForComponent(btnNewButton_1).dispose();}
				catch(Exception rt) {
					rt.printStackTrace();				}
			}
		});
		btnNewButton_1.setBounds(126, 560, 106, 28);
		contentPane.add(btnNewButton_1);
		textArea_1.append("\n\tHotels And Accomdations:\n"
				+ "\nHotel Alleviate in Agra"
				+ "\nBREAKFAST INCLUDED......");
	}

}
