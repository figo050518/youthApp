package com.gzh.youth.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gzh.youth.entity.User;

public interface UserService {

	public Page<User> findPage(String name,Pageable pageable);

	public User findByName(String string);

	public boolean login(String username,String pwd);
}
