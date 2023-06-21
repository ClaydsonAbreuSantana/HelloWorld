package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula02TiposPrimitivos {
    public static void main(String[] argos){
            //int, double, float, char, byte, short, long, boolean
        int idade = 26;                     //4 bytes ou 32 bits (-2,147,483,648 ate o 2,174,483,647)
        long numeroGrande = 100000;         //8 bytes ou 64 bits (-9,223,372,036,854,775,808 ate o 9223372036854750000)
        double salarioDouble = 2000;        //8 bytes ou 64 bits (1.7e-308 ate o 1.7e+038)
        float salarioFloat = 2500;          //4 bytes ou 32 bits (3.4e-038 ate o 3.4e+038)
        byte idadeByte = 10;                //1 byte ou 8 bits  (-128 ate o 127)
        short idadeShort = 14;              //2 bytes ou 16 bits  ( -32768 ate o 32767)
        boolean verdadeiro = true;          //1 bit  true ou false
        boolean falso = false;
        char caractere = 'M';               //2 bytes ou 16 bits

        System.out.println("A idade é " + idade + " anos ");
        System.out.println("O salario é  R$" + salarioDouble);
        System.out.println("O segundo salario é  R$" + salarioFloat);
        System.out.println("A pretenção de limite mensal é de " + numeroGrande + " dolares ");
        System.out.println("Tem um filho de " + idadeByte + " anos ");
        System.out.println("Tem uma filha de " + idadeShort + " anos ");
        System.out.println("É casado ? " + verdadeiro);
        System.out.println("Está solteiro?  " + falso);
        System.out.println("Sexo: " + caractere);



    }
}
