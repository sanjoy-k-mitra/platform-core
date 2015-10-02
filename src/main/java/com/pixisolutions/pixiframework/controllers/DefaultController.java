package com.pixisolutions.pixiframework.controllers;

import com.pixisolutions.pixiframework.services.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sanjoy on 9/29/15.
 */
@Controller
public class DefaultController {
    @Autowired
    private DefaultService defaultService;

    @RequestMapping(value = "/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("name", "Sanjoy");
        return modelAndView;
    }

    public String login(){
        return "login";
    }

    public String processLogin(){
        return "login";
    }

    public String adminLogin(){
        return "login";
    }

    public String processAdminLogin(){
        return "login";
    }

    @RequestMapping("/tryAdmin")
    public ModelAndView tryAdmin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/index");
        mv.addObject("name", defaultService.getName());
        return mv;
    }
}
