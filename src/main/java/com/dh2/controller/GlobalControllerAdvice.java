package com.dh2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.dh2.model.GioHang;

@ControllerAdvice
public class GlobalControllerAdvice {
	@ModelAttribute("cartNums")
	public int cartNums(HttpSession session) {
		int cartNums = 0;
		if(session.getAttribute("giohang")!=null) {
			GioHang gh = (GioHang) session.getAttribute("giohang");
			cartNums = gh.getChiTietGioHangs().size();
		}
		return cartNums;
	}
}
