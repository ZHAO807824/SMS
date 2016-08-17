package com.sms.dao.admin;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sms.entity.admin.Admin;

/**
 * 
 * @author zhao
 *
 */
@Repository("adminDao")
public class AdminDao implements IAdminDao {

	@Autowired
	private SessionFactory factory;
	
	public void save(Admin admin) {
		factory.getCurrentSession().save(admin);
	}

	@SuppressWarnings("unchecked")
	public List<Admin> query() {
		return (List<Admin>)factory.getCurrentSession().createCriteria(Admin.class).list();
	}

	public Admin queryById(Integer id) {
		return (Admin) factory.getCurrentSession().get(Admin.class, id);
	}
	
	

}
