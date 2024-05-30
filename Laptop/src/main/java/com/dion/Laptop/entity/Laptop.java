/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.Laptop.entity;

import com.dion.Laptop.vo.ResponseTemplate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
/**
 *
 * @author Asus
 */
@Entity
@Table(name="dblaptop")
public class Laptop {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String merek;
    private int harga;

    public Laptop() {
    }

    public Laptop(String code, String merek, int harga, String tanggal, String status, double total) {
        this.code = code;
        this.merek = merek;
        this.harga = harga;
    }

    public String getId() {
        return code;
    }

    public void setId(String code) {
        this.code = code;
    }

    public String getProdukId() {
        return merek;
    }

    public void setProdukId(String merek) {
        this.merek = merek;
    }

    public int getJumlah() {
        return harga;
    }

    public void setJumlah(int harga) {
        this.harga = harga;
    }


        @Override
    public String toString() {
        return "Laptop{" + "code=" + code + ", merek=" + merek + ", harga=" + harga + "}";
    }

    public List<Laptop> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Laptop getLaptopBycode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<ResponseTemplate> getLaptopWithProdukById(String code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void update(String code, int merek, String harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
