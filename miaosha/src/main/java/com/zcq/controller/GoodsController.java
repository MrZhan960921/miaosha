package com.zcq.controller;


import com.zcq.domain.MiaoshaUser;
import com.zcq.redis.RedisService;
import com.zcq.service.MiaoshaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	MiaoshaUserService userService;
	
	@Autowired
	RedisService redisService;

	/**
	 * 这里引用MiaoshaUser参数，分布式session处理，并且自定义这个参数，免去了每个方法都要获取MiaoshaUser的session
	 * @param model
	 * @param user
	 * @return
	 */
    @RequestMapping("/to_list")
    public String list(Model model, MiaoshaUser user) {
    	model.addAttribute("user", user);
        return "goods_list";
    }
    
}
