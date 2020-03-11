package aplicacion;

import java.util.*;
import java.awt.Color;
public class AutomataCelular{
    static private int LONGITUD=20;
    private Elemento[][] automata;
    public AutomataCelular() {
        automata=new Elemento[LONGITUD][LONGITUD];
        for (int f=0;f<LONGITUD;f++){
            for (int c=0;c<LONGITUD;c++){
                automata[f][c]=null;
            }
        }
        algunosElementos();
    }

    public int  getLongitud(){
        return LONGITUD;
    }

    public Elemento getElemento(int f,int c){
        return automata[f][c];
    }

    public void setElemento(int f, int c, Elemento nueva){
        automata[f][c]=nueva;
    }

    public void algunosElementos(){
        Elemento indiana = new Celula(this,1,1);
        Elemento OO7 = new Celula(this,2,2);
        Elemento marx = new Izquierdosa(this,3,10);
        Elemento hegel = new Izquierdosa(this,3,0);
        Elemento noreste = new Barrera(this,0,18);
        Elemento suroeste = new Barrera(this,19,0);
        Elemento Andres = new NewCelula(this,4,9);
        Elemento Ana = new NewCelula(this,3,9);
        Elemento Ana1 = new NewCelula(this,5,9);
        Elemento Ana2 = new NewCelula(this,5,10);
        Elemento Ana3 = new NewCelula(this,7,9);
        Elemento indiana1 = new Celula(this,6,3);
        Elemento OO71 = new Celula(this,6,4);
        Elemento indiana2 = new Celula(this,6,2);
        Elemento OO72 = new Celula(this,6,1);
         Elemento Andres1 = new NewCelula(this,5,1);
          Elemento Andres3 = new NewCelula(this,2,9);
    }

    public void ticTac(){
        for (int f=0;f<LONGITUD;f++){
            for (int c=0;c<LONGITUD;c++){
                if(automata[c][f] !=null){
                    automata[c][f].cambie();
                    automata[c][f].decida();                                        
                }
            }
        }
    }
}
