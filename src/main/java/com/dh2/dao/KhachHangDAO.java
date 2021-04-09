package com.dh2.dao;

import java.util.List;

import com.dh2.entity.KhachHang;

public interface KhachHangDAO {
	public void themKhachHang(KhachHang kh);
	public void capNhatKhachHang(KhachHang kh);
	public void xoaKhachHang(int id);
	public KhachHang getKhachHangTheoId(int id);
	public List<KhachHang> getAllKhachHang();
}
