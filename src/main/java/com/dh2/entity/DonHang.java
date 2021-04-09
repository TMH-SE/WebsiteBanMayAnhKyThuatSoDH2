package com.dh2.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DonHang implements Serializable{

	private static final long serialVersionUID = -6759054561208025891L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maDonHang;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date ngayLap;
	
	@Column
	private double tongTien;
	
	@Column(columnDefinition="nvarchar(max)")
	private String trangThai;
	
	@ManyToOne
	@JoinColumn(name = "maKhachHang", referencedColumnName = "maKhachHang")
	private KhachHang kh;
	
	@ManyToOne
	@JoinColumn(name = "maAdmin", referencedColumnName = "maAdmin")
	private Admin ad;
	
	@OneToMany(mappedBy = "dh", cascade = CascadeType.ALL)
	private List<ChiTietDonHang> dsCTDH;

	public DonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DonHang(int maDonHang, Date ngayLap, double tongTien, String trangThai, KhachHang kh, Admin ad) {
		super();
		this.maDonHang = maDonHang;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
		this.trangThai = trangThai;
		this.kh = kh;
		this.ad = ad;
	}


	public int getMaDonHang() {
		return maDonHang;
	}

	public void setMaDonHang(int maDonHang) {
		this.maDonHang = maDonHang;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public KhachHang getKh() {
		return kh;
	}

	public void setKh(KhachHang kh) {
		this.kh = kh;
	}

	public Admin getAd() {
		return ad;
	}

	public void setAd(Admin ad) {
		this.ad = ad;
	}

	public List<ChiTietDonHang> getDsCTDH() {
		return dsCTDH;
	}

	public void setDsCTDH(List<ChiTietDonHang> dsCTDH) {
		this.dsCTDH = dsCTDH;
	}
	
	public void themSanPham(SanPham sp, int sl, double tongTien) {
		if(dsCTDH == null){
			dsCTDH = new ArrayList<ChiTietDonHang>();
		}
		dsCTDH.add(new ChiTietDonHang(this, sp, sl, tongTien));
	}
}
