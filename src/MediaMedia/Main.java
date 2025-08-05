package MediaMedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        while(true){
            int op = 0;
            Menu.exibir();
            op = scanner.nextInt();

            if (op == 1){
                menu.adicionar();
            } else if (op == 2) {
                menu.remover();
            } else if (op == 3) {
                Menu.listaAtual(menu.getDb());
            } else if (op == 5){
                break;
            } else if (op == 4) {
                menu.media();
            }
        }

    }
}
