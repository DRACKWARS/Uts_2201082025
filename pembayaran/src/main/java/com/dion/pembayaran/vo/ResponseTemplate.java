/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.pembayaran.vo;

import com.dionpembayaran.entity.Pembayaran;

/**
 *
 * @author Asus
 */
public class ResponseTemplate {
    Pembayaran pembayaran;
    Produk produk;
    Order order;

    public ResponseTemplate() {
    }

    public ResponseTemplate(Pembayaran pembayaran, Produk produk, Order order) {
        this.pembayaran = pembayaran;
        this.produk = produk;
        this.order = order;
    }

    
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }
    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    @Override
    public String toString() {
        return "ResponseTemplate{" + "pembayaran=" + pembayaran + ", produk=" + produk + ", order=" + order + '}';
    }
    
}