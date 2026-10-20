import java.util.Scanner;

public class ScannerEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual es tu edad?  ");
        int edad = scanner.nextInt();
        final int EDAD_MINIMA = 18;

      String mensaje;
        if (edad>=EDAD_MINIMA){
            mensaje = "P";
        } else {
            mensaje = "No p";
        }

        mensaje = mensaje + "uedes pasar";

        System.out.println(mensaje);

        scanner.close();

    }

}
