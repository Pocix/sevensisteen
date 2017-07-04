package com.sevensisteen.service;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sevensisteen.dao.UserInfoMapper;
import com.sevensisteen.model.UserInfo;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public Map<String, Object> getAllUser(int pageNum, int pageSize, String username){
    	PageHelper.startPage(pageNum, pageSize);
    	Page<UserInfo> uselist = userInfoMapper.getByLoginName(username);
    	Map<String, Object> data = new HashMap<>();
    	data.put("list", uselist.getResult());
    	data.put("count", uselist.getTotal());
    	return data;
    }
    
    public UserInfo getUserByName(String name){
    	return userInfoMapper.getUserByName(name);
    }
}