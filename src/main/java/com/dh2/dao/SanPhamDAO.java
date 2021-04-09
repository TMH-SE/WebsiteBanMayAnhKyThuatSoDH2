package com.dh2.dao;

import java.util.List;

import com.dh2.entity.SanPham;

public interface SanPhamDAO {
	public void themSanPham(SanPham sanPham);
	public void capNhatSanPham(SanPham sanPham);
	public void xoaSanPham(String id);
	public SanPham getSanPhamByID(String id);
	public List<SanPham> getAllSanPham();
}
