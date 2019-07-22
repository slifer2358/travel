package com.baize.controller;

import com.baize.domain.User;
import com.baize.service.IBackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/back/user")
public class BackUserController {
    @Autowired
    private IBackUserService backUserService;
    @RequestMapping(value = "/toLoginPage",method = RequestMethod.GET)
    public ModelAndView toBackLoginPage(String username, String password){
        ModelAndView mav=new ModelAndView();
        User user = backUserService.checkBackLogin(username, password);
        int userType = user.getUserType();
        if (userType==0) {
            mav.setViewName("login");
            return mav;
        }
        if(userType==1){
            mav.setViewName("mp");
            return mav;
        }
        if (userType==2){
            mav.setViewName("jd");
        }
        return mav;
    }
}
