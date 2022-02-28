/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Fernando
 */
public class Botas extends Armadura{


   
    
    
    @Override
    public void imprimir(){
        System.out.println("Botas");
        System.out.println("Material: " + getMaterial());
        System.out.println("Dureza: " + getDureza());
    }
    
}
