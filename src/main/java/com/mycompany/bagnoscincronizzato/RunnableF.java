package com.mycompany.bagnoscincronizzato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class RunnableF implements Runnable{
    
      Bagno x;
    public RunnableF(Bagno x)
    {
        this.x=x;
    }
    public void run()
    {
       x.bagnofemmine();
              
    }
}
