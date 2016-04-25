/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosAutomovil;
import Vista.FRM_Automoviles;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephannie
 */
public class Controlador_FRM_Automoviles implements ActionListener {
    
    //Ref
    MetodosAutomovil metodos;
    FRM_Automoviles ventanaAutos;
    
    public Controlador_FRM_Automoviles(FRM_Automoviles ventanaAutos){
        this.ventanaAutos=ventanaAutos;
        metodos=new MetodosAutomovil();
        ventanaAutos.estadoInicial();
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Buscar")){
            System.out.println("Buscar");
            buscar();
            
        }
        
        if(e.getActionCommand().equals("Agregar")){
            System.out.println("Agregar");
            metodos.agregarAutomovil(ventanaAutos.devolverInfo());
            metodos.probarInfo();
            ventanaAutos.habilitarBotones();
            ventanaAutos.deshabilitarAgregar();
            ventanaAutos.limpiarInterfazParaModificar();
            ventanaAutos.deshabilitarAgregar();
            ventanaAutos.deshabilitarNumCodigo();
            ventanaAutos.habilitarNumCodigo();
            ventanaAutos.habilitarBuscar();
            ventanaAutos.estadoInicial();
            JOptionPane.showMessageDialog(null, metodos.mensajeTransaccion());
        }
        
        if(e.getActionCommand().equals("Modificar")){
            System.out.println("Modificar");
            metodos.modificarAutomovil(ventanaAutos.devolverInfo());
            ventanaAutos.limpiarInterfazParaModificar();
            JOptionPane.showMessageDialog(null, metodos.mensajeTransaccion());
            ventanaAutos.habilitarBuscar();
            ventanaAutos.habilitarNumCodigo();
            ventanaAutos.estadoInicial();
        }
        
        if(e.getActionCommand().equals("Eliminar")){
            System.out.println("Eliminar");
            metodos.eliminarAutomovil(ventanaAutos.devolverInfo());
            ventanaAutos.estadoInicial();
            ventanaAutos.limpiarInterfaz();
            ventanaAutos.habilitarNumCodigo();
            JOptionPane.showMessageDialog(null, metodos.mensajeTransaccion());
            ventanaAutos.habilitarBuscar();
            ventanaAutos.habilitarNumCodigo();
        }
    }
    
    public void buscar(){
         if(metodos.buscarAutomovil(ventanaAutos.devolverNumeroCodigo()))
            {
                ventanaAutos.mostrarInfo(metodos.getArregloInfo());
                ventanaAutos.deshabilitarNumCodigo();
                JOptionPane.showMessageDialog(null, metodos.mensajeTransaccion());
                ventanaAutos.deshabilitarBuscar();
                ventanaAutos.habilitarTexto();
                ventanaAutos.habilitarBotones();
                ventanaAutos.deshabilitarAgregar();
                
                
            }
            else
            {
                System.out.println("El estudiante consultado no se encontró");
                ventanaAutos.habilitarBotones();
                ventanaAutos.deshabilitarNumCodigo();
                JOptionPane.showMessageDialog(null, metodos.mensajeError());
                ventanaAutos.habilitarTexto();
                ventanaAutos.deshabilitarNumCodigo();
                ventanaAutos.deshabilitarBuscar();
            }
    }
    
}//Fin CLASE
