package trangchu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import vu.entity.DanhMucSanPham;
import vu.entity.GioHang;
import vu.entity.SanPham;
import vu.service.DanhMucService;
import vu.service.SanPhamService;

@Controller
@RequestMapping("chitiet")
@SessionAttributes("giohang")
public class ChiTietController {
	@Autowired
	SanPhamService sanphamservice;
	@Autowired
	DanhMucService danhmucservice;
	
	@GetMapping("/{masanpham}")
	public String Default(@PathVariable int masanpham, ModelMap modelmap, HttpSession httpSession) {
		SanPham sp =sanphamservice.laysanphamtheomasp(masanpham);
		List<DanhMucSanPham> listdanhmucsp= danhmucservice.danhmuc();
		
		if(httpSession.getAttribute("giohang")!=null) {
		List<GioHang> giohang= (List<GioHang>) httpSession.getAttribute("giohang");
		modelmap.addAttribute("soluongsp",giohang.size());
		}
		modelmap.addAttribute("sp",sp);
		modelmap.addAttribute("danhmucsp",listdanhmucsp);
		return "chitiett";
	}
} 