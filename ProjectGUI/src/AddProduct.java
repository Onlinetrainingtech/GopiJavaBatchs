import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 28, 710, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AddProduct");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(284, 26, 114, 28);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ProductId");
		lblNewLabel_1.setBounds(42, 88, 103, 28);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(220, 91, 178, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ProductName");
		lblNewLabel_2.setBounds(42, 170, 122, 28);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 171, 178, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ProductPrice");
		lblNewLabel_3.setBounds(42, 253, 122, 28);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 253, 178, 27);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Quty");
		lblNewLabel_4.setBounds(40, 336, 45, 13);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(220, 329, 178, 28);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.setBounds(527, 71, 103, 28);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Searching");
		btnNewButton_1.setBounds(527, 152, 103, 28);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Updated");
		btnNewButton_2.setBounds(527, 237, 103, 28);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setBounds(527, 321, 103, 28);
		panel.add(btnNewButton_3);
	}
}
