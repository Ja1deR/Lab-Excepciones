package excepciones;
//clase principal
public class ExcepcionDivision {
    //metodo main donde se ejecuta el programa
    public static void main(String[] args) {
        aritmetico();
    }
    //metodo artmetico que evaluara que no se divida por 0 y se capturará la excepcion de ser necesario
    public static void aritmetico() {
        //declaracion de variables
        int numero = 5, resultado;
        //funcion try que capturará la excepcion
        try {
            resultado = numero / 0;
        } catch (ArithmeticException e) {
            //mostrar excepcion
            System.out.println("No se puede dividir entre 0 "+"\n"+e.getMessage());
        }
    }
}
