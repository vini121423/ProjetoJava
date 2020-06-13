package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController {

    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() {
        Usuario usuario = helper.receberModelo();

    }

    public void tarefaRealizada() {
        System.out.println("Busca no banco de dados");

        this.view.exibirMsg("Execução da tarefa");
    }
}
