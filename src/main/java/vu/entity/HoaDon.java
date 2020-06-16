package vu.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="HOADON")
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MAHOADON;
	String TENKHACHHANG;
	String SDT;
	boolean TINHTRANG;
	String NGAYLAP;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="MAHOADON")
	Set<ChiTietHoaDon> danhsachchitiethoadon;
	
	public int getMAHOADON() {
		return MAHOADON;
	}
	public void setMAHOADON(int mAHOADON) {
		MAHOADON = mAHOADON;
	}
	public String getTENKHACHHANG() {
		return TENKHACHHANG;
	}
	public void setTENKHACHHANG(String tENKHACHHANG) {
		TENKHACHHANG = tENKHACHHANG;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public boolean isTINHTRANG() {
		return TINHTRANG;
	}
	public void setTINHTRANG(boolean tINHTRANG) {
		TINHTRANG = tINHTRANG;
	}
	public String getNGAYLAP() {
		return NGAYLAP;
	}
	public void setNGAYLAP(String nGAYLAP) {
		NGAYLAP = nGAYLAP;
	}
}
