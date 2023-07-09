/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nombreusuario;

//Gaby
//gaby2

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;



/**
 *
 * @author kenet
 */
public class Player1 extends javax.swing.JFrame {
    

    /**
     * Creates new form Player1
     */
    int xMouse,yMouse;
    public Player1() {
        initComponents();
        
        agregarBotones(CuadroBarcos);
        Coordenadas.setVisible(false);
        MensajeCoordenadas.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Juego = new javax.swing.JPanel();
        CuadroBarcos = new FondoPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ConfirmarP = new javax.swing.JPanel();
        Confirmar = new javax.swing.JLabel();
        Music_boton = new javax.swing.JToggleButton();
        Music_icono = new javax.swing.JLabel();
        MensajeCoordenadas = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        Coordenadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        Juego.setBackground(new java.awt.Color(255, 255, 255));
        Juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout CuadroBarcosLayout = new javax.swing.GroupLayout(CuadroBarcos);
        CuadroBarcos.setLayout(CuadroBarcosLayout);
        CuadroBarcosLayout.setHorizontalGroup(
            CuadroBarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        CuadroBarcosLayout.setVerticalGroup(
            CuadroBarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );

        Juego.add(CuadroBarcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 405, 405));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("9");
        Juego.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 45, 45));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("2");
        Juego.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 30, 45, 45));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("3");
        Juego.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 45, 45));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("4");
        Juego.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 45, 45));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("5");
        Juego.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 45, 45));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("6");
        Juego.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 30, 45, 45));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("7");
        Juego.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 45, 45));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("8");
        Juego.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 30, 45, 45));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("1");
        Juego.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 45, 45));

        jLabel14.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("I");
        Juego.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 45, 45));

        jLabel15.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("A");
        Juego.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 45, 45));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("B");
        Juego.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, 45, 45));

        jLabel17.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("C");
        Juego.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 45, 45));

        jLabel18.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("D");
        Juego.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, 45, 45));

        jLabel19.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("E");
        Juego.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 45, 45));

        jLabel20.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("F");
        Juego.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 295, 45, 45));

        jLabel21.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("G");
        Juego.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 45, 45));

        jLabel22.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("H");
        Juego.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 385, 45, 45));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Capitan1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        Juego.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 160, 200));

        ConfirmarP.setBackground(new java.awt.Color(0, 0, 0));

        Confirmar.setBackground(new java.awt.Color(255, 255, 255));
        Confirmar.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Confirmar.setText("CONFIRMAR");
        Confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ConfirmarPLayout = new javax.swing.GroupLayout(ConfirmarP);
        ConfirmarP.setLayout(ConfirmarPLayout);
        ConfirmarPLayout.setHorizontalGroup(
            ConfirmarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Confirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        ConfirmarPLayout.setVerticalGroup(
            ConfirmarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Juego.add(ConfirmarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 100, 40));

        Music_boton.setText("Music");
        Music_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Music_botonActionPerformed(evt);
            }
        });
        Juego.add(Music_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));
        Juego.add(Music_icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 60, 50));

        MensajeCoordenadas.setBackground(new java.awt.Color(0, 0, 0));
        MensajeCoordenadas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        MensajeCoordenadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MensajeCoordenadas.setText("Ingrese coordenadas de ataque");
        Juego.add(MensajeCoordenadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 220, 20));

        name1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Juego.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 160, 30));

        Coordenadas.setForeground(new java.awt.Color(153, 153, 153));
        Coordenadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Coordenadas.setText("A,1");
        Coordenadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoordenadasMouseClicked(evt);
            }
        });
        Coordenadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoordenadasActionPerformed(evt);
            }
        });
        Juego.add(Coordenadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Juego, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Juego, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    
   
    int aparecerTxtCoordenadas = 0;
    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
                                       
// In the confirmation button code:
    confirmedRectangles.add(new ArrayList<>(currentRectangle));
    for (Point p : currentRectangle) {
        clearLabels(labels, p.x, p.y);
    }
    currentRectangle.clear();
    for (List<Point> rectangle : confirmedRectangles) {
        for (Point p : rectangle) {
            if (labels[p.x][p.y] != null) {
                labels[p.x][p.y].setOpaque(true);
                labels[p.x][p.y].setBackground(Color.RED);
            }
        }
    }
    // Make the confirm button disappear
    Confirmar.setVisible(false);
    ConfirmarP.setVisible(false);

    // Check if there are any empty spaces in the matrix
    for (int i = 0; i < labels.length; i++) {
        for (int j = 0; j < labels[i].length; j++) {
            if (labels[i][j] != null && labels[i][j].getBackground() == Color.red) {
    // El botón Confirmar debería reaparecer si hay un espacio vacío en la matriz
    Confirmar.setVisible(true);
    ConfirmarP.setVisible(true);
    break;
}

        }
    }

    aparecerTxtCoordenadas++;
    rectanglesDrawn++;
    
        if (aparecerTxtCoordenadas == 4){
            Coordenadas.setVisible(true);
            MensajeCoordenadas.setVisible(true);
            //imprimirMatriz();
            Player2 hola = new Player2();
            hola.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ConfirmarMouseClicked
    //Audio
    private Clip Sound;
    
    private void Music_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Music_botonActionPerformed
      if (Music_boton.isSelected()){
          //this.setLocationRelativeTo(this);
        SetMusic_icon(Music_icono, "/IMAGENES/music_off.png");
        System.out.println("Icono of");
        Music_icono.repaint();
        
        //Stop sound 
        if (Sound != null) {
            Sound.stop();
        }
        
        }
      else{
           SetMusic_icon(Music_icono, "/IMAGENES/music_on.png");
        System.out.println("Icono on");
         Music_icono.repaint();
         
         //restart sound
         Setsound();
         
         
    
        
          
      }
    }//GEN-LAST:event_Music_botonActionPerformed

    private void CoordenadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoordenadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoordenadasActionPerformed

    private void CoordenadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoordenadasMouseClicked
        
            if (Coordenadas.getText().equals("A,1")){
                Coordenadas.setFocusable(true);
                Coordenadas.requestFocusInWindow();
                Coordenadas.setText("");
                Coordenadas.setForeground(Color.black);
            }   
        
    }//GEN-LAST:event_CoordenadasMouseClicked
