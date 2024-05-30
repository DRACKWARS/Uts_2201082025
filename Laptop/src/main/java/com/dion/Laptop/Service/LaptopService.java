/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.Laptop.service;

import com.dion.Laptop.entity.Laptop;
import com.dion.Laptop.repository.LaptopRepository;
import com.dion.Laptop.vo.Produk;
import com.dion.Laptop.vo.ResponseTemplate;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Asus
 */
@Service
public class LaptopService {
    @Autowired
    private LaptopRepository LaptopRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public List<Laptop> getAll(){
        return LaptopRepository.findAll();
    }
    
    public void insert(Laptop laptop){
        LaptopRepository.save(laptop);
    }
    

    public Laptop getLaptopById(String code) {
        return LaptopRepository.findById(code).get();
    }
    
    public List<ResponseTemplate> getLaptopWithProdukById(String code){
        List<ResponseTemplate> responseList = new ArrayList<>();
        Laptop laptop = getLaptopById(code);
        Produk produk = restTemplate.getForObject("http://localhost:9004/api/v1/produk/" 
                + laptop.getProdukId(), Produk.class);       
        ResponseTemplate vo = new ResponseTemplate();
        vo.setLaptop(laptop);    
        vo.setProduk(produk);
        responseList.add(vo);
        return responseList;
    }

    public void delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
   
}
