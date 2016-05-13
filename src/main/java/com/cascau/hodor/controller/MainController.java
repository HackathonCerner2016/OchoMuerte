/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cascau.hodor.controller;

import com.cascau.hodor.contract.PrepareSongAS;
import com.cascau.hodor.contract.SongRepresentaionResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cascau_neinvinsu
 */
@Controller
public class MainController {
    
    private static final String VIEW_NAME = "main";
    
    private PrepareSongAS prepareSongAS;
    
    @RequestMapping("/")
    public ModelAndView prepareSong() {
        
        final ModelAndView response = new ModelAndView();
        
        final SongRepresentaionResponse song = getPrepareSongAS().prepareSong();
        
        response.addObject("song", song);
        
        response.setViewName(VIEW_NAME);
        return response;
    }

    public void setPrepareSongAS(PrepareSongAS prepareSongAS) {
        this.prepareSongAS = prepareSongAS;
    }

    public PrepareSongAS getPrepareSongAS() {
        return prepareSongAS;
    }
}
