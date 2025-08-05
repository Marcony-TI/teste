package MediaMedia;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove {
    public static void number(int number, Database db) {
        //looping para users excluirem numeros no array corretamente

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (db.getNumbers().isEmpty()){
                System.out.println("Lista atual: Vazia");
            } else {
                System.out.println("Lista atual: " + db.getNumbers());
            }

            int option = 0;
            System.out.println("Você escolheu excluir um número da lista.");
            System.out.print("Digite um número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("");
                System.out.print("Valor inválido, tente novamente: ");
                scanner.next();
            } number = scanner.nextInt();

            boolean searchNumber = false;

            for (int i = 0; i < db.getNumbers().size(); i++){
                if (db.getNumbers().get(i) == number){
                    System.out.println("");
                    System.out.println("Número removido com sucesso!");


                    db.getNumbers().remove(i); //remoção do número da lista

                    System.out.println("Lista atual: " + db.getNumbers());
                    System.out.println("");
                    searchNumber = true;
                    break;
                }

            }
            if (!searchNumber) {
                System.out.println("Número não encontrado.");
            }
            //O for acima poderia ter sido simplificado pelas duas linhas comentadas abaixo
            //db.getNumbers().remove(Integer.valueOf(number));
            //System.out.println("Lista atual: " + db.getNumbers());


            System.out.println("Deseja excluir outro número?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            Menu.listaAtual(db);
            System.out.print("Opção: ");

            while (true) {
                while(!scanner.hasNextInt()) {
                    System.out.println("");
                    System.out.println("Valor inválido, tente novamente.");
                    System.out.println("Deseja excluir outro número?");
                    System.out.println("1- Sim");
                    System.out.println("2- Não");
                    System.out.print("Opção: ");
                    scanner.next();
                } option = scanner.nextInt();

                if (option == 2 || option == 1) break;
                System.out.println("Valor inválido, tente novamente.");

            } if (option == 2) break;

        }
    }
}

