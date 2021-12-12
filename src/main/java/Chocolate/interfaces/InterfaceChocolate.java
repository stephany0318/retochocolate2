/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Chocolate.interfaces;


import Chocolate.modelo.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author STEPHANY BERMUDEZ
 */
public interface InterfaceChocolate extends MongoRepository<Chocolate, String> {
    
}
