package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public Usuario receberModelo() {
        String nome = view.getCampoTexto().getText();
        String senha = view.getCampoSenha().getText();

        Usuario modelo = new Usuario(0, nome, senha, "2");

        return modelo;
    }

    public void setarModelo(Usuario modelo) {
        String nome = modelo.getNome();
        String senha = modelo.getSenha();

        view.getCampoTexto().setText(nome);
        view.getCampoSenha().setText(senha);
    }
}
