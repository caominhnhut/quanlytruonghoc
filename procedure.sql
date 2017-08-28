
/*lay danh sach hoc sinh*/
DELIMITER $$
	drop procedure if exists getHocSinh $$
    create procedure getHocSinh()
    begin
		select * from nguoidung where loai_nguoi_dung='HS';
    end; $$
DELIMITER ;
call getHocSinh();

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