package Servico;

import Model.Agendamento;

public class Correio {

    public void NotificarPorEmail(Agendamento agendamento) {
        String emailFormatado = formatarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        
        Email email = new Email("Agendamento", emailFormatado, destinatario);
        
        email.enviar();

    }

    private String formatarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();

        return "Olá" + nomeCliente + " Tudo certo para mais tarde? Seu agendamento para " + servico + " está marcado para " + dataAgendamento + horaAgendamento + ". O valor é de " + valor + " OK?";
    }
}
