package com.sms.service.admin;

import java.util.List;

import com.sms.entity.admin.Admin;

/**
 * ��̨ҵ���߼�
 * 
 * @author zhao
 *
 */
public interface IAdminService {

	/**
	 * �����û�
	 * 
	 * @param admin
	 */
	public void save(Admin admin);

	/**
	 * �����û�
	 * 
	 * @return
	 */
	public List<Admin> query();

	/**
	 * ͨ��id��ȡ�û�
	 * 
	 * @param id
	 * @return
	 */
	public Admin queryById(Integer id);
}
