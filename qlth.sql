create database quanlytruonghoc;
use quanlytruonghoc;

create table nguoidung
(
	mand varchar(10),
    ten_dang_nhap varchar(50),
    matkhau varchar(50),
    hoten nvarchar(50),
    cmnd varchar(12),
    ngaycap date,
    noicap nvarchar(50),
    sdt varchar(12),
    ngaysinh date,
    dantoc nvarchar(50),
    tongiao nvarchar(50),
    quoctich nvarchar(50),
    gioitinh varchar(3),
    hinhanh varchar(100),
    diachi nvarchar(50),
    trangthai varchar(10),
    loai_nguoi_dung varchar(10),
    primary key(mand)
);

create table trangthai
(
	matt varchar(10),
    ten_trang_thai nvarchar(50),
    primary key(matt)
);

create table loainguoidung
(
	ma_lnd varchar(10),
    tenloai nvarchar(50),
    primary key(ma_lnd)
);

create table hocsinh
(
	mand varchar(10),
    doi_tuong_uu_tien nvarchar(50),
    primary key(mand)
);

create table lophoc
(
	malop varchar(10),
    tenlop nvarchar(50),
    khoihoc varchar(10),
    primary key(malop)
);

create table khoilop
(
	makhoi varchar(10),
    tenkhoi nvarchar(50),
    primary key(makhoi)
);

create table giaovien
(
	mand varchar(10),
    luong float,
    primary key(mand)
);

create table hocsinh_phuhuynh
(
	mand varchar(10),
    maph varchar(10),
    primary key(mand,maph)
);

create table hocsinh_lop
(
	mand varchar(10),
    malop varchar(10),
    nienkhoa varchar(10),
    ngay_nhap_hoc date,
    primary key(mand,malop)
);

create table giaovien_chunhiem
(
	mand varchar(10),
    malop varchar(10),
    nienkhoa varchar(10),
    primary key(mand,malop)
);

create table phuhuynh
(
	maph varchar(10),
    hoten nvarchar(50),
    namsinh date,
    dienthoai varchar(12),
    nghenghiep nvarchar(50),
    quanhe varchar(50),
    primary key(maph)
);

alter table nguoidung 
add constraint nd_tt foreign key(trangthai) 
references trangthai(matt);

alter table nguoidung
add constraint nd_lnd foreign key(loai_nguoi_dung) 
references loainguoidung(ma_lnd);

alter table hocsinh
add constraint hs_nd foreign key(mand)
references nguoidung(mand);

alter table lophoc
add constraint lh_kl foreign key(khoihoc)
references khoilop(makhoi);

alter table giaovien
add constraint gv_nd foreign key(mand)
references nguoidung(mand);

alter table hocsinh_phuhuynh
add constraint hsph_hs foreign key(mand)
references hocsinh(mand);

alter table hocsinh_phuhuynh
add constraint hsph_ph foreign key(maph)
references phuhuynh(maph);

alter table hocsinh_lop
add constraint hsl_hs foreign key(mand)
references hocsinh(mand);

alter table hocsinh_lop
add constraint hsl_lh foreign key(malop)
references lophoc(malop);

alter table giaovien_chunhiem
add constraint gv_cn_gv foreign key(mand)
references giaovien(mand);

alter table giaovien_chunhiem
add constraint gv_cn_lh foreign key(malop)
references lophoc(malop);

insert into loainguoidung(ma_lnd,tenloai) values("HS","Học Sinh");
insert into loainguoidung(ma_lnd,tenloai) values("GV","Giáo Viên");
select * from loainguoidung;
/*insert data into trangthai*/
insert into trangthai(matt,ten_trang_thai) values("1","Còn học");
insert into trangthai(matt,ten_trang_thai) values("2","Đã nghỉ học");
insert into trangthai(matt,ten_trang_thai) values("3","Còn công tác");
insert into trangthai(matt,ten_trang_thai) values("4","Nghỉ công tác");
/*insert data into nguoidung*/
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS001","trangiathinh","3115410153","Tran Gia Thinh","321561937","2012-12-12","Ben Tre","0979857737","1997-06-19","Kinh","Không","Viet Nam","Nam","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS002","nguyenhieutrung","3115410157","Nguyen Hieu Trung","321561957","2012-03-12","Thành phố Hồ Chí Minh","0169857737","1997-05-19","Kinh","Không","Viet Nam","Nam","","Thành phố Hồ Chí Minh","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS003","vokhanhtoan","3115410158","Vo Khanh Toan","321561037","2012-08-12","Thành phố Hồ Chí Minh","016648795","1997-10-21","Kinh","Không","Viet Nam","Nam","","Thành phố HỒ Chí Minh","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS004","tranhotuan","3115410168","Tran Ho Tuan","321561337","2012-06-12","Thành phố Hồ Chí Minh","016748015","1997-11-23","Kinh","Không","Viet Nam","Nam","","Thành phố HỒ Chí Minh","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS005","trankieuan","3115510148","Tran Kieu An","321511277","2012-01-12","Thành phố Hồ Chí Minh","090311325","1997-01-13","Hoa","Không","Viet Nam","Nu","","Thành phố HỒ Chí Minh","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS006","nguyenthilinh","3115510158","Nguyen Thi Linh","321511287","2012-11-12","An Giang","012311325","1997-11-14","Khome","Không","Viet Nam","Nu","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS007","nguyenthikimthanh","3115510118","Nguyen Thi Kim Thanh","333511287","2012-07-21","Ben Tre","0166789200","1996-08-16","Tay","Không","Viet Nam","Nu","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS008","phanvanminh","3115510120","Phan Van Minh","333441212","2012-03-11","Ben Tre","0166755512","1997-02-17","Kinh","Không","Viet Nam","Nam","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS009","tranduchuy","3115510100","Tran Duc Huy","345441219","2012-05-10","Ben Tre","0166751181","1997-01-01","Kinh","Không","Viet Nam","Nam","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS010","phamdiepquangbang","3115510110","Pham Diep Quang Bang","321544001","2012-08-18","Ben Tre","0988344121","1997-09-01","Kinh","Không","Viet Nam","Nam","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS011","phamgiakhanh","3115511117","Pham Gia Khanh","321244567","2012-03-19","Ben Tre","0988121121","1997-12-06","Kinh","Không","Viet Nam","Nam","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS012","nguyenthimyngoc","3115500017","Nguyen Thi My Ngoc","3212654231","2012-12-25","Ben Tre","0166879456","1997-04-05","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS013","phanthihuyen","3115555115","Phan Thi Huyen","321244987","2012-05-10","Ben Tre","0166879598","1997-10-09","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS014","ngothibap","31155124987","Ngo Thi Bap","321224681","2012-01-19","Ben Tre","0245641089","1997-11-16","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS015","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS016","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS017","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS018","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS019","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS020","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS021","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS022","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS023","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS024","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("HS025","nguyenthihoa","3115511187","Nguyen Thi Hoa","321221221","2012-11-10","Chau Doc","0137108923","1997-12-31","Kinh","Không","Viet Nam","Nu","","Ben Tre","1","HS");
insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("GV001","caominhnhut","3115420612","Nguyen Cao Minh Nhut","221511957","2000-03-12","Bến Tre","0123456789","1984-11-10","Kinh","Không","Viet Nam","Nam","","Thành phố Hồ Chí Minh","3","GV");

