
package com.mycompany.relevos;

/**
 *
 * @author johann alejandro torres soler 
 */
public class Principal {
   /**
     *creacion de hilos  ya signacion a los equipos 
     */
    Team equipo1 = new Team("equipo 1", 0, 100);
    Team equipo2 = new Team("equipo 2", 0, 100);
    Team equipo3 = new Team("equipo 3", 0, 100);
    
    participante p1 = new participante(equipo1, 0, 33);
    participante p2 = new participante(equipo2, 0, 33);
    participante p3 = new participante(equipo3, 0, 33);
    participante p4 = new participante(equipo1, 33, 66);
    participante p5 = new participante(equipo2, 33, 66);
    participante p6 = new participante(equipo3, 33, 66);
    participante p7 = new participante(equipo1, 66, 100);
    participante p8 = new participante(equipo2, 66, 100);
    participante p9 = new participante(equipo3, 66, 100);
    /**
     * inciiamos los hilos en esta clase 
     */
    
    public void inciarhilos(){
        p1.start ();

        p2.start ();

        p3.start ();

        p4.start ();

        p5.start ();

        p6.start ();

        p7.start ();

        p8.start ();

        p9.start ();
    }
}