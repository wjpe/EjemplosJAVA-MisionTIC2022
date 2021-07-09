import java.util.Scanner;

public class numeroDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite un numero entero");
        int numero = scan.nextInt();
        int resultado = numeroDigitos(numero);
        System.out.println("Cifras = " + resultado);
        
    }

    public static int numeroDigitos(int numeroD){
        //1990 ---> 4 Cifras
        int cifras = 0;

        while( numeroD !=0){
            numeroD /= 10;
            cifras ++;
        }
        return cifras;
    }
}
