package com.zcq.service;


import com.zcq.dao.MiaoshaUserDao;
import com.zcq.domain.MiaoshaUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class MiaoshaUserService {
	
	
	public static final String COOKI_NAME_TOKEN = "token";
	
	@Autowired
	MiaoshaUserDao miaoshaUserDao;

	
	public MiaoshaUser getById(long id) {
		return miaoshaUserDao.getById(id);
	}




}
