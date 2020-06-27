package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper implements IHelper {

    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);

        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()

            });
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getSelectorCliente().getModel();

        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getSelectorServico().getModel();

        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Servico obterServico() {
        return (Servico) view.getSelectorServico().getSelectedItem();

    }
    
    public Cliente obterCliente() {
        return (Cliente) view.getSelectorCliente().getSelectedItem();

    }

    public void setarValor(float valor) {
        view.getCampoValor().setText(valor + "");
    }

    @Override
    public Agendamento obterModelo() {

        String idString = view.getCampoId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getCampoValor().getText();
        float valor = Float.parseFloat(valorString);
        
        String data = view.getCampoData().getText();
        String hora = view.getCampoHora().getText();
        
        String dataHora = data + " " + hora;
        String observacao = view.getjTextArea1().getText();
        
        Agendamento agendamento = new Agendamento(id, valor, dataHora, cliente, servico, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getCampoId().setText("0");
        view.getCampoValor().setText("");
        view.getCampoData().setText("");
        view.getCampoHora().setText("");
        view.getjTextArea1().setText("");
    }

}
