package com.zhanghanlun.action;

import com.zhanghanlun.dao.SignonMapper;
import com.zhanghanlun.entity.Signon;
import com.zhanghanlun.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author zhanghanlun
 * @Create 2018-08-13 19:54
 **/
@Controller
public class TestController {
    @Autowired
    private SignonMapper signonMapper;

    @RequestMapping(value = "/signon")
    @ResponseBody
    public Signon getSignon(HttpServletRequest request){
        Signon signon = signonMapper.findSignonByUserId("1011436981");
        return signon;
    }

    @RequestMapping(value = "/status")
    @ResponseBody
    public Status getWhat(HttpServletRequest request){
        Status status= new Status();
        return status;
    }
}
