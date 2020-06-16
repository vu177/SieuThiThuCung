package vu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vu.dao.DanhMucDAO;
import vu.daoimp.DanhMucImp;
import vu.entity.DanhMucSanPham;
@Service
public class DanhMucService implements DanhMucImp{
	@Autowired
	DanhMucDAO danhmucdao;
	
	@Override
	public List<DanhMucSanPham> danhmuc() {
		return danhmucdao.danhmuc();
	}

}
