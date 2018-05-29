/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Clientes;

import Controller.Clientes.DadosClientes;
import Model.Clientes.Clientes;
import DAO.Clientes.NovoCliente;
import Controller.Clientes.CPFCadastro;
import Controller.Clientes.ClienteCadastrado;
import DAO.Clientes.AlterarCliente;
import DAO.Produtos.AlterarProduto;
import Model.Produtos.Games;
import javax.swing.JOptionPane;

public class AlterarClienteTela extends javax.swing.JInternalFrame {

    private int quantosclientes = 0;

    public AlterarClienteTela() {
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
        GravarAltCliente = new javax.swing.JButton();
        JClienteNomeAlterar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JClienteLogradouroAlterar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JClienteNumeroAlterar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JClienteCidadeAlterar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JClienteEstadoAlterar = new javax.swing.JTextField();
        ComboUFAlterar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JClienteEmailAlterar = new javax.swing.JTextField();
        ComboSexoAlterar = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboEstadoCivil = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jFormattedNascimentoAlterar = new javax.swing.JFormattedTextField();
        jFormattedCPFAlterar = new javax.swing.JFormattedTextField();
        jFormattedRGAlterar = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        BotaoPesquisarCEP = new javax.swing.JButton();
        jFormattedTelefoneAlterar = new javax.swing.JFormattedTextField();
        jFormattedCelularAlterar = new javax.swing.JFormattedTextField();
        jFormattedCEPAlterar = new javax.swing.JFormattedTextField();
        JPesquisarCPFAlt = new javax.swing.JToggleButton();
        StatusCliente = new javax.swing.JCheckBox();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(725, 540));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar Clientes");

