/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.userinterface;

import esocial.people.Empregador;
import esocial.taxes.Imposto;

/**
 *
 * @authors:
 * Izadora Paim
 * Rodrigo de Oliveira
 */

public class MenuPrincipal extends javax.swing.JFrame {
    private static Empregador[] listaEmpregadores = new Empregador[100];
    private static Imposto[] listaImpostos = new Imposto[100];
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        eSocialLabel = new javax.swing.JLabel();
        cadastroEmpregadorButton = new javax.swing.JButton();
        cadastroEmpregadoButton = new javax.swing.JButton();
        cadastroImpostoButton = new javax.swing.JButton();
        gerarGuiaButton = new javax.swing.JButton();
        consultarGuiaButton = new javax.swing.JButton();
        listarEmpregadosButton = new javax.swing.JButton();
        consultarGuiasPagasButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eSocialLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        eSocialLabel.setText("eSocial");

        cadastroEmpregadorButton.setText("Cadastro de empregador");
        cadastroEmpregadorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEmpregadorButtonActionPerformed(evt);
            }
        });

        cadastroEmpregadoButton.setText("Cadastro de empregado");
        cadastroEmpregadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEmpregadoButtonActionPerformed(evt);
            }
        });

        cadastroImpostoButton.setText("Cadastro de imposto");
        cadastroImpostoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroImpostoButtonActionPerformed(evt);
            }
        });

        gerarGuiaButton.setText("Gerar guia de imposto");
        gerarGuiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarGuiaButtonActionPerformed(evt);
            }
        });

        consultarGuiaButton.setText("Consultar guia de imposto");
        consultarGuiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarGuiaButtonActionPerformed(evt);
            }
        });

        listarEmpregadosButton.setText("Listar empregados cadastrados");
        listarEmpregadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarEmpregadosButtonActionPerformed(evt);
            }
        });

        consultarGuiasPagasButton.setText("Consultar guias pagas");
        consultarGuiasPagasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarGuiasPagasButtonActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("O eSocial é um projeto do governo federal que unifica o envio de informações pelo empregador \nem relação aos seus funcionários empregados. Trata-se de um sistema que apoia a Lei 150 que estabelece \nalguns recolhimentos para os empregados domésticos tais como imposto de renda, contribuição previdenciária, \nfgts, dentre outros.");
        jTextArea2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(eSocialLabel)
                .addGap(0, 204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultarGuiasPagasButton)
                            .addComponent(listarEmpregadosButton)
                            .addComponent(consultarGuiaButton)
                            .addComponent(gerarGuiaButton)
                            .addComponent(cadastroImpostoButton)
                            .addComponent(cadastroEmpregadoButton)
                            .addComponent(cadastroEmpregadorButton))
                        .addGap(56, 56, 56)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eSocialLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastroEmpregadorButton)
                .addGap(20, 20, 20)
                .addComponent(cadastroEmpregadoButton)
                .addGap(20, 20, 20)
                .addComponent(cadastroImpostoButton)
                .addGap(20, 20, 20)
                .addComponent(gerarGuiaButton)
                .addGap(20, 20, 20)
                .addComponent(consultarGuiaButton)
                .addGap(20, 20, 20)
                .addComponent(listarEmpregadosButton)
                .addGap(20, 20, 20)
                .addComponent(consultarGuiasPagasButton)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroEmpregadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEmpregadoButtonActionPerformed
        CadastroEmpregado.main(null);        
    }//GEN-LAST:event_cadastroEmpregadoButtonActionPerformed

    private void cadastroImpostoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroImpostoButtonActionPerformed
        CadastroImposto.main(null);
    }//GEN-LAST:event_cadastroImpostoButtonActionPerformed

    private void cadastroEmpregadorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEmpregadorButtonActionPerformed
        CadastroEmpregador.main(null);
    }//GEN-LAST:event_cadastroEmpregadorButtonActionPerformed

    private void gerarGuiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarGuiaButtonActionPerformed
        GerarGuiaImposto.main(null);
    }//GEN-LAST:event_gerarGuiaButtonActionPerformed

    private void consultarGuiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarGuiaButtonActionPerformed
        ConsultarGuiaImposto.main(null);
    }//GEN-LAST:event_consultarGuiaButtonActionPerformed

    private void consultarGuiasPagasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarGuiasPagasButtonActionPerformed
        ConsultarGuiasPagas.main(null);
    }//GEN-LAST:event_consultarGuiasPagasButtonActionPerformed

    private void listarEmpregadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarEmpregadosButtonActionPerformed
        ListarEmpregadosCadastrados.main(null);
    }//GEN-LAST:event_listarEmpregadosButtonActionPerformed

    public static Empregador[] getListaEmpregadores() {
        return listaEmpregadores;
    }

    public static void setListaEmpregadores(Empregador[] listaEmpregadores) {
        MenuPrincipal.listaEmpregadores = listaEmpregadores;
    }


    public static Imposto[] getListaImpostos() {
        return listaImpostos;
    }

    public static void setListaImpostos(Imposto[] listaImpostos) {
        MenuPrincipal.listaImpostos = listaImpostos;
    }
    
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
    private javax.swing.JButton cadastroEmpregadoButton;
    private javax.swing.JButton cadastroEmpregadorButton;
    private javax.swing.JButton cadastroImpostoButton;
    private javax.swing.JButton consultarGuiaButton;
    private javax.swing.JButton consultarGuiasPagasButton;
    private javax.swing.JLabel eSocialLabel;
    private javax.swing.JButton gerarGuiaButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton listarEmpregadosButton;
    // End of variables declaration//GEN-END:variables
}
