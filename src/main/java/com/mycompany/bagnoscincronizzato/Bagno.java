/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bagnoscincronizzato;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samir pellegrini
 */
public class Bagno {
    
    private String tipo;
    
    public Bagno(String tipo)
    {
        this.tipo=tipo;
    }
  synchronized void bagnogenerale()
  {
      if(tipo.equals("uomo"))
      {
          
      
      System.out.println("un "+ tipo+ " è entrato");
      try {
          Thread.sleep(3000);  } catch (InterruptedException ex) {
          Logger.getLogger(Bagno.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("un "+tipo+" è uscito");
  }
  else
      {
           System.out.println("una "+ tipo+ " è entrata");
      try {
          Thread.sleep(3000);  } catch (InterruptedException ex) {
          Logger.getLogger(Bagno.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("una "+tipo+" è uscita");
      }
 
}
}