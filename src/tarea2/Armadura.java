/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;


public abstract class Armadura {
    
   
    
    private int Dureza;
    private String Material;
    
     public void Armadura(int Dureza,String Material){
        this.Dureza = Dureza;
        this.Material = Material;
    }
     

    public int getDureza() {
        return Dureza;
    }

    public void setDureza(int Dureza) {
        this.Dureza = Dureza;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    
    public void imprimir(){
    
    }
    
}
