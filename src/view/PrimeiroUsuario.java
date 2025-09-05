package view;

import java.util.Scanner;
import static java.lang.System.out;

public class PrimeiroUsuario {
    public static void main(String[] args) {
        System.out.println("Crie o primeiro usuário para acessar o sistema:");
        String[] dados = coletarUsuario();
    }

    public static String[] coletarUsuario() {
        Scanner sc = new Scanner(System.in);
        out.print("Nome: ");
        String nome = sc.nextLine();
        out.print("Nascimento [yyyy-mm-dd]: ");
        String dtNascimento = sc.nextLine();
        out.print("Email: ");
        String email = sc.nextLine();
        out.print("Senha: ");
        String senha = sc.nextLine();
        sc.close();
        String[] dados = {nome, dtNascimento, email, senha};
        return dados;
    }

    private static void validarUsusario(String[] dados) {
        // if(dados[0].length() > )
    }
}
