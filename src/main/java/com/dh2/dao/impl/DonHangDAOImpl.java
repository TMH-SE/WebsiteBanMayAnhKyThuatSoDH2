package com.dh2.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dh2.dao.DonHangDAO;
import com.dh2.entity.DonHang;

@Repository
@Transactional
public class DonHangDAOImpl implements DonHangDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void themDonHang(DonHang dh) {
		sessionFactory.getCurrentSession().save(dh);
	}

	@Override
	public void capNhatDonHang(DonHang dh) {
		sessionFactory.getCurrentSession().merge(dh);
	}

	@Override
	public void xoaDonHang(int id) {
		sessionFactory.getCurrentSession().delete(getDonHangTheoId(id));
	}

	@Override
	public DonHang getDonHangTheoId(int id) {
		return sessionFactory.getCurrentSession().get(DonHang.class, id);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<DonHang> getAllDonHang() {
		return sessionFactory.getCurrentSession().createCriteria(DonHang.class).list();
	}
}
