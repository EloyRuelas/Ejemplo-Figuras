/**
 * Esta clase representa objetos triangulos con base y altura.
 * @autor Eloy Ruelas Sanatcruz
 * @version 1.0(8-sep-17)
 */

public class Triangulo extends Figura
{
    private float base;
    private float altura;
    private float lado3;
    /**
     * Constructor de la clase Triangulo.
     */
    public Triangulo(float unBase, float unAltura, float unLado3)
    {
        base=unBase;
        altura=unAltura;
        lado3=unLado3;
    }
    
    /**
     * Calcula el area de un traingulo.
     */
    @Override       // nos permite saber si estamos sobreescribiendo o no en realidad.
    public void calcularArea()
    {
        area=(base*altura)/2; 
    }
    
    /**
     * Calcula el perimetro de un Triangulo.
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro=base+altura+lado3;
    }
}