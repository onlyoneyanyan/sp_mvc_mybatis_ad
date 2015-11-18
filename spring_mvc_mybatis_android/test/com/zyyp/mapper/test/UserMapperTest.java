package com.zyyp.mapper.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zyyp.bean.User;
import com.zyyp.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-common.xml")
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSave() {
		User user = new User(1, "24", "admin002");
		userMapper.save(user);
	}

	@Test
	public void testUpdate() {
		User user = new User(3, "23", "admin001");
		userMapper.update(user);
	}

	@Test
	public void testDelete() {
		boolean flag = userMapper.delete(1);
		System.out.println(flag ? "delete success!" : "delete fail!");
	}

	@Test
	public void testFindById() {
		User temp = userMapper.findById(2);
		System.out.println(temp != null ? "login success! " : "login fail!");
	}

	@Test
	public void testFindAll() {
		List<User> datas = userMapper.findAll();
		if (datas == null) {
			return;
		}
		for (User user : datas) {
			System.out.println("user: " + user.toString());
		}
	}

}
