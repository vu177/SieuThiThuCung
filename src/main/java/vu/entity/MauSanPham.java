package vu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="MAUSANPHAM")
public class MauSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MAMAU;
	String TENMAU;
	public int getMAMAU() {
		return MAMAU;
	}
	public void setMAMAU(int mAMAU) {
		MAMAU = mAMAU;
	}
	public String getTENMAU() {
		return TENMAU;
	}
	public void setTENMAU(String tENMAU) {
		TENMAU = tENMAU;
	}
	
}
