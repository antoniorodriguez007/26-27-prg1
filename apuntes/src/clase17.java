
class clase17 {

    public static void main(String[] args) {

        int[] arrayDeEnteros = {1, 2, 3, 4};

        int[][] notas = {
            arrayDeEnteros,
            arrayDeEnteros,
            arrayDeEnteros
        };

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " , ");
            }
            System.out.println();
        }
    }
}
