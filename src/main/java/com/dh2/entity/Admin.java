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
public class Admin implements Serializable{
	
	private static final long serialVersionUID = -653143961679110329L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maAdmin;
	
	@Column(columnDefinition="nvarchar(max)")
	private String hoTen;
	
	@Column
	private String soCMND;
	
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
	
	@OneToMany(mappedBy = "ad", cascade = CascadeType.ALL)
	private List<DonHang> dsDonHang;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int maAdmin, String hoTen, String soCMND, String soDienThoai, String email, String matKhau, boolean quyenTruyCap) {
		super();
		this.maAdmin = maAdmin;
		this.hoTen = hoTen;
		this.soCMND = soCMND;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.matKhau = matKhau;
		this.role = "ROLE_ADMIN";
		this.quyenTruyCap = quyenTruyCap;
	}

	public int getMaAdmin() {
		return maAdmin;
	}

	public void setMaAdmin(int maAdmin) {
		this.maAdmin = maAdmin;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
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
