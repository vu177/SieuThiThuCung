package trangchu.controller;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import vu.entity.SanPham;
import vu.service.SanPhamService;


@Controller
@RequestMapping("/")
public class TrangChuController {	
	
	@Autowired
	SanPhamService sanphamservice;
	
	@GetMapping
	@Transactional
	public String Default(@SessionAttribute("sesdangnhap") String sesdangnhap, ModelMap modelmap, HttpSession httpSession) {
		if(httpSession.getAttribute("sesdangnhap")!=null) {
			String ten=(String) httpSession.getAttribute("sesdangnhap");
			String chucaidau=ten.substring(0,1);
			modelmap.addAttribute("chucaidau", chucaidau);
		}
		
		List<SanPham> listsp= sanphamservice.laysanphamlimit(1);
			modelmap.addAttribute("listsp",listsp);
		return "trangchu";
	}
	
//	@PostMapping
//	@Transactional
//	public String ThemNV(@RequestParam String tenNhanVien, @RequestParam int tuoi) {
//		Session session= sessionFactory.getCurrentSession();
//		NhanVien nhanvien=new NhanVien(tenNhanVien, tuoi);
//		session.save(nhanvien);
//		return "trangchu";
//	}
}