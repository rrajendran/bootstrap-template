package com.capella.mvc.example.controllers;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    private static final Logger LOGGER = LoggerFactory
                    .getLogger(PageController.class);

    public PageController() {

    }

    @RequestMapping(value = { "/{pageName}" })
    public ModelAndView handleRequest(HttpServletRequest request, @PathVariable("pageName")  String pageName) throws Exception {
        ModelAndView modelAndView = new ModelAndView(pageName);
        modelAndView.addObject("dateTime", LocalDateTime.now());
        modelAndView.addObject("pageTitle", pageName.toUpperCase());
        modelAndView.addObject("menus", getMenus());
        return modelAndView;
    }

    public Map<String, String> getMenus() {
        Map<String, String> menus = new HashMap<>();
        menus.put("Template", "template.html");
        return menus;
    }
}