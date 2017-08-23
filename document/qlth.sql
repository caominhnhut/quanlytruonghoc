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













