
package View;

import Controller.LoginController;
import java.awt.TextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;

   
    public Login() {
        initComponents();
        controller = new LoginController(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTexto = new java.awt.TextField();
        campoSenha = new javax.swing.JPasswordField();
        tituloSenha = new javax.swing.JLabel();
        tituloLogin = new javax.swing.JLabel();
        tituloUsuario = new javax.swing.JLabel();
        botao = new javax.swing.JToggleButton();
        tela2 = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoActionPerformed(evt);
            }
        });
        getContentPane().add(campoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, -1));

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, -1));

        tituloSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloSenha.setForeground(new java.awt.Color(255, 255, 255));
        tituloSenha.setText("SENHA");
        getContentPane().add(tituloSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        tituloLogin.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        tituloLogin.setText("LOGIN");
        getContentPane().add(tituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        tituloUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tituloUsuario.setText("USUÁRIO");
        getContentPane().add(tituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        botao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botao.setText("ENTRAR");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });
        getContentPane().add(botao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, -1));

        tela2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/5.jpg"))); // NOI18N
        tela2.setText("jLabel2");
        getContentPane().add(tela2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 490, 470));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/1.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
       
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed
             
    }//GEN-LAST:event_campoTextoActionPerformed

    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed
        // TODO add your handling code here:
        this.controller.tarefaRealizada();
    }//GEN-LAST:event_botaoActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botao;
    private javax.swing.JPasswordField campoSenha;
    private java.awt.TextField campoTexto;
    private javax.swing.JLabel tela2;
    private javax.swing.JLabel tituloLogin;
    private javax.swing.JLabel tituloSenha;
    private javax.swing.JLabel tituloUsuario;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

    public void exibirMsg(String msg) {
      JOptionPane.showMessageDialog(null, msg);
    }

    public JPasswordField getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(JPasswordField campoSenha) {
        this.campoSenha = campoSenha;
    }

    public TextField getCampoTexto() {
        return campoTexto;
    }

    public void setCampoTexto(TextField campoTexto) {
        this.campoTexto = campoTexto;
    }
    
    
}