public void Setsound(){
try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/Sonidos/Outbreak.wav"));
            Sound = AudioSystem.getClip();
            Sound.open(audioInputStream);
            Sound.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }}
    public void SetMusic_icon (JLabel labelName, String root){
    java.net.URL imgURL = getClass().getResource(root);
    if (imgURL != null) {
        ImageIcon image= new ImageIcon(imgURL);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight() , Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
   
    } else {
        System.err.println("Erro archivo no encontrado: " + root);
    }
}
public void cargar_Imag_Soun(){
//cargar tambien Icono predeterminado de Musica
        boolean first_time = true;
        if (first_time){
        SetMusic_icon(Music_icono, "/IMAGENES/music_on.png");
        //Setsound();
        first_time= false;
        }
}
     
   public class FondoPanel extends JPanel {
    private Image imagen;
    //...
    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/IMAGENES/Mar.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
 
        setOpaque(false);
        super.paint(g);
        }
    //...
    }
   
/*int drawnRectanglesCount = 0;
int rectanglesDrawn = 0;
JLayeredPane Orden = new JLayeredPane();
int[] rectangleSizes = {2, 2, 3, 4};
int currentX = -1;
int currentY = -1;
JLabel[][] labels = new JLabel[10][10];
List<List<Point>> confirmedRectangles = new ArrayList<>();
List<Point> currentRectangle = new ArrayList<>();

public void agregarBotones(JPanel panel) {
    panel.setLayout(new GridLayout(9, 9));
    JLabel[][] labels = new JLabel[10][10];
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            final int x = j;
            final int y = i;
            labels[j][i] = new JLabel();
            labels[j][i].setPreferredSize(new Dimension(45, 45));
            labels[j][i].setBorder(BorderFactory.createLineBorder(Color.WHITE));          
            labels[j][i].addMouseListener(new MouseAdapter() {
                boolean isVertical = false;
int direction = 0; // Agregamos una variable para rastrear la dirección del rectángulo

@Override
public void mouseClicked(MouseEvent e) {
    if (rectanglesDrawn >= rectangleSizes.length) return;
    System.out.println("Label presionado en la posición: (" + x + ", " + y + ")");
    
    int size = rectangleSizes[rectanglesDrawn];
    
    for (Point p : currentRectangle) {
        clearLabels(labels, p.x, p.y);
    }
    currentRectangle.clear();
    
    
    // Check if the new position is already occupied by a confirmed rectangle
    Confirmar.setVisible(true); 
    ConfirmarP.setVisible(true);
    boolean canDraw = false;
    for (int d = 0; d < 4; d++) { // Verificamos si el rectángulo se puede dibujar en cada una de las cuatro direcciones
        direction = (direction + 1) % 4; // Cambiamos la dirección cada vez que se verifica una nueva dirección
        canDraw = true;
        if (direction == 0 || direction == 2) { // Verificamos si la dirección es hacia la derecha o hacia la izquierda
            for (int i = 0; i < size; i++) {
                int newX = x + i;
                if (direction == 2) newX = x - i; // Si la dirección es hacia la izquierda, restamos en lugar de sumar
                if (newX > 9 || newX < 1) { // Si el nuevo valor de X está fuera de los límites, no dibujamos el rectángulo
                  
                    canDraw = false;
                    break;
                }
                for (List<Point> confirmedRectangle : confirmedRectangles) {
                    for (Point p : confirmedRectangle) {
                        if (p.x == newX && p.y == y) {
                            canDraw = false;
                            break;
                        }
                    }
                    if (!canDraw) break;
                }
            }
        } else { // La dirección es hacia arriba o hacia abajo
            for (int i = 0; i < size; i++) {
                int newY = y + i;
                if (direction == 3) newY = y - i; // Si la dirección es hacia arriba, restamos en lugar de sumar
                if (newY > 9 || newY < 1) { // Si el nuevo valor de Y está fuera de los límites, no dibujamos el rectángulo
                    canDraw = false;
                    break;
                }
                for (List<Point> confirmedRectangle : confirmedRectangles) {
                    for (Point p : confirmedRectangle) {
                        if (p.x == x && p.y == newY) {
                            canDraw = false;
                            break;
                        }
                    }
                    if (!canDraw) break;
                }
            }
        }
        if (canDraw) break; // Si encontramos una dirección en la que el rectángulo se puede dibujar, salimos del bucle
    }
    if (canDraw) {
        if (direction == 0 || direction == 2) { // Dibujamos el rectángulo hacia la derecha o hacia la izquierda
            for (int i = 0; i < size; i++) {
                int newX = x + i;
                if (direction == 2) newX = x - i; // Si la dirección es hacia la izquierda, restamos en lugar de sumar
                if (newX > 9 || newX < 1) continue; // Si el nuevo valor de X está fuera de los límites, no dibujamos esa celda
                if (labels[newX][y] != null) {
                    labels[newX][y].setOpaque(true);
                    labels[newX][y].setBackground(Color.RED);
                    
                    currentRectangle.add(new Point(newX, y));
                }
            }
        } else { // Dibujamos el rectángulo hacia arriba o hacia abajo
            for (int i = 0; i < size; i++) {
                int newY = y + i;
                if (direction == 3) newY = y - i; // Si la dirección es hacia arriba, restamos en lugar de sumar
                if (newY > 9 || newY < 1) continue; // Si el nuevo valor de Y está fuera de los límites, no dibujamos esa celda
                if (labels[x][newY] != null) {
                    labels[x][newY].setOpaque(true);
                    labels[x][newY].setBackground(Color.RED);
                    
                    currentRectangle.add(new Point(x, newY));
                }
            }
        }
    }
    
    currentX = x;
    currentY = y;
    
    
}
            });
            panel.add(labels[j][i]); 
            
        }
    }
     cargar_Imag_Soun();
}



public void clearLabels(JLabel[][] labels, int x, int y) {
    if (x >= 1 && x <= 9 && y >= 1 && y <= 9 && labels[x][y] != null) {
        labels[x][y].setOpaque(false);
        labels[x][y].setBackground(null);
    }
}*/
   
   

