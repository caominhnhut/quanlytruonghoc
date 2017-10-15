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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.qlth.bus.GiaoVienLopHocBus;
import com.qlth.bus.HocSinhBus;
import com.qlth.bus.impl.GiaoVienLopHocBusImpl;
import com.qlth.bus.impl.HocSinhBusImpl;
import com.qlth.factory.PlaceHolderTextField;
import com.qlth.model.HocSinh;
import com.qlth.model.LopHoc;

public class DanhSachHocSinh implements ActionListener, MouseListener {

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
	private JPopupMenu pup;
	private JMenuItem edit;
	private JMenuItem view;
	private JMenuItem delete;

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
		createEdit();
		createView();
		createDelete();
		createPup();
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
		String columnName[] = { "STT", "MSHS", "Tên Đăng Nhập", "Họ Tên", "Giới Tính", "Ngày Sinh", "Điện Thoại",
				"Địa Chỉ" };
		model = new DefaultTableModel(columnName, 0);
		hsBus = new HocSinhBusImpl();
		LopHoc lop = new LopHoc();
		lop.setTenlop(cbDanhSachLop.getSelectedItem().toString());
		ArrayList<HocSinh> arr = hsBus.getHocSinhTheoLop(lop);
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
		pup.add(view);
		pup.addSeparator();
		pup.add(edit);
		pup.addSeparator();
		pup.add(delete);
		pup.addSeparator();
		tbDanhSachHocSinh.addMouseListener(this);
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
		DefaultComboBoxModel<String> cbmodel = new DefaultComboBoxModel<String>();
		GiaoVienLopHocBus gvlhBus = new GiaoVienLopHocBusImpl();
		ArrayList<String> arr = new ArrayList<String>();
		arr = gvlhBus.getDanhSachLop("GV001");
		for (String st : arr) {
			cbmodel.addElement(st);
		}
		this.cbDanhSachLop = new JComboBox<String>(cbmodel);
		cbDanhSachLop.addActionListener(this);
		cbDanhSachLop.setSelectedItem(0);
		cbDanhSachLop.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				removeDataFromTable();
				String tenlop = (String) cbDanhSachLop.getSelectedItem();
				LopHoc lop = new LopHoc();
				lop.setTenlop(tenlop);
				ArrayList<HocSinh> arr = hsBus.getHocSinhTheoLop(lop);
				if (arr.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Danh sach trong!");
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

			}
		});
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
		this.txtTim = new PlaceHolderTextField("Nhap ten can tim", 12, 18);
	}

	public JPopupMenu getPup() {
		return pup;
	}

	public void createPup() {
		this.pup = new JPopupMenu();
	}

	public JMenuItem getEdit() {
		return edit;
	}

	public void createEdit() {
		this.edit = new JMenuItem("Edit");
	}

	public JMenuItem getView() {
		return view;
	}

	public void createView() {
		this.view = new JMenuItem("View");
		this.view.addActionListener(this);
	}

	public JMenuItem getDelete() {
		return delete;
	}

	public void createDelete() {
		this.delete = new JMenuItem("Delete");
	}

	public void removeDataFromTable() {
		int k = model.getRowCount() - 1;
		while (k >= 0) {
			model.removeRow(k);
			k--;
		}
		tbDanhSachHocSinh.setModel(model);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnThemMoi) {
			ThemHocSinh ths = new ThemHocSinh();
			ths.createGUI();
		}
		if (e.getSource() == view) {
			int k = tbDanhSachHocSinh.getSelectedRow();
			String mand = (String) tbDanhSachHocSinh.getModel().getValueAt(k, 1);
			String tenDangNhap = (String) tbDanhSachHocSinh.getModel().getValueAt(k, 2);
			JOptionPane.showMessageDialog(null, "Ma nguoi dung: " + mand + " va ten dang nhap: " + tenDangNhap);
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (SwingUtilities.isRightMouseButton(e)) {
			pup.show(e.getComponent(), e.getX(), e.getY());
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
