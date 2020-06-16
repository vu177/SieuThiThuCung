package vu.entity;

import java.io.Serializable;

public class ChiTietHoaDonId implements Serializable{
	int MAHOADON;
	int MACHITIETSANPHAM;
	public int getMAHOADON() {
		return MAHOADON;
	}
	public void setMAHOADON(int mAHOADON) {
		MAHOADON = mAHOADON;
	}
	public int getMACHITIETSANPHAM() {
		return MACHITIETSANPHAM;
	}
	public void setMACHITIETSANPHAM(int mACHITIETSANPHAM) {
		MACHITIETSANPHAM = mACHITIETSANPHAM;
	}
}
