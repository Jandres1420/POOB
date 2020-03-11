package aplicacion;
import java.awt.Color;

public class Barrera implements Elemento
{
    private int x;
    private Color color;
    /**
     * Constructor for objects of class Barrera
     */
    public Barrera(AutomataCelular ac, int fila , int columna)
    {
        ac.setElemento(fila,columna,(Elemento)this);
        color = Color.black;
    }
    
    public final int getForma(){
        return CUADRADA;
    }  
    
    public final Color getColor(){
        return color;
    } 
}
