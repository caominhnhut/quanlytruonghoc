package com.qlth.views.hocsinh;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.sun.media.jfxmediaimpl.platform.java.JavaPlatform;


public class ThemHocSinh {
	private JFrame frame;
	private JLabel lbHoTen;
	private JLabel lbCMND;
	private JLabel lbNgaySinh;
	private JLabel lbDanToc;
	private JLabel lbTonGiao;
	private JLabel lbTrangThai;
	private JLabel lbDiaChi;
	private JLabel lbNamSinhCha;
	private JLabel lbNamSinhMe;
	private JLabel lbDienThoaiCha;
	private JLabel lbDienThoaiMe;
	private JLabel lbAnh;
	private JTextField tfHoTen;
	private JTextField tfEmail;
	private JTextField tfTenDangNhap;
	private JTextField tfCMND;
	private JTextField tfSoDienThoai;
	private JPasswordField pfMatKhau;
	private JTextField tfNgaySinh;
	private JTextField tfDanToc;
	private JTextField tfTonGiao;
	private JTextField tfNgayVaoHoc;
	private JTextField tfDiaChi;
	private JTextField tfHoTenCha;
	private JTextField tfNamSinhCha;
	private JTextField tfDienThoaiCha;
	private JTextField tfHoTenMe;
	private JTextField tfDienThoai;
	private JTextField tfNgheNghiepMe;
	private JButton btCapNhatHinh;
	private JCheckBox cbDTUT;
	private JRadioButton rbNam;
	private JRadioButton rbNu;
	private JPanel pnChinh;
	private JPanel pnTren;
	private JPanel pnDuoi;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemHocSinh window = new ThemHocSinh();
					window.createGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ThemHocSinh() {
		initialize();
	}

	private void initialize() {
		createFrame();
		createLbCMND();
		createLbDanToc();
		createLbDiaChi();
		createLbDienThoaiCha();
		createLbDienThoaiMe();
		createLbHoTen();
		createLbNamSinhCha();
		createLbNamSinhMe();
		createLbNgaySinh();
		createLbTonGiao();
		createLbTrangThai();
		createLbAnh();
		createTfCMND();
		createTfDanToc();
		createTfDiaChi();
		createTfDienThoai();
		createTfDienThoaiCha();
		createTfEmail();
		createTfHoTen();
		createTfHoTenCha();
		createTfHoTenMe();
		createPfMatKhau();
		createCbDTUT();
		createRbNam();
		createRbNu();
	}
	
	

	public JFrame getFrame() {
		return frame;
	}

	public void createFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createGUI(){
		pnChinh.add(pnTren, BorderLayout.CENTER);
		pnChinh.add(pnTren, BorderLayout.SOUTH);
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		pnTren.add(lbHoTen, gbc);
		
		gbc.gridx=1;
		pnTren.add(tfHoTen, gbc);
		
		gbc.gridx=2;
		pnTren.add(tfEmail, gbc);
		
		gbc.gridx=3;
		pnTren.add(tfTenDangNhap, gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		pnTren.add(lbCMND, gbc);
		
		gbc.gridx=1;
		pnTren.add(tfCMND, gbc);
		
		gbc.gridx=2;
		pnTren.add(tfSoDienThoai, gbc);
		
		gbc.gridx=3;
		pnTren.add(pfMatKhau, gbc);
		
		gbc.gridx=0;
	}

	public JLabel getLbHoTen() {
		return lbHoTen;
	}

	public void createLbHoTen() {
		this.lbHoTen = new JLabel("Họ Tên");
	}

	public JLabel getLbCMND() {
		return lbCMND;
	}

	public void createLbCMND() {
		this.lbCMND = new JLabel("CMND");
	}

	public JLabel getLbNgaySinh() {
		return lbNgaySinh;
	}

	public void createLbNgaySinh() {
		this.lbNgaySinh = new JLabel("Dân tộc");
	}

	public JLabel getLbDanToc() {
		return lbDanToc;
	}

	public void createLbDanToc() {
		this.lbDanToc = new JLabel("Dân tộc");
	}

	public JLabel getLbTonGiao() {
		return lbTonGiao;
	}

	public void createLbTonGiao() {
		this.lbTonGiao = new JLabel("Tôn giáo");
	}

	public JLabel getLbTrangThai() {
		return lbTrangThai;
	}

	public void createLbTrangThai() {
		this.lbTrangThai = new JLabel("Trạng thái");
	}

	public JLabel getLbDiaChi() {
		return lbDiaChi;
	}

	public void createLbDiaChi() {
		this.lbDiaChi = new JLabel("Địa chỉ");
	}

	public JLabel getLbNamSinhCha() {
		return lbNamSinhCha;
	}

	public void createLbNamSinhCha() {
		this.lbNamSinhCha = new JLabel("Năm sinh");
	}

	public JLabel getLbNamSinhMe() {
		return lbNamSinhMe;
	}

	public void createLbNamSinhMe() {
		this.lbNamSinhMe = new JLabel("Năm sinh");
	}

	public JLabel getLbDienThoaiCha() {
		return lbDienThoaiCha;
	}

	public void createLbDienThoaiCha() {
		this.lbDienThoaiCha = new JLabel("Điện thoại");
	}

	public JLabel getLbDienThoaiMe() {
		return lbDienThoaiMe;
	}

	public void createLbDienThoaiMe() {
		this.lbDienThoaiMe = new JLabel("Điện thoại");
	}
	
	public JLabel getLbAnh() {
		return lbAnh;
	}

	public void createLbAnh() {
		this.lbAnh = new JLabel();
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("images\\addimage.png"));
		lbAnh.setIcon(icon);
	}

