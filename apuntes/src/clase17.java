
class clase17 {

    public static void main(String[] args) {

        int[] notas; //Variable de referencia de arrays tipo int 1 espacio

        notas = new int[3]; //notas guarda la direccion y new int tiene una variable de 3, asiqeu hay 4 espacios de memoria en uso, 1 + 3 = 4

        notas[0] = 7;
        notas[2] = 10;
        int[] otrasNotas = {2, 3};  //1 espacio por var de ref y se agregan 2 por el array de otrasnotas

        otrasNotas = notas; //deja de apuntar a 2,3 y desaparecen los arrays, hay 5 espacios

        int tamañoarray = notas.length;

        for (int i = 0; i < notas.length; i++) {
            System.err.println(notas[i]);
        }

    }
}
