package com.dh2.entity;

import java.io.Serializable;

public class CTDonHang_PK implements Serializable{

	private static final long serialVersionUID = 8955408079058741142L;
	
	private int dh;
	private String sp;
	public CTDonHang_PK() {
		super();
	}
	public CTDonHang_PK(int dh, String sp) {
		super();
		this.dh = dh;
		this.sp = sp;
	}
	public int getDh() {
		return dh;
	}
	public void setDh(int dh) {
		this.dh = dh;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dh;
		result = prime * result + ((sp == null) ? 0 : sp.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CTDonHang_PK other = (CTDonHang_PK) obj;
		if (dh != other.dh)
			return false;
		if (sp == null) {
			if (other.sp != null)
				return false;
		} else if (!sp.equals(other.sp))
			return false;
		return true;
	}
}
