import java.util.Scanner;

public class contadorDigitos{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        //System.out.println("Ingres tu nombre");
        //String nombre = scanner.nextLine();
        //System.out.println("Hola " + nombre);
        //System.out.println(saludar(nombre));

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
    }

    public static String saludar(String nombre){
        return "Hola " + nombre;
    }

    public static int calcularDigito(int numero){
        //1990 --> 4 Digitos

        int cifras = 0;
        while (numero != 0){
            numero /= 10;
            cifras++;
        }
        return cifras;
    }
}