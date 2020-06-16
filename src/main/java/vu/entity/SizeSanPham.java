package vu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="SIZESANPHAM")
public class SizeSanPham {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int MASIZE;
	String SIZE;
	public int getMASIZE() {
		return MASIZE;
	}
	public void setMASIZE(int mASIZE) {
		MASIZE = mASIZE;
	}
	public String getSIZE() {
		return SIZE;
	}
	public void setSIZE(String sIZE) {
		SIZE = sIZE;
	}
	
	
}
