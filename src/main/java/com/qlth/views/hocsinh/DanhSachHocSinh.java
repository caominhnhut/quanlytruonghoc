package com.qlth.views.hocsinh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.qlth.factory.PlaceHolderTextField;

public class DanhSachHocSinh {
	private JFrame frame;
	private JLabel lbTieuDe;
	private JComboBox<String> cbDanhSachLop;
	private PlaceHolderTextField txtTim;
	private JButton btnKhoiPhuc;
	private JButton btnThemMoi;
	private JButton btnXuatExcel;
	private JButton btnXuatPDF;
	private JTable tbDanhSachHocSinh;
	private JPanel pnDanhSach;
	private JPanel pnTieuDe;
	private JPanel pnNoiDung;
	private JPanel pnTimKiem;
	private JPanel pnTimKiemPhai;
	private JPanel pnCongCu;
	private JPanel pnCongCuPhai;
	
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
		createLbTieuDe();
		createCbDanhSachLop();
		createTxtTim();
		createBtnKhoiPhuc();
		createBtnThemMoi();
		createBtnXuatExcel();
		createBtnXuatPDF();
		createTbDanhSachHocSinh();
		createPnDanhSach();
		createPnTieuDe();
		createPnNoiDung();
		createPnTimKiem();
		createPnTimKiemPhai();
		createPnCongCu();
		createPnCongCuPhai();
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
		pnDanhSach.setBorder(new EmptyBorder(20, 20, 20, 20));
		lbTieuDe.setBorder(new EmptyBorder(10, 0, 50, 0));
		pnTieuDe.add(lbTieuDe);
		
		JScrollPane sc=new JScrollPane(tbDanhSachHocSinh);
		pnDanhSach.add(pnTieuDe, BorderLayout.NORTH);
		pnDanhSach.add(pnNoiDung, BorderLayout.CENTER);
		
		pnNoiDung.add(pnTimKiem,BorderLayout.NORTH);
		pnTimKiem.add(cbDanhSachLop, BorderLayout.WEST);
		pnTimKiem.add(pnTimKiemPhai, BorderLayout.EAST);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.VERTICAL;
		gbc.insets=new Insets(0, 10, 0, 0);
		gbc.weightx=1;
		gbc.gridx=0;
		gbc.gridy=0;
		pnTimKiemPhai.add(txtTim, gbc);
		gbc.weightx=0;
		gbc.gridx=1;
		pnTimKiemPhai.add(btnKhoiPhuc, gbc);
		
		sc.setBorder(new EmptyBorder(30, 0, 30, 0));
		pnNoiDung.add(sc,BorderLayout.CENTER);
		
		pnNoiDung.add(pnCongCu, BorderLayout.SOUTH);
		pnCongCu.add(btnThemMoi, BorderLayout.WEST);
		pnCongCu.add(pnCongCuPhai, BorderLayout.EAST);
		GridBagConstraints gbc2=new GridBagConstraints();
		gbc2.fill=GridBagConstraints.VERTICAL;
		gbc2.insets=new Insets(0, 10, 0, 0);
		gbc2.gridx=0;
		gbc2.gridy=0;
		pnCongCuPhai.add(btnXuatExcel,gbc2);
		gbc2.gridx=1;
		pnCongCuPhai.add(btnXuatPDF,gbc2);
		
		frame.add(pnDanhSach);
	}

	public JLabel getLbTieuDe() {
		return lbTieuDe;
	}

	public void createLbTieuDe() {
		this.lbTieuDe = new JLabel("Quản Lý Danh Sách Học Sinh");
		lbTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lbTieuDe.setForeground(Color.BLUE);
		lbTieuDe.setFont(new Font("SansSerif", Font.BOLD, 25));
	}

	public JComboBox<String> getCbDanhSachLop() {
		return cbDanhSachLop;
	}

	public void createCbDanhSachLop() {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		model.addElement("Lớp chủ nhiệm");
		model.addElement("Nam II");
		model.addElement("Nam III");
		model.addElement("Nam IV");
		this.cbDanhSachLop = new JComboBox<String>(model);
	}

	public JButton getBtnKhoiPhuc() {
		return btnKhoiPhuc;
	}

	public void createBtnKhoiPhuc() {
		this.btnKhoiPhuc = new JButton("Khôi phục");
	}

	public JButton getBtnThemMoi() {
		return btnThemMoi;
	}

	public void createBtnThemMoi() {
		this.btnThemMoi = new JButton("Thêm Mới");
	}

	public JButton getBtnXuatExcel() {
		return btnXuatExcel;
	}

	public void createBtnXuatExcel() {
		this.btnXuatExcel = new JButton("Xuất Excel");
	}

	public JButton getBtnXuatPDF() {
		return btnXuatPDF;
	}

	public void createBtnXuatPDF() {
		this.btnXuatPDF = new JButton("Xuất PDF");
	}

	public JTable getTbDanhSachHocSinh() {
		return tbDanhSachHocSinh;
	}

	public void createTbDanhSachHocSinh() {
		
		DefaultTableModel model = new DefaultTableModel(new Object[][] {
			{1,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{2,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{3,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{4,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{5,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{6,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{7,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{8,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{9,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{10,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{11,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{12,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"},
			{13,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","09645454445","nguyencao@gmail.com","Bến Tre"},{14,"HS001","caominhnhut","Cao Minh Nhựt","Nam","14/04/1988","094654654","nguyencao@gmail.com","Bến Tre"}},
		      new Object[] { "STT","MSHS","Tên Đăng Nhập","Họ Tên","Giới Tính","Ngày Sinh","Điện Thoại","Email","Địa Chỉ" });
		tbDanhSachHocSinh=new JTable(model);
	}

	public JPanel getPnDanhSach() {
		return pnDanhSach;
	}

	public void createPnDanhSach() {
		this.pnDanhSach = new JPanel();
		pnDanhSach.setLayout(new BorderLayout());
	}

	public JPanel getPnTieuDe() {
		return pnTieuDe;
	}

	public void createPnTieuDe() {
		this.pnTieuDe = new JPanel();
		pnTieuDe.setLayout(new FlowLayout(FlowLayout.CENTER));
	}
	
	public JPanel getPnNoiDung() {
		return pnNoiDung;
	}

	public void createPnNoiDung() {
		this.pnNoiDung = new JPanel();
		pnNoiDung.setLayout(new BorderLayout());
	}
	
	public JPanel getPnTimKiem(){
		return pnTimKiem;
	}
	
	public void createPnTimKiem() {
		this.pnTimKiem = new JPanel();
		pnTimKiem.setLayout(new BorderLayout());
	}
	
	public JPanel getPnTimKiemPhai(){
		return pnTimKiemPhai;
	}
	
	public void createPnTimKiemPhai() {
		this.pnTimKiemPhai = new JPanel();
		pnTimKiemPhai.setLayout(new GridBagLayout());
	}

	public JPanel getPnCongCu(){
		return pnCongCu;
	}
	
	public void createPnCongCu() {
		this.pnCongCu = new JPanel();
		pnCongCu.setLayout(new BorderLayout());
	}
	
	public JPanel getPnCongCuPhai(){
		return pnCongCuPhai;
	}
	
	public void createPnCongCuPhai() {
		this.pnCongCuPhai = new JPanel();
		pnCongCuPhai.setLayout(new GridBagLayout());
	}

	public PlaceHolderTextField getTxtTim() {
		return txtTim;
	}

	public void createTxtTim() {
		this.txtTim = new PlaceHolderTextField("Nhap ten can tim",17);
	}
	
	
}
