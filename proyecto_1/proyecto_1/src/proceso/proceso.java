package proceso;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Josue
 */
public class proceso extends javax.swing.JFrame {
    int Contador;//Contador del total de procesos que se van ingresando
    int NProceso;//Carga el número de procesos ejecutándose
    int rafaga=0;//Carga la ráfaga en ejecución
    int quantum1=0;//Carga el quantum en ejecución
    int ResiduoRafaga=0;//Carga el residuo en ejecución
    int TiempoProceso=0;//Carga el tiempo que se dura procesando
    int ValorBarra;//Carga el progreso de la Barra
    int CantidadProcesos;//Número de procesos terminados

    /**
     * Creates new form proceso
     */
    public proceso() {
        initComponents();
        jTIngreso.setBackground(Color.CYAN);
        jTIngreso.setForeground(Color.black);
        jTFinal.setBackground(Color.white);
        Quantum.grabFocus();
        BM.setEditable(false);
       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        Rafaga = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTIngreso = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLNumeroProceso = new javax.swing.JTextField();
        jLPorcentajeProceso = new javax.swing.JTextField();
        jPBEstado = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLCantidadProcesos = new javax.swing.JTextField();
        jLCantidadTiempo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTFinal = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Quantum = new javax.swing.JTextField();
        RAM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        BM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Quantum");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("         Rafaga");

        Nom.setBackground(new java.awt.Color(204, 255, 255));
        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });

        Rafaga.setBackground(new java.awt.Color(204, 255, 255));
        Rafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RafagaActionPerformed(evt);
            }
        });

        Agregar.setBackground(new java.awt.Color(0, 204, 255));
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Iniciar.setBackground(new java.awt.Color(0, 204, 255));
        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        jTIngreso.setBackground(new java.awt.Color(0, 255, 255));
        jTIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Rafaga", "Quantum", "CPU%", "Estado", "Nombre de pro", "RAM", "BM", "Usuario"
            }
        ));
        jTIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTIngresoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTIngreso);

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("        LISTA DE PROCESOS");

        jLNumeroProceso.setBackground(new java.awt.Color(204, 255, 255));
        jLNumeroProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNumeroProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLNumeroProcesoActionPerformed(evt);
            }
        });

        jLPorcentajeProceso.setBackground(new java.awt.Color(204, 255, 255));
        jLPorcentajeProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLPorcentajeProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLPorcentajeProcesoActionPerformed(evt);
            }
        });

        jPBEstado.setBackground(new java.awt.Color(0, 102, 153));
        jPBEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPBEstado.setForeground(new java.awt.Color(0, 255, 255));
        jPBEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jLabel7.setBackground(new java.awt.Color(51, 51, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Proceso");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("        HISTORICO PROCESOS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("CANTIDAD PROCESO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("TIEMPO PROCESO");

        jLCantidadProcesos.setBackground(new java.awt.Color(204, 255, 255));
        jLCantidadProcesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadProcesosActionPerformed(evt);
            }
        });

        jLCantidadTiempo.setBackground(new java.awt.Color(204, 255, 255));
        jLCantidadTiempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadTiempoActionPerformed(evt);
            }
        });

        jTFinal.setBackground(new java.awt.Color(51, 153, 255));
        jTFinal.setForeground(new java.awt.Color(0, 0, 102));
        jTFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Rafaga", "Quantum", "Tiempo Final"
            }
        ));
        jScrollPane4.setViewportView(jTFinal);

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Salir ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Reiniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Nombre de proceso ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Usuario");

        Quantum.setBackground(new java.awt.Color(204, 255, 255));
        Quantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantumActionPerformed(evt);
            }
        });

        RAM.setBackground(new java.awt.Color(204, 255, 255));
        RAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAMActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("RAM");

        Usuario.setBackground(new java.awt.Color(204, 255, 255));
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        BM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BM.setForeground(new java.awt.Color(51, 51, 255));
        BM.setText("BM");
        BM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(53, 53, 53)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Quantum)
                                .addComponent(Nom, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(49, 49, 49)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RAM, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Rafaga, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addComponent(Usuario, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(BM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLCantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(Rafaga)
                    .addComponent(Quantum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RAM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPBEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantidadProcesos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void RAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RAMActionPerformed

    private void QuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantumActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Reiniciar();
        limpiartabla();
        limpiartabla2();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Cerando procesos....=>");
        System.exit(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLCantidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadTiempoActionPerformed

    private void jLCantidadProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadProcesosActionPerformed

    private void jLPorcentajeProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLPorcentajeProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPorcentajeProcesoActionPerformed

    private void jLNumeroProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLNumeroProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLNumeroProcesoActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
        new Thread(new Hilo()).start(); //Crea un nuevo hilo
        Iniciar();
    }//GEN-LAST:event_IniciarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        if((Integer.parseInt(RAM.getText()))<=1024){
            Ingresar();
            Quantum.grabFocus();
            Quantum.setText("");
            RAM.setText("");
            Nom.setText("");
            Usuario.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "La memrio es insuficiente para este proces*****");
            RAM.setText(null);
            RAM.grabFocus();
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void RafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RafagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RafagaActionPerformed

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void BMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BMActionPerformed

    private void jTIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTIngresoMouseClicked
        // TODO add your handling code here:
       Dener();
    }//GEN-LAST:event_jTIngresoMouseClicked

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
            java.util.logging.Logger.getLogger(proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proceso().setVisible(true);
            }
        });
    }
    private class Hilo implements Runnable{ //Objeto de tipo Hilo con extension ejectubale
    @Override
    public void run(){
        int estado=1; //Estado de while que indica si se puede seguir o no
        int i=0; // contador de while
        
        while(estado!=0){
            while(i<Contador){ //Recorrer las filas
                Cargar(i);
                if(ResiduoRafaga!=0 && ResiduoRafaga>quantum1){ //Ejecutando Procesos
                    for(int c=1; c<=quantum1; c++){
                        jTIngreso.setValueAt("Procesando",i,4);
                        ResiduoRafaga--;
                        Barra(rafaga,ResiduoRafaga);
                        Pintar();
                        jTIngreso.setValueAt(String.valueOf(ResiduoRafaga),i,3);
                        TiempoProceso++;
                        Dormir();
                    }
                    jTIngreso.setValueAt("Espera",i,4);
                    if(ResiduoRafaga==0){
                        jTIngreso.setValueAt("Terminado",i,4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        jPBEstado.setValue(0);
                    }
            }else{
                if(ResiduoRafaga>0 && quantum1!=0){
                    while(ResiduoRafaga>0){
                        jTIngreso.setValueAt("Procesando",i,4);
                        ResiduoRafaga--;
                        Barra(rafaga,ResiduoRafaga);
                        Pintar();
                        jTIngreso.setValueAt(String.valueOf(ResiduoRafaga),i,3);
                        TiempoProceso++;
                        Dormir();
                    }
                    jTIngreso.setValueAt("Espera",i,4);
                    if(ResiduoRafaga==0 && quantum1!=0){
                        jTIngreso.setValueAt("Terminado",i,4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        jPBEstado.setValue(0);
                     }
                    }else{
                        if(ResiduoRafaga==0 && quantum1!=0){
                            jTIngreso.setValueAt("Terminado",i,4);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            jPBEstado.setValue(0);
                        }
                    }
                }
                jLNumeroProceso.setText(String.valueOf("")); //Borrar contenido
                jLPorcentajeProceso.setText(String.valueOf(""));
                i++;
            }
            i=0;
            jLNumeroProceso.setText(String.valueOf("")); //Borrar contenido
            jLPorcentajeProceso.setText(String.valueOf(""));
            
        }
            
    }
}
public void Dormir(){
    try{
        Thread.sleep(700); //Dormir sistema
    }catch(InterruptedException ex){
        Logger.getLogger(proceso.class.getName()).log(Level.SEVERE,null,ex);
    }

}

public void Cargar(int i){ //Carga los valores de la Tabla
    NProceso=(int)jTIngreso.getValueAt(i,0);
    rafaga=parseInt((String)(jTIngreso.getValueAt(i,1)));
    quantum1=parseInt((String)(jTIngreso.getValueAt(i,2)));
    ResiduoRafaga=parseInt((String)(jTIngreso.getValueAt(i,3)));
    if(NProceso>0){
        jLNumeroProceso.setText(String.valueOf(NProceso));
    }
}

public void Ingresar(){ //Ingresar proceso a la tabla
    DefaultTableModel modelo=(DefaultTableModel) jTIngreso.getModel();

    Contador ++;
    Object[] miTabla = new Object[9];
    miTabla[0]= Contador;
    miTabla[1]= Rafaga.getText();
    miTabla[2]= Quantum.getText();
    miTabla[3]= Rafaga.getText();
    miTabla[4]= "Listo";
    miTabla[5]= Nom.getText();
    miTabla[6]= RAM.getText();
    miTabla[7]= BM.getText();
    miTabla[8]= Usuario.getText();
    modelo.addRow(miTabla);
    jTIngreso.setModel(modelo);
    Rafaga.setText(null);
    Rafaga.grabFocus();
}

public void Informe(int c){
    DefaultTableModel modelo2 = (DefaultTableModel) jTFinal.getModel();

    Object[] miTabla= new Object[5];
    miTabla[0]= c+1;
    miTabla[1]= Rafaga;
    miTabla[2]= Quantum;
    miTabla[3]= TiempoProceso+" Segundos";
    miTabla[4]= "Terminado";
    modelo2.addRow(miTabla);
    jTFinal.setModel(modelo2);

    CantidadProcesos++;
    jLCantidadProcesos.setText(String.valueOf(CantidadProcesos+" Terminados"));
    jLCantidadTiempo.setText(String.valueOf(TiempoProceso+" Segundos"));
}

public void Borrar(int c){ //Elimina los registros de la tabla procesos
    jTIngreso.setValueAt(0,c,0);
    jTIngreso.setValueAt("0",c,1);
    jTIngreso.setValueAt("0",c,2);
    jTIngreso.setValueAt("0",c,3);
    jTIngreso.setValueAt("******",c,4);
}

   public void Barra(int rafaga, int residuo){ //Calcula porcentaje de la barra y su progreso
        int Rafaga = rafaga;
        int valor=100/rafaga;
        int porcentaje=100-(valor*residuo);
        ValorBarra=porcentaje;
        jLPorcentajeProceso.setText(String.valueOf(ValorBarra+"%"));
}

    public void Pintar(){
        jPBEstado.setValue(ValorBarra);
        jPBEstado.repaint();
    }

    public void Iniciar(){ //Inicia la secuencia de procesos
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        Rafaga.setVisible(false);
        Quantum.setVisible(false);
        Agregar.setVisible(false);
        Iniciar.setVisible(false);
        Nom.setVisible(false);
        BM.setVisible(false);
        RAM.setVisible(false);
        Usuario.setVisible(false);
        jLabel10.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        
        
}
      public void Reiniciar(){ //Inicia la secuencia de procesos
        jLabel2.setVisible(true );
        jLabel1.setVisible(true );
        Rafaga.setVisible(true );
        Nom.setVisible(true );
        Agregar.setVisible(true );
        Iniciar.setVisible(true );
        Quantum.setVisible(true);
        Quantum.setText("");
        Rafaga.setText("");
        jLPorcentajeProceso.setText("");
        jLNumeroProceso.setText("");
        jPBEstado.setValue(0);
        jLCantidadProcesos.setText("");
        jLCantidadTiempo.setText("");
        Contador = 0 ;
        NProceso=0;
        rafaga=0;
        quantum1=0;
        ResiduoRafaga=0;
        TiempoProceso=0;
        ValorBarra=0;
        CantidadProcesos=0;
        Nom.setVisible(true);
        BM.setVisible(true);
        RAM.setVisible(true);
        Usuario.setVisible(true);
         jLabel10.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        
       
}
     public void limpiartabla(){
    DefaultTableModel temp = (DefaultTableModel) jTIngreso.getModel();
    int filas = jTIngreso.getRowCount();

    for (int a = 0; filas > a; a++) {
        temp.removeRow(0);
    }

     
   }
     public void limpiartabla2(){
      DefaultTableModel temp = (DefaultTableModel) jTFinal.getModel();
    int filas = jTFinal.getRowCount();

    for (int a = 0; filas > a; a++) {
        temp.removeRow(0);
    }
       
}
    public void Dener(){
      try{
        Thread.sleep(70000); //Dormir sistema
    }catch(InterruptedException ex){
        Logger.getLogger(proceso.class.getName()).log(Level.SEVERE,null,ex);
    }
     }
     
    
       
     
    
        
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField BM;
    private javax.swing.JButton Iniciar;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Quantum;
    private javax.swing.JTextField RAM;
    private javax.swing.JTextField Rafaga;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jLCantidadProcesos;
    private javax.swing.JTextField jLCantidadTiempo;
    private javax.swing.JTextField jLNumeroProceso;
    private javax.swing.JTextField jLPorcentajeProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jPBEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTFinal;
    private javax.swing.JTable jTIngreso;
    // End of variables declaration//GEN-END:variables
}
