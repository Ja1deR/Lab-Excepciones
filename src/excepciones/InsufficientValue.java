package excepciones;
//clase que heredara de "exception" para poder crear nuestra propia excepcion
public class InsufficientValue extends Exception {
    //metodo main donde se genera la excepcion
    public static void numeros() throws InsufficientValue {

        throw new InsufficientValue();
        
    }
}
