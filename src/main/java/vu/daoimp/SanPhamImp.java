package vu.daoimp;

import java.util.List;

import vu.entity.SanPham;

public interface SanPhamImp {
	List<SanPham> laysanphamlimit(int batdau);
	SanPham laysanphamtheomasp(int masp);
}
