package vu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CHUCVU")
public class ChucVu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MACHUCVU;
	String TENCHUCVU;
	
	public int getMACHUCVU() {
		return MACHUCVU;
	}
	public void setMACHUCVU(int mACHUCVU) {
		MACHUCVU = mACHUCVU;
	}
	public String getTENCHUCVU() {
		return TENCHUCVU;
	}
	public void setTENCHUCVU(String tENCHUCVU) {
		TENCHUCVU = tENCHUCVU;
	}
}
