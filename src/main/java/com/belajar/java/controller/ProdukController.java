/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.belajar.java.controller;

import com.belajar.java.domain.Produk;
import com.belajar.java.service.PosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author faheem
 */
@Controller
public class ProdukController {
    @Autowired
    PosService service;
    
    @RequestMapping("/produk/list")
    public ModelMap listAll(){
        ModelMap mm=new ModelMap();
        mm.addAttribute("produk", service.listAll());
        return mm;
    }
    @RequestMapping("/api/produk/list")
    @ResponseBody
    public List<Produk> apiListAll(){
        return service.listAll();
    }
    
}
