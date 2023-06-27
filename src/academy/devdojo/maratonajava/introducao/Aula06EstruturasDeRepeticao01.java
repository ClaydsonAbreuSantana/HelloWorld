package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

//        int count = 0;
//        while (count < 10) {
//            ++count;
//            System.out.println(count);
//        }
        int count = 0;
        do {
            System.out.println("Dentro do while " + ++count);

        } while (count < 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println("for " + i );
        }

    }

}

