package com.jdk.springbootws.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("/index1")
    public String toIndex1(HttpServletRequest request){
        request.setAttribute("userId","8888");
        return "index1";
    }

    @RequestMapping("/index2")
    public String toIndex2(HttpServletRequest request){
        request.setAttribute("userId","9999");
        return "index2";
    }
}
