package excepciones;
//clase principal
public class ExcepcionCadena {
    //metodo main donde se ejecuta el programa
    public static void main(String[] args) {
        Cadena();
    }
    //metodo Cadena donde evaluara que no se digiten letras en un espacio reservado para un numero y se capturará la excepcion si es necesario
    public static void Cadena() {
        //declaracion de variables
        int numero = 2;
        String cadena = "Holaaaa";
        //funcion try donde que capturará la excepcion
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            //mostrar la excepcion
            System.out.println("No es un numero, es una cadena de texto" +"\n"+ ex.getMessage());
        }
    }
}
