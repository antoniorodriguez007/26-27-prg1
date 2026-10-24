package reto002.src;

import java.util.Scanner;

public class CajeroEuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Bienvenido al pago de tasas!");
        System.out.println("Ingrese la cantidad que debe...");
        int debe = scanner.nextInt();

        System.out.println("Ingrese la cantidad que paga...");
        int paga = scanner.nextInt();

        final int CAMBIO = paga - debe;
        int resto = CAMBIO;

        final int BILLETE100 = 100;
        int billete100 = resto / BILLETE100;
        resto = resto % BILLETE100;

        final int BILLETE50 = 50;
        int billete50 = resto / BILLETE50;
        resto = resto % BILLETE50;

        final int BILLETE20 = 20;
        int billete20 = resto / BILLETE20;
        resto = resto % BILLETE20;

        final int BILLETE10 = 10;
        int billete10 = resto / BILLETE10;
        resto = resto % BILLETE10;

        final int BILLETE5 = 5;
        int billete5 = resto / BILLETE5;
        resto = resto % BILLETE5;

        final int MONEDA2 = 2;
        int moneda2 = resto / MONEDA2;
        resto = resto % MONEDA2;

        final int MONEDA1 = 1;
        int moneda1 = resto / MONEDA1;
        resto = resto % MONEDA1;

        System.out.println("Billetes de 100: " + billete100);
        System.out.println("Billetes de 50: " + billete50);
        System.out.println("Billetes de 20: " + billete20);
        System.out.println("Billetes de 10: " + billete10);
        System.out.println("Billetes de 5: " + billete5);
        System.out.println("Monedas de 2: " + moneda2);
        System.out.println("Monedas de 1: " + moneda1);

        final String MENSAJE = (CAMBIO >= 0)?"El cambio es: " + CAMBIO + " euros":"Error: No hay cambio suficiente, faltan: " + (CAMBIO * -1) + " euros";

        System.out.println(MENSAJE);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        scanner.close();

    }

}
