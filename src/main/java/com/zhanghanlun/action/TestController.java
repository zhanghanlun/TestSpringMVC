package com.zhanghanlun.action;

import com.zhanghanlun.entity.Signon;
import com.zhanghanlun.entity.Status;
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

    @RequestMapping(value = "/signon")
    @ResponseBody
    public Signon getSignon(HttpServletRequest request){
        Signon signon = new Signon();
        return signon;
    }

    @RequestMapping(value = "/status")
    @ResponseBody
    public Status getWhat(HttpServletRequest request){
        Status status= new Status();
        return status;
    }
}