        GravarAltCliente.setText("Gravar");
        GravarAltCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarAltClienteActionPerformed(evt);
            }
        });

        JClienteNomeAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClienteNomeAlterarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("RG");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CPF");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Logradouro");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Numero");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cidade");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estado");

        ComboUFAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "ES", "SE", "PE", "PB", "ES", "AM", "RR", "RO", "RS", "RN","PR", "AC", "TO", "MG", "SC", "BA", "CE", "PA","PI" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("UF");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Telefone");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Celular");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Email");

        ComboSexoAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino"}));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sexo");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Estado Civil");

        ComboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Viúvo", "Divorciado" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Data Nascimento AAAA/MM/DD");

        try {
            jFormattedNascimentoAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCPFAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedRGAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("CEP");

        BotaoPesquisarCEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/lupa_icon.png"))); // NOI18N
        BotaoPesquisarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarCEPActionPerformed(evt);
            }
        });

        try {
            jFormattedTelefoneAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCelularAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCEPAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JPesquisarCPFAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/lupa_icon.png"))); // NOI18N
        JPesquisarCPFAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPesquisarCPFAltActionPerformed(evt);
            }
        });

        StatusCliente.setSelected(true);
        StatusCliente.setText("Cliente Ativo");
        StatusCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusClienteActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFormattedCPFAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JPesquisarCPFAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JClienteLogradouroAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(147, 147, 147)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedRGAlterar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JClienteNumeroAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(127, 127, 127)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JClienteCidadeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboSexoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(JClienteNomeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFormattedCEPAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoPesquisarCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ComboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jFormattedNascimentoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTelefoneAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedCelularAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StatusCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JClienteEmailAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JClienteEstadoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addComponent(ComboUFAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GravarAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedCPFAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPesquisarCPFAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JClienteNomeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedRGAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedCEPAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoPesquisarCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JClienteLogradouroAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JClienteNumeroAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JClienteCidadeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JClienteEstadoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboUFAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSexoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedNascimentoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JClienteEmailAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jFormattedTelefoneAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedCelularAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusCliente))))
                .addGap(38, 38, 38)
                .addComponent(GravarAltCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GravarAltClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarAltClienteActionPerformed

        Clientes clientes = new Clientes();

        DAO.Clientes.AlterarCliente updatecliente = new AlterarCliente();

        clientes.setCPF(String.valueOf(jFormattedCPFAlterar.getText()));
        clientes.setNome(String.valueOf(JClienteNomeAlterar.getText()));

        clientes.setLogradouro(String.valueOf(JClienteLogradouroAlterar.getText()));
        clientes.setRG(String.valueOf(jFormattedRGAlterar.getText()));
        clientes.setNumero(String.valueOf(JClienteNumeroAlterar.getText()));
        clientes.setCidade(String.valueOf(JClienteCidadeAlterar.getText()));
        clientes.setEstado(String.valueOf(JClienteEstadoAlterar.getText()));
        clientes.setUF(String.valueOf(ComboUFAlterar.getSelectedItem()));
        clientes.setCep(String.valueOf(jFormattedCEPAlterar.getText().replace("-", "")));
        clientes.setCelular(String.valueOf(jFormattedCelularAlterar.getText()));
        clientes.setTelefone(String.valueOf(jFormattedTelefoneAlterar.getText()));
        clientes.setEmail(String.valueOf(JClienteEmailAlterar.getText()));
        clientes.setSexo(String.valueOf(ComboSexoAlterar.getSelectedItem()));
        clientes.setEstadoCivil(String.valueOf(ComboEstadoCivil.getSelectedItem()));
        clientes.setNascimento(String.valueOf(jFormattedNascimentoAlterar.getText().replace("/", "-")));

        if (StatusCliente.isSelected()) {
            clientes.setStatusCliente(true);
        } else {
            clientes.setStatusCliente(false);
        }

        updatecliente.AtualizarCliente(clientes);
        JOptionPane.showMessageDialog(null, "Cliente " + clientes.getNome() + " alterado!");

        jFormattedCPFAlterar.setText("");
        jFormattedCPFAlterar.setEditable(true);
        JClienteNomeAlterar.setText("");
        JClienteLogradouroAlterar.setText("");
        jFormattedRGAlterar.setText("");
        JClienteNumeroAlterar.setText("");
        JClienteCidadeAlterar.setText("");
        JClienteEstadoAlterar.setText("");
        ComboUFAlterar.setSelectedItem("");
        jFormattedCEPAlterar.setText("");
        jFormattedCelularAlterar.setText("");
        jFormattedTelefoneAlterar.setText("");
        JClienteEmailAlterar.setText("");
        ComboSexoAlterar.setSelectedItem("");
        ComboEstadoCivil.setSelectedItem("");
        jFormattedNascimentoAlterar.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_GravarAltClienteActionPerformed

    private void JClienteNomeAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClienteNomeAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JClienteNomeAlterarActionPerformed

    private void JPesquisarCPFAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPesquisarCPFAltActionPerformed

        DAO.Clientes.AlterarCliente alterarcliente = new AlterarCliente();

        Clientes clientes = new Clientes();

        boolean tudook = false;

        do {
            try {

                clientes = alterarcliente.PesquisarProduto(String.valueOf(jFormattedCPFAlterar.getText()));
                tudook = true;
                if (clientes.getNome() == null) {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                } else {
                    jFormattedCPFAlterar.setEditable(false);
                    JClienteNomeAlterar.setText(String.valueOf(clientes.getNome()));
                    JClienteLogradouroAlterar.setText(String.valueOf(clientes.getLogradouro()));
                    jFormattedRGAlterar.setText(String.valueOf(clientes.getRG()));
                    JClienteNumeroAlterar.setText(String.valueOf(clientes.getNumero()));
                    JClienteCidadeAlterar.setText(String.valueOf(clientes.getCidade()));
                    JClienteEstadoAlterar.setText(String.valueOf(clientes.getEstado()));
                    ComboUFAlterar.setSelectedItem(String.valueOf(clientes.getUF().trim()));
                    jFormattedCEPAlterar.setText(String.valueOf(clientes.getCep()));
                    jFormattedCelularAlterar.setText(String.valueOf(clientes.getCelular()));
                    jFormattedTelefoneAlterar.setText(String.valueOf(clientes.getTelefone()));
                    JClienteEmailAlterar.setText(String.valueOf(clientes.getEmail()));
                    ComboSexoAlterar.setSelectedItem(String.valueOf(clientes.getSexo()));
                    ComboEstadoCivil.setSelectedItem(String.valueOf(clientes.getEstadoCivil()));
                    jFormattedNascimentoAlterar.setText(String.valueOf(clientes.getNascimento().replace("-", "/")));
                    StatusCliente.setSelected(clientes.getStatusCliente());
                    

                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Verifique os dados inseridos");
                break;
            }
        } while (tudook == false);

        // TODO add your handling code here:
    }//GEN-LAST:event_JPesquisarCPFAltActionPerformed

    private void BotaoPesquisarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarCEPActionPerformed

        DAO.Clientes.CepClienteVenda selectCEP = new DAO.Clientes.CepClienteVenda();

        boolean cepvalido = false;

        //TENTA PEGAR O CEP DO CLIENTE
        do {
            try {
                selectCEP.SelectCEP(String.valueOf(jFormattedCEPAlterar.getText().replace("-", "")));
                cepvalido = true;
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "CEP inválido");
                break;
            }
        } while (cepvalido == false);

        if (selectCEP.GetLogradouro() != null) {

            JClienteLogradouroAlterar.setText(String.valueOf(selectCEP.GetLogradouro()));
            JClienteEstadoAlterar.setText(String.valueOf(selectCEP.GetEstado()));
            JClienteCidadeAlterar.setText(String.valueOf(selectCEP.GetCidade()));
            ComboUFAlterar.setSelectedItem(String.valueOf(selectCEP.GetUF()));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPesquisarCEPActionPerformed

    private void StatusClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoPesquisarCEP;
    public javax.swing.JComboBox<String> ComboEstadoCivil;
    public javax.swing.JComboBox<String> ComboSexoAlterar;
    public javax.swing.JComboBox<String> ComboUFAlterar;
    private javax.swing.JButton GravarAltCliente;
    public javax.swing.JTextField JClienteCidadeAlterar;
    public javax.swing.JTextField JClienteEmailAlterar;
    public javax.swing.JTextField JClienteEstadoAlterar;
    public javax.swing.JTextField JClienteLogradouroAlterar;
    public javax.swing.JTextField JClienteNomeAlterar;
    public javax.swing.JTextField JClienteNumeroAlterar;
    private javax.swing.JToggleButton JPesquisarCPFAlt;
    private javax.swing.JCheckBox StatusCliente;
    public javax.swing.JFormattedTextField jFormattedCEPAlterar;
    public javax.swing.JFormattedTextField jFormattedCPFAlterar;
    public javax.swing.JFormattedTextField jFormattedCelularAlterar;
    public javax.swing.JFormattedTextField jFormattedNascimentoAlterar;
    public javax.swing.JFormattedTextField jFormattedRGAlterar;
    public javax.swing.JFormattedTextField jFormattedTelefoneAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
