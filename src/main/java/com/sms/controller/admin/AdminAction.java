package com.sms.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.sms.entity.admin.Admin;
import com.sms.service.admin.IAdminService;

/**
 * 后台管理员控制器
 * 
 * @author zhao
 *
 */
public class AdminAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(AdminAction.class);

	@Autowired
	private IAdminService adminService;

	@Override
	public String execute() throws Exception {
		Admin admin=adminService.queryById(1);
		logger.info(admin.getName());
		return SUCCESS;
	}

}
