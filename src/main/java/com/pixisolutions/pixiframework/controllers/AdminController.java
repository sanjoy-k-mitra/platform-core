package com.pixisolutions.pixiframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sanjoy on 10/2/15.
 */
@Controller
public class AdminController {

    @RequestMapping(value = "/admin")
    public String index() {
        return "admin/index";
    }

}
