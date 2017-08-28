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

