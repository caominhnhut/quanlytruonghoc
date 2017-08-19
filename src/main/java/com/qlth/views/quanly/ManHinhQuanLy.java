package com.qlth.views.quanly;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.qlth.constant.Constant;
import com.qlth.views.hocsinh.DanhSachHocSinh;

@SuppressWarnings("serial")
public class ManHinhQuanLy extends JFrame implements ActionListener {
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
	private JPanel pnWest;
	private JPanel userPanel;
	private JPanel functionPanel;
	private JPanel pnView;
	private CardLayout card;
	private JPanel pnMain;

	public ManHinhQuanLy() {
		super("Man Hinh Quan Ly");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(700, 600));
		setLayout(new BorderLayout());
		ImageIcon icon = createIconFromResource("images\\school_icon.png");
		setIconImage(icon.getImage());
		initialize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 ManHinhQuanLy mhql=new ManHinhQuanLy();
					 mhql.showUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public void showUI() {
		add(createWestPanel(), BorderLayout.WEST);
		add(createMainPanel(), BorderLayout.CENTER);
	}

	public JPanel createWestPanel() {
		pnWest = new JPanel();
		pnWest.setLayout(new BorderLayout(20, 20));
		pnWest.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
		pnWest.add(createPanelUser(), BorderLayout.NORTH);
		pnWest.add(createPanelFunction(), BorderLayout.CENTER);
		return pnWest;
	}

	// create panel user
	public JPanel createPanelUser() {
		userPanel = new JPanel();
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
		functionPanel = new JPanel();
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
		pnView = new JPanel();
		JLabel pnImg = new JLabel();
		pnView.setLayout(card);
		ImageIcon icon = createIconFromResource("images\\main.png");
		pnImg.setIcon(icon);
		pnView.add(pnImg, "1");
		DanhSachHocSinh a = new DanhSachHocSinh();
		pnView.add(a.createPnDSHS(), Constant.MAN_HINH_DSHS);
		pnView.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 50));
		return pnView;

	}

	// create main panel
	public JPanel createMainPanel() {
		pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout(20, 20));
		pnMain.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 0));
		pnMain.add(getLbTitle(), BorderLayout.NORTH);
		pnMain.add(createPanel(), BorderLayout.CENTER);
		return pnMain;
	}

	public void initialize() {
		this.createCard();
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

	public JLabel getLbImg() {
		return lbImg;
	}

	public void createLbImg() {
		ImageIcon icon = createIconFromResource("images\\addimage.png");
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
		this.btStudent.addActionListener(this);
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

	public CardLayout getCard() {
		return card;
	}

	public void createCard() {
		this.card = new CardLayout();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btStudent) {
			card.show(pnView, Constant.MAN_HINH_DSHS);
		}
	}
}
