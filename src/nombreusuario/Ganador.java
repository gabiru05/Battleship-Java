/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nombreusuario;

import javax.swing.JScrollPane;

/**
 *
 * @author kenet
 */
public class Ganador extends javax.swing.JFrame {

    
    boolean[][] celdasR1 = new boolean[10][10];
    boolean[][] celdasR2 = new boolean[10][10];
    boolean gana11 = false;
    boolean gana2 = false;
    public Ganador() {
        initComponents();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                celdasR1[i][j] = Player1.redcells1[j][i];     
            }      
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                celdasR2[i][j] = Player2.redcells2[j][i];     
            }      
        }
        
        
        
        
        MATRIZ1.setText(imprimir1());
        MATRIZ2.setText(imprimir2());
        GANADOR1.setVisible(false);
        GANADOR1.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GANADOR2 = new javax.swing.JLabel();
        GANADOR1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MATRIZ2 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        MATRIZ1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Capitan2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 160, 200));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Capitan1.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, 200));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JUGADOR 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 25, 160, 45));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("JUGADOR1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 25, 160, 45));

        GANADOR2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        GANADOR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GANADOR2.setText("GANADOR");
        jPanel1.add(GANADOR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 160, 30));

        GANADOR1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        GANADOR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GANADOR1.setText("GANADOR");
        jPanel1.add(GANADOR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 160, 30));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);
        jScrollPane2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jScrollPane2.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setWheelScrollingEnabled(false);

        MATRIZ2.setBorder(null);
        MATRIZ2.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        MATRIZ2.setFocusable(false);
        MATRIZ2.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(MATRIZ2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 160, 160));

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setFocusable(false);
        jScrollPane4.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jScrollPane4.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setWheelScrollingEnabled(false);

        MATRIZ1.setBorder(null);
        MATRIZ1.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        MATRIZ1.setAutoscrolls(false);
        MATRIZ1.setFocusable(false);
        MATRIZ1.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(MATRIZ1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 160, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String imprimir1() {
    StringBuilder sb = new StringBuilder();
    sb.append("  ");
    for (int i = 1; i <= 9; i++) {
        sb.append(i + " ");
    }
    sb.append("\n");
    for (int i = 1; i <= 9; i++) {
        sb.append((char)('A' + i - 1) + " ");
        for (int j = 1; j <= 9; j++) {
            if (celdasR1[i][j]) {
                sb.append("X ");
            } else {
                sb.append("- ");
            }
        }
        if (i < 9) {
            sb.append("\n");
        }
    }
    return sb.toString();
}



    
    public String imprimir2() {
    StringBuilder sb = new StringBuilder();
    sb.append("  ");
    for (int i = 1; i <= 9; i++) {
        sb.append(i + " ");
    }
    sb.append("\n");
    for (int i = 1; i <= 9; i++) {
        sb.append((char)('A' + i - 1) + " ");
        for (int j = 1; j <= 9; j++) {
            if (celdasR2[i][j]) {
                sb.append("X ");
            } else {
                sb.append("- ");
            }
        }
        if (i < 9) {
            sb.append("\n");
        }
    }
    return sb.toString();
}


    
   public void mostrar_ganador(boolean ganador) {
        if(ganador == true){
         GANADOR1.setVisible(true);
         GANADOR2.setVisible(false);
        }
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
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ganador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GANADOR1;
    private javax.swing.JLabel GANADOR2;
    private javax.swing.JTextPane MATRIZ1;
    private javax.swing.JTextPane MATRIZ2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
