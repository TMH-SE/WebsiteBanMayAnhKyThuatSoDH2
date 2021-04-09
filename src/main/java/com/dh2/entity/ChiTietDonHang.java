package com.dh2.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(CTDonHang_PK.class)
public class ChiTietDonHang implements Serializable{

	private static final long serialVersionUID = 3134736971304484208L;

	@Id
	@ManyToOne
	@JoinColumn(name = "maDonHang", referencedColumnName = "maDonHang")
	private DonHang dh;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maSanPham", referencedColumnName = "maSanPham")
	private SanPham sp;
	
	@Column
	private int soLuong;
	
	@Column
	private double tongTien;

	public ChiTietDonHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChiTietDonHang(DonHang dh, SanPham sp, int soLuong, double tongTien) {
		super();
		this.dh = dh;
		this.sp = sp;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
	}

	public DonHang getDh() {
		return dh;
	}

	public void setDh(DonHang dh) {
		this.dh = dh;
	}

	public SanPham getSp() {
		return sp;
	}

	public void setSp(SanPham sp) {
		this.sp = sp;
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
}
