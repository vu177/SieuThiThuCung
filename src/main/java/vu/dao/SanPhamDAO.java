package vu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import vu.daoimp.SanPhamImp;
import vu.entity.ChiTietSanPham;
import vu.entity.SanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SanPhamDAO implements SanPhamImp{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<SanPham> laysanphamlimit(int batdau) {
		Session session= sessionFactory.getCurrentSession();
		List<SanPham> listsp=(List<SanPham>) session.createQuery("FROM SANPHAM WHERE MASANPHAM<28").getResultList();
		return listsp;
	}

	@Override
	@Transactional
	public SanPham laysanphamtheomasp(int masp) {
		Session session= sessionFactory.getCurrentSession();
		String query="from SANPHAM sp WHERE sp.MASANPHAM="+masp;
		SanPham sanPham=(SanPham) session.createQuery(query).getSingleResult();
		return sanPham;
	}

}
