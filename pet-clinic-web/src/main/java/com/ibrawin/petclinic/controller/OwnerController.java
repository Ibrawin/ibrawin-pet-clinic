package com.ibrawin.petclinic.controller;

import com.ibrawin.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/owners")
    public String owners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners";
    }
}
