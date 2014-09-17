/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.belajar.java.service;

import com.belajar.java.domain.Produk;
import java.util.List;

/**
 *
 * @author faheem
 */
public interface PosService {
    public void simpan(Produk p);
    public List<Produk> listAll();
    public List<Produk> filter(String s);
}
