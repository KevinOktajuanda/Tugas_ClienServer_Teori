/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kevin.kevinbelajarspringdasar;

import com.kevin.kevinbelajarspringdasar.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author ASUS
 */
@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
    
}
