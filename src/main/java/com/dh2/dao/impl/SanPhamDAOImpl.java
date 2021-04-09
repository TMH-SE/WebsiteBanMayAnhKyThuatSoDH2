package com.dh2.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dh2.dao.SanPhamDAO;
import com.dh2.entity.SanPham;

@Repository
@Transactional
public class SanPhamDAOImpl implements SanPhamDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void themSanPham(SanPham mayAnh) {
		sessionFactory.getCurrentSession().save(mayAnh);
	}

	@Override
	public void capNhatSanPham(SanPham mayAnh) {
		sessionFactory.getCurrentSession().merge(mayAnh);
	}

	@Override
	public void xoaSanPham(String id) {
		sessionFactory.getCurrentSession().delete(getSanPhamByID(id));
	}

	@Override
	public SanPham getSanPhamByID(String id) {
		return sessionFactory.getCurrentSession().get(SanPham.class, id);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<SanPham> getAllSanPham() {
		return sessionFactory.getCurrentSession().createCriteria(SanPham.class).list();
	}

}
