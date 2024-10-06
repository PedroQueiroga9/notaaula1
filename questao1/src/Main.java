import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        String nome;
        double nota1, nota2, nota3, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        nome = sc.nextLine();

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média de %s é: %.2f\n", nome, media);
        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media < 4) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Final");
        }

    }
}