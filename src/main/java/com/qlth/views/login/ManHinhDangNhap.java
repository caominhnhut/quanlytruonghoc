package com.qlth.views.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.qlth.bus.NguoiDungBus;
import com.qlth.bus.impl.NguoiDungBusImpl;
import com.qlth.dao.NguoiDungDao;
import com.qlth.factory.LinkButton;
import com.qlth.factory.PlaceHolderTextField;
import com.qlth.model.NguoiDung;
import com.qlth.model.ResponseData;
import com.qlth.views.quanly.ManHinhQuanLy;

public class ManHinhDangNhap implements ActionListener {

	private JFrame frame;
	private JPanel pnDangNhap;
	private JLabel lbImg;
	private JLabel lbDangNhap;
	private LinkButton btQuenMatKhau;
	private JTextField tfDangNhap;
	private JPasswordField pass;
	private JCheckBox cbGhiNho;
	private JButton btDangNhap;
	private JButton btThoat;
	private NguoiDungBus nguoiDungBus;
	
	public static final Log logger = LogFactory.getLog(ManHinhDangNhap.class);
	
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// ManHinhDangNhap window = new ManHinhDangNhap();
	// window.createGUI();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	public ManHinhDangNhap() {
		initialize();
		nguoiDungBus = new NguoiDungBusImpl();
	}

	public void initialize() {
		createFrame();
		createPnDangNhap();
		createLbDangNhap();
		createLbImg();
		createTfDangNhap();
		createPass();
		createCbGhiNho();
		createBtQuenMatKhau();
		createBtDangNhap();
		createBtThoat();
	}

	public void createGUI() {
		JPanel pnGioiThieu = new JPanel(new FlowLayout());
		pnGioiThieu.add(lbDangNhap);
		frame.add(pnGioiThieu, BorderLayout.PAGE_START);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 5, 5, 5);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weighty = 1;
		gbc.gridheight = 4;
		pnDangNhap.add(lbImg, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 0;
		gbc.gridheight = 1;
		gbc.ipady = 17;
		pnDangNhap.add(tfDangNhap, gbc);

		gbc.gridy = 1;
		pnDangNhap.add(pass, gbc);

		JPanel pnBt = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnBt.add(btDangNhap);
		pnBt.add(btThoat);
		gbc.gridy = 2;
		pnDangNhap.add(pnBt, gbc);

		gbc.gridy = 3;
		gbc.ipady = 1;
		pnDangNhap.add(cbGhiNho, gbc);

		gbc.gridy = 4;
		pnDangNhap.add(getBtQuenMatKhau(), gbc);

		frame.add(pnDangNhap, BorderLayout.CENTER);
	}

	public void createFrame() {
		frame = new JFrame("Đăng nhập");
		frame.setBounds(100, 100, 600, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		;
		frame.setLocationRelativeTo(null);
		frame.setResizable(false); // co dinh man hinh
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		ImageIcon icon = layAnhTuResource("images\\school_icon.png");
		frame.setIconImage(icon.getImage());
	}

	public void createPnDangNhap() {
		this.pnDangNhap = new JPanel();
		this.pnDangNhap.setLayout(new GridBagLayout());
	}

	public void createLbDangNhap() {
		lbDangNhap = new JLabel();
		lbDangNhap.setText("XIN MỜI ĐĂNG NHẬP");
		lbDangNhap.setForeground(Color.RED);
		lbDangNhap.setOpaque(true);
		lbDangNhap.setFont(new Font("Serif", Font.BOLD, 35));
	}

	public JLabel getLbImg() {
		return lbImg;
	}

	public void createLbImg() {
		this.lbImg = new JLabel();
		lbImg.setIcon(layAnhTuResource("img\\login.png"));
	}

	public JTextField getTfDangNhap() {
		return tfDangNhap;
	}

	public void createTfDangNhap() {
		this.tfDangNhap = new PlaceHolderTextField("Tên Đăng Nhập", 12,25);
		this.tfDangNhap.addActionListener(this);
	}

	public JPasswordField getPass() {
		return pass;
	}

	public void createPass() {
		this.pass = new JPasswordField();
		this.pass.addActionListener(this);
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

	public void createBtDangNhap() {
		ImageIcon icon = layAnhTuResource("img\\check-icon.png");
		this.btDangNhap = new JButton();
		this.btDangNhap.setIcon(icon);
		this.btDangNhap.setText("Đăng Nhập");
		this.btDangNhap.addActionListener(this);
	}

	public void createBtThoat() {
		btThoat = new JButton();
		btThoat.setText("Thoát");
		ImageIcon icon = layAnhTuResource("img\\Error-icon.png");
		btThoat.setIcon(icon);
		btThoat.addActionListener(this);
	}

	public ImageIcon layAnhTuResource(String path) {
		return new ImageIcon(getClass().getClassLoader().getResource(path));
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tfDangNhap || e.getSource() == pass){
			btDangNhap.doClick();
		}
		if (e.getSource() == btDangNhap ) {
			String tenDN = tfDangNhap.getText();
			String matKhau = new String(pass.getPassword());
			if (tenDN.isEmpty() || matKhau.isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Vui long nhap day du du lieu", "Canh báo",
						JOptionPane.WARNING_MESSAGE);
			} else {
				NguoiDung nguoiDung = new NguoiDung();
				nguoiDung.setTenDN(tenDN);
				nguoiDung.setMatkhau(matKhau);
				ResponseData<NguoiDung> rs = nguoiDungBus.timNguoiDung(nguoiDung);
				if (rs.getData() != null) {
					logger.info(rs.getData().getMaND());
					logger.info(rs.getData().getHoten());
					logger.info(rs.getData().getHinhanh());
					frame.dispose();
					ManHinhQuanLy mhql = new ManHinhQuanLy(rs.getData());
					mhql.showUI();
				} else {
					JOptionPane.showMessageDialog(frame, rs.getErrorMessage(), "Thông báo",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		if (e.getSource() == btThoat) {
			System.exit(0);
		}
	}
}
