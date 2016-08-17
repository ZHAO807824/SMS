package com.sms.service.admin;

import java.util.List;

import com.sms.entity.admin.Admin;

/**
 * 后台业务逻辑
 * 
 * @author zhao
 *
 */
public interface IAdminService {

	/**
	 * 保存用户
	 * 
	 * @param admin
	 */
	public void save(Admin admin);

	/**
	 * 遍历用户
	 * 
	 * @return
	 */
	public List<Admin> query();

	/**
	 * 通过id获取用户
	 * 
	 * @param id
	 * @return
	 */
	public Admin queryById(Integer id);
}
