package controllers;

import inputs.KeyboardInputs;
import entities.Player;
import entities.Picture;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import static java.lang.Double.max;
import static java.lang.Math.random;
import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 * The Canvas where everything is drawn, it's the visual that makes the game visible
 * @author Santi
 */
public class GamePanel extends javax.swing.JPanel{
    
    private final Game game;
    
    /**
     * Creates new form GamePanel
     */
    public GamePanel(Game game) {
        this.game = game;
        
        addKeyListener(new KeyboardInputs(this));
        this.setFocusable(true);
        setPanelSize();
    }

    /**
     * sets the size of the panel (organization)
     */
    private void setPanelSize() {
        Dimension size = new Dimension(1280, 720);
        setPreferredSize(size);
    }

    /**
     * MAIN draw tool and draws EVERYTHING that needs to ever be drawn in the entire game
     * @param g pencil
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        game.render(g);
    }

    /**
     * returns game
     */
    public Game getGame() {
        return game;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
