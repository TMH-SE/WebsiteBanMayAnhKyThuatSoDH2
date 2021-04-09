package com.dh2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dh2.entity.SanPham;
import com.dh2.model.ChiTietGioHang;
import com.dh2.model.GioHang;
import com.dh2.service.SanPhamService;

@Controller
public class GioHangController {
	
	@Autowired
	SanPhamService service;
	
	@GetMapping("/them-gio-hang/{maSanPham}")
	public String themGioHang(HttpServletRequest req, @PathVariable(name="maSanPham") String maSanPham, HttpSession session) {
		SanPham sp = service.getSanPhamById(maSanPham);
		if(session.getAttribute("giohang")==null) {
			GioHang gioHang = new GioHang();
			ChiTietGioHang chiTietGioHang = new ChiTietGioHang();
			chiTietGioHang.setSoLuong(1);
			chiTietGioHang.setSanPham(sp);
			chiTietGioHang.setTongTien(sp.getGia());
			List<ChiTietGioHang> list = new ArrayList<ChiTietGioHang>();
			list.add(chiTietGioHang);
			gioHang.setChiTietGioHangs(list);
			session.setAttribute("giohang", gioHang);
			req.setAttribute("gioHang", gioHang);
		} else {
			GioHang gioHang = (GioHang) session.getAttribute("giohang");
			List<ChiTietGioHang> list = gioHang.getChiTietGioHangs();
			boolean flag = false;
			for (ChiTietGioHang ct : list) {
				if(ct.getSanPham().getMaSanPham().equalsIgnoreCase(sp.getMaSanPham())) {
					ct.setSoLuong(ct.getSoLuong()+1);
					ct.setTongTien(sp.getGia()*ct.getSoLuong());
					flag = true;
				}
			}
			if(!flag) {
				ChiTietGioHang chiTietGioHang = new ChiTietGioHang();
				chiTietGioHang.setSoLuong(1);
				chiTietGioHang.setSanPham(sp);
				chiTietGioHang.setTongTien(sp.getGia());
				list.add(chiTietGioHang);
			}
			
			session.setAttribute("giohang", gioHang);
			req.setAttribute("gioHang", gioHang);
		}
	
		return "redirect:/danh-sach-san-pham";
	}
	
	@GetMapping("/gio-hang")
	public String getGioHang(HttpServletRequest req, HttpSession session) {
		if(session.getAttribute("giohang")!=null) {
			GioHang gioHang = (GioHang) session.getAttribute("giohang");
			req.setAttribute("gioHang", gioHang);
		}
		req.setAttribute("chitiet", new ChiTietGioHang());
		return "giohang";
	}
	
	@PostMapping("/cap-nhat-gio-hang/{maSanPham}")
	public String changeQuantity(HttpServletRequest req, HttpSession session, @RequestParam("quantity_update") int quantity, @PathVariable("maSanPham") String maSanPham) {
		SanPham sp = service.getSanPhamById(maSanPham);
		if(session.getAttribute("giohang")!=null) {
			GioHang gioHang = (GioHang) session.getAttribute("giohang");
			List<ChiTietGioHang> list = gioHang.getChiTietGioHangs();
			for (ChiTietGioHang ct : list) {
				if(ct.getSanPham().getMaSanPham().equalsIgnoreCase(maSanPham)) {
					if(quantity==0) {
						list.remove(ct);
						break;
					} else {
						ct.setSoLuong(quantity);
						ct.setTongTien(quantity*sp.getGia());
						break;
					}
				}
			}
			session.setAttribute("giohang", gioHang);
			req.setAttribute("gioHang", gioHang);
		}
		return "redirect:/gio-hang";
	}
}