insert into nguoidung(mand,ten_dang_nhap,matkhau,hoten,cmnd,ngaycap,noicap,sdt,ngaysinh,dantoc,tongiao,quoctich,gioitinh,hinhanh,diachi,trangthai,loai_nguoi_dung)
values("GV002","phantanquoc","3115420600","Phan Tan Quoc","123511957","1990-01-13","Bạc Liêu","024681111","1979-02-14","Kinh","Không","Viet Nam","Nam","","Thành phố Hồ Chí Minh","3","GV");

select * from nguoidung;
/*insert data into khoilop*/
insert into khoilop(makhoi,tenkhoi) values("1","Khối 10");
insert into khoilop(makhoi,tenkhoi) values("2","Khối 11");
insert into khoilop(makhoi,tenkhoi) values("3","Khối 12");
/*insert data into lophoc*/
insert into lophoc(malop,tenlop,khoihoc) values('101','10A1','1');
insert into lophoc(malop,tenlop,khoihoc) values('102','10A2','1');
insert into lophoc(malop,tenlop,khoihoc) values('103','10A3','1');
insert into lophoc(malop,tenlop,khoihoc) values('104','10A4','1');
insert into lophoc(malop,tenlop,khoihoc) values('105','10A5','1');
insert into lophoc(malop,tenlop,khoihoc) values('106','10A6','1');
insert into lophoc(malop,tenlop,khoihoc) values('107','10A7','1');
insert into lophoc(malop,tenlop,khoihoc) values('108','10A8','1');
insert into lophoc(malop,tenlop,khoihoc) values('109','10A9','1');
insert into lophoc(malop,tenlop,khoihoc) values('1010','10A10','1');
insert into lophoc(malop,tenlop,khoihoc) values('111','11A1','2');
insert into lophoc(malop,tenlop,khoihoc) values('112','11A2','2');
select * from lophoc;
/*insert data into giaovien*/
insert into giaovien(mand,luong) values('GV001',5000000);
insert into giaovien(mand,luong) values('GV002',3000000);
select * from giaovien;
/*insert data into giaovien_chunhiem*/
insert into giaovien_chunhiem(mand,malop,nienkhoa) values('GV001','101','2014-2015');
insert into giaovien_chunhiem(mand,malop,nienkhoa) values('GV001','102','2015-2016');

select *
from giaovien_chunhiem gvcn join lophoc lh on gvcn.malop=lh.malop
where gvcn.mand='GV001';

/*insert data into hocsinh*/
insert into hocsinh(mand,doi_tuong_uu_tien) values('HS001','Khong');
insert into hocsinh(mand,doi_tuong_uu_tien) values('HS002','Khong');
insert into hocsinh(mand,doi_tuong_uu_tien) values('HS003','Nguoi dan toc');
insert into hocsinh(mand,doi_tuong_uu_tien) values('HS004','Con thuong binh');
insert into hocsinh(mand,doi_tuong_uu_tien) values('HS005','Ho ngheo');

select* from hocsinh;

/*insert data into hocsinh_lop*/
insert into hocsinh_lop(mand,malop,nienkhoa,ngay_nhap_hoc) values('HS001','101','2014-2015','2014-08-15');
insert into hocsinh_lop(mand,malop,nienkhoa,ngay_nhap_hoc) values('HS002','102','2014-2015','2014-08-15');
insert into hocsinh_lop(mand,malop,nienkhoa,ngay_nhap_hoc) values('HS003','101','2014-2015','2014-08-15');
insert into hocsinh_lop(mand,malop,nienkhoa,ngay_nhap_hoc) values('HS004','101','2014-2015','2014-08-15');
insert into hocsinh_lop(mand,malop,nienkhoa,ngay_nhap_hoc) values('HS005','101','2014-2015','2014-08-15');

select * from hocsinh_lop;




