package com.dh2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dh2.entity.SanPham;
import com.dh2.service.SanPhamService;

@Controller
public class WebController {
	
	@Autowired
	SanPhamService spService;
	
	@RequestMapping("/")
	public String home(HttpServletRequest req) {
		List<SanPham> list = spService.getAllSanPham();
		req.setAttribute("sanphams", list);
		return "danhsachsanpham";
	}
	
	@RequestMapping("/danh-sach-san-pham")
	public String danhSachSanPham(HttpServletRequest req) {
		List<SanPham> list = spService.getAllSanPham();
		req.setAttribute("sanphams", list);
		return "danhsachsanpham";
	}
	
	@GetMapping("/chinhsachbaohanh")
	public String chinhSachBaoHanh(Model model) {
		return "chinhsachbaohanh";
	}
	
}
