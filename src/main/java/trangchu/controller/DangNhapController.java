package trangchu.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import vu.entity.NhanVien;
import vu.service.NhanVienService;

@Controller
@RequestMapping("dangnhap")
public class DangNhapController {
	@Autowired
	NhanVienService nhanvienservice;
	@GetMapping
	public String Default() {
		
		return "dangnhap";
	}
	
	@PostMapping
	public String DangKy(@RequestParam String EMAIL,@RequestParam String TENDANGNHAP, @RequestParam String MATKHAU, @RequestParam String NHAPLAIMATKHAU, ModelMap modelmap) {
		boolean checkemail=validate(EMAIL);
		if(checkemail) {
			if(TENDANGNHAP.length()>0) {
				if(MATKHAU.equals(NHAPLAIMATKHAU)) {
					NhanVien nhanvien=new NhanVien();
					nhanvien.setEMAIL(EMAIL);
					nhanvien.setTENDANGNHAP(TENDANGNHAP);
					nhanvien.setMATKHAU(MATKHAU);
					
					boolean checkThemNV =nhanvienservice.ThemNhanVien(nhanvien);
					if(checkThemNV) {
						modelmap.addAttribute("kiemtradangnhap","Tạo tài khoản thành công!");
					}else {
						modelmap.addAttribute("kiemtradangnhap","Tạo tài khoản thất bại!");
					}
				}else {
					modelmap.addAttribute("kiemtradangnhap","Mật khẩu không trùng khớp!");
				}
			}else {
				modelmap.addAttribute("kiemtradangnhap","Vui lòng điền tên đăng nhập!");
			}
			
		}else {
			modelmap.addAttribute("kiemtradangnhap","Vui lòng nhập đúng định dạng email!");
		}
		return "dangnhap";
	}
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		return matcher.find();
	}
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	@PostMapping
//	@Transactional
//	public String XuLyDangNhap(@RequestParam String TENDANGNHAP, @RequestParam String MATKHAU, ModelMap modelmap) {
//		Session session=sessionFactory.getCurrentSession();
//		try {
//			NhanVien nhanvien=(NhanVien) session.createQuery("from NHANVIEN WHERE TENDANGNHAP='"+TENDANGNHAP+"' AND MATKHAU='"+MATKHAU+"'").getSingleResult();
//			if(nhanvien != null) {
//				System.out.println("Dang nhap thanh cong!");
//			}
//		} catch (Exception e) {
//			System.out.println("Dang nhap that bai!");
//		}
//		
//		return "dangnhap";
//	}
}
