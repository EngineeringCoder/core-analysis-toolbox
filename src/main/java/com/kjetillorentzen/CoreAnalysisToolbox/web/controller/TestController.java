package com.kjetillorentzen.CoreAnalysisToolbox.web.controller;

import com.kjetillorentzen.CoreAnalysisToolbox.model.Core;
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

    @RequestMapping(value = "/core-details")
    public String showCoreDetails(Model model) {
        model.addAttribute("core", new Core());
        return "/core/details";
    }
}
