package com.dh2.model;

import com.dh2.entity.SanPham;

public class ChiTietGioHang {
	private int soLuong;
	private double tongTien;
	private SanPham sanPham;
	public ChiTietGioHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ChiTietGioHang(int soLuong, double tongTien, SanPham sanPham) {
		super();
		this.soLuong = soLuong;
		this.tongTien = tongTien;
		this.sanPham = sanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
}
