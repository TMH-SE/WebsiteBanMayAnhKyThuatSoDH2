package com.dh2.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dh2.dao.AdminDAO;
import com.dh2.entity.Admin;

@Repository
@Transactional
public class AdminDAOImpl implements AdminDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void themAdmin(Admin admin) {
		sessionFactory.getCurrentSession().save(admin);
	}

	@Override
	public void capNhatAdmin(Admin admin) {
		sessionFactory.getCurrentSession().merge(admin);
	}

	@Override
	public void xoaAdmin(int id) {
		sessionFactory.getCurrentSession().delete(getAdminTheoId(id));
	}

	@Override
	public Admin getAdminTheoId(int id) {
		return sessionFactory.getCurrentSession().get(Admin.class, id);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Admin> getAllAdmin() {
		return sessionFactory.getCurrentSession().createCriteria(Admin.class).list();
	}

}
