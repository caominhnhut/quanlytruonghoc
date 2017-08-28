package com.qlth.views.hocsinh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.qlth.bus.GiaoVienLopHocBus;
import com.qlth.bus.HocSinhBus;
import com.qlth.factory.PlaceHolderTextField;
import com.qlth.model.HocSinh;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class DanhSachHocSinh implements ActionListener {

	private JLabel lbTieuDe;
	private JComboBox<String> cbDanhSachLop;
	private PlaceHolderTextField txtTim;
	private JButton btnKhoiPhuc;
	private JButton btnThemMoi;
	private JButton btnXuatExcel;
	private JButton btnXuatPDF;
	private JTable tbDanhSachHocSinh;
	public JPanel pnDanhSach;
	private JPanel pnTieuDe;
	private JPanel pnNoiDung;
	private JPanel pnTimKiem;
	private JPanel pnTimKiemPhai;
	private JPanel pnCongCu;
	private JPanel pnCongCuPhai;
	private DefaultTableModel model;
	private HocSinhBus hsBus;

	public DanhSachHocSinh() {
		initialize();
	}

	private void initialize() {
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

	public JPanel createPnDSHS() {
		
		lbTieuDe.setBorder(new EmptyBorder(10, 0, 20, 0));
		pnTieuDe.add(lbTieuDe);

		JScrollPane sc = new JScrollPane(tbDanhSachHocSinh);
		pnDanhSach.add(pnTieuDe, BorderLayout.NORTH);
		pnDanhSach.add(pnNoiDung, BorderLayout.CENTER);

		pnNoiDung.add(pnTimKiem, BorderLayout.NORTH);
		pnTimKiem.add(cbDanhSachLop, BorderLayout.WEST);
		pnTimKiem.add(pnTimKiemPhai, BorderLayout.EAST);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.weightx = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		pnTimKiemPhai.add(txtTim, gbc);
		gbc.weightx = 0;
		gbc.gridx = 1;
		pnTimKiemPhai.add(btnKhoiPhuc, gbc);

		sc.setBorder(new EmptyBorder(40, 0, 40, 0));
		pnNoiDung.add(sc, BorderLayout.CENTER);

		pnNoiDung.add(pnCongCu, BorderLayout.SOUTH);
		pnCongCu.add(btnThemMoi, BorderLayout.WEST);
		pnCongCu.add(pnCongCuPhai, BorderLayout.EAST);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.VERTICAL;
		gbc2.insets = new Insets(0, 10, 0, 0);
		gbc2.gridx = 0;
		gbc2.gridy = 0;
		pnCongCuPhai.add(btnXuatExcel, gbc2);
		gbc2.gridx = 1;
		pnCongCuPhai.add(btnXuatPDF, gbc2);

		return pnDanhSach;
	}

	public void createTbDanhSachHocSinh() {

		// DefaultTableModel model = new DefaultTableModel(
		// new Object[][] {
		// { 1, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "09645454445",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 2, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "094654654",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 3, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "09645454445",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 4, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "094654654",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 5, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "09645454445",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 6, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "094654654",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 7, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "09645454445",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 8, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "094654654",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 9, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "09645454445",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 10, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "094654654",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 11, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "09645454445",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 12, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "094654654",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 13, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "09645454445",
		// "nguyencao@gmail.com", "Bến Tre" },
		// { 14, "HS001", "caominhnhut", "Cao Minh Nhựt", "Nam", "14/04/1988",
		// "094654654",
		// "nguyencao@gmail.com", "Bến Tre" } },
		// new Object[] { "STT", "MSHS", "Tên Đăng Nhập", "Họ Tên", "Giới Tính",
		// "Ngày Sinh", "Điện Thoại",
		// "Email", "Địa Chỉ" });
		String columnName[] = { "STT", "MSHS", "Tên Đăng Nhập", "Họ Tên", "Giới Tính", "Ngày Sinh", "Điện Thoại",
				"Địa Chỉ" };
		model = new DefaultTableModel(columnName, 0);
		hsBus = new HocSinhBus();
		ArrayList<HocSinh> arr = hsBus.getDanhSachHocSinh();
		if (arr.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Danh sách trống!");
		} else {
			Vector<String> vector;
			int i = 0;
			for (HocSinh hs : arr) {
				vector = new Vector<String>();
				vector.add(String.valueOf(i));
				vector.add(hs.getMaND());
				vector.add(hs.getTenDN());
				vector.add(hs.getHoten());
				vector.add(hs.getGioitinh());
				vector.add(hs.getNgaysinh().toString());
				vector.add(hs.getSdt());
				vector.add(hs.getDiachi());
				model.addRow(vector);
				i++;
			}
		}
		tbDanhSachHocSinh = new JTable(model);
	}

	public JLabel getLbTieuDe() {
		return lbTieuDe;
	}

	public void createLbTieuDe() {
		this.lbTieuDe = new JLabel("Quản Lý Danh Sách Học Sinh");
		lbTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lbTieuDe.setForeground(Color.BLUE);
		lbTieuDe.setFont(new Font("SansSerif", Font.BOLD, 25));
//		lbTieuDe.setBorder(new EmptyBorder(10, 0, 20, 0));
	}

	public JComboBox<String> getCbDanhSachLop() {
		return cbDanhSachLop;
	}

	public void createCbDanhSachLop() {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		GiaoVienLopHocBus gvlhBus=new GiaoVienLopHocBus();
		ArrayList<String> arr=new ArrayList<String>();
		arr=gvlhBus.getDanhSachTheoGVCN();
		for(String st:arr){
			model.addElement(st);
		}
//		model.addElement("Lớp chủ nhiệm");
//		model.addElement("Nam II");
//		model.addElement("Nam III");
//		model.addElement("Nam IV");
		this.cbDanhSachLop = new JComboBox<String>(model);
	}

	public JButton getBtnKhoiPhuc() {
		return btnKhoiPhuc;
	}

	public void createBtnKhoiPhuc() {
		this.btnKhoiPhuc = new JButton("Khôi phục");
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("images\\restore.png"));
		btnKhoiPhuc.setIcon(icon);
	}

	public JButton getBtnThemMoi() {
		return btnThemMoi;
	}

	public void createBtnThemMoi() {
		this.btnThemMoi = new JButton("Thêm Mới");
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("images\\addnew.png"));
		btnThemMoi.setIcon(icon);
		btnThemMoi.addActionListener(this);
	}

	public JButton getBtnXuatExcel() {
		return btnXuatExcel;
	}

	public void createBtnXuatExcel() {
		this.btnXuatExcel = new JButton("Xuất Excel");
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("images\\xuatexcel.png"));
		btnXuatExcel.setIcon(icon);
	}

	public JButton getBtnXuatPDF() {
		return btnXuatPDF;
	}

	public void createBtnXuatPDF() {
		this.btnXuatPDF = new JButton("Xuất PDF");
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("images\\xuatpdf.png"));
		btnXuatPDF.setIcon(icon);
	}

	public JTable getTbDanhSachHocSinh() {
		return tbDanhSachHocSinh;
	}

	public JPanel getPnDanhSach() {
		return pnDanhSach;
	}

	public void createPnDanhSach() {
		pnDanhSach = new JPanel();
		pnDanhSach.setLayout(new BorderLayout());
		pnDanhSach.setBorder(new EmptyBorder(0, 0, 0, 0));
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

	public JPanel getPnTimKiem() {
		return pnTimKiem;
	}

	public void createPnTimKiem() {
		this.pnTimKiem = new JPanel();
		pnTimKiem.setLayout(new BorderLayout());
	}

	public JPanel getPnTimKiemPhai() {
		return pnTimKiemPhai;
	}

	public void createPnTimKiemPhai() {
		this.pnTimKiemPhai = new JPanel();
		pnTimKiemPhai.setLayout(new GridBagLayout());
	}

	public JPanel getPnCongCu() {
		return pnCongCu;
	}

	public void createPnCongCu() {
		this.pnCongCu = new JPanel();
		pnCongCu.setLayout(new BorderLayout());
	}

	public JPanel getPnCongCuPhai() {
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
		this.txtTim = new PlaceHolderTextField("Nhap ten can tim", 12,18);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnThemMoi){
			ThemHocSinh ths=new ThemHocSinh();
			ths.createGUI();
		}
		
	}
}
