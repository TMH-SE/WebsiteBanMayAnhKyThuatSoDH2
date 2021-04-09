package com.dh2.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KhachHang implements Serializable{
	
	private static final long serialVersionUID = 2307182296382193753L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKhachHang;
	
	@Column(columnDefinition="nvarchar(max)")
	private String hoTen;
	
	@Column(columnDefinition="nvarchar(max)")
	private String gioiTinh;
	
	@Column
	private String soCMND;
	
	@Column(columnDefinition="nvarchar(max)")
	private String diaChi;
	
	@Column
	private String soDienThoai;
	
	@Column
	private String email;
	
	@Column
	private String matKhau;
	
	@Column
	private String role;
	
	@Column
	private boolean quyenTruyCap;
	
	@OneToMany(mappedBy = "kh", cascade = CascadeType.ALL)
	private List<DonHang> dsDonHang;

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHang(int maKhachHang, String hoTen, String gioiTinh, String soCMND, String diaChi, String soDienThoai,
			String email, String matKhau, boolean quyenTruyCap) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.soCMND = soCMND;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.matKhau = matKhau;
		this.role = "ROLE_USER";
		this.quyenTruyCap = quyenTruyCap;
	}

	public int getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public boolean isQuyenTruyCap() {
		return quyenTruyCap;
	}

	public void setQuyenTruyCap(boolean quyenTruyCap) {
		this.quyenTruyCap = quyenTruyCap;
	}

	public List<DonHang> getDsDonHang() {
		return dsDonHang;
	}

	public void setDsDonHang(List<DonHang> dsDonHang) {
		this.dsDonHang = dsDonHang;
	}

	public String getRole() {
		return role;
	}	
}
