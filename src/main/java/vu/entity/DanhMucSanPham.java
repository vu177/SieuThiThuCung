package vu.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="DANHMUCSANPHAM")
public class DanhMucSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MADANHMUC;
	String TENDANHMUC;
	String HINHDANHMUC;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="MADANHMUC")
	Set<SanPham> danhsachsanpham;
	
	public int getMADANHMUC() {
		return MADANHMUC;
	}
	public void setMADANHMUC(int mADANHMUC) {
		MADANHMUC = mADANHMUC;
	}
	public String getTENDANHMUC() {
		return TENDANHMUC;
	}
	public void setTENDANHMUC(String tENDANHMUC) {
		TENDANHMUC = tENDANHMUC;
	}
	public String getHINHDANHMUC() {
		return HINHDANHMUC;
	}
	public void setHINHDANHMUC(String hINHDANHMUC) {
		HINHDANHMUC = hINHDANHMUC;
	}
}
