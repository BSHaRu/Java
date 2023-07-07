package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalc {

	private JFrame frmMycalcV;
	private JTextField txtDsp;
	
	private int num1 = 0;
	private int num2 = 0;
	// 1: plus, 2 : min, 3: mul, 4: div
	private int operator = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMycalcV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMycalcV = new JFrame();
		frmMycalcV.setTitle("MyCalc v1.0");
		frmMycalcV.setBounds(100, 100, 295, 422);
		frmMycalcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalcV.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setBackground(Color.WHITE);
		txtDsp.setEditable(false);
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setFont(new Font("배달의민족 주아", Font.PLAIN, 24));
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 255, 45);
		frmMycalcV.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(136, 65, 50, 50);
		frmMycalcV.getContentPane().add(btnBack);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1.setBounds(74, 65, 50, 50);
		frmMycalcV.getContentPane().add(btnNewButton_3_1);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("1");
				
				num1 = 1;
			}
		});
		btn1.setBounds(12, 245, 50, 50);
		frmMycalcV.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("2");
				
				num2 = 2;
			}
		});
		btn2.setBounds(74, 245, 50, 50);
		frmMycalcV.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("3");
			}
		});
		btn3.setBounds(137, 245, 50, 50);
		frmMycalcV.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("4");
			}
		});
		btn4.setBounds(12, 185, 50, 50);
		frmMycalcV.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("5");
			}
		});
		btn5.setBounds(74, 185, 50, 50);
		frmMycalcV.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("6");
			}
		});
		btn6.setBounds(137, 185, 50, 50);
		frmMycalcV.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("7");
			}
		});
		btn7.setBounds(12, 125, 50, 50);
		frmMycalcV.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("8");
			}
		});
		btn8.setBounds(74, 125, 50, 50);
		frmMycalcV.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("9");
			}
		});
		btn9.setBounds(137, 125, 50, 50);
		frmMycalcV.getContentPane().add(btn9);
		
		JButton btn00 = new JButton("0");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDsp.setText("0");
			}
		});
		btn00.setBounds(74, 305, 50, 50);
		frmMycalcV.getContentPane().add(btn00);
		
		JButton btnNewButton_3_2 = new JButton("");
		btnNewButton_3_2.setBounds(12, 305, 50, 50);
		frmMycalcV.getContentPane().add(btnNewButton_3_2);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(12, 65, 50, 50);
		frmMycalcV.getContentPane().add(btnCancel);
		
		JButton btnDouble = new JButton(".");
		btnDouble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDouble.setBounds(137, 305, 50, 50);
		frmMycalcV.getContentPane().add(btnDouble);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				
				if(operator == 1) result = num1+num2;
				else if(operator == 2) result = num1-num2;
				else if(operator == 3) result = num1*num2;
				else if(operator == 4) result = num1/num2;
				
				// 문자열로 변환해줘야함
				txtDsp.setText(""+result);
			}
		});
		btnEqual.setBounds(217, 305, 50, 50);
		frmMycalcV.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
			}
		});
		btnPlus.setBounds(217, 185, 50, 50);
		frmMycalcV.getContentPane().add(btnPlus);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMin.setBounds(217, 245, 50, 50);
		frmMycalcV.getContentPane().add(btnMin);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMul.setBounds(217, 125, 50, 50);
		frmMycalcV.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(217, 65, 50, 50);
		frmMycalcV.getContentPane().add(btnDiv);
	}

}
