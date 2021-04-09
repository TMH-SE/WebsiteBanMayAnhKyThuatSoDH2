package com.dh2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh2.dao.SanPhamDAO;
import com.dh2.entity.SanPham;
import com.dh2.service.SanPhamService;

@Service
public class SanPhamServiceImpl implements SanPhamService{
	@Autowired
	SanPhamDAO dao;

	@Override
	public void themSanPham(SanPham sanPham) {
		dao.themSanPham(sanPham);
	}

	@Override
	public void capNhatSanPham(SanPham sanPham) {
		dao.capNhatSanPham(sanPham);
	}

	@Override
	public void xoaSanPham(String id) {
		dao.xoaSanPham(id);
	}

	@Override
	public SanPham getSanPhamById(String id) {
		return dao.getSanPhamByID(id);
	}

	@Override
	public List<SanPham> getAllSanPham() {
		return dao.getAllSanPham();
	}
	
	
}
