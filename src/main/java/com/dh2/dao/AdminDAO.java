package com.dh2.dao;

import java.util.List;

import com.dh2.entity.Admin;

public interface AdminDAO {
	public void themAdmin(Admin admin);
	public void capNhatAdmin(Admin admin);
	public void xoaAdmin(int id);
	public Admin getAdminTheoId(int id);
	public List<Admin> getAllAdmin();
}
