package org.duckdns.azraeltrooper.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JPanel;

import org.duckdns.azraeltrooper.chess.ChessGame;

public class ChessBoardPanel extends JPanel {
    public static final Dimension CANVAS_DIM = new Dimension(800, 800);
    public static final Dimension BOARD_DIM = new Dimension(600,600);
    public static final Point TOPLEFT_BOARD_POINT = new Point(100,100);
    public static final Point BOTRIGHT_BOARD_POINT = new Point(700,700);
    public static final int BOARD_TILE_SIZE = BOARD_DIM.width/8;
    
    private static final long serialVersionUID = 1L;
    private ChessGame game;
    
    public ChessBoardPanel() {
        this.setPreferredSize(CANVAS_DIM);
        this.setMinimumSize(CANVAS_DIM);
        this.setMaximumSize(CANVAS_DIM);

    };
    
    public void setGame(ChessGame game) {
        this.game = game;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if(game != null) {
            game.renderState(g2d);
        } else {
            g2d.setColor(Color.MAGENTA);
            g2d.fillRect(0, 0, CANVAS_DIM.width, CANVAS_DIM.height);
            DrawStringUtils.drawStringMiddle(g, "No game loaded", Color.BLACK);
        }
    }

}
