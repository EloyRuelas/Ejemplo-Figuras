/**
 * Esta clase representa objetos circulo con un radio.
 * @autor Eloy Ruelas Sanatcruz
 * @version 1.0(8-sep-17)
 */

public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float unLado)
    {
        lado=unLado;
    }
    
    @Override       // nos permite saber si estamos sobreescribiendo o no en realidad.
    public void calcularArea()
    {
        area=lado*4; 
    }
    
    @Override
    public void calcularPerimetro()
    {
        perimetro=lado*4;
    }
}