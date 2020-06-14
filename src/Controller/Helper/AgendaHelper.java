package Controller.Helper;

import Model.Agendamento;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper {

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

}
