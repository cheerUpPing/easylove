package com.easylove.controller.user;

import com.alibaba.fastjson.JSON;
import com.easylove.entity.MsgWapper;
import com.easylove.entity.user.Picture;
import com.easylove.entity.user.Register;
import com.easylove.service.user.PictureService;
import com.easylove.service.user.RegisterService;
import com.easylove.service.user.UserService;
import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * 2017/2/8 11:08.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private RegisterService registerService;
    @Autowired
    private PictureService pictureService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public MsgWapper sayHello() {

        userService.sayHello();

        Register register = new Register();
        register.setTel("13088839347");
        register.setEmail("cheerupping@163.com");
        register.setAddTime(new Date());
        register.setLastLoginTime(new Date());
        registerService.insert(register);
        Register register1 = registerService.selectByTel("13088839347");
        PageBounds pageBounds = new PageBounds(1,20, Order.create("add_time","desc"));
        List<Picture> list = pictureService.selectByTelOrEmail("13088839347",null,pageBounds);
        MsgWapper msgWapper = new MsgWapper();
        msgWapper.setData(list);
        System.out.println(JSON.toJSONString(list));
        return msgWapper;
    }
}
