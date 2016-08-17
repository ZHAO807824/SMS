package com.sms.dao.admin;

import java.util.List;

import com.sms.entity.admin.Admin;

/**
 * ��̨Dao
 * 
 * @author zhao
 *
 */
public interface IAdminDao {

	/**
	 * ����Admin
	 * 
	 * @param admin
	 */
	public void save(Admin admin);

	/**
	 * �����û�
	 */
	public List<Admin> query();

	/**
	 * ����id��ȡ�û�
	 * 
	 * @param id
	 * @return
	 */
	public Admin queryById(Integer id);
}
