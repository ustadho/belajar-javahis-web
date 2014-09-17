/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.belajar.java;

import com.belajar.java.domain.Produk;
import com.belajar.java.service.PosService;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author faheem
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:com/belajar/**/applicationContext.xml")
public class ProdukTest {
    @Autowired
    PosService service;
    
    @Test
    public void simpan(){
        Produk p=new Produk();
        p.setKode("P0002");
        p.setNama("Produk 2");
        p.setHarga(new BigDecimal(20000));
        service.simpan(p);
    }
    
    @Test
    public void tampilkan(){
        List<Produk> list=service.listAll();
        for(Produk p: list){
            System.out.println("-----------------------");
            System.out.println("Kode: "+p.getKode());
            System.out.println("Nama: "+p.getNama());
            System.out.println("Harga: "+p.getHarga());
            System.out.println("-----------------------");
        }
    }
}
