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

public class tour extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JTextArea textArea_1;
	static JTextArea textArea;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tour frame = new tour();
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
	public tour() {
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
		textArea.append("\n\t What To Expect\n"
				+ "\nDay 1  Chennai to Kanchipuram 1 Stop"
				+ " \nDay 2 Kanchipuram to Mahabalipuram 1 Stop "
				+ "\nDay 3 Mahabalipuram to Chidambaram 1 Stop "
				+ "\nDay 4  Chidambaram to Kumbakonam 1 Stop"
				+ "\nDay 5 Kumbakonam to Thanjavur 1 Stop "
				+ "\nDay 6 Thanjavur to Madurai 1 Stop"
				+ " \nDay 7 Madurai to Trichy 1 Stop "
				+ "\nDay 8 Trichy to Chennai 1 Stop"
				+ " \nDay 9 Depart Chennai 1 Stop "
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
		btnNewButton.setBounds(539, 559, 126, 23);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					tamilnadu sf1 = new tamilnadu();
				sf1.setVisible(true);
				SwingUtilities.windowForComponent(btnBack).dispose();}
				catch(Exception rt) {
					rt.printStackTrace();				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(87, 559, 126, 23);
		contentPane.add(btnBack);
		textArea_1.append("\n\tHotels And Accomdations:\n"
				+ " \nGayathri Stay Stay and Hotel in Kanchipuram"
				+"\nLandmark Pallava Stay and Hotel in Mahabalipuram"
				+"\nLakshmi Vilas Stay and Hotel in Chidambaram"
				+ "\nMantra Koodam Stay and Hotel in Kumbakonam"
				+ "\nSvatma Stay and Hotel in Thanjavur"
				+ "\nAstoria Stay and Hotel in Madurai"
				+ "\nCourtyard hotel in Trichy"
				+ "\nBREAKFAST INCLUDED......");
	}

}
