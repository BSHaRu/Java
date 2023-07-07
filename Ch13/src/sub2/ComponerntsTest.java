package sub2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ComponerntsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponerntsTest window = new ComponerntsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponerntsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		lblNewLabel.setBounds(12, 10, 111, 15);
		frame.getContentPane().add(lblNewLabel);
		
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "저장되었습니다.");
			}
		});
		btnSave.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		btnSave.setBounds(302, 27, 62, 22);
		frame.getContentPane().add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(
								null, "로드 하시겠습니까?","Load해줘",JOptionPane.YES_NO_OPTION);
				if(answer == 0) System.out.println("Yes 클릭");
				else System.out.println("No 클릭");
			}
		});
		btnLoad.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		btnLoad.setBounds(362, 27, 62, 22);
		frame.getContentPane().add(btnLoad);
		
		txtUid = new JTextField();
		txtUid.setBounds(57, 61, 90, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(57, 91, 90, 21);
		frame.getContentPane().add(txtName);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(57, 122, 90, 21);
		frame.getContentPane().add(txtPhone);
		
		JLabel labelUid = new JLabel("Id");
		labelUid.setBounds(12, 64, 45, 15);
		frame.getContentPane().add(labelUid);
		
		JLabel labelName = new JLabel("name");
		labelName.setBounds(12, 94, 45, 15);
		frame.getContentPane().add(labelName);
		
		JLabel labelPhone = new JLabel("phone");
		labelPhone.setBounds(12, 125, 45, 15);
		frame.getContentPane().add(labelPhone);
		
		JLabel lbUid = new JLabel("result : ");
		lbUid.setBounds(242, 64, 122, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("result : ");
		lbName.setBounds(242, 94, 122, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbPhone = new JLabel("result : ");
		lbPhone.setBounds(242, 125, 122, 15);
		frame.getContentPane().add(lbPhone);
			
		JButton btnUid = new JButton("OK");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbUid.setText("result : " + uid);
			}
		});
		btnUid.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		btnUid.setBounds(159, 59, 80, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("OK");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText(); 
				lbName.setText("result : " + name);
			}
		});		
		btnName.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		btnName.setBounds(159, 90, 80, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnPhone = new JButton("OK");
		btnPhone.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		btnPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phone = txtPhone.getText();
				lbPhone.setText("result : " + phone);
			}
		});
		btnPhone.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		btnPhone.setBounds(159, 120, 80, 23);
		frame.getContentPane().add(btnPhone);
		
		JLabel lblNewLabel_1 = new JLabel("CheckBox Test");
		lblNewLabel_1.setBounds(12, 150, 99, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chk1 = new JCheckBox("Apple");
		chk1.setFont(new Font("야놀자 야체 R", Font.PLAIN, 12));
		chk1.setBounds(8, 168, 62, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("Cherry");
		chk2.setFont(new Font("야놀자 야체 R", Font.PLAIN, 12));
		chk2.setBounds(74, 168, 62, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("Banana");
		chk3.setFont(new Font("야놀자 야체 R", Font.PLAIN, 12));
		chk3.setBounds(140, 168, 62, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("Tomato");
		chk4.setFont(new Font("야놀자 야체 R", Font.PLAIN, 12));
		chk4.setBounds(206, 168, 62, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("Orenge");
		chk5.setFont(new Font("야놀자 야체 R", Font.PLAIN, 12));
		chk5.setBounds(274, 168, 62, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("result : ");
		lbChkFruit.setBounds(12, 191, 324, 15);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkFruit = new JButton("OK");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) fruits.add(chk1.getText());
				if(chk2.isSelected()) fruits.add(chk2.getText());
				if(chk3.isSelected()) fruits.add(chk3.getText());
				if(chk4.isSelected()) fruits.add(chk4.getText());
				if(chk5.isSelected()) fruits.add(chk5.getText());
				
				lbChkFruit.setText("result : " +fruits);
			}
		});
		btnChkFruit.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		btnChkFruit.setBounds(344, 167, 80, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_2 = new JLabel("Radio Test");
		lblNewLabel_2.setBounds(12, 233, 80, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdMale = new JRadioButton("male");
		rdMale.setBounds(12, 254, 69, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("female");
		rdFemale.setBounds(85, 254, 69, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JLabel lbGender = new JLabel("result : ");
		lbGender.setBounds(12, 283, 324, 15);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("OK");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdMale.isSelected()) 
					lbGender.setText("result : " + rdMale.getText());
				else
					lbGender.setText("result : " + rdFemale.getText());
			}	
		});
		btnGender.setFont(new Font("JetBrains Mono", Font.BOLD, 12));
		btnGender.setBounds(170, 254, 80, 23);
		frame.getContentPane().add(btnGender);
	}
}
