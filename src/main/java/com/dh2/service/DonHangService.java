package com.dh2.service;

import java.util.List;

import com.dh2.entity.DonHang;

public interface DonHangService {
	public void themDonHang(DonHang dh);
	public void capNhatDonHang(DonHang dh);
	public void xoaDonHang(int id);
	public DonHang getDonHangTheoId(int id);
	public List<DonHang> getAllDonHang();
}
