/**
 * Esta clase representa objetos circulo con un radio.
 * @autor Eloy Ruelas Sanatcruz
 * @version 1.0(8-sep-17)
 */

public class Triangulo extends Figura
{
    private float base;
    private float altura;
    private float lado3;
   
    public Triangulo(float unBase, float unAltura, float unLado3)
    {
        base=unBase;
        altura=unAltura;
        lado3=unLado3;
    }
    
    @Override       // nos permite saber si estamos sobreescribiendo o no en realidad.
    public void calcularArea()
    {
        area=(base*altura)/2; 
    }
    
    @Override
    public void calcularPerimetro()
    {
        perimetro=base+altura+lado3;
    }
}