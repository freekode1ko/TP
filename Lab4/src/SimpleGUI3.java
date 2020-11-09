import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleGUI3 
{
	private JFrame frmHidemyas;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{try 
				{
					SimpleGUI3 window = new SimpleGUI3();
					window.frmHidemyas.setVisible(true);
				} catch (Exception e) {e.printStackTrace();}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleGUI3() 
	{initialize();}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmHidemyas = new JFrame();
		frmHidemyas.setTitle("hidemyas");
		frmHidemyas.setBounds(100, 100, 300, 150);
		frmHidemyas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHidemyas.getContentPane().setLayout(null);
		
		JLabel lblText = new JLabel("text:");
		lblText.setBounds(52, 11, 35, 14);
		frmHidemyas.getContentPane().add(lblText);
		
		textField = new JTextField();
		textField.setBackground(Color.RED);
		textField.setBounds(130, 11, 144, 92);
		frmHidemyas.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("hide");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
                if (btnNewButton.getText().equals("hide")) 
                {
                	btnNewButton.setText("show");
                	textField.setVisible(false);
                } 
                else 
                {
                	btnNewButton.setText("hide");
                	textField.setVisible(true);
                }
			}
		});
		btnNewButton.setBounds(20, 36, 89, 67);
		frmHidemyas.getContentPane().add(btnNewButton);
	}
}
