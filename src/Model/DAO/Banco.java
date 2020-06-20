package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

public class Banco {

    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;

    public static void inicio() {
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();

        Usuario usuario1 = new Usuario("senha", "1", 2434, "nome", 'M', "30/02/2001", "3323524", "email@email.com", "243.436.325");
        Usuario usuario2 = new Usuario("senh1", "2", 2445, "Maria", 'F', "10/04/1980", "3444", "mariaemail@email.com", "343.452.135");

        Cliente cliente1 = new Cliente("Rua Palmeiras do Norte - 210", "41231-000", 231, "Núbia Neves", 'F', "12/12/1992", "9934535", "neves_nubia@email.com", "345.552.332");
        Cliente cliente2 = new Cliente("Rua do Medo - 93", "54331-000", 232, "Mateus Santos", 'M', "01/09/2000", "994435", "santos_mateus_nome@email.com", "125.551.123");

        Servico servico1 = new Servico(123, "Corte e pintura", 30);
        Servico servico2 = new Servico(124, "Lavagem", 25);
        
        Agendamento agendamento1 = new Agendamento(12, 25, "20/06/2021 12:10",cliente2,servico2);
        Agendamento agendamento2 = new Agendamento(13, 30, "20/06/2021 19:40",cliente1,servico1);
        
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        
        servico.add(servico1);
        servico.add(servico2);
      
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
      

    }
}
