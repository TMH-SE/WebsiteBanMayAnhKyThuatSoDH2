package com.dh2.service;

import java.util.List;

import com.dh2.entity.LoaiSanPham;

public interface LoaiSanPhamService {
	public void themLoaiSanPham(LoaiSanPham loai);
	public void capNhatLoaiSanPham(LoaiSanPham loai);
	public void xoaLoaiSanPham(int id);
	public LoaiSanPham getLoaiTheoId(int id);
	public List<LoaiSanPham> getAllLoaiSanPham();
}
