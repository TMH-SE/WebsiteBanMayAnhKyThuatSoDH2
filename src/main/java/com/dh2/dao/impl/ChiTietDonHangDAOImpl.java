package com.dh2.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dh2.dao.ChiTietDonHangDAO;
import com.dh2.entity.ChiTietDonHang;

@Repository
@Transactional
public class ChiTietDonHangDAOImpl implements ChiTietDonHangDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void themChiTietDonHang(ChiTietDonHang ct) {
		sessionFactory.getCurrentSession().save(ct);
	}

	@Override
	public void capNhatChiTietDonHang(ChiTietDonHang ct) {
		sessionFactory.getCurrentSession().merge(ct);
	}

	@Override
	public void xoaChiTietDonHang(int id) {
		sessionFactory.getCurrentSession().delete(getChiTietDonHangTheoId(id));
	}

	@Override
	public ChiTietDonHang getChiTietDonHangTheoId(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(ChiTietDonHang.class, id);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ChiTietDonHang> getAllChiTietDonHang() {
		return sessionFactory.getCurrentSession().createCriteria(ChiTietDonHang.class).list();
	}

}
