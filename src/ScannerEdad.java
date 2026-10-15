import java.util.Scanner;

public class ScannerEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual es tu edad?  ");

        int edad = scanner.nextInt();
        final int EDAD_MINIMA = 18;

        String valoracion = "Eres " + (edad>=EDAD_MINIMA?"mayor":"menor") + " de edad ";

        System.out.print(valoracion);

        scanner.close();

    }
    
}
