import java.util.Scanner;

public class ScannerEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cual es tu edad?  ");

        int edad = sc.nextInt();
        final int EDAD_MINIMA = 18;

        String valoracion = "Eres " + (edad>=EDAD_MINIMA?"mayor":"menor") + " de edad ";

        System.out.print(valoracion);

        if (edad>=EDAD_MINIMA){
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }

        sc.close();

    }

}
