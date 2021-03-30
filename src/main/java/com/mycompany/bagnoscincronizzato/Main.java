/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bagnoscincronizzato;

/**
 *
 * @author samir pellegrini
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bagno b= new Bagno("uomo");
        Bagno b1= new Bagno("donna");
        
        
      Runnable r1= new Lista(b);
      Runnable r2= new Lista(b1);
      
      
      Thread uomini1=new Thread(r1);
      Thread uomini2=new Thread(r1);
      
      
      Thread donne1=new Thread(r2);
      Thread donne2=new Thread(r2);
      
      uomini1.start();
      uomini2.start();
      
      donne1.start();
      donne2.start();
    }
    
}
