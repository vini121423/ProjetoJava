/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MenuPrincipalController;

/**
 *
 * @author Josué
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wallpaper2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        operacao = new javax.swing.JMenu();
        agenda = new javax.swing.JMenuItem();
        acoes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wallpaper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/2.jpg"))); // NOI18N

        cadastro.setText("Cadastro");

        jMenuItem1.setText("Cliente");
        cadastro.add(jMenuItem1);

        jMenuItem2.setText("Serviço");
        cadastro.add(jMenuItem2);

        jMenuBar1.add(cadastro);

        operacao.setText("Operação");

        agenda.setText("Agenda");
        agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaActionPerformed(evt);
            }
        });
        operacao.add(agenda);

        jMenuBar1.add(operacao);

        acoes.setText("Relatório");
        jMenuBar1.add(acoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wallpaper2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wallpaper2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaActionPerformed
        // TODO add your handling code here:
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_agendaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu acoes;
    private javax.swing.JMenuItem agenda;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu operacao;
    private javax.swing.JLabel wallpaper2;
    // End of variables declaration//GEN-END:variables
}
