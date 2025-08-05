package MediaMedia;

import java.util.Scanner;

public class Add {
    public static void number (int number, Database d) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (d.getNumbers().isEmpty()){
                System.out.println("Lista atual: Vazia");
            } else {
                System.out.println("Lista atual: " + d.getNumbers());
            }
            System.out.println("Você escolheu adicionar um número á lista.");
            System.out.print("Digite um número: ");
            System.out.println("");
            while (!scanner.hasNextInt()) {
                System.out.print("Valor inválido, tente novamente: ");
                scanner.next();
            }
            number = scanner.nextInt();
            d.getNumbers().add(number);
            int option = 0;

            System.out.println("");
            System.out.println("Deseja inserir outro número?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            System.out.println("Lista atual: " + d.getNumbers());
            System.out.println("Opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("");
                System.out.println("Valor inválido, tente novamente.");
                System.out.println("Deseja inserir outro número?");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                System.out.print("Opção: ");
                scanner.next();
                System.out.println("");

            }
            option = scanner.nextInt();

            if (option == 2) {
                break;
            }
        }
    }

}

