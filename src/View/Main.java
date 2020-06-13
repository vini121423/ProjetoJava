
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
        
        Cliente cliente = new Cliente(1, "João","Rua Ianomami","42356");
        
        System.out.println(cliente.getNome());
       
        
       
    } 
    
}
