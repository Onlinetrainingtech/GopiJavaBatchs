import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminLogin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(216, 10, 117, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AdminId");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(24, 85, 102, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(182, 88, 167, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(24, 199, 125, 19);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 196, 167, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String adminid=textField.getText();
					String adminpwd=textField_1.getText();
					
					String str1="select * from adminlogin";
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gopius","root","root");
					
					Statement smt=conn.createStatement();
					
					ResultSet rs=smt.executeQuery(str1);
					
					rs.next();
					
					String adminiddb=rs.getString(1);
					
					String adminpwddb=rs.getString(2);
					
					if(adminid.equals(adminiddb)&&adminpwd.equals(adminpwddb))
					{
						JOptionPane.showMessageDialog(btnNewButton, "LoginSucess!!");
						new AdminHomePage().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "LoginFail..!!");
					}
					
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(70, 285, 117, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(247, 285, 102, 30);
		contentPane.add(btnNewButton_1);
	}
}
