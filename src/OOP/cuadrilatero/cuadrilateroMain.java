
package cuadrilatero;

import javax.swing.JOptionPane;

public class cuadrilateroMain {
    public static void main(String[] args) {
        cuadrilatero C1;
        float base,altura;
        
        base= Float.parseFloat(JOptionPane.showInputDialog("Digite el tamaño de la base de la  figura: "));
        altura= Float.parseFloat(JOptionPane.showInputDialog("Digite el tamaño de la altura de la figura: "));
        
        if (base==altura){
            C1= new cuadrilatero(base);
            System.out.println("Es un cuadrado.");
        
        }else{
            C1= new cuadrilatero(base, altura);
            System.out.println("Es un rectangulo");
        
        }
        
        System.out.println("El perimetro es: "+C1.getPerimetro());
        System.out.println("El area es;"+C1.getArea());
    }
    
}
