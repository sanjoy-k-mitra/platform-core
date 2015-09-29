package com.pixisolutions.pixiframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sanjoy on 9/29/15.
 */
@Controller
public class DefaultController {
    @RequestMapping(value = "/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("name", "Sanjoy");
        return modelAndView;
    }
}
