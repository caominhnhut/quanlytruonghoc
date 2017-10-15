-- This procedure use for login function;
drop procedure if exists dangNhap;
DELIMITER $$
create procedure dangNhap
(
	param_ten_dang_nhap varchar(50),
    param_matkhau varchar(50)
)
begin
	select *
    from nguoidung
    where ten_dang_nhap=param_ten_dang_nhap and matkhau=param_matkhau;
end$$
DELIMITER ;

call dangNhap('nguyenthilinh','3115510158');

/*create store procedure lay danh sach hoc sinh*/
DELIMITER $$
	drop procedure if exists getHocSinh $$
    create procedure getHocSinh()
    begin
		select * from nguoidung where loai_nguoi_dung='HS';
    end; $$
DELIMITER ;
call getHocSinh();


/*create store procedure lay danh sach lop*/
DELIMITER $$
	drop procedure if exists getTenLop $$
    create procedure getTenLop(
		input_magv varchar(10)
    )
    begin
		select lh.tenlop from giaovien_chunhiem gvcn join lophoc lh on gvcn.malop=lh.malop where gvcn.mand=input_magv;
    end; $$
DELIMITER ;
call getTenLop('GV001');

/*them hoc sinh*/
DELIMITER $$
	drop procedure if exists themHocSinh $$
    create procedure themHocSinh(
		in_mand varchar(10),
		in_ten_dang_nhap varchar(50),
		in_matkhau varchar(50),
		in_hoten nvarchar(50),
		in_cmnd varchar(12),
		in_ngaycap date,
		in_noicap nvarchar(50),
		in_sdt varchar(12),
		in_ngaysinh date,
		in_dantoc nvarchar(50),
		in_tongiao nvarchar(50),
		in_quoctich nvarchar(50),
		in_gioitinh varchar(3),
		in_hinhanh varchar(100),
		in_diachi nvarchar(50),
		in_trangthai varchar(10),
		in_loai_nguoi_dung varchar(10),
		in_doi_tuong_uu_tien nvarchar(50),
        in_ph_maph varchar(10),
        in_ph_hoten nvarchar(50),
		in_ph_namsinh date,
		in_ph_dienthoai varchar(12),
		in_ph_nghenghiep nvarchar(50),
		in_ph_quanhe varchar(50)
    )
    begin
		insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung) values (in_mand,in_ten_dang_nhap,in_matkhau,in_hoten,in_cmnd,in_ngaycap,in_noicap,in_sdt,in_ngaysinh,in_dantoc,in_tongiao,in_quoctich,in_gioitinh,in_hinhanh,in_diachi,in_trangthai,in_loai_nguoi_dung);
        insert into hocsinh(mand,doi_tuong_uu_tien) values (in_mand,in_doi_tuong_uu_tien);
        insert into phuhuynh(maph,hoten,namsinh,dienthoai,nghenghiep,quanhe) values (in_ph_maph,in_ph_hoten,in_ph_namsinh,in_ph_dienthoai,in_ph_nghenghiep,in_ph_quanhe);
        insert into hocsinh_phuhuynh(maph,mand) values (in_ph_maph,in_mand);
    end; $$
DELIMITER ;

call themHocSinh('HS035','hoangsonsb','123','Nguyen Hoang Son','352354238','1990-4-5','TPHCM','0249545415','1975-4-5','Kinh','Helima','Viet Nam','Nam','hoangson.img','65 Cao That Thuyet P8 Q 23','1','HS','1','PH015','Ha Dong','1960-6-6','0964656545','Giam doc','Cha');

delete hocsinh
from hocsinh
where hs.mand='HS026';

/*create store procedure getHocSinhTheoLop*/
DELIMITER $$
	drop procedure if exists getHocSinhTheoLop $$
    create procedure getHocSinhTheoLop(
		in_tenlop varchar(50)
    )
    begin
		select * from nguoidung nd where nd.mand in(
		select mand from hocsinh_lop hsl where hsl.malop=(select malop from lophoc where tenlop=in_tenlop)
);
    end; $$
DELIMITER ;
call getHocSinhTheoLop('10A1');
