package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper implements IHelper {

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

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
