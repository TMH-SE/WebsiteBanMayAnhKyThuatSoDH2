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
public class LoaiSanPham implements Serializable{

	private static final long serialVersionUID = 1117251681753402942L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLoai;
	
	@Column(columnDefinition="nvarchar(max)")
	private String tenLoai;
	
	@Column(columnDefinition="nvarchar(max)")
	private String moTa;
	
	@Column
	private boolean trangThai;
	
	@OneToMany(mappedBy = "loai", cascade = CascadeType.ALL)
	private List<SanPham> dsSanPham;

	public LoaiSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoaiSanPham(int maLoai, String tenLoai, String moTa, boolean trangThai) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.moTa = moTa;
		this.trangThai = trangThai;
	}

	public int getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
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

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}
	
}
