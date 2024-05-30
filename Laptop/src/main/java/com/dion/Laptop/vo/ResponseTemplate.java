/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.Laptop.vo;

import com.dion.Laptop.entity.Laptop;

/**
 *
 * @author Asus
 */
public class ResponseTemplate {
    Laptop laptop;
    Produk produk;
    
    public ResponseTemplate(){
    }
    
    public ResponseTemplate(Laptop laptop, Produk produk){
        this.laptop = laptop;
        this.produk = produk;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setOrder(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

     @Override
    public String toString() {
        return "ResponseTemplate{" + "produk=" + produk + ", laptop=" + laptop + '}';
    }

    public void setLaptop(Laptop laptop) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
