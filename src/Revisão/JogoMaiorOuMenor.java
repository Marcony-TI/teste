package Revisão;

import java.util.Scanner;
import java.util.Random;

public class JogoMaiorOuMenor {
    public static void main(String[] args) {
        System.out.print("Advinhe em qual número inteiro estou pensando: ");

        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = gerador.nextInt(101);
        int n = scanner.nextInt();

        while (true) {
            if (n == numeroAleatorio) {
                System.out.println("Acertou!!!");
                break;
            }
            if (n < numeroAleatorio) {
                System.out.println("Tente um número maior: ");
            }
            if (n > numeroAleatorio) {
                System.out.println("Tente um número menor: ");
            }
            n = scanner.nextInt();
        }
        scanner.close();
    }
}
