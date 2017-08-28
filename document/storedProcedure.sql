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