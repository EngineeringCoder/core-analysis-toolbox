package com.kjetillorentzen.CoreAnalysisToolbox.web.controller;

import com.kjetillorentzen.CoreAnalysisToolbox.model.Core;
import com.kjetillorentzen.CoreAnalysisToolbox.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CoreController {

    @Autowired
    private CoreService coreService;

    @RequestMapping(value = "/")
    public String showTestPage(Model model) {

        return "home";
    }

    @RequestMapping(value = "/library")
    public String showLibraryPage(Model model) {

        //List of all cores in DB
        List<Core> cores = coreService.findAll();
        model.addAttribute("cores", cores);

        return "/core/library";
    }

    @RequestMapping(value = "/core-details/{coreId}")
    public String showCoreDetails(@PathVariable Long coreId, Model model) {

        //List of all cores in DB
        List<Core> cores = coreService.findAll();
        if (coreId == null) {
            coreId = 1L;
        }
        Core core = coreService.findById(coreId);
        model.addAttribute("core", core);

        model.addAttribute("cores", cores);
        return "/core/details";
    }

    @RequestMapping(value = "/core-details/{coreId}", method = RequestMethod.POST)
    public String saveCore(@Valid Core core, @PathVariable Long coreId) {

        coreService.save(core);
        return String.format("redirect:/core-details/%s", coreId);
    }
}
