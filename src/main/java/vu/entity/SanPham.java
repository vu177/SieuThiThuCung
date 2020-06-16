package vu.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="SANPHAM")
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MASANPHAM;
	String TENSANPHAM;
	String GIATIEN;
	String MOTA;
	String HINHSANPHAM;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="MASANPHAM")
	Set<ChiTietSanPham> chitietsanpham;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="CHITIETKHUYENMAI",joinColumns = {@JoinColumn(name="MASANPHAM",referencedColumnName = "MASANPHAM")},
	inverseJoinColumns = {@JoinColumn(name="MAKHUYENMAI",referencedColumnName = "MAKHUYENMAI")} )
	Set<KhuyenMai> danhsachkhuyenmai;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MADANHMUC")
	DanhMucSanPham danhmucsanpham;
	
	
	public Set<ChiTietSanPham> getChitietsanpham() {
		return chitietsanpham;
	}
	public void setChitietsanpham(Set<ChiTietSanPham> chitietsanpham) {
		this.chitietsanpham = chitietsanpham;
	}
	public Set<KhuyenMai> getDanhsachkhuyenmai() {
		return danhsachkhuyenmai;
	}
	public void setDanhsachkhuyenmai(Set<KhuyenMai> danhsachkhuyenmai) {
		this.danhsachkhuyenmai = danhsachkhuyenmai;
	}
	public int getMASANPHAM() {
		return MASANPHAM;
	}
	public void setMASANPHAM(int mASANPHAM) {
		MASANPHAM = mASANPHAM;
	}
	public String getTENSANPHAM() {
		return TENSANPHAM;
	}
	public void setTENSANPHAM(String tENSANPHAM) {
		TENSANPHAM = tENSANPHAM;
	}
	public String getGIATIEN() {
		return GIATIEN;
	}
	public void setGIATIEN(String gIATIEN) {
		GIATIEN = gIATIEN;
	}
	public String getMOTA() {
		return MOTA;
	}
	public void setMOTA(String mOTA) {
		MOTA = mOTA;
	}
	public String getHINHSANPHAM() {
		return HINHSANPHAM;
	}
	public void setHINHSANPHAM(String hINHSANPHAM) {
		HINHSANPHAM = hINHSANPHAM;
	}
	public DanhMucSanPham getDanhmucsanpham() {
		return danhmucsanpham;
	}
	public void setDanhmucsanpham(DanhMucSanPham danhmucsanpham) {
		this.danhmucsanpham = danhmucsanpham;
	}
}
