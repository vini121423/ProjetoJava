/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Josué
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoValor = new javax.swing.JTextField();
        campoTexto = new javax.swing.JTextField();
        campoData = new javax.swing.JTextField();
        campoHora = new javax.swing.JTextField();
        selectorServico = new javax.swing.JComboBox<>();
        selectorCliente = new javax.swing.JComboBox<>();
        botao = new javax.swing.JToggleButton();
        tabela = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelTexto = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        titleServico = new javax.swing.JLabel();
        titleCliente = new javax.swing.JLabel();
        titeNome = new javax.swing.JLabel();
        titleValor = new javax.swing.JLabel();
        titleData = new javax.swing.JLabel();
        titleHora = new javax.swing.JLabel();
        fundoAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorActionPerformed(evt);
            }
        });
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 130, 30));

        campoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoActionPerformed(evt);
            }
        });
        getContentPane().add(campoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, -1));

        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });
        getContentPane().add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 130, 30));

        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraActionPerformed(evt);
            }
        });
        getContentPane().add(campoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 130, 30));

        selectorServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tesoura", "Máquina", " " }));
        getContentPane().add(selectorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, -1));

        selectorCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alexandre", "Guilherme" }));
        getContentPane().add(selectorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, -1));

        botao.setBackground(new java.awt.Color(255, 255, 255));
        botao.setForeground(new java.awt.Color(51, 51, 51));
        botao.setText("Agendar");
        getContentPane().add(botao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Cliente", "Serviço", "Valor", "Data", "Hora", "Obs."
            }
        ));
        tabela.setViewportView(jTable1);

        getContentPane().add(tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 440, 90));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Observação:");
        painelTexto.setViewportView(jTextArea1);

        getContentPane().add(painelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 210, 110));

        titleServico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titleServico.setForeground(new java.awt.Color(255, 255, 255));
        titleServico.setText("SERVIÇO");
        getContentPane().add(titleServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        titleCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titleCliente.setForeground(new java.awt.Color(255, 255, 255));
        titleCliente.setText("CLIENTE");
        getContentPane().add(titleCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        titeNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titeNome.setForeground(new java.awt.Color(255, 255, 255));
        titeNome.setText("NOME");
        getContentPane().add(titeNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        titleValor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titleValor.setForeground(new java.awt.Color(255, 255, 255));
        titleValor.setText("VALOR");
        getContentPane().add(titleValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        titleData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titleData.setForeground(new java.awt.Color(255, 255, 255));
        titleData.setText("DATA");
        getContentPane().add(titleData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        titleHora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titleHora.setForeground(new java.awt.Color(255, 255, 255));
        titleHora.setText("HORA");
        getContentPane().add(titleHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        fundoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/3.gif"))); // NOI18N
        getContentPane().add(fundoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorActionPerformed

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void campoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botao;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel fundoAgenda;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane painelTexto;
    private javax.swing.JComboBox<String> selectorCliente;
    private javax.swing.JComboBox<String> selectorServico;
    private javax.swing.JScrollPane tabela;
    private javax.swing.JLabel titeNome;
    private javax.swing.JLabel titleCliente;
    private javax.swing.JLabel titleData;
    private javax.swing.JLabel titleHora;
    private javax.swing.JLabel titleServico;
    private javax.swing.JLabel titleValor;
    // End of variables declaration//GEN-END:variables
}
