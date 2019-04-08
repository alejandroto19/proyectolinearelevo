
package com.mycompany.relevos;

/**
 *
 * @author johann alejandro torres soler 
 */
public class Aleatorio {
    
    /**
     * esta clase nos da un numero aleatorio que son los que hacen posible
     * que los participantes avancen 
     * 
     */
    public static int random(){
        double num=Math.random()*100;
        int num1=(int) num;
        if(num1<25){
            num1=0;
        }
        else if(num1>=25&&num1<50){
            num1=1;
        }
        else if(num1>=50&&num1<75){
            num1=2;
        }
        else if(num1>=75){
            num1=3;
        }
        return num1;
    }
    
}
