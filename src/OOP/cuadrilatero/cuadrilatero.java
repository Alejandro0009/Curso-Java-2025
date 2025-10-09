
package cuadrilatero;

public class cuadrilatero {
    private float base;
    private float altura;

    public cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public cuadrilatero(float base) {
        this.base = base;
        this.altura=base;
    }

    public float getPerimetro() {
        float perimetro = 2*(base+altura);
        return perimetro;
    }

    public float getArea() {
        float area = base *altura;
        return area;
    }
    
    
    
    
    
}
