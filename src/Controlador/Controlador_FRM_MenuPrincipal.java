/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Automoviles;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Stephannie
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener{
    
    //Ref
    FRM_Automoviles ventanaAutomoviles;
    
    public Controlador_FRM_MenuPrincipal(){
        ventanaAutomoviles=new FRM_Automoviles();
    }
    
    public void actionPerformed (ActionEvent e){
        if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }
        if(e.getActionCommand().equals("Autos")){
            ventanaAutomoviles.setVisible(true);
        }
    }
    
}
