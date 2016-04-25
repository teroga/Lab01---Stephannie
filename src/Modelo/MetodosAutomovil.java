/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Stephannie
 */
public class MetodosAutomovil {
    
    private ArrayList <Automovil> arrayAutomovil;
    String arregloInfo[]=new String[3];
    
    public MetodosAutomovil(){
        arrayAutomovil=new ArrayList<Automovil>();
    }
    
    public void agregarAutomovil(String info[]){
        Automovil temporal=new Automovil(info[0], info[1], info[2], info[3]);
        arrayAutomovil.add(temporal);
    }
    
        public void probarInfo(){
        for(int contador=0;contador<arrayAutomovil.size();contador++){
            System.out.println(arrayAutomovil.get(contador).getInfo());
        }
    }
    
    public boolean buscarAutomovil(String numeroCodigo){
        boolean encontro=false;
        for(int contador=0;contador<arrayAutomovil.size();contador++){
         if(arrayAutomovil.get(contador).getNumeroCodigo().equals(numeroCodigo)){
                arregloInfo[0]=arrayAutomovil.get(contador).getNombreDueño();
                arregloInfo[1]=arrayAutomovil.get(contador).getCedula();
                arregloInfo[2]=arrayAutomovil.get(contador).getPlaca();
                encontro=true;
            }
        }
        return encontro;
    }
    
    public void modificarAutomovil(String arreglo[]){
        for(int contador=0;contador<arrayAutomovil.size();contador++){
            if(arrayAutomovil.get(contador).getNumeroCodigo().equals(arreglo[0])){
                arrayAutomovil.get(contador).setNombreDueño(arreglo[1]);
                arrayAutomovil.get(contador).setCedula(arreglo[2]);
                arrayAutomovil.get(contador).setPlaca(arreglo[3]);
            }
        }
    }
    
    public void eliminarAutomovil(String arreglo[]){
        for(int contador=0;contador<arrayAutomovil.size();contador++){
            if(arrayAutomovil.get(contador).getNumeroCodigo().equals(arreglo[0])){
                arrayAutomovil.remove(contador);
          }
        }
      }
    
     public String[] getArregloInfo(){
        return this.arregloInfo;
    }
     
     public String mensajeTransaccion(){
         return "La transacción se ha efectuado correctamente";
     }
     
     public String mensajeError(){
         return "No se encontraron los datos, proceda a agregar";
     }
    
    
}//FIN CLASE