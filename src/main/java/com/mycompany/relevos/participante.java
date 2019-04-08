
/**
 * clase hace movimiento 
 * @author johann alejandro torres soler 
 */
package com.mycompany.relevos;


import java.util.logging.Level;
import java.util.logging.Logger;


public class participante extends Thread {
/**
     * declarar variables
     */
    Team equipo;
    private int posicion;
    private int fin;
    private String equipo1;
    private String equipo2;
    private String equipo3;
    
    /**
     * Constuctor de participante 
     */
    public participante(Team equipo, int posicion, int fin) {
        this.equipo = equipo;
        this.posicion = posicion;
        this.fin = fin;
    }

    /**
     * iniciar hilos
     */
    @Override
    public void run() {
        /**
     * evaluar la posisicon en la que se encuentra el equipo
     */
        if (posicion == 0) {
            while (true) {
                int posicionactual = adelante(1);
                if (posicionactual >= 33) {
                    equipo.setPos1(33);
                    synchronized (equipo) {
                        equipo.notifyAll();
                        posicion = 33;
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(participante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        /**
     * evaluar la posisicon en la que se encuentra el equipo
     */
        if (posicion == 33) {
            while (true) {
                int posicionactual = adelante(2);
                if (posicionactual >= 66) {
                    equipo.setPos2(66);
                    synchronized (equipo) {
                        equipo.notify();
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(participante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        /**
     * evaluar la posisicon en la que se encuentra el equipo
     */
        if (posicion == 66) {
            while (true) {
                int posicionactual = adelante(3);
                if (posicionactual >= 100) {
                    equipo.setPos3(100);
                    



                    
                    System.out.println((char)27 + "[34;43mEL GANADOR ES : "+equipo.getNombre());
                    System.out.println("\033[33m _______________________*____________________: ");
                    System.out.println("\033[33m ____________________*     *____________________: ");
                    System.out.println("\033[33m __________________*         *____________________: ");
                    System.out.println("\033[33m _______________**             **___________________: ");
                    System.out.println("\033[33m _________________*           *____________________: ");
                    System.out.println("\033[32m __________________"+equipo.getNombre()+"__________________:");
                    System.out.println("\033[33m __________________*         *____________________: ");
                    System.out.println("\033[33m _________________*           *____________________: ");
                    System.out.println("\033[33m _______________*               *___________________: ");
                    System.out.println("\033[33m _________________*           *____________________: ");
                    System.out.println("\033[33m ____________________*     *____________________: ");
                    System.out.println("\033[33m _______________________*____________________: ");

                    
                    System.exit(0);
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(participante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    /**
     * metodo dar marcha adelante dependiendo el numero de participante 
     */

    public int adelante(int numparticipante) {
        try {
            Thread.sleep(500);            
        } catch (InterruptedException ex) {
            Logger.getLogger(participante.class.getName()).log(Level.SEVERE, null, ex);
        }
        int valorAvance = Aleatorio.random();
        /**
     * evaluar el participante numero uno de los 3 diferentes equipos
     */
        if (numparticipante == 1) {
            equipo.setPos1(equipo.getPos1() + valorAvance);
            if(equipo.MostrarTransicion().contains("equipo 1")){
                equipo1=equipo.MostrarTransicion();
            }else if(equipo.MostrarTransicion().contains("equipo 2")){
                equipo2=equipo.MostrarTransicion();
            }else if(equipo.MostrarTransicion().contains("equipo 3")){
                equipo3=equipo.MostrarTransicion();
            }
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }            
            return equipo.getPos1();
        }
        /**
     * evaluar el participante numero dos de los 3 diferentes equipos
     */
        if (numparticipante == 2) {
            equipo.setPos2(equipo.getPos2() + valorAvance);
            if(equipo.MostrarTransicion().contains("equipo 1")){
                equipo1=equipo.MostrarTransicion();
            }else if(equipo.MostrarTransicion().contains("equipo 2")){
                equipo2=equipo.MostrarTransicion();
            }else if(equipo.MostrarTransicion().contains("equipo 3")){
                equipo3=equipo.MostrarTransicion();
            }
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }
            return equipo.getPos2();
        }
        /**
     * evaluar el participante numero tres de los 3 diferentes equipos
     */
        if (numparticipante == 3) {
            equipo.setPos3(equipo.getPos3() + valorAvance);
            if(equipo.MostrarTransicion().contains("equipo 1")){
                equipo1=equipo.MostrarTransicion();
            }else if(equipo.MostrarTransicion().contains("equipo 2")){
                equipo2=equipo.MostrarTransicion();
            }else if(equipo.MostrarTransicion().contains("equipo 3")){
                equipo3=equipo.MostrarTransicion();
            }
            if(equipo1!=null){
                System.out.println(equipo1);
            }
            if(equipo3!=null){
                System.out.println(equipo3);
            }
            if(equipo2!=null){
                System.out.println(equipo2);
            }
            
            return equipo.getPos3();
        }
        return 0;
    }
}
