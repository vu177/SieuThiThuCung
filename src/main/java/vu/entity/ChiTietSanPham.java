package vu.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="CHITIETSANPHAM")
public class ChiTietSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MACHITIETSANPHAM;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MASANPHAM")
	SanPham sanpham;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MASIZE")
	SizeSanPham sizesanpham;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MAMAU")
	MauSanPham mausanpham;
	int SOLUONG;
	String NGAYNHAP;
	public int getMACHITIETSANPHAM() {
		return MACHITIETSANPHAM;
	}
	public void setMACHITIETSANPHAM(int mACHITIETSANPHAM) {
		MACHITIETSANPHAM = mACHITIETSANPHAM;
	}
	public SanPham getSanpham() {
		return sanpham;
	}
	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}
	public SizeSanPham getSizesanpham() {
		return sizesanpham;
	}
	public void setSizesanpham(SizeSanPham sizesanpham) {
		this.sizesanpham = sizesanpham;
	}
	public MauSanPham getMausanpham() {
		return mausanpham;
	}
	public void setMausanpham(MauSanPham mausanpham) {
		this.mausanpham = mausanpham;
	}
	
	public int getSOLUONG() {
		return SOLUONG;
	}
	public void setSOLUONG(int sOLUONG) {
		SOLUONG = sOLUONG;
	}
	public String getNGAYNHAP() {
		return NGAYNHAP;
	}
	public void setNGAYNHAP(String nGAYNHAP) {
		NGAYNHAP = nGAYNHAP;
	}
	
}
