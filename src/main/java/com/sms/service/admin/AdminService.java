package com.sms.service.admin;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.dao.admin.IAdminDao;
import com.sms.entity.admin.Admin;

/**
 * 
 * @author zhao
 *
 */
@Service("adminService")
@Transactional
public class AdminService implements IAdminService{

	@Autowired
	private IAdminDao adminDao;
	
	public void save(Admin admin) {
		adminDao.save(admin);
	}

	public List<Admin> query() {
		return adminDao.query();
	}

	public Admin queryById(Integer id) {
		return adminDao.queryById(id);
	}

}
