/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Augusto Chissano
 */
public class TesteRufrago {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RufragoPU");
    }

}
