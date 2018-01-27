package com.kjetillorentzen.CoreAnalysisToolbox.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String showTestPage(Model model) {

        return "home";
    }

    @RequestMapping(value = "/library")
    public String showLibraryPage(Model model) {

        return "/core/library";
    }
}
