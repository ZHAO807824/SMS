package com.sms.service.admin;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sms.entity.admin.Admin;
import com.sms.utils.MD5;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-bean.xml","classpath:spring/spring-cache.xml"})
public class AdminServiceTest {

	@Resource(name="adminService")
	private IAdminService adminService;
	
	@Test
	public void testSave() {
		Admin admin=new Admin();
		admin.setName("admin");
		admin.setPassword(MD5.getMD5("admin"));
		
		adminService.save(admin);
	}

	@Test
	public void testQueryById(){
		Admin admin=adminService.queryById(1);
		System.out.println(admin);
	}
	
	@Test
	public void testQuery(){
		List<Admin> admins=adminService.query();
		for (Admin admin : admins) {
			System.out.println(admin);
		}
	}
}
