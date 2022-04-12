package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistForm extends JFrame {

	private JPanel contentPane;
	private JTextField emNameInputField;
	private JTextField emIdInputField;
	private JTextField emPwInputField;
	private JTextField textField_3;
	private JTextField EmrePwInputField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistForm frame = new RegistForm();
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
	public RegistForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 464);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel registTitle = new JLabel("사원 등록");
		registTitle.setFont(new Font("KoPubWorld돋움체 Bold", Font.BOLD, 30));
		registTitle.setHorizontalAlignment(SwingConstants.CENTER);
		registTitle.setBounds(74, 51, 171, 36);
		contentPane.add(registTitle);
		
		JLabel emName = new JLabel("사원 명");
		emName.setFont(new Font("KoPubWorld돋움체 Medium", Font.PLAIN, 13));
		emName.setHorizontalAlignment(SwingConstants.CENTER);
		emName.setBounds(52, 131, 57, 15);
		contentPane.add(emName);
		
		JLabel emId = new JLabel("사원 아이디");
		emId.setFont(new Font("KoPubWorld돋움체 Medium", Font.PLAIN, 13));
		emId.setHorizontalAlignment(SwingConstants.CENTER);
		emId.setBounds(52, 167, 70, 15);
		contentPane.add(emId);
		
		JLabel emPw = new JLabel("비밀 번호");
		emPw.setFont(new Font("KoPubWorld돋움체 Medium", Font.PLAIN, 13));
		emPw.setHorizontalAlignment(SwingConstants.CENTER);
		emPw.setBounds(52, 205, 57, 15);
		contentPane.add(emPw);
		
		JLabel emPart = new JLabel("소속 부서");
		emPart.setFont(new Font("KoPubWorld돋움체 Medium", Font.PLAIN, 13));
		emPart.setHorizontalAlignment(SwingConstants.CENTER);
		emPart.setBounds(52, 285, 57, 15);
		contentPane.add(emPart);
		
		emNameInputField = new JTextField();
		emNameInputField.setBounds(143, 125, 116, 21);
		contentPane.add(emNameInputField);
		emNameInputField.setColumns(10);
		
		emIdInputField = new JTextField();
		emIdInputField.setBounds(143, 161, 116, 21);
		contentPane.add(emIdInputField);
		emIdInputField.setColumns(10);
		
		emPwInputField = new JTextField();
		emPwInputField.setBounds(143, 199, 116, 21);
		contentPane.add(emPwInputField);
		emPwInputField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(143, 279, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton registConfirm = new JButton("사원 등록");
		registConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registConfirm.setFont(new Font("KoPubWorld돋움체 Bold", Font.PLAIN, 12));
		registConfirm.setBackground(new Color(216, 191, 216));
		registConfirm.setBounds(40, 329, 97, 23);
		registConfirm.setOpaque(true);
		contentPane.add(registConfirm);
		
		JButton returnBtn = new JButton("돌아가기");
		returnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		returnBtn.setFont(new Font("KoPubWorld돋움체 Bold", Font.PLAIN, 12));
		returnBtn.setBackground(new Color(216, 191, 216));
		returnBtn.setBounds(179, 329, 97, 23);
		returnBtn.setOpaque(true);
		contentPane.add(returnBtn);
		
		JLabel emRePw = new JLabel("비밀번호 확인");
		emRePw.setHorizontalAlignment(SwingConstants.CENTER);
		emRePw.setFont(new Font("KoPubWorld돋움체 Medium", Font.PLAIN, 13));
		emRePw.setBounds(52, 244, 81, 15);
		contentPane.add(emRePw);
		
		EmrePwInputField = new JTextField();
		EmrePwInputField.setColumns(10);
		EmrePwInputField.setBounds(143, 238, 116, 21);
		contentPane.add(EmrePwInputField);
	}
}
