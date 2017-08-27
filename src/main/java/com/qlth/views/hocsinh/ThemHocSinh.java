package com.qlth.views.hocsinh;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import com.qlth.factory.PlaceHolderTextField;


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
	private PlaceHolderTextField ptfEmail;
	private PlaceHolderTextField ptfTenDangNhap;
	private JTextField tfCMND;
	private PlaceHolderTextField ptfSoDienThoai;
	private JPasswordField pfMatKhau;
	private PlaceHolderTextField ptfNgaySinh;
	private JTextField tfDanToc;
	private PlaceHolderTextField ptfTonGiao;
	private PlaceHolderTextField ptfNgayVaoHoc;
	private JTextField tfDiaChi;
	private PlaceHolderTextField ptfHoTenCha;
	private PlaceHolderTextField ptfNgheNghiepCha;
	private JTextField tfDienThoaiCha;
	private PlaceHolderTextField ptfHoTenMe;
	private JTextField tfDienThoaiMe;
	private PlaceHolderTextField ptfNgheNghiepMe;
	private JComboBox<String> cbChonKhoiHoc;
	private JComboBox<String> cbChonLopHoc;
	private JComboBox<String> cbChonNamHoc;
	private JComboBox<String> cbChonTrangThai;
	private JSpinner spNamSinhCha;
	private JSpinner spNamSinhMe;
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
		createCbDTUT();
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
		createBtCapNhatHinh();
		createTfCMND();
		createTfDanToc();
		createTfDiaChi();
		createTfDienThoaiMe();
		createTfDienThoaiCha();
		createPtfEmail();
		createTfHoTen();
		createPtfHoTenCha();
		createPtfHoTenMe();
		createPtfTenDangNhap();
		createPtfSoDienThoai();
		createPtfNgayVaoHoc();
		createPtfSoDienThoai();
		createPtfTonGiao();
		createPtfNgaySinh();
		createPtfNgheNghiepCha();
		createPtfNgheNghiepMe();
		createPtfSoDienThoai();
		createPtfTenDangNhap();
		createCbChonKhoiHoc();
		createCbChonLopHoc();
		createCbChonNamHoc();
		createCbChonTrangThai();
		createPfMatKhau();
		createCbDTUT();
		createRbNam();
		createRbNu();
		createSpNamSinhCha();
		createSpNamSinhMe();
		createPnChinh();
		createPnDuoi();
		createPnTren();
	}
	
	

	public JFrame getFrame() {
		return frame;
	}

	public void createFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createGUI(){
		pnChinh.add(pnTren, BorderLayout.CENTER);
		pnChinh.add(pnDuoi, BorderLayout.SOUTH);
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(5, 5, 5, 5);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=1;
		pnTren.add(lbHoTen, gbc);
		gbc.gridx=1;
		pnTren.add(tfHoTen, gbc);
		gbc.gridx=2;
		pnTren.add(ptfEmail, gbc);
		gbc.gridx=3;
		pnTren.add(ptfTenDangNhap, gbc);
		gbc.gridx=4;
		gbc.gridheight=5;
		gbc.weightx=0;
		pnTren.add(lbAnh, gbc);
		gbc.gridheight=1;
		
		
		gbc.gridx=0;
		gbc.gridy=1;
		pnTren.add(lbCMND, gbc);
		gbc.gridx=1;
		gbc.weightx=1;
		pnTren.add(tfCMND, gbc);
		gbc.gridx=2;
		pnTren.add(ptfSoDienThoai, gbc);
		gbc.gridx=3;
		pnTren.add(pfMatKhau, gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		pnTren.add(lbNgaySinh, gbc);
		gbc.gridx=1;
		pnTren.add(ptfNgaySinh, gbc);
		gbc.gridx=2;
		pnTren.add(cbChonKhoiHoc,gbc);
		gbc.gridx=3;
		pnTren.add(cbDTUT, gbc);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbNam);
		bg.add(rbNu);
		gbc.gridx=0;
		gbc.gridy=3;
		pnTren.add(lbDanToc, gbc);
		gbc.gridx=1;
		pnTren.add(tfDanToc, gbc);
		gbc.gridx=2;
		pnTren.add(cbChonLopHoc, gbc);
		gbc.gridx=3;
		pnTren.add(rbNam, gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		pnTren.add(lbTonGiao, gbc);
		gbc.gridx=1;
		pnTren.add(ptfTonGiao, gbc);
		gbc.gridx=2;
		pnTren.add(cbChonNamHoc,gbc);
		gbc.gridx=3;
		pnTren.add(rbNu, gbc);
		
		gbc.gridx=0;
		gbc.gridy=5;
		pnTren.add(lbTrangThai, gbc);
		gbc.gridx=1;
		pnTren.add(cbChonTrangThai, gbc);
		gbc.gridx=2;
		pnTren.add(ptfNgayVaoHoc, gbc);
		
		gbc.gridx=0;
		gbc.gridy=6;
		pnTren.add(lbDiaChi, gbc);
		gbc.gridx=1;
		gbc.gridwidth=3;
		pnTren.add(tfDiaChi, gbc);
		gbc.gridx=4;
		gbc.gridwidth=1;
		pnTren.add(btCapNhatHinh, gbc);
		
		GridBagConstraints gbc1=new GridBagConstraints();
		gbc1.fill=GridBagConstraints.HORIZONTAL;
		gbc1.insets=new Insets(5, 10, 5, 5);
		gbc1.gridx=0;
		gbc1.gridy=0;
		gbc1.weightx=1;
		pnDuoi.add(ptfHoTenCha, gbc1);
		gbc1.gridx=1;
		gbc.weightx=0;
		gbc.anchor=GridBagConstraints.EAST;
		pnDuoi.add(lbNamSinhCha, gbc1);
		gbc1.gridx=2;
		gbc1.weightx=1;
		pnDuoi.add(spNamSinhCha, gbc1);
		gbc1.gridx=3;
		gbc.weightx=0;
		pnDuoi.add(lbDienThoaiCha, gbc1);
		gbc1.gridx=4;
		gbc.weightx=1;
		pnDuoi.add(tfDienThoaiCha, gbc1);
		
		gbc1.gridx=0;
		gbc1.gridy=1;
		gbc1.gridwidth=5;
		pnDuoi.add(ptfNgheNghiepMe, gbc1);
		
		gbc1.gridwidth=1;
		gbc1.gridy=2;
		pnDuoi.add(ptfHoTenMe, gbc1);
		gbc1.gridx=1;
		pnDuoi.add(lbNamSinhMe, gbc1);
		gbc1.gridx=2;
		pnDuoi.add(spNamSinhMe, gbc1);
		gbc1.gridx=3;
		pnDuoi.add(lbDienThoaiMe, gbc1);
		gbc1.gridx=4;
		pnDuoi.add(tfDienThoaiMe, gbc1);
		
		gbc1.gridx=0;
		gbc1.gridy=3;
		gbc1.gridwidth=5;
		pnDuoi.add(ptfNgheNghiepCha, gbc1);
		
		frame.add(pnChinh);
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
		this.lbNgaySinh = new JLabel("Ngày sinh");
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

	public JTextField getPtfEmail() {
		return ptfEmail;
	}

	public void createPtfEmail() {
		this.ptfEmail = new PlaceHolderTextField("Email", 12);
	}

	public PlaceHolderTextField getPtfTenDangNhap() {
		return ptfTenDangNhap;
	}

	public void createPtfTenDangNhap() {
		this.ptfTenDangNhap = new PlaceHolderTextField("Tên đăng nhập", 12);
	}

	public JTextField getTfCMND() {
		return tfCMND;
	}

	public void createTfCMND() {
		this.tfCMND = new JTextField();
	}

	public PlaceHolderTextField getPtfSoDienThoai() {
		return ptfSoDienThoai;
	}

	public void createPtfSoDienThoai() {
		this.ptfSoDienThoai = new PlaceHolderTextField("Số điện thoại", 12);
	}

	public JTextField getPfMatKhau() {
		return pfMatKhau;
	}

	public void createPfMatKhau() {
		this.pfMatKhau = new JPasswordField();
		pfMatKhau.setEchoChar('*');
	}

	public PlaceHolderTextField getPtfNgaySinh() {
		return ptfNgaySinh;
	}

	public void createPtfNgaySinh() {
		this.ptfNgaySinh = new PlaceHolderTextField("Date picker",12);
	}

	public JTextField getTfDanToc() {
		return tfDanToc;
	}

	public void createTfDanToc() {
		this.tfDanToc = new JTextField();
	}

	public PlaceHolderTextField getPtfTonGiao() {
		return ptfTonGiao;
	}

	public void createPtfTonGiao() {
		this.ptfTonGiao = new PlaceHolderTextField("Tôn giáo",12);
	}

	public PlaceHolderTextField getPtfNgayVaoHoc() {
		return ptfNgayVaoHoc;
	}

	public void createPtfNgayVaoHoc() {
		this.ptfNgayVaoHoc = new PlaceHolderTextField("Ngày vào học",12);
	}

	public JTextField getTfDiaChi() {
		return tfDiaChi;
	}

	public void createTfDiaChi() {
		this.tfDiaChi = new JTextField();
	}

	public PlaceHolderTextField getPtfHoTenCha() {
		return ptfHoTenCha;
	}

	public void createPtfHoTenCha() {
		this.ptfHoTenCha = new PlaceHolderTextField("Họ tên cha", 12);
	}

	public PlaceHolderTextField getPtfNgheNghiepCha() {
		return ptfNgheNghiepCha;
	}

	public void createPtfNgheNghiepCha() {
		this.ptfNgheNghiepCha = new PlaceHolderTextField("Nghề nghiệp Cha",12);
	}

	public JTextField getTfDienThoaiCha() {
		return tfDienThoaiCha;
	}

	public void createTfDienThoaiCha() {
		this.tfDienThoaiCha = new JTextField();
	}

	public PlaceHolderTextField getPtfHoTenMe() {
		return ptfHoTenMe;
	}

	public void createPtfHoTenMe() {
		this.ptfHoTenMe = new PlaceHolderTextField("Họ tên mẹ",12);
	}

	public JTextField getfDienThoaiMe() {
		return tfDienThoaiMe;
	}

	public void createTfDienThoaiMe() {
		this.tfDienThoaiMe = new JTextField();
	}

	public PlaceHolderTextField getPtfNgheNghiepMe() {
		return ptfNgheNghiepMe;
	}

	public void createPtfNgheNghiepMe() {
		this.ptfNgheNghiepMe = new PlaceHolderTextField("Nghề nghiệp mẹ", 12);
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
		pnTren.setBorder(BorderFactory.createTitledBorder("Thông tin học sinh"));
	}

	public JPanel getPnDuoi() {
		return pnDuoi;
	}

	public void createPnDuoi() {
		this.pnDuoi = new JPanel();
		pnDuoi.setLayout(new GridBagLayout());
		pnDuoi.setBorder(BorderFactory.createTitledBorder("Thông tin học sinh"));
	}

	public JSpinner getSpNamSinhCha() {
		return spNamSinhCha;
	}

	public void createSpNamSinhCha() {
		SpinnerModel model =
		        new SpinnerNumberModel(1960, 
		                               1960 - 100, 
		                               1960 + 100, 
		                               1);                
		this.spNamSinhCha = new JSpinner(model);
	}

	public JSpinner getSpNamSinhMe() {
		return spNamSinhMe;
	}

	public void createSpNamSinhMe() {
		SpinnerModel model =
		        new SpinnerNumberModel(1960, 
		                               1960 - 100, 
		                               1960 + 100, 
		                               1);            
		this.spNamSinhMe = new JSpinner(model);
	}

	public JComboBox<String> getCbChonKhoiHoc() {
		return cbChonKhoiHoc;
	}

	public void createCbChonKhoiHoc() {
		DefaultComboBoxModel<String> model;
		model = new DefaultComboBoxModel<String>();
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		this.cbChonKhoiHoc = new JComboBox<String>(model);
	}

	public JComboBox<String> getCbChonLopHoc() {
		return cbChonLopHoc;
	}

	public void createCbChonLopHoc() {
		DefaultComboBoxModel<String> model;
		model = new DefaultComboBoxModel<String>();
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		this.cbChonLopHoc = new JComboBox<String>(model);
	}

	public JComboBox<String> getCbChonNamHoc() {
		return cbChonNamHoc;
	}

	public void createCbChonNamHoc() {
		DefaultComboBoxModel<String> model;
		model = new DefaultComboBoxModel<String>();
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		this.cbChonNamHoc = new JComboBox<String>(model);
	}

	public JComboBox<String> getCbChonTrangThai() {
		return cbChonTrangThai;
	}

	public void createCbChonTrangThai() {
		DefaultComboBoxModel<String> model;
		model = new DefaultComboBoxModel<String>();
		model.addElement("Khối 10");
		model.addElement("Khối 10");
		this.cbChonTrangThai = new JComboBox<String>(model);
	}
	
	
	
	

}
