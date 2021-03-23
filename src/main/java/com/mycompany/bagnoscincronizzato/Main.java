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
        Bagno b= new Bagno();
      Runnable r1= new RunnableM(b);
      Runnable r2= new RunnableM(b);
      Runnable r3= new RunnableF(b);
      Runnable r4= new RunnableF(b);
      
      Thread t1=new Thread(r1);
       Thread t3=new Thread(r3);
      Thread t2=new Thread(r2);
      Thread t4=new Thread(r4);
      t1.start();
      t2.start();
      t3.start();
      t4.start();
    }
    
}
