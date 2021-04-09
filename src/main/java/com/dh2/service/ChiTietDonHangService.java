package com.dh2.service;

import java.util.List;

import com.dh2.entity.ChiTietDonHang;

public interface ChiTietDonHangService {
	public void themChiTietDonHang(ChiTietDonHang ct);
	public void capNhatChiTietDonHang(ChiTietDonHang ct);
	public void xoaChiTietDonHang(int id);
	public ChiTietDonHang getChiTietDonHangTheoId(int id);
	public List<ChiTietDonHang> getAllChiTietDonHang();
}
