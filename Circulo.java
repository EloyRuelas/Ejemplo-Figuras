/**
 * Esta clase representa objetos circulo con un radio.
 * @autor Eloy Ruelas Sanatcruz
 * @version 1.0(8-sep-17)
 */

public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio=unRadio;
    }
    
    @Override       // nos permite saber si estamos sobreescribiendo o no en realidad.
    public void calcularArea()
    {
        area=3.14f * radio; //a un numero con decimales se le pone una f al final para decirle al compilar que es un float
    }
    
}