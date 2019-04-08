
package com.mycompany.relevos;

/**
 *
 * @author johann alejandro torres soler 
 */
public class Team extends Thread {
    
   /**
     * declaracion de variables 
     */
    private String nombre;
  
    private int inicio;
   
    private int fin;
    
    private int pos1;
   
    private int pos2;
    
    private int pos3;
   /**
     * constructor
     */
    public Team(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.pos1 = 0;
        this.pos2 = 33;
        this.pos3 = 66;
    }
    /**
     * ¡metodo que imporme la transicion por consola
     */
    public synchronized String MostrarTransicion() {
        String trayecto = "\033[36m "+nombre+" ";
        for (int i = inicio; i <= fin; i++) {
            if (i == pos1) {
                trayecto += "\033[33mº1º";                    

            } else if (i == pos2) {
                trayecto += "\033[35mº2º";
            } else if (i == pos3) {
                trayecto += "\033[31mº3º";
            } else {
                trayecto += "-";
            }
        }
        
        return trayecto;
        
    }
    /**
     *get y set 
     */
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getInicio() {
        return inicio;
    }
    
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    
    public int getFin() {
        return fin;
    }
    
    public void setFin(int fin) {
        this.fin = fin;
    }
    
    public int getPos1() {
        return pos1;
    }
    
    public void setPos1(int pos1) {
        this.pos1 = pos1;
    }
    
    public int getPos2() {
        return pos2;
    }
    
    public void setPos2(int pos2) {
        this.pos2 = pos2;
    }
    
    public int getPos3() {
        return pos3;
    }
   
    public void setPos3(int pos3) {
        this.pos3 = pos3;
    }
    
    

}
