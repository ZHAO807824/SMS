package com.sms.entity.admin;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sms.common.BaseEntity;

/**
 * 后台管理用户
 * 
 * @author zhao
 *
 */
@Entity
@Table(name = "admin")
public class Admin extends BaseEntity {
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [ id=" + super.toString() + ",name=" + name + ", password=" + password + "]";
	}

}
