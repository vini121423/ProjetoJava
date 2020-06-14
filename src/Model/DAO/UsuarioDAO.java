
package Model.DAO;

import Model.Usuario;
import java.util.ArrayList;

public class UsuarioDAO {
       public void insert(Usuario usuario){
        Banco.usuario.add(usuario);
    }
    
    public boolean update(Usuario usuario){
        for(int i =0; i< Banco.usuario.size();i++){
            if(idSaoIguais(Banco.usuario.get(i), usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }
        return false;
    }
    
     public boolean delete(Usuario usuario){
        for(Usuario usuarioLista : Banco.usuario){
            if(idSaoIguais(usuarioLista, usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
     
     public ArrayList<Usuario> selectPorNomeESenha(){
         return Banco.usuario;
     }
     
     private boolean idSaoIguais(Usuario usuario,Usuario usuarioAComparar){
         return usuario.getId() == usuarioAComparar.getId();
     }
}
