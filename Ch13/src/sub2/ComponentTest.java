package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtHp;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest window = new ComponentTest();
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
	public ComponentTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 196, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		btn1.setBackground(UIManager.getColor("Button.background"));
		btn1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
		btn1.setForeground(Color.ORANGE);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.out.println("버튼1 클릭...");
			}
		});
		
		btn1.setBounds(12, 74, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"버튼2 클릭...");
			}
		});
		btn2.setForeground(Color.ORANGE);
		btn2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
		btn2.setBackground(UIManager.getColor("Button.background"));
		btn2.setBounds(141, 74, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("YES 클릭...");
				}else {
					System.out.println("NO 클릭...");
				}
			}
		});
		btn3.setForeground(Color.ORANGE);
		btn3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
		btn3.setBackground(new Color(255, 255, 240));
		btn3.setBounds(265, 74, 97, 23);
		frame.getContentPane().add(btn3);
		
		txtUid = new JTextField();
		txtUid.setBounds(68, 165, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("TextField 실습");
		lblNewLabel_1.setBounds(12, 136, 132, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Button 실습");
		lblNewLabel_1_1.setBounds(12, 47, 132, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 168, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 193, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("휴대폰");
		lblNewLabel_2_1_1.setBounds(12, 218, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(68, 215, 116, 21);
		frame.getContentPane().add(txtHp);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(68, 190, 116, 21);
		frame.getContentPane().add(txtName);
		
		JLabel lbUid = new JLabel("결과 :");
		lbUid.setBounds(273, 168, 138, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 :");
		lbName.setBounds(273, 193, 138, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 :");
		lbHp.setBounds(273, 218, 138, 15);
		frame.getContentPane().add(lbHp);

		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 : " + uid);
			}
		});
		btnUid.setBounds(196, 164, 68, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name = txtName.getText();
			lbName.setText("결과 : " + name);
			}
		});
		btnName.setBounds(196, 189, 68, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbHp.setText("결과 : " + hp);
				
			}
		});
		btnHp.setBounds(196, 214, 68, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 실습");
		lblNewLabel_3.setBounds(12, 243, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 265, 57, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(68, 265, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(129, 265, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(196, 265, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(265, 265, 57, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일 : ");
		lbChkFruit.setBounds(12, 299, 310, 21);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					fruits.add(chk5.getText());
				}
				lbChkFruit.setText("선택한 과일 " +fruits);
			}
		});
		btnChkFruit.setBounds(343, 265, 68, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 실습");
		lblNewLabel_4.setBounds(12, 330, 152, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(23, 359, 121, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(156, 359, 121, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		
		JLabel lbGender = new JLabel("선택결과 : ");
		lbGender.setBounds(12, 386, 327, 27);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdMale.isSelected()) {
					lbGender.setText("선택결과 : "+rdMale.getText());
				}else {
					lbGender.setText("선택결과 : "+rdFemale.getText());
				}
				
			}
		});
		btnGender.setBounds(296, 359, 97, 23);
		frame.getContentPane().add(btnGender);
		
	}
}
