package vu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vu.dao.NhanVienDAO;
import vu.daoimp.NhanVienImp;
import vu.entity.NhanVien;

@Service
public class NhanVienService implements NhanVienImp{
	@Autowired
	NhanVienDAO nhanviendao;

	@Override
	public boolean KiemTraDangNhap(String TENDANGNHAP, String MATKHAU) {
		boolean kiemtra=nhanviendao.KiemTraDangNhap(TENDANGNHAP, MATKHAU);
		return kiemtra;
	}

	@Override
	public boolean ThemNhanVien(NhanVien nhanvien) {
		boolean checkThemNV= nhanviendao.ThemNhanVien(nhanvien);
		return checkThemNV;
	}
	
}
