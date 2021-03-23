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
    
    
  synchronized void bagnomaschi()
  {
      System.out.println("un maschio è entrato");
      try {
          Thread.sleep(2000);  } catch (InterruptedException ex) {
          Logger.getLogger(Bagno.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("un maschio è uscito");
  }
  
    synchronized void bagnofemmine()
  {
      System.out.println("una femmina è entrata");
      try {
          Thread.sleep(2000); } catch (InterruptedException ex) {
          Logger.getLogger(Bagno.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("una femmina è uscita");
  }
}
