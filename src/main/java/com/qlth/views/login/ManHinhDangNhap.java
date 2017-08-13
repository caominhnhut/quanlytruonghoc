package com.qlth.views.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.qlth.factory.LinkButton;

public class ManHinhDangNhap {

	private JFrame frame;
	private JPanel pnDangNhap;
	private JLabel lbImg;
	private JLabel lbDangNhap;
	private LinkButton btQuenMatKhau;
	private JTextField tfDangNhap;
	private JPasswordField pass;
	private JCheckBox cbGhiNho;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhDangNhap window = new ManHinhDangNhap();
					window.createGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ManHinhDangNhap(){
		initialize();
	}
	
	public void initialize(){
		createFrame();
		createPnDangNhap();
		createLbDangNhap();
		createLbImg();
		createTfDangNhap();
		createPass();
		createCbGhiNho();
		createBtQuenMatKhau();
	}
	
	public void createGUI(){
//		pnImg.add(lbImg, BorderLayout.CENTER);
//		frame.add(pnImg, BorderLayout.WEST);
		JPanel pnGioiThieu=new JPanel(new FlowLayout());
		pnGioiThieu.add(lbDangNhap);
		frame.add(pnGioiThieu, BorderLayout.PAGE_START);
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(5, 5, 5, 5);
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weighty=1;
		gbc.gridheight=3;
		pnDangNhap.add(lbImg, gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.weightx=1;
		gbc.weighty=0;
		gbc.gridheight=1;
		gbc.ipady=17;
		pnDangNhap.add(tfDangNhap, gbc);
		
		gbc.gridy=1;
		pnDangNhap.add(pass, gbc);
		
		gbc.gridy=2;
		gbc.ipady=1;
		gbc.weightx=0;
		pnDangNhap.add(cbGhiNho, gbc);
		
		gbc.gridy=3;
		pnDangNhap.add(getBtQuenMatKhau(), gbc);
		
		frame.add(pnDangNhap,BorderLayout.CENTER);
	}
	
	public void createFrame(){
		frame=new JFrame("Đăng nhập");
		frame.setBounds(100,100,600,280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
	}
	
	public void createPnDangNhap(){
		this.pnDangNhap=new JPanel();
		this.pnDangNhap.setLayout(new GridBagLayout());
	}
	
	public void createLbDangNhap(){
		lbDangNhap=new JLabel();
		lbDangNhap.setText("XIN MỜI ĐĂNG NHẬP");
		lbDangNhap.setForeground(Color.RED);
		lbDangNhap.setOpaque(true);
		lbDangNhap.setFont(new Font("Serif", Font.BOLD, 35));
	}

	public JLabel getLbImg() {
		return lbImg;
	}

	public void createLbImg() {
		this.lbImg = new  JLabel();
		lbImg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/login.png")));
	}

	public JTextField getTfDangNhap() {
		return tfDangNhap;
	}

	public void createTfDangNhap() {
		this.tfDangNhap = new JTextField("Tên đăng nhập");
	}

	public JPasswordField getPass() {
		return pass;
	}

	public void createPass() {
		this.pass = new JPasswordField();
		
	}

	public JCheckBox getCbGhiNho() {
		return cbGhiNho;
	}

	public void createCbGhiNho() {
		this.cbGhiNho = new JCheckBox("Ghi nhớ");
	}

	public LinkButton getBtQuenMatKhau() {
		return btQuenMatKhau;
	}

	public void createBtQuenMatKhau() {
		this.btQuenMatKhau = new LinkButton("Quên mật khẩu");
	}
}
