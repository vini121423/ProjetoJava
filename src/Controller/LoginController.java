package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;
import java.util.ArrayList;

public class LoginController {

    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() {
        Usuario usuario = helper.receberModelo();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibirMsg("Usuário ou senha inválidos!");
        }
           
    }

    public void tarefaRealizada() {
        System.out.println("Busca no banco de dados");

        this.view.exibirMsg("Execução da tarefa");
    }
}
