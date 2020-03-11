package aplicacion;

import java.awt.Color;
/**
 * Write a description of class NewCelula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NewCelula extends Celula
{
    private int fila, columna;
    private AutomataCelular ac;

    public NewCelula(AutomataCelular ac,int fila, int columna)
    {
        super(ac,fila,columna);
        this.ac = ac;
        this.fila = fila;
        this.columna = columna;
        color = Color.green;
    }

    @Override
    public void decida(){
        super.decida();

        for(int i=fila-1;i>-1;i--){
            if(ac.getElemento(i,columna)!=null && ac.getElemento(i,columna).isVivo()){
                estadoSiguiente = 'm';
            }
        }
    }

}
