package vu.daoimp;

import vu.entity.NhanVien;

public interface NhanVienImp {
	boolean KiemTraDangNhap(String TENDANGNHAP,String MATKHAU);
	boolean ThemNhanVien(NhanVien nhanvien);
}
