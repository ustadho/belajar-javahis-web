/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.belajar.java.dao;

import com.belajar.java.domain.Produk;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author faheem
 */
@Repository
public class ProdukDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public void simpan(Produk p){
        sessionFactory.getCurrentSession().save(p);
    }
    
    public List<Produk> listAll(){
        return sessionFactory.getCurrentSession().createQuery("from Produk p ")
                .list();
    }
    public List<Produk> filter(String s){
        return sessionFactory.getCurrentSession().createQuery("from Produk p "
                + "where p.kode='"+s+"'")
                .list();
    }
}
