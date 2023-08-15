package JavaGUI;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGui implements ActionListener 
{
	private static JLabel Label;
	private static JTextField UserText;
	private static JLabel Password; 
	private static JPasswordField passText;
	private static JButton button;
	private static JLabel success;
	private static JPanel Panel;
	
	public static void main(String[] args) 
	{
		JPanel Panel = new JPanel();
		
		JFrame Frame = new JFrame("Login");
		Frame.setSize(100, 100);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setVisible(true);
		Frame.add(Panel);
		
		
		Panel.setLayout(null);
		
		Label = new JLabel("User");
		Label.setBounds(10, 20, 80, 25);
		Panel.add(Label);

		UserText = new JTextField();
		UserText.setBounds(100, 25, 165, 25);
		Panel.add(UserText);
		
		Password = new JLabel("Password");
		Password.setBounds(10, 50, 80, 25);
		Panel.add(Password);
		
		passText = new JPasswordField();
		passText.setBounds(100, 50, 165, 25);
		Panel.add(passText);
		
		button = new JButton("Login");
		button.setBounds(200, 80, 80, 25);
		button.addActionListener(new LoginGui());
		Panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		Panel.add(success);
		success.setText("");
		
		Frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		String User = UserText.getText();
		String passing = passText.getText();
		
		
		if(User.equals("maxhzhang119@gmail.com") && passing.equals("Three03Rose"))
		{
			success.setText("Login Successful!");
			
		}
		else
			success.setText("Login Failed, sucks to suck.");
	
	}

}
