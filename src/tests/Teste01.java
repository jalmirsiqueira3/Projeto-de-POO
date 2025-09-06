package tests;

import java.time.LocalDate;

import model.Usuario;

public class Teste01 {
    
    public static void main(String[] args) {
        Usuario user1 = createUser("joelmir");
        Usuario user2 = createUser("ana");
        Usuario user3 = createUser("siclano");
        segue(user1, user2);
        segue(user1, user3);
    }
    private static Usuario createUser(String name) {
        String nome = name;
        LocalDate nascimento = LocalDate.of(1995, 11, 10);
        String email = "joel@email.com";
        String senha = "abc1";
    
        try {
            Usuario user = new Usuario(nome, nascimento, email, senha);
            System.out.println("Usuário \"" + user.getNome() + "\" criado com sucesso!");
            return user;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    public static void segue(Usuario us1, Usuario us2) {
        try {
            us1.seguir(us2);
            System.out.print("O usuário \'" + us1.getNome() + "\' segue: ");
            for (Usuario usuario : us1.getListaSegue()) {
                System.out.print(usuario.getNome() + ", ");
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
