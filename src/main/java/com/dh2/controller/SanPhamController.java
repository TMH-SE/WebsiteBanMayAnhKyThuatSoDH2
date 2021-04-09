package com.dh2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dh2.entity.SanPham;
import com.dh2.service.SanPhamService;

@Controller
public class SanPhamController {
	
	@Autowired
	SanPhamService spService;
	
	@RequestMapping("/sanpham/{maSanPham}")
	public String chiTietSanPham(HttpServletRequest req, @PathVariable(name="maSanPham") String maSanPham) {
		SanPham sp = spService.getSanPhamById(maSanPham);
		req.setAttribute("sanpham", sp);
		return "chitietsanpham";
	}
}
