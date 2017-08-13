package com.qlth.views.hocsinh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.qlth.factory.PlaceHolderTextField;

public class DanhSachHocSinh {
	private JFrame frame;
	private JLabel lb1;
	private JComboBox<String> cb1;
	private PlaceHolderTextField txtTim;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JTable tb1;
	private JPanel pn1;
	private JPanel pn1_c1;
	private JPanel pn1_c2;
	private JPanel pn1_c2_1;
	private JPanel pn1_c2_1_1;
	private JPanel pn1_c2_1_2;
	private JPanel pn1_c2_1_2_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DanhSachHocSinh window = new DanhSachHocSinh();
					window.createGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DanhSachHocSinh(){
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		createFrame();
		createLb1();
		createCb1();
		createBt1();
		createBt2();
		createBt3();
		createBt4();
		createTxtTim();
		createTb1();
		createPn1();
		createPn1_c1();
		createPn1_c2();
		createPn1_c2_1();
		createPn1_c2_1_1();
		createPn1_c2_1_2();
		createPn1_c2_1_2_1();
	}

	public JFrame getFrame() {
		return frame;
	}

	public void createFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 450);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createGUI(){
		pn1.setBorder(new EmptyBorder(20, 20, 20, 20));
		lb1.setBorder(new EmptyBorder(10, 0, 50, 0));
		pn1_c1.add(lb1);
		
		JScrollPane sc=new JScrollPane(tb1);
		pn1.add(pn1_c1, BorderLayout.NORTH);
		pn1.add(pn1_c2, BorderLayout.CENTER);
		
		pn1_c2.add(pn1_c2_1,BorderLayout.NORTH);
		pn1_c2_1.add(cb1, BorderLayout.WEST);
		pn1_c2_1.add(pn1_c2_1_1, BorderLayout.EAST);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.VERTICAL;
		gbc.insets=new Insets(0, 10, 0, 0);
		gbc.weightx=1;
		gbc.gridx=0;
		gbc.gridy=0;
		pn1_c2_1_1.add(txtTim, gbc);
		gbc.weightx=0;
		gbc.gridx=1;
		pn1_c2_1_1.add(bt1, gbc);
		
		sc.setBorder(new EmptyBorder(30, 0, 30, 0));
		pn1_c2.add(sc,BorderLayout.CENTER);
		
		pn1_c2.add(pn1_c2_1_2, BorderLayout.SOUTH);
		pn1_c2_1_2.add(bt2, BorderLayout.WEST);
		pn1_c2_1_2.add(pn1_c2_1_2_1, BorderLayout.EAST);
		GridBagConstraints gbc2=new GridBagConstraints();
		gbc2.fill=GridBagConstraints.VERTICAL;
		gbc2.insets=new Insets(0, 10, 0, 0);
		gbc2.gridx=0;
		gbc2.gridy=0;
		pn1_c2_1_2_1.add(bt3,gbc2);
		gbc2.gridx=1;
		pn1_c2_1_2_1.add(bt4,gbc2);
		
		frame.add(pn1);
	}

	public JLabel getLb1() {
		return lb1;
	}

	public void createLb1() {
		this.lb1 = new JLabel("Quản Lý Danh Sách Học Sinh");
		lb1.setHorizontalAlignment(lb1.CENTER);
		lb1.setForeground(Color.BLUE);
		lb1.setFont(new Font("SansSerif", Font.BOLD, 25));
	}

	public JComboBox<String> getCb1() {
		return cb1;
	}

	public void createCb1() {
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		model.addElement("Lớp chủ nhiệm");
		model.addElement("Nam II");
		model.addElement("Nam III");
		model.addElement("Nam IV");
		this.cb1 = new JComboBox<String>(model);
	}

	public JButton getBt1() {
		return bt1;
	}

	public void createBt1() {
		this.bt1 = new JButton("Khôi phục");
	}

	public JButton getBt2() {
		return bt2;
	}

	public void createBt2() {
		this.bt2 = new JButton("Thêm Mới");
	}

	public JButton getBt3() {
		return bt3;
	}

	public void createBt3() {
		this.bt3 = new JButton("Xuất Excel");
	}

	public JButton getBt4() {
		return bt4;
	}

	public void createBt4() {
		this.bt4 = new JButton("Xuất PDF");
	}

	public JTable getTb1() {
		return tb1;
	}

	public void createTb1() {
		
		DefaultTableModel model = new DefaultTableModel(new Object[][] {
			{1,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{2,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{3,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{4,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{5,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{6,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{7,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{8,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{9,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{10,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{11,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{12,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{13,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{14,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"}},
		      new Object[] { "STT","MSHS","Tên Đăng Nhập","Họ Tên","Giới Tính","Ngày Sinh","Điện Thoại","Email","Địa Chỉ" });
		tb1=new JTable(model);
	}

	public JPanel getPn1() {
		return pn1;
	}

	public void createPn1() {
		this.pn1 = new JPanel();
		pn1.setLayout(new BorderLayout());
	}

	public JPanel getPn1_c1() {
		return pn1_c1;
	}

	public void createPn1_c1() {
		this.pn1_c1 = new JPanel();
		pn1_c1.setLayout(new FlowLayout(FlowLayout.CENTER));
	}
	
	public JPanel getPn1_c2() {
		return pn1_c2;
	}

	public void createPn1_c2() {
		this.pn1_c2 = new JPanel();
		pn1_c2.setLayout(new BorderLayout());
	}
	
	public JPanel getPn1_c2_1(){
		return pn1_c2_1;
	}
	
	public void createPn1_c2_1() {
		this.pn1_c2_1 = new JPanel();
		pn1_c2_1.setLayout(new BorderLayout());
	}
	
	public JPanel getPn1_c2_1_1(){
		return pn1_c2_1_1;
	}
	
	public void createPn1_c2_1_1() {
		this.pn1_c2_1_1 = new JPanel();
		pn1_c2_1_1.setLayout(new GridBagLayout());
	}

	public JPanel getPn1_c2_1_2(){
		return pn1_c2_1_2;
	}
	
	public void createPn1_c2_1_2() {
		this.pn1_c2_1_2 = new JPanel();
		pn1_c2_1_2.setLayout(new BorderLayout());
	}
	
	public JPanel getPn1_c2_1_2_1(){
		return pn1_c2_1_2_1;
	}
	
	public void createPn1_c2_1_2_1() {
		this.pn1_c2_1_2_1 = new JPanel();
		pn1_c2_1_2_1.setLayout(new GridBagLayout());
	}

	public PlaceHolderTextField getTxtTim() {
		return txtTim;
	}

	public void createTxtTim() {
		this.txtTim = new PlaceHolderTextField("Nhap ten can tim",17);
	}
	
	
}
