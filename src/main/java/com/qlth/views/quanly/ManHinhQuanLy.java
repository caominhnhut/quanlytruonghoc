package com.qlth.views.quanly;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ManHinhQuanLy extends JFrame {
	private JLabel lbImg;
	private JLabel lbUser;
	private JLabel lbId;
	private JLabel lbTitle;
	private JButton btStudent;
	private JButton btOfficials;
	private JButton btClass;
	private JButton btSubject;
	private JButton btGrade;
	private JButton btLibrary;
	private JButton btEquipment;
	private JButton btFinance;
	private JButton btTimeTable;

	public ManHinhQuanLy(String title) {
		super(title);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(700, 600));
		setLayout(new BorderLayout());
		ImageIcon icon = new ImageIcon("src\\main\\resources\\images\\school_icon.png");
		setIconImage(icon.getImage());
		initialize();
		add(createWestPanel(), BorderLayout.WEST);
		add(createMainPanel(), BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public JPanel createWestPanel() {
		JPanel west = new JPanel();
		west.setLayout(new BorderLayout(20, 20));
		west.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
		west.add(createPanelUser(), BorderLayout.NORTH);
		west.add(createPanelFunction(), BorderLayout.CENTER);
		return west;
	}

	// create panel user
	public JPanel createPanelUser() {
		JPanel userPanel = new JPanel();
		userPanel.setLayout(new BorderLayout(10, 10));
		userPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		userPanel.add(getLbImg(), BorderLayout.NORTH);
		userPanel.add(getLbUser(), BorderLayout.CENTER);
		userPanel.add(getLbId(), BorderLayout.SOUTH);
		JPanel pnWrap = new JPanel();
		pnWrap.setBorder(BorderFactory.createTitledBorder("Người dùng"));
		TitledBorder title = (TitledBorder) pnWrap.getBorder();
		title.setTitleColor(Color.red);
		title.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnWrap.add(userPanel);
		return pnWrap;
	}

	// create panel function
	public JPanel createPanelFunction() {
		JPanel functionPanel = new JPanel();
		functionPanel.setLayout(new GridLayout(9, 1, 10, 10));
		functionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		functionPanel.add(getBtStudent());
		functionPanel.add(getBtOfficials());
		functionPanel.add(getBtClass());
		functionPanel.add(getBtSubject());
		functionPanel.add(getBtGrade());
		functionPanel.add(getBtLibrary());
		functionPanel.add(getBtEquipment());
		functionPanel.add(getBtFinance());
		functionPanel.add(getBtTimeTable());
		JPanel max = new JPanel();
		max.setLayout(new GridLayout(1, 1));
		max.setBorder(BorderFactory.createTitledBorder("Chức năng"));
		max.add(functionPanel);
		return max;
	}

	public JPanel createPanel() {
		JPanel pn = new JPanel();
		JLabel pnImg = new JLabel();
		ImageIcon icon = new ImageIcon("src\\main\\resources\\images\\main.png");
		pnImg.setIcon(icon);
		pn.add(pnImg);
		return pn;

	}

	// create main panel
	public JPanel createMainPanel() {
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout(20, 20));
		main.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
		main.add(getLbTitle(), BorderLayout.NORTH);
		main.add(createPanel(), BorderLayout.CENTER);
		return main;
	}

	public void initialize() {
		this.createLbImg();
		this.createLbUser();
		this.createLbId();
		this.createBtStudent();
		this.createBtClass();
		this.createBtSubject();
		this.createBtOfficials();
		this.createBtEquipment();
		this.createBtFinance();
		this.createBtGrade();
		this.createBtLibrary();
		this.createBtTimeTable();
		this.createLbTitle();
	}

	public ImageIcon createIconFromResource(String path) {
		return new ImageIcon(getClass().getClassLoader().getResource(path));
	}

	public static void main(String[] args) {
		new ManHinhQuanLy("Man Hinh Quan Ly");
	}

	public JLabel getLbImg() {
		return lbImg;
	}

	public void createLbImg() {
		ImageIcon icon = new ImageIcon("D:\\workspace\\EmployeeManagement\\img\\addimage.png");
		this.lbImg = new JLabel(icon);
	}

	public JLabel getLbUser() {
		return lbUser;
	}

	public void createLbUser() {
		this.lbUser = new JLabel("Người dùng: Thinh Tran");
	}

	public JLabel getLbId() {
		return lbId;
	}

	public void createLbId() {
		this.lbId = new JLabel("MSSV: 3115410153");
	}

	public JButton getBtStudent() {
		return btStudent;
	}

	public void createBtStudent() {
		this.btStudent = new JButton();
		ImageIcon icon = createIconFromResource("images\\student_icon.png");
		this.btStudent.setIcon(icon);
		this.btStudent.setText("Quản Lý Học Sinh");
	}

	public JButton getBtOfficials() {
		return btOfficials;
	}

	public void createBtOfficials() {
		ImageIcon icon = createIconFromResource("images\\officials_icon.png");
		this.btOfficials = new JButton();
		this.btOfficials.setIcon(icon);
		this.btOfficials.setText("Quản Lý Cán Bộ");
	}

	public JButton getBtClass() {
		return btClass;
	}

	public void createBtClass() {
		ImageIcon icon = createIconFromResource("images\\class_icon.png");
		this.btClass = new JButton();
		this.btClass.setIcon(icon);
		this.btClass.setText("Quản Lý Lớp Học");
	}

	public JButton getBtSubject() {
		return btSubject;
	}

	public void createBtSubject() {
		ImageIcon icon = createIconFromResource("images\\subject_icon.png");
		this.btSubject = new JButton();
		this.btSubject.setIcon(icon);
		this.btSubject.setText("Quản Lý Môn Học");
	}

	public JButton getBtGrade() {
		return btGrade;
	}

	public void createBtGrade() {
		ImageIcon icon = createIconFromResource("images\\grade_icon.png");
		this.btGrade = new JButton();
		this.btGrade.setIcon(icon);
		this.btGrade.setText("Quản Lý Khối Học");
	}

	public JButton getBtLibrary() {
		return btLibrary;
	}

	public void createBtLibrary() {
		ImageIcon icon = createIconFromResource("images\\library_icon.png");
		this.btLibrary = new JButton();
		this.btLibrary.setIcon(icon);
		this.btLibrary.setText("Quản Lý Thư Viện");
	}

	public JButton getBtEquipment() {
		return btEquipment;
	}

	public void createBtEquipment() {
		ImageIcon icon = createIconFromResource("images\\equipment_icon.png");
		this.btEquipment = new JButton();
		this.btEquipment.setIcon(icon);
		this.btEquipment.setText("Quản Lý Thiết Bị");
	}

	public JButton getBtFinance() {
		return btFinance;
	}

	public void createBtFinance() {
		ImageIcon icon = createIconFromResource("images\\finance_icon.png");
		this.btFinance = new JButton();
		this.btFinance.setIcon(icon);
		this.btFinance.setText("Quản Lý Tài Chính");
	}

	public JButton getBtTimeTable() {
		return btTimeTable;
	}

	public void createBtTimeTable() {
		ImageIcon icon = createIconFromResource("images\\timetable_icon.png");
		this.btTimeTable = new JButton();
		this.btTimeTable.setIcon(icon);
		this.btTimeTable.setText("Thời Khóa Biểu");
	}

	public JLabel getLbTitle() {
		return lbTitle;
	}

	public void createLbTitle() {
		this.lbTitle = new JLabel("PHẦN MỀM QUẢN LÝ TRƯỜNG HỌC", JLabel.CENTER);
		this.lbTitle.setFont(new Font("Arial", 20, 50));
	}

}
