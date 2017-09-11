/**
 * Esta clase representa objetos circulo con un radio.
 * @autor Eloy Ruelas Sanatcruz
 * @version 1.0(8-sep-17)
 */

public class Circulo extends Figura
{
    private float radio;
    
    /**
     * Constructor de la clase Circulo.
     */
    public Circulo(float unRadio)
    {
        radio=unRadio;
    }
    
    /**
     * Calcula el area del Circulo.
     */
    @Override       // nos permite saber si estamos sobreescribiendo o no en realidad.
    public void calcularArea()
    {
        area=3.14f * radio; //a un numero con decimales se le pone una f al final para decirle al compilar que es un float
    }
    
    /**
     * Calcula el perimetro del Circulo.
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro=(3.14f*2)*radio;
    }
}