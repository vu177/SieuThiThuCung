package vu.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import vu.daoimp.NhanVienImp;
import vu.entity.NhanVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanVienDAO implements NhanVienImp{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public boolean KiemTraDangNhap(String TENDANGNHAP, String MATKHAU) {
		Session session= sessionFactory.getCurrentSession();
		try {
			NhanVien nhanvien=(NhanVien) session.createQuery("from NHANVIEN WHERE TENDANGNHAP='"+TENDANGNHAP+"' AND MATKHAU='"+MATKHAU+"'").getSingleResult();
			if(nhanvien!=null) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean ThemNhanVien(NhanVien nhanvien) {
		Session session= sessionFactory.getCurrentSession();
		int ma=(int) session.save(nhanvien);
		if(ma>0) {
			return true;
		}else {
			return false;
		}
	}
	
}
