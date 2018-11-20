/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdelivery_jr;

import View.Principal;

/**
 *
 * @author jairjunior
 */
public class JDelivery_JR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Principal().setVisible(true);
            }
       });
        
    }
    
}
