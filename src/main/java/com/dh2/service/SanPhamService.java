package com.dh2.service;

import java.util.List;

import com.dh2.entity.SanPham;

public interface SanPhamService {
	public void themSanPham(SanPham sanPham);
	public void capNhatSanPham(SanPham sanPham);
	public void xoaSanPham(String id);
	public SanPham getSanPhamById(String id);
	public List<SanPham> getAllSanPham();
}
