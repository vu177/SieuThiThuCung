package vu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vu.dao.SanPhamDAO;
import vu.daoimp.SanPhamImp;
import vu.entity.SanPham;
@Service
public class SanPhamService implements SanPhamImp{
	@Autowired
	SanPhamDAO sanphamdao;
	
	@Override
	public List<SanPham> laysanphamlimit(int batdau) {
		return sanphamdao.laysanphamlimit(batdau);
		
	}

	@Override
	public SanPham laysanphamtheomasp(int masp) {
		return sanphamdao.laysanphamtheomasp(masp);
	}

}
