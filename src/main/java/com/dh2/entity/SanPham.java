package com.dh2.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SanPham implements Serializable{

	private static final long serialVersionUID = 8312750550187320029L;

	@Id
	private String maSanPham;
	
	@Column(columnDefinition="nvarchar(max)")
	private String tenSanPham;
	
	@Column(columnDefinition="nvarchar(max)")
	private double gia;
	
	@Column
	private int namSanXuat;
	
	@Column(columnDefinition="nvarchar(max)")
	private String noiSanXuat;
	
	@Column(columnDefinition="nvarchar(max)")
	private String thuongHieu;
	
	@Column(columnDefinition="nvarchar(max)")
	private String tinhNang;
	
	@Column
	private int thoiGianBaoHanh;
	
	@Column(columnDefinition="nvarchar(max)")
	private String moTa;
	
	@Column
	private String hinhAnh;
	
	@Column
	private boolean trangThai;
	
	@ManyToOne
	@JoinColumn(name = "maLoai", referencedColumnName = "maLoai")
	private LoaiSanPham loai;
	
	@OneToMany(mappedBy = "sp", cascade = CascadeType.ALL)
	private List<ChiTietDonHang> dsCTDH;

	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPham(String maSanPham, String tenSanPham, double gia, int namSanXuat, String noiSanXuat,
			String thuongHieu, String tinhNang, int thoiGianBaoHanh, String moTa, String hinhAnh, boolean trangThai,
			LoaiSanPham loai) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.gia = gia;
		this.namSanXuat = namSanXuat;
		this.noiSanXuat = noiSanXuat;
		this.thuongHieu = thuongHieu;
		this.tinhNang = tinhNang;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.moTa = moTa;
		this.hinhAnh = hinhAnh;
		this.trangThai = trangThai;
		this.loai = loai;
	}

	public String getNoiSanXuat() {
		return noiSanXuat;
	}

	public void setNoiSanXuat(String noiSanXuat) {
		this.noiSanXuat = noiSanXuat;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public String getThuongHieu() {
		return thuongHieu;
	}

	public void setThuongHieu(String thuongHieu) {
		this.thuongHieu = thuongHieu;
	}

	public String getTinhNang() {
		return tinhNang;
	}

	public void setTinhNang(String tinhNang) {
		this.tinhNang = tinhNang;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public LoaiSanPham getLoai() {
		return loai;
	}

	public void setLoai(LoaiSanPham loai) {
		this.loai = loai;
	}

	public List<ChiTietDonHang> getDsCTDH() {
		return dsCTDH;
	}

	public void setDsCTDH(List<ChiTietDonHang> dsCTDH) {
		this.dsCTDH = dsCTDH;
	}
	
}
