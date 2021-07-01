import java.util.Scanner;

import javax.swing.text.TabExpander;

public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su Nombre: ");
        
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre);
    }
    
}
