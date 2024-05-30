/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dion.Laptop.repository;

import com.dion.Laptop.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Asus
 */
@Repository 
public interface LaptopRepository extends JpaRepository<Laptop, String> {

    public Object findByCode(String code);
    
}
