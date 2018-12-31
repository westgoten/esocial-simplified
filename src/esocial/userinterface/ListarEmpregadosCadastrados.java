/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.userinterface;

import esocial.people.Empregador;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class ListarEmpregadosCadastrados extends javax.swing.JFrame {

    private Empregador[] listaEmpregadores;
    
    /**
     * Creates new form ListarEmpregadosCadastrados
     */
    public ListarEmpregadosCadastrados() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeEmpregadorTexto = new javax.swing.JTextField();
        listarEmpregadosButton = new javax.swing.JButton();
        cpfEmpregadorTexto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Listar empregados cadastrados");

        jLabel2.setText("Nome do empregador");

        jLabel3.setText("CPF do empregador");

        listarEmpregadosButton.setText("Listar empregados");
        listarEmpregadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarEmpregadosButtonActionPerformed(evt);
            }
        });

        try {
            cpfEmpregadorTexto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeEmpregadorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfEmpregadorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listarEmpregadosButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeEmpregadorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cpfEmpregadorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(listarEmpregadosButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarEmpregadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarEmpregadosButtonActionPerformed
        Empregador empregador = buscarEmpregador();
        if (empregador != null) {
            ListaDeEmpregados.setEmpregadosCadastrados(empregador
                    .getListaEmpregados());
            ListaDeEmpregados.setEmpregadorConsultado(empregador);
            ListaDeEmpregados.main(null);
        } else {
            JOptionPane.showMessageDialog(null, "Empregador não encontrado.");
            limparTela();
        }
    }//GEN-LAST:event_listarEmpregadosButtonActionPerformed

    private Empregador buscarEmpregador() {
        for (Empregador empregador : listaEmpregadores) {
            if (empregador != null && empregador.getNome()
                    .equals(nomeEmpregadorTexto.getText().toUpperCase()) 
                    && empregador.getCpf().equals(cpfEmpregadorTexto.getText()))
                return empregador;
        }
        
        return null;
    }
    
    private void limparTela() {
        nomeEmpregadorTexto.setText(null);
        cpfEmpregadorTexto.setValue(null);
    }
    
    public Empregador[] getListaEmpregadores() {
        return listaEmpregadores;
    }

    public void setListaEmpregadores(Empregador[] listaEmpregadores) {
        this.listaEmpregadores = listaEmpregadores;
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
            java.util.logging.Logger.getLogger(ListarEmpregadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEmpregadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEmpregadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEmpregadosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarEmpregadosCadastrados listarEmpregadosCadastrados = 
                        new ListarEmpregadosCadastrados();
                listarEmpregadosCadastrados.setListaEmpregadores(MenuPrincipal
                        .getListaEmpregadores());
                listarEmpregadosCadastrados.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                listarEmpregadosCadastrados.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cpfEmpregadorTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton listarEmpregadosButton;
    private javax.swing.JTextField nomeEmpregadorTexto;
    // End of variables declaration//GEN-END:variables
}
