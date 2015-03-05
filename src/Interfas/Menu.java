/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author MujicaM
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("...::Menu Pacman::..");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_Inicio = new javax.swing.JPanel();
        Panel_Registrar = new javax.swing.JPanel();
        Boton_Registrar = new javax.swing.JButton();
        LabelId = new javax.swing.JLabel();
        LabelColor = new javax.swing.JLabel();
        LabelPass = new javax.swing.JLabel();
        CampoID = new javax.swing.JTextField();
        CampoPass = new javax.swing.JTextField();
        LabelIdMaxCararteres = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        Panel_Jugar = new javax.swing.JPanel();
        Boton_Arcade = new javax.swing.JButton();
        Boton_Multijugador = new javax.swing.JButton();
        Panel_Acerca = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_Acerca = new javax.swing.JTextArea();
        Panel_IniciarSesion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout Panel_InicioLayout = new javax.swing.GroupLayout(Panel_Inicio);
        Panel_Inicio.setLayout(Panel_InicioLayout);
        Panel_InicioLayout.setHorizontalGroup(
            Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        Panel_InicioLayout.setVerticalGroup(
            Panel_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inicio", Panel_Inicio);

        Boton_Registrar.setText("Registrar");

        LabelId.setText("ID Username:");

        LabelColor.setText("Color:");

        LabelPass.setText("Contraseña:");

        CampoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIDActionPerformed(evt);
            }
        });
        CampoID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoIDKeyTyped(evt);
            }
        });

        LabelIdMaxCararteres.setText("Maximo 12 caracteres");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Amarillo", "Blanco", "Morado", "Verde" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_RegistrarLayout = new javax.swing.GroupLayout(Panel_Registrar);
        Panel_Registrar.setLayout(Panel_RegistrarLayout);
        Panel_RegistrarLayout.setHorizontalGroup(
            Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistrarLayout.createSequentialGroup()
                .addGroup(Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_RegistrarLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Boton_Registrar))
                    .addGroup(Panel_RegistrarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelId)
                            .addComponent(LabelColor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelPass, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_RegistrarLayout.createSequentialGroup()
                                .addGroup(Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoPass, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(CampoID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelIdMaxCararteres))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        Panel_RegistrarLayout.setVerticalGroup(
            Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistrarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelId)
                    .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIdMaxCararteres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelColor)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPass)
                    .addComponent(CampoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(Boton_Registrar)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Registrar", Panel_Registrar);

        Boton_Arcade.setText("Modo Arcade");
        Boton_Arcade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ArcadeActionPerformed(evt);
            }
        });

        Boton_Multijugador.setText("Modo Multijugador");
        Boton_Multijugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_MultijugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_JugarLayout = new javax.swing.GroupLayout(Panel_Jugar);
        Panel_Jugar.setLayout(Panel_JugarLayout);
        Panel_JugarLayout.setHorizontalGroup(
            Panel_JugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_JugarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Boton_Arcade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(Boton_Multijugador)
                .addGap(28, 28, 28))
        );
        Panel_JugarLayout.setVerticalGroup(
            Panel_JugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_JugarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(Panel_JugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Multijugador)
                    .addComponent(Boton_Arcade))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jugar", Panel_Jugar);

        Area_Acerca.setEditable(false);
        Area_Acerca.setColumns(20);
        Area_Acerca.setRows(5);
        Area_Acerca.setText("******************************Creditos***********************************\n*                   Proyecto de Tecnicas de programacion 3\n*                                      Docente: Jhannlys Bello.\n*                                             elaborado por:\n*                                                 Laura Arias\n*                                            Deivys Rodriguez\n*                                                Miguel Mujica\n*                                           Reinaldo Gonzalez\n*                                           Anthony Filgueira \n*************************************************************************");
        jScrollPane1.setViewportView(Area_Acerca);

        javax.swing.GroupLayout Panel_AcercaLayout = new javax.swing.GroupLayout(Panel_Acerca);
        Panel_Acerca.setLayout(Panel_AcercaLayout);
        Panel_AcercaLayout.setHorizontalGroup(
            Panel_AcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AcercaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_AcercaLayout.setVerticalGroup(
            Panel_AcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Acerca", Panel_Acerca);

        javax.swing.GroupLayout Panel_IniciarSesionLayout = new javax.swing.GroupLayout(Panel_IniciarSesion);
        Panel_IniciarSesion.setLayout(Panel_IniciarSesionLayout);
        Panel_IniciarSesionLayout.setHorizontalGroup(
            Panel_IniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        Panel_IniciarSesionLayout.setVerticalGroup(
            Panel_IniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Iniciar Sesion", Panel_IniciarSesion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_ArcadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ArcadeActionPerformed
        //aqui llamamos al juego contra la GPU
    }//GEN-LAST:event_Boton_ArcadeActionPerformed

    private void Boton_MultijugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_MultijugadorActionPerformed
        //Aqui llamamos al socket y todo lo q requiera el juego multijugador
    }//GEN-LAST:event_Boton_MultijugadorActionPerformed

    private void CampoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIDActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
//validar maximo de la cadena
    private void CampoIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoIDKeyTyped
        String Caracteres = CampoID.getText();
        if (Caracteres.length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_CampoIDKeyTyped

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area_Acerca;
    private javax.swing.JButton Boton_Arcade;
    private javax.swing.JButton Boton_Multijugador;
    private javax.swing.JButton Boton_Registrar;
    private javax.swing.JTextField CampoID;
    private javax.swing.JTextField CampoPass;
    private javax.swing.JLabel LabelColor;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelIdMaxCararteres;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JPanel Panel_Acerca;
    private javax.swing.JPanel Panel_IniciarSesion;
    private javax.swing.JPanel Panel_Inicio;
    private javax.swing.JPanel Panel_Jugar;
    private javax.swing.JPanel Panel_Registrar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
