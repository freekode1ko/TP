import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SimpleGUI2 {

	private JFrame frmDa;
	private JTextField textField;
	private JCheckBox chckbxDa = new JCheckBox("DA");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUI2 window = new SimpleGUI2();
					window.frmDa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleGUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDa = new JFrame();
		frmDa.setTitle("DA");
		frmDa.setBounds(100, 100, 300, 150);
		frmDa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDa.getContentPane().setLayout(null);
		
		JButton btnDa = new JButton("DA");
		btnDa.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				StringBuilder msg = new StringBuilder("");
	            msg.append(textField.getText());
	            if(chckbxDa.isSelected())
	            	msg.append(" DA");
	            else msg.append(" NE DA");
	            JOptionPane.showMessageDialog(null, msg, "MSG",JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		btnDa.setBounds(10, 77, 89, 23);
		frmDa.getContentPane().add(btnDa);
		
		JLabel lblDa = new JLabel("DA");
		lblDa.setBounds(10, 23, 46, 14);
		frmDa.getContentPane().add(lblDa);
		
		textField = new JTextField();
		textField.setBounds(188, 20, 86, 20);
		frmDa.getContentPane().add(textField);
		textField.setColumns(10);
		
		//JCheckBox chckbxDa = new JCheckBox("DA");
		chckbxDa.setBounds(177, 77, 97, 23);
		frmDa.getContentPane().add(chckbxDa);
	}
}
