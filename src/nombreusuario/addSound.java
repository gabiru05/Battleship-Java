package nombreusuario;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 * @author Ruiz
 */
public class addSound {

    public Clip Sound;

    public void Setsound() {
        try {
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(getClass().getResource("/Sonidos/Navy.wav"));
            Sound = AudioSystem.getClip();
            Sound.open(audioInputStream);
            Sound.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void SetMusic_icon(JLabel labelName, String root) {
        System.out.println("JLabel size: " + labelName.getWidth() + "x" + labelName.getHeight());

        java.net.URL imgURL = getClass().getResource(root);
        if (imgURL != null) {
            ImageIcon image = new ImageIcon(imgURL);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),
                    Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
            labelName.repaint();
        } else {
            System.err.println("Erro archivo no encontrado: " + root);
        }
    }

    public void cargar_Imag_Soun(JLabel Music_icono) {
        // cargar tambien Icono predeterminado de Musica
        boolean first_time = true;
        if (first_time) {
            SetMusic_icon(Music_icono, "/IMAGENES/music_on.png");
            // Setsound();
            first_time = false;
        }
    }

}