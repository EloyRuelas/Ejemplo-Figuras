/**
 * Esta clase representa objetos cuadrado con un lado igual para todos los demas lados.
 * @autor Eloy Ruelas Sanatcruz
 * @version 1.0(8-sep-17)
 */

public class Cuadrado extends Figura
{
    private float lado;
    
    /**
     * Constructor de la clase Cuadrado.
     */
    public Cuadrado(float unLado)
    {
        lado=unLado;
    }
    
    /**
     * Calcula el area del Cuadrado.
     */
    @Override       // nos permite saber si estamos sobreescribiendo o no en realidad.
    public void calcularArea()
    {
        area=lado*4; 
    }
    
    /**
     * Calcula el perimetro del Cuadrado.
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro=lado*4;
    }
}