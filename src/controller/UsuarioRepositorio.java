package controller;

import java.util.ArrayList;

import model.ObjetoDuplicadoException;
import model.Usuario;

/**
 * UsuarioRepositorio
 */
public class UsuarioRepositorio {

    public ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public UsuarioRepositorio() {
    }

    public void addUser(Usuario usuario) throws ObjetoDuplicadoException {
        if (duplicateTest(usuario)) {
            throw new ObjetoDuplicadoException("Nome de usúario já existe!");
        }
        listaUsuarios.add(usuario);
    }

    private boolean duplicateTest(Usuario user) {
        for (Usuario usuario : listaUsuarios) {
            if(usuario.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public void removeUser(String nome) {

    }
}