package excepciones;
//clase principal
public class ExcepcionVector {
    //metodo main donde se ejecuta el programa
    public static void main(String[] args) {
        desborde();
    }
    //metodo desborde, que evaluara la longitud del vector y mostrará la excepcion de ser necesario
    public static void desborde() {
        int v[] = new int[3];
        try {
            for (int i = 0; i < 6; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //mostrar la excepcion 
            System.out.println("Las longitudes no corresponden"+"\n"+e.getMessage());
        }
    }
}