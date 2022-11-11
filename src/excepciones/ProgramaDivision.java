package excepciones;
//importacion del paquete escanner para poder introducir variables por consola
import javax.swing.JOptionPane;
//clase principal 
public class ProgramaDivision {
    //definimos las variables que vamos a usar
    public static int n;
    public static int div;
    public static int res;
    //metodo main donde se ejecutara el programa
    public static void main(String[] args) {

        division();

    }
    //metodo donde se encuentra la implementacion del codigo
    public static void division() {
        //metodo try que capturara las excepciones de ser necesario
        try {
            //pedimos los numeros
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite el divisor: "));
            div = Integer.parseInt(JOptionPane.showInputDialog("Digite el dividendo: "));
            res = n / div;
            //creamos la condicion para lanzar la excpecion por restriccion en el tamaño del numero
            if (div < 10) {
                //metodo try para capturar la excepcion
                try {
                    InsufficientValue.numeros();
                } catch (InsufficientValue ex) {
                    //mostramos la excepcion
                    JOptionPane.showMessageDialog(null, "el divisor debe ser mayor a 10");
                }
            }
            //mostramos el resultado de la division
            JOptionPane.showMessageDialog(null, "La division de " + n + " Entre " + div + " es: " + res);
        } catch (ArithmeticException ae) {
            //mostramos la excepcion sobre la division entre cero
            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
        } catch (Exception e) {
            //mostramos la excepcion en caso de que este poniendo letras en un espacio reservado para numeros
            JOptionPane.showMessageDialog(null, "No es un numero, es una cadena de texto");
        }
    }
}
