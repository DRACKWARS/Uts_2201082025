/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.Laptop.Controller;

import com.dion.Laptop.entity.Laptop;
import com.dion.Laptop.service.LaptopService;
import com.dion.Laptop.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Asus
 */
@RestController
@RequestMapping("api/v1/order")
public class LaptopController {

    @Autowired
    private Laptop laptop;

    @GetMapping
    public List<Laptop> getAll() {
        return laptop.getAll();
    }

    @GetMapping(path = "{code}")
    public Laptop getLaptopById(@PathVariable("code") String code) {
        return laptop.getLaptopBycode(code);
    }
    
    @GetMapping(path = "/produk/{code}")
    public List<ResponseTemplate> getLaptopWithProdukById(@PathVariable("code") String code) {
        return laptop.getLaptopWithProdukById(code);
    }
    
    @PutMapping(path = "{code}")
    public void updateLaptop(@PathVariable ("code") String code,
            @RequestParam(required = false) int merek,
            @RequestParam(required = false) String harga
            
    ){
        laptop.update(code, merek, harga);
    }
            
}
