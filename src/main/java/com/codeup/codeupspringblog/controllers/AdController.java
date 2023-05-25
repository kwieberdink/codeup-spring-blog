package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AdController {
    private final AdRepository adsDao;

    public AdController(AdRepository adsDao) {
        this.adsDao = adsDao;
    }

    public String adIndex(Model model) {
        model.addAttribute("ads",adsDao.findAll());
        return "ads/index";
    }
}
