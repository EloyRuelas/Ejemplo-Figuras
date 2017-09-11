/**
 * Esta es una superclase para representar las caracteristicas
 * @autor Eloy Ruelas Santacruz
 * @version 1.0(8-sep-17)
 */

public class Figura
{
    protected float area;
    protected float perimetro;
    
    /**
     * Constructor de la clase Figura.
     */
    public Figura()
    {
        area=0;
        perimetro=0;
    }
    
    /**
     * Calcula el area de la figura.
     */
    public void calcularArea()
    {
        System.out.println("No se calcular el area por que no se de que figura se trata");
    }
    
    /**
     * Imprime el area de la figura.
     */
    public void imprimirArea()
    {
        System.out.println("El area de la figura es: " + area);
    }
    
    /**
     * Calcula el perimetro de la Figura.
     */
    public void calcularPerimetro()
    {
        System.out.println("No se calcular el perimetro por que no se de que figura se trata");
    }
    
    /**
     * Imprime el perimetro de la figura.
     */
    public void imprimirPerimetro()
    {
        System.out.println("El perimetro de la figura es: " + perimetro);
    }
}