	public JTextField getTfHoTen() {
		return tfHoTen;
	}

	public void createTfHoTen() {
		this.tfHoTen = new JTextField();
	}

	public JTextField getTfEmail() {
		return tfEmail;
	}

	public void createTfEmail() {
		this.tfEmail = new JTextField();
	}

	public JTextField getTfTenDangNhap() {
		return tfTenDangNhap;
	}

	public void createTfTenDangNhap() {
		this.tfTenDangNhap = new JTextField();
	}

	public JTextField getTfCMND() {
		return tfCMND;
	}

	public void createTfCMND() {
		this.tfCMND = new JTextField();
	}

	public JTextField getTfSoDienThoai() {
		return tfSoDienThoai;
	}

	public void createTfSoDienThoai() {
		this.tfSoDienThoai = new JTextField();
	}

	public JTextField getPfMatKhau() {
		return pfMatKhau;
	}

	public void createPfMatKhau() {
		this.pfMatKhau = new JPasswordField();
	}

	public JTextField getTfNgaySinh() {
		return tfNgaySinh;
	}

	public void createTfNgaySinh() {
		this.tfNgaySinh = new JTextField();
	}

	public JTextField getTfDanToc() {
		return tfDanToc;
	}

	public void createTfDanToc() {
		this.tfDanToc = new JTextField();
	}

	public JTextField getTfTonGiao() {
		return tfTonGiao;
	}

	public void createTfTonGiao() {
		this.tfTonGiao = new JTextField();
	}

	public JTextField getTfNgayVaoHoc() {
		return tfNgayVaoHoc;
	}

	public void createTfNgayVaoHoc() {
		this.tfNgayVaoHoc = new JTextField();
	}

	public JTextField getTfDiaChi() {
		return tfDiaChi;
	}

	public void createTfDiaChi() {
		this.tfDiaChi = new JTextField();
	}

	public JTextField getTfHoTenCha() {
		return tfHoTenCha;
	}

	public void createTfHoTenCha() {
		this.tfHoTenCha = new JTextField();
	}

	public JTextField getTfNamSinhCha() {
		return tfNamSinhCha;
	}

	public void createTfNamSinhCha() {
		this.tfNamSinhCha = new JTextField();
	}

	public JTextField getTfDienThoaiCha() {
		return tfDienThoaiCha;
	}

	public void createTfDienThoaiCha() {
		this.tfDienThoaiCha = new JTextField();
	}

	public JTextField getTfHoTenMe() {
		return tfHoTenMe;
	}

	public void createTfHoTenMe() {
		this.tfHoTenMe = new JTextField();
	}

	public JTextField getTfDienThoai() {
		return tfDienThoai;
	}

	public void createTfDienThoai() {
		this.tfDienThoai = new JTextField();
	}

	public JTextField getTfNgheNghiepMe() {
		return tfNgheNghiepMe;
	}

	public void createTfNgheNghiepMe() {
		this.tfNgheNghiepMe = new JTextField();
	}
	
	

	public JButton getBtCapNhatHinh() {
		return btCapNhatHinh;
	}

	public void createBtCapNhatHinh() {
		this.btCapNhatHinh = new JButton("Cập nhật hình");
	}

	public JCheckBox getCbDTUT() {
		return cbDTUT;
	}

	public void createCbDTUT() {
		this.cbDTUT = new JCheckBox("Đối tượng ưu tiên");
	}

	public JRadioButton getRbNam() {
		return rbNam;
	}

	public void createRbNam() {
		this.rbNam = new JRadioButton("Nam");
	}

	public JRadioButton getRbNu() {
		return rbNu;
	}

	public void createRbNu() {
		this.rbNu = new JRadioButton("Nữ");
	}

	public JPanel getPnChinh() {
		return pnChinh;
	}

	public void createPnChinh() {
		this.pnChinh = new JPanel();
		pnChinh.setLayout(new BorderLayout());
	}

	public JPanel getPnTren() {
		return pnTren;
	}

	public void createPnTren() {
		this.pnTren = new JPanel();
		pnTren.setLayout(new GridBagLayout());
	}

	public JPanel getPnDuoi() {
		return pnDuoi;
	}

	public void createPnDuoi() {
		this.pnDuoi = new JPanel();
		pnDuoi.setLayout(new GridBagLayout());
	}
	

}
