import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HolaQuien {
    public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Por favor digite su nombre: ");
    String nombre = br.readLine();
    System.out.println(nombre);
    } 
}
