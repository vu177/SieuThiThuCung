package trangchu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import vu.entity.GioHang;
import vu.service.NhanVienService;

@Controller
@RequestMapping("api/")
@SessionAttributes({"sesdangnhap","giohang"})
public class ApiController {
	@Autowired
	NhanVienService nhanvienservice;	

	
	@GetMapping("KiemTraDangNhap")
	@ResponseBody
	public String KiemTraDangNhap(@RequestParam String TENDANGNHAP, @RequestParam String MATKHAU, ModelMap modelmap) {
		boolean kiemtra=nhanvienservice.KiemTraDangNhap(TENDANGNHAP, MATKHAU);
		
			modelmap.addAttribute("sesdangnhap",TENDANGNHAP);
		
		return ""+kiemtra;
	}
	
	@GetMapping("GioHang")
	@ResponseBody
	public void GioHang(@RequestParam int masp,@RequestParam int masize,@RequestParam int mamau,@RequestParam String tensp,@RequestParam String giatien,@RequestParam String tenmau,@RequestParam String tensize,@RequestParam int soluong,HttpSession httpsession) {
		if(httpsession.getAttribute("giohang")==null) {

		List<GioHang> listgiohang= new ArrayList<>();
		
		GioHang gio = new GioHang();
		gio.setMasp(masp);
		gio.setTensp(tensp);
		gio.setMamau(mamau);
		gio.setTenmau(tenmau);
		gio.setMasize(masize);
		gio.setTensize(tensize);
		gio.setGiatien(giatien);
		gio.setSoluong(1);
		
		listgiohang.add(gio);
		httpsession.setAttribute("giohang", listgiohang);
		List<GioHang> listgio= (List<GioHang>) httpsession.getAttribute("giohang");
		System.out.println(listgio.size());
		}else {
			List<GioHang> listgio= (List<GioHang>) httpsession.getAttribute("giohang");
			int vitri = KiemTraSPDaVaoGio(listgio, masp, masize, mamau, httpsession);
			if(vitri== -1) {
				GioHang gio = new GioHang();
				gio.setMasp(masp);
				gio.setTensp(tensp);
				gio.setMamau(mamau);
				gio.setTenmau(tenmau);
				gio.setMasize(masize);
				gio.setTensize(tensize);
				gio.setGiatien(giatien);
				gio.setSoluong(1);
				
				listgio.add(gio);
			}else {
				int capnhatsoluong= listgio.get(vitri).getSoluong() +1;
				listgio.get(vitri).setSoluong(capnhatsoluong);
			}
		}
		List<GioHang> listgio= (List<GioHang>) httpsession.getAttribute("giohang");
		for (GioHang gioHang : listgio) {
			System.out.println(gioHang.getMasp()+" - "+gioHang.getTenmau()+" - "+gioHang.getSoluong());
		}
	}
	private int KiemTraSPDaVaoGio(List<GioHang> listgio,int masp,int masize, int mamau, HttpSession httpsession) {
		if(httpsession.getAttribute("giohang")!=null) {
			for (int i = 0; i < listgio.size(); i++) {
				if(listgio.get(i).getMasp()==masp && listgio.get(i).getMamau()==mamau && listgio.get(i).getMasize()==masize) {
					return i;
				}
			} 
		}
		
		return -1;
	}
	
	@GetMapping("ThemSoLuongGioHang")
	@ResponseBody
	public String ThemSoLuongGioHang(HttpSession httpSession) {
		if(httpSession.getAttribute("giohang")!=null) {
			List<GioHang> giohang= (List<GioHang>) httpSession.getAttribute("giohang");
			return giohang.size()+"";
			}
		return "";
	}
}
