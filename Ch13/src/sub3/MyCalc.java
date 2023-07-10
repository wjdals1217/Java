package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MyCalc extends JFrame {

	private JPanel contentPane;
	private JTextField txtDsp;

	private int num1 = 0;
	private int num2 = 0;
	
	private int operator = 0; // 1:plus, 2:minus, 3:multi, 4:div
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc frame = new MyCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	ArrayList<Double> numberList = new ArrayList<>(); // 숫자를 저장하는 리스트
	ArrayList<String> arithList = new ArrayList<>(); // 연산자를 저장하는 리스트
	static final Double ERROR_NUM = -99999.999; // 오류넘버;
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
		frame = new JFrame();
		frame.setTitle("MyCalc v1.0");
		frmMycalcV.setBounds(100, 100, 279, 372);
		frmMycalcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalcV.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setBackground(new Color(255, 255, 255));
		txtDsp.setEditable(false);
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setFont(new Font("굴림", Font.PLAIN, 24));
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 239, 40);
		frmMycalcV.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(22, 60, 45, 45);
		frmMycalcV.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(79, 60, 45, 45);
		frmMycalcV.getContentPane().add(btn8);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(195, 60, 45, 45);
		frmMycalcV.getContentPane().add(btnDiv);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(138, 60, 45, 45);
		frmMycalcV.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(22, 128, 45, 45);
		frmMycalcV.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(79, 128, 45, 45);
		frmMycalcV.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBounds(138, 128, 45, 45);
		frmMycalcV.getContentPane().add(btn6);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(195, 128, 45, 45);
		frmMycalcV.getContentPane().add(btnMulti);
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDsp.setText("1");
				num1 = 1;
			}
		});
		btn1.setBounds(22, 198, 45, 45);
		frmMycalcV.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = 2;
			}
			
		});
		btn2.setBounds(79, 198, 45, 45);
		frmMycalcV.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(138, 198, 45, 45);
		frmMycalcV.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(195, 198, 45, 45);
		frmMycalcV.getContentPane().add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn0.setBounds(22, 269, 45, 45);
		frmMycalcV.getContentPane().add(btn0);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(79, 269, 45, 45);
		frmMycalcV.getContentPane().add(btnCancel);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
				
				if(operator == 1) {
					result = num1 + num2;	
				}else if(operator == 2) {
					result = num1 - num2;
				}else if(operator == 3) {
					result = num1 * num2;
				}else if(operator == 4) {
					result = num1 / num2;
				}
				txtDsp.setText(""+result);
			}
		});
		btnEq.setBounds(138, 269, 45, 45);
		frmMycalcV.getContentPane().add(btnEq);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
			}
		});
		btnPlus.setBounds(195, 269, 45, 45);
		frmMycalcV.getContentPane().add(btnPlus);
	}
}
