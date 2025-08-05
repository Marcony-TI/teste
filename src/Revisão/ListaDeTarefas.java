package Revisão;


import java.util.Scanner;
import java.util.ArrayList;
public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao;

        //Menu principal
        while (true) {
            System.out.println("\nLista de Tarefas:");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Listar Tarefas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            //verificar se a entrada é um número válido
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.next();
                System.out.println("1 - Adicionar Tarefa; 2 - Remover Tarefa; 3 - Listar Tarefas; 4 - Sair");
                System.out.print("Escolha uma opção: ");
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            //executar ações conforme a opção escolhida
            switch (opcao) {
                case 1:
                    System.out.print("Digite a terefa que deseja adicionar: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o número da tarefa que deseja remover: ");
                    listarTarefas(tarefas);
                    if (!tarefas.isEmpty()) {
                        while (!scanner.hasNextInt()) {
                            System.out.println("Entrada Inválida. Digite um número de tarefa válido.");
                            scanner.next();
                        }
                        int numeroTarefa = scanner.nextInt();
                    }

            }

        }

    }
    public static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("Tarefas: ");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + " - " + tarefas.get(i));
            }
        }
    }
}
