/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kevin.kevinbelajarspringdasar.client;

import lombok.Data;

/**
 *
 * @author ASUS
 */
@Data
public class PaymentGatewayClient {
    
    private String endpoint;
    
    private String publicKey;
    
    private String privateKey;
}
