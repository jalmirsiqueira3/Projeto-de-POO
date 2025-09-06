import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        String[] opcoes = {"op1", "op2"};
        menu(opcoes);
    }

    private static int menu(String[] opcoes) {
		int opcao;
		// String[] opcoes = {"Cadastrar Homem", "Cadastrar Mulher", "Consultar IMC (Nome)", "Listar Homens", "Listar Mulheres", "Listar todos os IMCs dos Homens", "Listar todos os IMCs"};
		System.out.println("Menu:");
		for(int i = 0; i < opcoes.length; i++) {
			System.out.println((i+1) + ". " + opcoes[i]);
		}
		System.out.println("0. Sair");
		System.out.println();
		System.out.print("Opção: ");
		opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}
}
