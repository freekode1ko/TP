import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SimpleGUI {

	private JFrame frmAb;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					SimpleGUI window = new SimpleGUI();
					window.frmAb.setVisible(true);
				} catch (Exception e) {e.printStackTrace();}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleGUI() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmAb = new JFrame();
		frmAb.setTitle("Простая программа");
		frmAb.setBounds(100, 100, 200, 200);
		frmAb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnPressMe = new JButton("PRESS ME!");
		btnPressMe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				StringBuilder msg = new StringBuilder("");
				if(!textField.getText().equals("")&&!textField_1.getText().equals(""))
				{
		            msg.append(textField.getText()+" "+textField_1.getText());
		            JOptionPane.showMessageDialog(null, msg, "MSG",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
		frmAb.getContentPane().add(btnPressMe, BorderLayout.SOUTH);
		
		textField = new JTextField();
		frmAb.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		frmAb.getContentPane().add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
	}
}
