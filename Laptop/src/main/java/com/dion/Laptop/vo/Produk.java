/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.Laptop.vo;


/**
 *
 * @author Asus
 */
public class Produk {
   
    private String code;
    private String merek;
    private String harga;

    public Produk() {
    }

    public Produk(String code, String merek, String harga) {
        this.code = code;
        this.merek = merek;
        this.harga = harga;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getKode() {
        return merek;
    }

    public void setKode(String merek) {
        this.merek = merek;
    }

    public String getNama() {
        return harga;
    }

    public void setNama(String harga) {
        this.harga = harga;
    }

    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
