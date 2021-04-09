package com.dh2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh2.dao.AdminDAO;
import com.dh2.entity.Admin;
import com.dh2.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminDAO dao;

	@Override
	public void themAdmin(Admin admin) {
		dao.themAdmin(admin);
	}

	@Override
	public void capNhatAdmin(Admin admin) {
		dao.capNhatAdmin(admin);
	}

	@Override
	public void xoaAdmin(int id) {
		dao.xoaAdmin(id);
	}

	@Override
	public Admin getAdminTheoId(int id) {
		return dao.getAdminTheoId(id);
	}

	@Override
	public List<Admin> getAllAdmin() {
		return dao.getAllAdmin();
	}
}
