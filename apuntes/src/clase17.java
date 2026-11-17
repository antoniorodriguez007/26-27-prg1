
class clase17 {

    public static void main(String[] args) {

        int[] arrayDeEnteros = {1, 2, 3, 4};

        int[][] notas = {
            arrayDeEnteros,
            arrayDeEnteros,
            arrayDeEnteros
        };

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
