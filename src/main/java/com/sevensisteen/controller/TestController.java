package com.sevensisteen.controller;


import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sevensisteen.model.UserInfo;
import com.sevensisteen.service.UserInfoService;

@RestController
public class TestController {

	private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "/getAllUser" ,method = RequestMethod.GET)
    public Map<String, Object> getAllUser( int pageNum, int pageSize,  String username) {
        return userInfoService.getAllUser(pageNum, pageSize, username);
    }
    
    @ResponseBody
    @RequestMapping(value = "/getUserByName/{name}" ,method = RequestMethod.GET)
    public UserInfo getUserByName(@PathVariable String name) {
        return userInfoService.getUserByName(name);
    }
}
