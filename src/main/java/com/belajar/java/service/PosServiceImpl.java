/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.belajar.java.service;

import com.belajar.java.dao.ProdukDao;
import com.belajar.java.domain.Produk;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author faheem
 */
@Service
@Transactional
public class PosServiceImpl implements PosService{
    @Autowired
    ProdukDao dao;
    
    public void simpan(Produk p) {
        dao.simpan(p);
    }

    public List<Produk> listAll() {
        return dao.listAll();
    }

    public List<Produk> filter(String s) {
        return dao.filter(s);
    }
    
}
