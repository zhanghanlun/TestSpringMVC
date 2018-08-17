package com.zhanghanlun.action;

import com.zhanghanlun.dao.SignonMapper;
import com.zhanghanlun.dao.StatusMapper;
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

    @Autowired
    private StatusMapper statusMapper;

    @RequestMapping(value = "/signon")
    @ResponseBody
    public Signon getSignon(HttpServletRequest request){
        Signon signon = signonMapper.findSignonByUserId("1011436981");
        signon.setPro(true);
        signon.setNeedSubscribe(false);
        signon.setDs(true);
        return signon;
    }

    @RequestMapping(value = "/status")
    @ResponseBody
    public Status getWhat(HttpServletRequest request){
        Status status= statusMapper.findStatusByUserId("1011436981");
        status.setDs(true);
        status.setPro(true);
        status.setNeedSubscribe(false);
        return status;
    }
}
