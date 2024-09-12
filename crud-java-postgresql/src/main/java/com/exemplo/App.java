package com.exemplo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CRUDExample crud = new CRUDExample();
        Scanner scanner = new Scanner(System.in);

        // Painel
        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Atualizar informações do piloto");
            System.out.println("3 - Excluir piloto");
            System.out.println("4 - Listar pilotos");
            System.out.println("5 - Sair");
            
            int choice = 0;

            // Loop para garantir entrada válida
            while (true) {
                try {
                    choice = scanner.nextInt();
                    if (choice < 1 || choice > 5) {
                        System.out.println("Valor digitado inválido. Tente novamente.");
                        continue; // Volta ao início do loop para pedir novamente
                    }
                    break; // Sai do loop se a entrada for válida
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número entre 1 e 5.");
                    scanner.next(); // Limpa o buffer do scanner
                }
            }

            switch (choice) {
                case 1:
                    System.out.print("Digite o ID do piloto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do piloto: ");
                    String name = scanner.nextLine();
                    System.out.print("Digite a equipe do piloto: ");
                    String team = scanner.nextLine();
                    crud.insertDriver(id, name, team);
                    break;

                case 2:
                    System.out.print("Digite o ID do piloto a ser atualizado: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o novo nome do piloto: ");
                    String newName = scanner.nextLine();
                    System.out.print("Digite o novo time do piloto: ");
                    String newTeam = scanner.nextLine();
                    crud.updateDriver(updateId, newName, newTeam);
                    break;

                case 3:
                    System.out.print("Digite o ID do piloto a ser excluído: ");
                    int deleteId = scanner.nextInt();
                    crud.deleteDriver(deleteId);
                    break;

                case 4:
                    crud.listDrivers();
                    break;

                case 5:
                    scanner.close();
                    System.out.println("Saindo do sistema...");
                    return; // Usar return para sair do método main e encerrar o programa
            }
        }
    }
}
