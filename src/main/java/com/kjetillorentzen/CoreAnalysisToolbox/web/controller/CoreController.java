package com.kjetillorentzen.CoreAnalysisToolbox.web.controller;

import com.kjetillorentzen.CoreAnalysisToolbox.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CoreController {

    @Autowired
    private CoreService coreService;


}
