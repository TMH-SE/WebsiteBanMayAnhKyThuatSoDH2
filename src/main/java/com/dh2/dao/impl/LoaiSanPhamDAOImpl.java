package com.dh2.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dh2.dao.LoaiSanPhamDAO;
import com.dh2.entity.LoaiSanPham;

@Repository
@Transactional
public class LoaiSanPhamDAOImpl implements LoaiSanPhamDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void themLoaiSanPham(LoaiSanPham loai) {
		sessionFactory.getCurrentSession().save(loai);
	}

	@Override
	public void capNhatLoaiSanPham(LoaiSanPham loai) {
		sessionFactory.getCurrentSession().merge(loai);
	}

	@Override
	public void xoaLoaiSanPham(int id) {
		sessionFactory.getCurrentSession().delete(getLoaiTheoId(id));
	}

	@Override
	public LoaiSanPham getLoaiTheoId(int id) {
		return sessionFactory.getCurrentSession().get(LoaiSanPham.class, id);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<LoaiSanPham> getAllLoaiSanPham() {
		return sessionFactory.getCurrentSession().createCriteria(LoaiSanPham.class).list();
	}

}
