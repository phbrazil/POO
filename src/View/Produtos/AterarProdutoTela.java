/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Produtos;

import Controller.Produtos.DadosProdutos;
import Controller.Produtos.ProdutoCadastrado;
import DAO.Produtos.AlterarProduto;
import Model.Produtos.Games;
import DAO.Produtos.NovoProduto;
import javax.swing.JOptionPane;

public class AterarProdutoTela extends javax.swing.JInternalFrame {

    private int contador = 1;

    public AterarProdutoTela() {
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

        GravarAltProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JNomeProdutoAlterar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JFabricanteAlterar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboFaixaAlterar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboGarantia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerQuantidadeProdAlterar = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        JCodigoBarrasAlterar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedValorProdutoAlterar = new javax.swing.JFormattedTextField();
        JPesquisarProduto = new javax.swing.JToggleButton();
        StatusProduto = new javax.swing.JCheckBox();

        setClosable(true);

        GravarAltProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        GravarAltProd.setText("Gravar");
        GravarAltProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarAltProdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar Produto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" Nome do Produto ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fabricante");

        jComboFaixaAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"0 à 12 meses", "1 à 2 anos", "3 à 4 anos", "5 à 6 anos", "7 à 8 anos", "9 à 10 anos", "11 anos ou mais" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Faixa etária");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Prazo de Garantia");

        jComboGarantia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 meses", "6 meses", "1 ano"}));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Valor");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Quantidade");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Código de Barras");

        jFormattedValorProdutoAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        JPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/lupa_icon.png"))); // NOI18N
        JPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPesquisarProdutoActionPerformed(evt);
            }
        });

        StatusProduto.setSelected(true);
        StatusProduto.setText("Produto Ativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JNomeProdutoAlterar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCodigoBarrasAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JFabricanteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboFaixaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(GravarAltProd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedValorProdutoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSpinnerQuantidadeProdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(StatusProduto)))))
                        .addContainerGap(77, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCodigoBarrasAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(JNomeProdutoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFabricanteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboFaixaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedValorProdutoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerQuantidadeProdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusProduto))
                .addGap(77, 77, 77)
                .addComponent(GravarAltProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GravarAltProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarAltProdActionPerformed

        Games produtos = new Games();

        DAO.Produtos.AlterarProduto updateprod = new AlterarProduto();

        produtos.setCodigobarras(Integer.valueOf(JCodigoBarrasAlterar.getText()));
        produtos.setNomeProduto(String.valueOf(JNomeProdutoAlterar.getText()));
        produtos.setFabricante(String.valueOf(JFabricanteAlterar.getText()));
        produtos.setFaixaEtaria(String.valueOf(jComboFaixaAlterar.getSelectedItem()));
        produtos.setGarantia(String.valueOf(jComboGarantia.getSelectedItem()));
        produtos.setValor(Double.valueOf(jFormattedValorProdutoAlterar.getText().replace(",", ".")));
        produtos.setQuantidade((Integer) jSpinnerQuantidadeProdAlterar.getValue());
        
        if (StatusProduto.isSelected()) {
            produtos.setStatusProduto(true);
        } else {
            produtos.setStatusProduto(false);
        }

        updateprod.AtualizarProduto(produtos);
        JOptionPane.showMessageDialog(null, "Produto " + produtos.getNomeProduto() + " alterado!");

        JCodigoBarrasAlterar.setText("");
        JCodigoBarrasAlterar.setEditable(true);
        JNomeProdutoAlterar.setText("");
        JFabricanteAlterar.setText("");
        jComboFaixaAlterar.setSelectedItem("");
        jComboGarantia.setSelectedItem("");
        jSpinnerQuantidadeProdAlterar.setValue(1);
        jFormattedValorProdutoAlterar.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_GravarAltProdActionPerformed

    private void JPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPesquisarProdutoActionPerformed

        DAO.Produtos.AlterarProduto alterarproduto = new AlterarProduto();
        Model.Produtos.Games produtos = new Games();

        boolean tudook = false;

        do {
            try {

                produtos = alterarproduto.PesquisarProduto(Integer.valueOf(JCodigoBarrasAlterar.getText()));
                tudook = true;
                if (produtos.getNomeProduto() == null) {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado");
                } else {
                    JCodigoBarrasAlterar.setEditable(false);
                    JNomeProdutoAlterar.setText(String.valueOf(produtos.getNomeProduto()));
                    JFabricanteAlterar.setText(String.valueOf(produtos.getFabricante()));
                    jFormattedValorProdutoAlterar.setText(String.valueOf(produtos.getValor()));
                    jSpinnerQuantidadeProdAlterar.setValue(Integer.valueOf(produtos.getQuantidade()));
                    jComboGarantia.setSelectedItem(String.valueOf(produtos.getGarantia()));
                    jComboFaixaAlterar.setSelectedItem(String.valueOf(produtos.getFaixaEtaria()));
                    StatusProduto.setSelected(produtos.getStatusProduto());

                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira o código de barras");
                break;
            }
        } while (tudook == false);

        // TODO add your handling code here:
    }//GEN-LAST:event_JPesquisarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GravarAltProd;
    public javax.swing.JTextField JCodigoBarrasAlterar;
    public javax.swing.JTextField JFabricanteAlterar;
    public javax.swing.JTextField JNomeProdutoAlterar;
    private javax.swing.JToggleButton JPesquisarProduto;
    private javax.swing.JCheckBox StatusProduto;
    public javax.swing.JComboBox<String> jComboFaixaAlterar;
    public javax.swing.JComboBox<String> jComboGarantia;
    public javax.swing.JFormattedTextField jFormattedValorProdutoAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JSpinner jSpinnerQuantidadeProdAlterar;
    // End of variables declaration//GEN-END:variables

}
