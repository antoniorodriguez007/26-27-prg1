
class clase17 {

    public static void main(String[] args) {

        int[] arrayDeEnteros = {1, 2, 3, 4};

        int[][] notas = {
            arrayDeEnteros,
            arrayDeEnteros,
            arrayDeEnteros
        };

        arrayDeEnteros = new int[]{6, 7, 8};

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " , ");
            }
            System.out.println();
        }

        notas[1][1] = 9;

        System.out.println(".----------------");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " , ");
            }
            System.out.println();
        }

        notas[0] = new int[]{6, 6, 6, 6};

        System.out.println(".----------------");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " , ");
            }
            System.out.println();
        }

        notas[0] = new int[]{6, 6, 6, 6};
        notas[1] = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        notas[2] = notas[0]; //direccion a un array de enteros

        System.out.println(".----------------");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " , ");
            }
            System.out.println();
        }
        System.out.println(notas[0]);

    }
}
