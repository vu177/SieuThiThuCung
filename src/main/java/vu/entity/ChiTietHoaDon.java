package vu.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;

@Entity(name="CHITIETHOADON")
public class ChiTietHoaDon {
	@EmbeddedId
	ChiTietHoaDonId chitiethoadonid;
	int SOLUONG;
	String GIATIEN;
	public ChiTietHoaDonId getChitiethoadonid() {
		return chitiethoadonid;
	}
	public void setChitiethoadonid(ChiTietHoaDonId chitiethoadonid) {
		this.chitiethoadonid = chitiethoadonid;
	}
	public int getSOLUONG() {
		return SOLUONG;
	}
	public void setSOLUONG(int sOLUONG) {
		SOLUONG = sOLUONG;
	}
	public String getGIATIEN() {
		return GIATIEN;
	}
	public void setGIATIEN(String gIATIEN) {
		GIATIEN = gIATIEN;
	}
}
