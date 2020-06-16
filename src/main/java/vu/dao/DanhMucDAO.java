package vu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import vu.daoimp.DanhMucImp;
import vu.entity.DanhMucSanPham;
import vu.entity.SanPham;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DanhMucDAO implements DanhMucImp{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<DanhMucSanPham> danhmuc() {
		Session session= sessionFactory.getCurrentSession();
		List<DanhMucSanPham> listdanhmuc= session.createQuery("from DANHMUCSANPHAM").getResultList();
		return listdanhmuc;
	}

}
