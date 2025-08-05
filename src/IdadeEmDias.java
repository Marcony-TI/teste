// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
import java.util.Scanner;
public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade em anos: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Valor Invalido, tente novamente: ");
            scanner.next();
        }
        int ano = scanner.nextInt();
        System.out.println("Digite sua idade em meses: ");


        while(!scanner.hasNextInt()) {
            System.out.println("Valor inválido, tente novamente: ");
            scanner.next();
        }
        int meses = scanner.nextInt();

        System.out.println("Digite sua idade em dias: ");

        while(!scanner.hasNextInt()) {
            System.out.println("Valor inválido, tente novamente: ");
            scanner.next();
        }
        int dias = scanner.nextInt();

        int idadeEmDias = ((ano * 365) + (meses * 30) + dias);
        System.out.println("Sua idade em dias é " + idadeEmDias);
    }
}
