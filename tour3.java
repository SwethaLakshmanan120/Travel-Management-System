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

public class tour3 extends JFrame {

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
					tour3 frame = new tour3();
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
	public tour3() {
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
				+ "\nDay 1  Chennai to Palolem 1 Stop"
				+ "\nDay 1 Palolem to Calangute 1 Stop "
				+ "\nDay 2 Calangute to Agonda 1 Stop "
				+ "\nDay 2 Agonda to Candolim 1 Stop"
				+ "\nDay 3 Candolim to Arambol 1 Stop"
				+ "\nDay 4 Depart Chennai 1 Stop "
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
		btnNewButton.setBounds(523, 565, 126, 25);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					manali sf1 = new manali();
				sf1.setVisible(true);
				SwingUtilities.windowForComponent(btnNewButton_1).dispose();}
				catch(Exception rt) {
					rt.printStackTrace();				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(108, 565, 110, 23);
		contentPane.add(btnNewButton_1);
		textArea_1.append("\n\tHotels And Accomdations:\n"
				+ "\nSeaview Resort in Palolem"
				+"\nGinger Tree Goveia Suites in Candolim"
				+"\nFamafa Beach Resort in Arambol\n"
				+ "\nBREAKFAST INCLUDED......");
	}

}
