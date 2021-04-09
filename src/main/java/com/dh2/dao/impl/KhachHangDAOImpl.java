package com.dh2.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dh2.dao.KhachHangDAO;
import com.dh2.entity.KhachHang;

@Repository
@Transactional
public class KhachHangDAOImpl implements KhachHangDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void themKhachHang(KhachHang kh) {
		sessionFactory.getCurrentSession().save(kh);
	}

	@Override
	public void capNhatKhachHang(KhachHang kh) {
		sessionFactory.getCurrentSession().merge(kh);
	}

	@Override
	public void xoaKhachHang(int id) {
		sessionFactory.getCurrentSession().delete(getKhachHangTheoId(id));
	}

	@Override
	public KhachHang getKhachHangTheoId(int id) {
		return sessionFactory.getCurrentSession().get(KhachHang.class, id);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<KhachHang> getAllKhachHang() {
		return sessionFactory.getCurrentSession().createCriteria(KhachHang.class).list();
	}
}
