/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.userinterface;

import esocial.taxes.Imposto;
import javax.swing.JOptionPane;

/**
 *
 * @author 030071145
 */
public class CadastroImposto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroImposto
     */
    private Imposto[] listaImpostos;
    
    public CadastroImposto() {
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

        jPanel1 = new javax.swing.JPanel();
        cadImpostoLabel = new javax.swing.JLabel();
        nomeImpostoLabel = new javax.swing.JLabel();
        nomeImpostoTexto = new javax.swing.JTextField();
        percentualCobradoTexto = new javax.swing.JTextField();
        percentualCobradoLabel = new javax.swing.JLabel();
        faixaAplicadaLabel1 = new javax.swing.JLabel();
        faixaAplicadaTexto1 = new javax.swing.JTextField();
        faixaAplicadaLabel2 = new javax.swing.JLabel();
        faixaAplicadaTexto2 = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        pesquisarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadImpostoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cadImpostoLabel.setText("Cadastro de impostos");

        nomeImpostoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomeImpostoLabel.setText("Nome do imposto");

        nomeImpostoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeImpostoTextoActionPerformed(evt);
            }
        });

        percentualCobradoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentualCobradoTextoActionPerformed(evt);
            }
        });

        percentualCobradoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        percentualCobradoLabel.setText("Percentual cobrado");

        faixaAplicadaLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        faixaAplicadaLabel1.setText("Faixa aplicada: de");

        faixaAplicadaTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faixaAplicadaTexto1ActionPerformed(evt);
            }
        });

        faixaAplicadaLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        faixaAplicadaLabel2.setText("até");

        faixaAplicadaTexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faixaAplicadaTexto2ActionPerformed(evt);
            }
        });

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });

        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(percentualCobradoLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(percentualCobradoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(nomeImpostoLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nomeImpostoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(faixaAplicadaLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(faixaAplicadaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(faixaAplicadaLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(faixaAplicadaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(cadastrarButton)
                        .addGap(56, 56, 56)
                        .addComponent(pesquisarButton)
                        .addGap(46, 46, 46)
                        .addComponent(excluirButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(cadImpostoLabel)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadImpostoLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeImpostoLabel)
                    .addComponent(nomeImpostoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentualCobradoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentualCobradoLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faixaAplicadaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faixaAplicadaLabel1)
                    .addComponent(faixaAplicadaLabel2)
                    .addComponent(faixaAplicadaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton)
                    .addComponent(pesquisarButton)
                    .addComponent(excluirButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeImpostoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeImpostoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeImpostoTextoActionPerformed

    private void percentualCobradoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentualCobradoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_percentualCobradoTextoActionPerformed

    private void faixaAplicadaTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faixaAplicadaTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faixaAplicadaTexto1ActionPerformed

    private void faixaAplicadaTexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faixaAplicadaTexto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faixaAplicadaTexto2ActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        // TODO add your handling code here:
        float percentual, inicio, fim;
        
        percentual = Float.parseFloat(percentualCobradoTexto.getText());
        inicio = Float.parseFloat(faixaAplicadaTexto1.getText());
        fim = Float.parseFloat(faixaAplicadaTexto2.getText());
        
        Imposto novoImposto = new Imposto(nomeImpostoTexto.getText()
                .toUpperCase(), percentual, inicio, fim);
        
        boolean isOk = addImposto(novoImposto);
        
        if (isOk)
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");
        else
            JOptionPane.showMessageDialog(null, "Falha no cadastro.");
        
        limparTela();
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < listaImpostos.length; i++) {
            if (listaImpostos[i] != null && nomeImpostoTexto.getText()
                    .toUpperCase().equals(listaImpostos[i].getNome())) {
                percentualCobradoTexto.setText(String.valueOf(listaImpostos[i].getPercentual()));
                faixaAplicadaTexto1.setText(String.valueOf(listaImpostos[i].getFaixaInicial()));
                faixaAplicadaTexto2.setText(String.valueOf(listaImpostos[i].getFaixaFim()));
                JOptionPane.showMessageDialog(null, "Imposto encontrado.");
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Imposto não encontrado.");
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < listaImpostos.length; i++) {
            if (listaImpostos[i] != null && nomeImpostoTexto.getText()
                    .toUpperCase().equals(listaImpostos[i].getNome())) {
                listaImpostos[i] = null;
                limparTela();
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Imposto não encontrado.");
    }//GEN-LAST:event_excluirButtonActionPerformed

    private boolean addImposto(Imposto novoImposto) {
        for (Imposto imposto : listaImpostos) {
            if (imposto != null && imposto.getNome()
                    .equals(novoImposto.getNome()))
                return false;
        }
        
        for (int i = 0; i < listaImpostos.length; i++) {
            if (listaImpostos[i] == null) {
                listaImpostos[i] = novoImposto;
                return true;
            }
        }
        return false;
    }
    
    private void limparTela() {
        nomeImpostoTexto.setText(null);
        percentualCobradoTexto.setText(null);
        faixaAplicadaTexto1.setText(null);
        faixaAplicadaTexto2.setText(null);
    }

    public void setListaImpostos(Imposto[] listaImpostos) {
        this.listaImpostos = listaImpostos;
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
            java.util.logging.Logger.getLogger(CadastroImposto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroImposto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroImposto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroImposto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroImposto cadastroImposto = new CadastroImposto();
                cadastroImposto.setListaImpostos(MenuPrincipal.getListaImpostos());
                cadastroImposto.setVisible(true);
                cadastroImposto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadImpostoLabel;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JButton excluirButton;
    private javax.swing.JLabel faixaAplicadaLabel1;
    private javax.swing.JLabel faixaAplicadaLabel2;
    private javax.swing.JTextField faixaAplicadaTexto1;
    private javax.swing.JTextField faixaAplicadaTexto2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeImpostoLabel;
    private javax.swing.JTextField nomeImpostoTexto;
    private javax.swing.JLabel percentualCobradoLabel;
    private javax.swing.JTextField percentualCobradoTexto;
    private javax.swing.JButton pesquisarButton;
    // End of variables declaration//GEN-END:variables
}