int drawnRectanglesCount = 0;
int rectanglesDrawn = 0;
JLayeredPane Orden = new JLayeredPane();
int[] rectangleSizes = {2, 2, 3, 4};
int currentX = -1;
int currentY = -1;
JLabel[][] labels = new JLabel[10][10];
List<List<Point>> confirmedRectangles = new ArrayList<>();
List<Point> currentRectangle = new ArrayList<>();
boolean[][] celdasRojas = new boolean[10][10];

public void agregarBotones(JPanel panel) {
    panel.setLayout(new GridLayout(9, 9));
    JLabel[][] labels = new JLabel[10][10];
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            final int x = j;
            final int y = i;
            labels[j][i] = new JLabel();
            labels[j][i].setPreferredSize(new Dimension(45, 45));
            labels[j][i].setBorder(BorderFactory.createLineBorder(Color.WHITE));          
            labels[j][i].addMouseListener(new MouseAdapter() {
                boolean isVertical = false;
int direction = 0; // Agregamos una variable para rastrear la dirección del rectángulo

@Override
public void mouseClicked(MouseEvent e) {
    if (rectanglesDrawn >= rectangleSizes.length) return;
    System.out.println("Label presionado en la posición: (" + x + ", " + y + ")");
    
    int size = rectangleSizes[rectanglesDrawn];
    
    for (Point p : currentRectangle) {
        clearLabels(labels, p.x, p.y);
    }
    currentRectangle.clear();
    
    
    // Check if the new position is already occupied by a confirmed rectangle
    Confirmar.setVisible(true); 
    ConfirmarP.setVisible(true);
    boolean canDraw = false;
    for (int d = 0; d < 4; d++) { // Verificamos si el rectángulo se puede dibujar en cada una de las cuatro direcciones
        direction = (direction + 1) % 4; // Cambiamos la dirección cada vez que se verifica una nueva dirección
        canDraw = true;
        if (direction == 0 || direction == 2) { // Verificamos si la dirección es hacia la derecha o hacia la izquierda
            for (int i = 0; i < size; i++) {
                int newX = x + i;
                if (direction == 2) newX = x - i; // Si la dirección es hacia la izquierda, restamos en lugar de sumar
                if (newX > 9 || newX < 1) { // Si el nuevo valor de X está fuera de los límites, no dibujamos el rectángulo
                  
                    canDraw = false;
                    break;
                }
                for (List<Point> confirmedRectangle : confirmedRectangles) {
                    for (Point p : confirmedRectangle) {
                        if (p.x == newX && p.y == y) {
                            canDraw = false;
                            break;
                        }
                    }
                    if (!canDraw) break;
                }
            }
        } else { // La dirección es hacia arriba o hacia abajo
            for (int i = 0; i < size; i++) {
                int newY = y + i;
                if (direction == 3) newY = y - i; // Si la dirección es hacia arriba, restamos en lugar de sumar
                if (newY > 9 || newY < 1) { // Si el nuevo valor de Y está fuera de los límites, no dibujamos el rectángulo
                    canDraw = false;
                    break;
                }
                for (List<Point> confirmedRectangle : confirmedRectangles) {
                    for (Point p : confirmedRectangle) {
                        if (p.x == x && p.y == newY) {
                            canDraw = false;
                            break;
                        }
                    }
                    if (!canDraw) break;
                }
            }
        }
        if (canDraw) break; // Si encontramos una dirección en la que el rectángulo se puede dibujar, salimos del bucle
    }
    if (canDraw) {
        if (direction == 0 || direction == 2) { // Dibujamos el rectángulo hacia la derecha o hacia la izquierda
            for (int i = 0; i < size; i++) {
                int newX = x + i;
                if (direction == 2) newX = x - i; // Si la dirección es hacia la izquierda, restamos en lugar de sumar
                if (newX > 9 || newX < 1) continue; // Si el nuevo valor de X está fuera de los límites, no dibujamos esa celda
                if (labels[newX][y] != null) {
                    labels[newX][y].setOpaque(true);
                    labels[newX][y].setBackground(Color.RED);
                    celdasRojas[newX][y] = true; 
                    
                    currentRectangle.add(new Point(newX, y));
                }
            }
        } else { // Dibujamos el rectángulo hacia arriba o hacia abajo
            for (int i = 0; i < size; i++) {
                int newY = y + i;
                if (direction == 3) newY = y - i; // Si la dirección es hacia arriba, restamos en lugar de sumar
                if (newY > 9 || newY < 1) continue; // Si el nuevo valor de Y está fuera de los límites, no dibujamos esa celda
                if (labels[x][newY] != null) {
                    labels[x][newY].setOpaque(true);
                    labels[x][newY].setBackground(Color.RED);
                    celdasRojas[x][newY] = true; 
                    currentRectangle.add(new Point(x, newY));
                }
            }
        }
        redcells = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            redcells[i][j] = celdasRojas[i][j];
        }
    }
    }
    
    currentX = x;
    currentY = y;
    
    
}
            });
            panel.add(labels[j][i]); 
            
        }
    }
     cargar_Imag_Soun();
}

public static boolean[][] redcells;



public void clearLabels(JLabel[][] labels, int x, int y) {
    if (x >= 1 && x <= 9 && y >= 1 && y <= 9 && labels[x][y] != null) {
        labels[x][y].setOpaque(false);
        labels[x][y].setBackground(null);
        celdasRojas[x][y] = false; 
    }
}

                                


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
//            java.util.logging.Logger.getLogger(Player1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Player1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Player1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Player1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
 
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                new Player1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Confirmar;
    private javax.swing.JPanel ConfirmarP;
    private javax.swing.JTextField Coordenadas;
    private javax.swing.JPanel CuadroBarcos;
    private javax.swing.JPanel Juego;
    private javax.swing.JLabel MensajeCoordenadas;
    private javax.swing.JToggleButton Music_boton;
    private javax.swing.JLabel Music_icono;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel name1;
    // End of variables declaration//GEN-END:variables
}