package com.sms.dao.admin;

import java.util.List;

import com.sms.entity.admin.Admin;

/**
 * 后台Dao
 * 
 * @author zhao
 *
 */
public interface IAdminDao {

	/**
	 * 保存Admin
	 * 
	 * @param admin
	 */
	public void save(Admin admin);

	/**
	 * 遍历用户
	 */
	public List<Admin> query();

	/**
	 * 根据id获取用户
	 * 
	 * @param id
	 * @return
	 */
	public Admin queryById(Integer id);
}
