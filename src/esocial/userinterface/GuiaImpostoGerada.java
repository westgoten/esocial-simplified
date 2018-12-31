/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.userinterface;

import esocial.people.Empregado;
import esocial.taxes.Guia;
import esocial.taxes.Imposto;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author rodrigo
 */
public class GuiaImpostoGerada extends javax.swing.JFrame {

    private static Guia[] guiasGeradas;
    private static Empregado empregadoDeclarado;
    private static boolean isGuiasPagasClass;
    
    /**
     * Creates new form GuiaImpostoGerada
     */
    public GuiaImpostoGerada() {
        initComponents();
    }
    
    private void preencherDados() {
        if (empregadoDeclarado != null) {
            nomeEmpregadoTexto.setText(empregadoDeclarado.getNome());
            cpfEmpregadoTexto.setValue(empregadoDeclarado.getCpf());
        }
        preencherTabela();
    }
    
    private void preencherTabela() {
        String[] columnNames = {"Mês/Ano", "Valor (R$)", "Impostos cobrados"};
        List<String[]> tempData = new ArrayList<>();
        String[][] data;
        int numRows;
        
        if (guiasGeradas != null) {
            for (Guia guia : guiasGeradas) {
                if (guia != null) {
                    String[] row = {guia.getData(), String.valueOf(guia.getValor()), 
                        obterNomesDosImpostos(guia)};
                    tempData.add(row);
                }
            }
            
            numRows = tempData.size();
            if (numRows >= 1) {
                data = new String[numRows][columnNames.length];
                tempData.toArray(data);
            } else {
                data = new String[1][columnNames.length];
            }
        } else {
            data = new String[1][columnNames.length];
        }
        
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tabelaDeGuias.setModel(tableModel);
    }

    private void ajustarColunas() {
        TableModel model = (TableModel) tabelaDeGuias.getModel();
        TableColumn column;
        Component comp;
        int headerWidth;
        int cellWidth;
        TableCellRenderer headerRenderer =
            tabelaDeGuias.getTableHeader().getDefaultRenderer();

        for (int i = 0; i < model.getColumnCount(); i++) {
            column = tabelaDeGuias.getColumnModel().getColumn(i);

            comp = headerRenderer.getTableCellRendererComponent(
                                 null, column.getHeaderValue(),
                                 false, false, -1, i);
            headerWidth = comp.getPreferredSize().width;

            comp = tabelaDeGuias.getDefaultRenderer(model.getColumnClass(i)).
                             getTableCellRendererComponent(tabelaDeGuias, 
                                     model.getValueAt(0, i), false, false, 0, i);
            cellWidth = comp.getPreferredSize().width;

            column.setPreferredWidth(Math.max(headerWidth, cellWidth));
        }
    }
    
    private String obterNomesDosImpostos(Guia guia) {
        Imposto[] listaImpostosCobrados = guia.getListaImpostosCobrados();
        String listaDeNomes = "";
        
        for (Imposto imposto : listaImpostosCobrados) {
            if (imposto != null)
                listaDeNomes += imposto.getNome() + ", ";
        }
        
        return listaDeNomes;
    }
    
    public JScrollPane getScrollDaTabela() {
        return scrollDaTabela;
    }

    public void setScrollDaTabela(JScrollPane scrollDaTabela) {
        this.scrollDaTabela = scrollDaTabela;
    }

    public JTable getTabelaDeGuias() {
        return tabelaDeGuias;
    }

    public void setTabelaDeGuias(JTable tabelaDeGuias) {
        this.tabelaDeGuias = tabelaDeGuias;
    }

    public static Guia[] getGuiasGeradas() {
        return guiasGeradas;
    }

    public static void setGuiasGeradas(Guia[] guiasGeradas) {
        GuiaImpostoGerada.guiasGeradas = guiasGeradas;
    }

    public static Empregado getEmpregadoDeclarado() {
        return empregadoDeclarado;
    }

    public static void setEmpregadoDeclarado(Empregado empregadoDeclarado) {
        GuiaImpostoGerada.empregadoDeclarado = empregadoDeclarado;
    }

    public JLabel getGuiaDeImpostosLabel() {
        return guiaDeImpostosLabel;
    }

    public void setGuiaDeImpostosLabel(JLabel guiaDeImpostosLabel) {
        this.guiaDeImpostosLabel = guiaDeImpostosLabel;
    }

    public static boolean getIsGuiasPagasClass() {
        return isGuiasPagasClass;
    }

    public static void setIsGuiasPagasClass(boolean isGuiasPagasClass) {
        GuiaImpostoGerada.isGuiasPagasClass = isGuiasPagasClass;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiaDeImpostosLabel = new javax.swing.JLabel();
        nomeEmpregadoLabel = new javax.swing.JLabel();
        nomeEmpregadoTexto = new javax.swing.JTextField();
        cpfEmpregadoLabel = new javax.swing.JLabel();
        scrollDaTabela = new javax.swing.JScrollPane();
        tabelaDeGuias = new javax.swing.JTable();
        cpfEmpregadoTexto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guiaDeImpostosLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        guiaDeImpostosLabel.setText("Guia de Impostos");

        nomeEmpregadoLabel.setText("Nome do empregado");

        nomeEmpregadoTexto.setEditable(false);

        cpfEmpregadoLabel.setText("CPF do empregado");

        tabelaDeGuias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        scrollDaTabela.setViewportView(tabelaDeGuias);

        cpfEmpregadoTexto.setEditable(false);
        try {
            cpfEmpregadoTexto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeEmpregadoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeEmpregadoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpfEmpregadoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfEmpregadoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guiaDeImpostosLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guiaDeImpostosLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeEmpregadoLabel)
                    .addComponent(nomeEmpregadoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfEmpregadoLabel)
                    .addComponent(cpfEmpregadoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollDaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
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
            java.util.logging.Logger.getLogger(GuiaImpostoGerada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiaImpostoGerada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiaImpostoGerada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiaImpostoGerada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GuiaImpostoGerada guiaImpostoGerada = new GuiaImpostoGerada();
                guiaImpostoGerada.preencherDados();
                guiaImpostoGerada.ajustarColunas();
                if (isGuiasPagasClass)
                    guiaImpostoGerada.getGuiaDeImpostosLabel()
                            .setText("Guias de Impostos Pagas");
                else
                    guiaImpostoGerada.getGuiaDeImpostosLabel()
                            .setText("Guia de Impostos");
                guiaImpostoGerada.setVisible(true);
                guiaImpostoGerada.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpfEmpregadoLabel;
    private javax.swing.JFormattedTextField cpfEmpregadoTexto;
    private javax.swing.JLabel guiaDeImpostosLabel;
    private javax.swing.JLabel nomeEmpregadoLabel;
    private javax.swing.JTextField nomeEmpregadoTexto;
    private javax.swing.JScrollPane scrollDaTabela;
    private javax.swing.JTable tabelaDeGuias;
    // End of variables declaration//GEN-END:variables
}
