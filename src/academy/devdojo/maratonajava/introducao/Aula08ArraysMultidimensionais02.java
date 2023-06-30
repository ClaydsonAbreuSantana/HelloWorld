package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        //Outra forma de criar um array multidimensional

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{-1, -2};
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{2, 4, 6, 8, 10, 12};



        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        //Inserindo dados direto
        int[][] arrayInt2 = {{1, 2, 3}, {2, 4, 6, 8}, {1, 3, 5, 7, 9}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
