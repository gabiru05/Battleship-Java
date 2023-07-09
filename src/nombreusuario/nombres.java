/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nombreusuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.Timer;
 



/**
 *
 * @author kenet
 */
public class nombres extends javax.swing.JFrame {

    /**
     * Creates new form nombres
     */
    int xMouse,yMouse;
    String play1, play2;
    Player1 nose = new Player1();
    EsperaTurno2 Turno2 = new EsperaTurno2();
 
    public nombres() {
        initComponents();
        nombreusuario1.setFocusable(false);
        nombreusuario2.setFocusable(false);
 
    }
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        imagenbarco = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        textoiniciosesion = new javax.swing.JLabel();
        usuario1 = new javax.swing.JLabel();
        nombreusuario1 = new javax.swing.JTextField();
        separadorusuario1 = new javax.swing.JSeparator();
        usuario2 = new javax.swing.JLabel();
        nombreusuario2 = new javax.swing.JTextField();
        separadorusuario2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        MensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusable(false);
        setLocationByPlatform(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setPreferredSize(new java.awt.Dimension(800, 500));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenbarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Portada.jpg"))); // NOI18N
        imagenbarco.setText("jLabel1");
        BG.add(imagenbarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 500));

        logo.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LogoaPortadaBattleShip.jpeg"))); // NOI18N
        logo.setText("Battleship");
        BG.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        textoiniciosesion.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        textoiniciosesion.setText("INICIAR JUEGO");
        BG.add(textoiniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        usuario1.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        usuario1.setText("JUGADOR 1");
        BG.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 30));

        nombreusuario1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        nombreusuario1.setForeground(new java.awt.Color(153, 153, 153));
        nombreusuario1.setText("Por favor. Ingrese su nombre");
        nombreusuario1.setBorder(null);
        nombreusuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreusuario1MousePressed(evt);
            }
        });
        nombreusuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreusuario1ActionPerformed(evt);
            }
        });
        BG.add(nombreusuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 330, 20));

        separadorusuario1.setBackground(new java.awt.Color(0, 0, 0));
        separadorusuario1.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(separadorusuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 330, 20));

        usuario2.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        usuario2.setText("JUGADOR 2");
        BG.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 30));

        nombreusuario2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        nombreusuario2.setForeground(new java.awt.Color(153, 153, 153));
        nombreusuario2.setText("Por favor. Ingrese su nombre");
        nombreusuario2.setBorder(null);
        nombreusuario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreusuario2MousePressed(evt);
            }
        });
        nombreusuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreusuario2ActionPerformed(evt);
            }
        });
        BG.add(nombreusuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 330, 20));

        separadorusuario2.setBackground(new java.awt.Color(0, 0, 0));
        separadorusuario2.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(separadorusuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 330, 20));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTRAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        BG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SALIR");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, 40));

        content.setBackground(new java.awt.Color(255, 255, 255));

        MensajeError.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        MensajeError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(443, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        BG.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreusuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreusuario1ActionPerformed

    }//GEN-LAST:event_nombreusuario1ActionPerformed

    private void nombreusuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreusuario2ActionPerformed
      
    }//GEN-LAST:event_nombreusuario2ActionPerformed

    
    private void nombreusuario1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreusuario1MousePressed
         if (nombreusuario1.getText().equals("Por favor. Ingrese su nombre")){
            nombreusuario1.setFocusable(true);
            nombreusuario1.requestFocusInWindow();
            nombreusuario1.setText("");
            nombreusuario1.setForeground(Color.black);
        }
        if(nombreusuario2.getText().isEmpty()){
            nombreusuario2.setFocusable(false);
            nombreusuario2.setText("Por favor. Ingrese su nombre");
            nombreusuario2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nombreusuario1MousePressed

    private void nombreusuario2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreusuario2MousePressed
         if (nombreusuario2.getText().equals("Por favor. Ingrese su nombre")){
            nombreusuario2.setFocusable(true);
            nombreusuario2.requestFocusInWindow();
            nombreusuario2.setText("");
            nombreusuario2.setForeground(Color.black);
        }
        if(nombreusuario1.getText().isEmpty()){
            nombreusuario1.setFocusable(false);
            nombreusuario1.setText("Por favor. Ingrese su nombre");
            nombreusuario1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nombreusuario2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
   String nombreUsuario1 = nombreusuario1.getText();
    String nombreUsuario2 = nombreusuario2.getText();
    String patron = "^[a-zA-Z]{2,}[a-zA-Z0-9ñÑáéíóúÁÉÍÓÚüÜ]*$";

    if (nombreUsuario1.matches(patron) && nombreUsuario2.matches(patron)) {
        if (nombreUsuario1.equals(nombreUsuario2)) {
            // Mostrar mensaje de error en el panel
            MensajeError.setText("Los nombres de usuario son iguales.");
            MensajeError.setVisible(true);
        } else{ 
            
            play1 = nombreusuario1.getText();
            play2 = nombreusuario2.getText();
            Turno2.setVisible(true);
            this.setVisible(false);
            nose.name1.setText(play1);
            Turno2.nombre2.setText("Es turno de "+play1+"...");
            Turno2.Player2.setText(play2);
        }
    }else {
        // Mostrar mensaje de error en el panel
        MensajeError.setText("Los datos ingresados no son correctos.");
        MensajeError.setVisible(true);
    }
        
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

         //No se que hace pero me parece puede ser removido -- mientras lo comento
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
 
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imagenbarco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    public static javax.swing.JTextField nombreusuario1;
    private javax.swing.JTextField nombreusuario2;
    private javax.swing.JSeparator separadorusuario1;
    private javax.swing.JSeparator separadorusuario2;
    private javax.swing.JLabel textoiniciosesion;
    private javax.swing.JLabel usuario1;
    private javax.swing.JLabel usuario2;
    // End of variables declaration//GEN-END:variables
}
