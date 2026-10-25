package reto002.src;

import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Bienvenido al pago de tasas!");
        System.out.println("Ingrese la cantidad que debe...");
        int debe = scanner.nextInt();

        System.out.println("Ingrese la cantidad que paga...");
        int paga = scanner.nextInt();
    }
}
