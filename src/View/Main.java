
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {
    public static void main(String[] args){
        String nome = "Teste";
        System.out.println(nome);
               
        // Usando a classe criada Servico, criando para ela uma variável// 
        Servico servico = new Servico(1,"barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Cléber",'M',"9994925","Rua Palmeira 2324");
        
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "Barbeiro", "senha1234567");
         System.out.println(usuario.getNome());
    } 
    
}
