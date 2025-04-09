package introd.exercicio.Calculadora;

import java.util.Scanner;

public class Menu {
    private Calculadora calculadora;
    private Scanner scanner;

    public Menu() {
        this.calculadora = new Calculadora();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n=== CALCULADORA POO ===");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao != 0) {
                processarOpcao(opcao);
            }
        } while (opcao != 0);

        System.out.println("Programa encerrado. Obrigado!");
        scanner.close();
    }

    private void processarOpcao(int opcao) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + calculadora.somar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + calculadora.subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + calculadora.multiplicar(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Resultado: " + calculadora.dividir(num1, num2));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}