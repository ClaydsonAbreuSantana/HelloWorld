package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World");


        System.out.println("Qual o seu nome ? ");
        String nome = scanner.nextLine();

        System.out.println("Bem-vindo ao meu primeiro programa " + nome);


        }
    }
