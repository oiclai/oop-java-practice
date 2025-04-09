package introd;
// dependências pra coleções
import java.util.ArrayList;
import java.util.List;
//package: semelhante ao namespace do C#

public class Program {
    public static void main(String[] args) {

        int numero = 10;
        double decimal = 5.5;
        String texto = "Olá"; // 'S' maiúsculo
        boolean condicao = true; // em C# seria 'bool'

        System.out.println(texto + numero + decimal + condicao); // semelhante ao Console.WriteLine

        // condicional
        int idade = 20;
        if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Menor");
        }

        // switch case
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            default:
                System.out.println("Dia inválido");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int[] numeros = {1, 2, 3, 4};
        for (int num : numeros) {
            System.out.println(num);
        }


        // coleções
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        // exceções
        try {
            // "código"
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}   