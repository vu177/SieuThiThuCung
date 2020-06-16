package vu.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="KHUYENMAI")
public class KhuyenMai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MAKHUYENMAI;
	String TENKHUYENMAI;
	String THOIGIANBATDAU;
	String THOIGIANKETTHUC;
	String MOTA;
	String HINHKHUYENMAI;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="CHITIETKHUYENMAI",joinColumns = {@JoinColumn(name="MAKHUYENMAI",referencedColumnName = "MAKHUYENMAI")},
	inverseJoinColumns = {@JoinColumn(name="MASANPHAM",referencedColumnName = "MASANPHAM")} )
	Set<SanPham> danhsachsanpham;

	public int getMAKHUYENMAI() {
		return MAKHUYENMAI;
	}

	public void setMAKHUYENMAI(int mAKHUYENMAI) {
		MAKHUYENMAI = mAKHUYENMAI;
	}

	public String getTENKHUYENMAI() {
		return TENKHUYENMAI;
	}

	public void setTENKHUYENMAI(String tENKHUYENMAI) {
		TENKHUYENMAI = tENKHUYENMAI;
	}

	public String getTHOIGIANBATDAU() {
		return THOIGIANBATDAU;
	}

	public void setTHOIGIANBATDAU(String tHOIGIANBATDAU) {
		THOIGIANBATDAU = tHOIGIANBATDAU;
	}

	public String getTHOIGIANKETTHUC() {
		return THOIGIANKETTHUC;
	}

	public void setTHOIGIANKETTHUC(String tHOIGIANKETTHUC) {
		THOIGIANKETTHUC = tHOIGIANKETTHUC;
	}

	public String getMOTA() {
		return MOTA;
	}

	public void setMOTA(String mOTA) {
		MOTA = mOTA;
	}

	public String getHINHKHUYENMAI() {
		return HINHKHUYENMAI;
	}

	public void setHINHKHUYENMAI(String hINHKHUYENMAI) {
		HINHKHUYENMAI = hINHKHUYENMAI;
	}

	public Set<SanPham> getDanhsachsanpham() {
		return danhsachsanpham;
	}

	public void setDanhsachsanpham(Set<SanPham> danhsachsanpham) {
		this.danhsachsanpham = danhsachsanpham;
	}
	
}
