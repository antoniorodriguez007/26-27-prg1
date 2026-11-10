
import java.util.Scanner; //arrays tienen orden

class PromedioNota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas;
        double promedio;

        int cantidadNotas;
        System.out.println("Cauntas notas vas a ingresar?");
        cantidadNotas = sc.nextInt();

        notas = new double[cantidadNotas];
        double sumaNotas = 0;
        //double nota1, nota2, nota3, nota4; (sin array)
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Cual es la nota " + (i + 1));
            notas[i] = sc.nextDouble();
            sumaNotas = sumaNotas + notas[i];
        }

        promedio = sumaNotas / cantidadNotas;
        System.out.println("El promedio es " + promedio);
    }
}
