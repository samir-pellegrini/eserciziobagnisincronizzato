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
public class Lista implements Runnable {
    Bagno x;
    public Lista(Bagno x)
    {
        this.x=x;
    }
    public void run()
    {
        x.bagnogenerale();
    }
}
