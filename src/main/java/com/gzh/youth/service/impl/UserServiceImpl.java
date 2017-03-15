package com.gzh.youth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gzh.youth.entity.User;
import com.gzh.youth.repository.UserRepository;
import com.gzh.youth.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

	@Override
	public Page<User> findPage(String name,Pageable pageable) {
		return userRepo.findPageByName(name,pageable);
	}

	@Override
	public User findByName(String string) {
		// TODO Auto-generated method stub
		return userRepo.findByName(string);
	}
	@Override
	public boolean login(String username,String pwd){
		int a =  userRepo.findUser(username,pwd);
		return a==1?true:false;
	}

}
