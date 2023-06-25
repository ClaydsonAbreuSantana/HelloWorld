package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresJava {
    public static void main(String[] args) {
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= ++ !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("IsDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("IsDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("IsDezIgualVinte " + isDezIgualVinte);
        System.out.println("IsDezIgualDez " + isDezIgualDez);
        System.out.println("IsDezDiferenteDez " + isDezDiferenteDez);


        // && (AND), || (or), ! (Negação)
        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);


        // ++ --
        int contador = 0;
        contador ++; //incrementa depois
        contador--;
        ++contador; //incrementa antes
        --contador;
        System.out.println(contador);

    }
}
