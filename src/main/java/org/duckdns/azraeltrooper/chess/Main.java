package org.duckdns.azraeltrooper.chess;

import javax.swing.JFrame;

import org.duckdns.azraeltrooper.chess.resourcemanager.TextureManager;
import org.duckdns.azraeltrooper.gui.ChessBoardPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private final static Logger LOG = LoggerFactory.getLogger(Main.class);
    private JFrame applicationWindow;
    private TextureManager textureManager;
    private ChessBoardPanel chessBoardPanel;
    
    public void init() {
        initWindow();
        initResources();
        initGame();
    }
    
    private void initWindow() {
        applicationWindow = new JFrame("Chess");
        applicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationWindow.setVisible(true);
        chessBoardPanel = new ChessBoardPanel();
        applicationWindow.add(chessBoardPanel);
        applicationWindow.pack();
        applicationWindow.setLocationRelativeTo(null);
    }
    
    private void initResources() {
        textureManager = new TextureManager();
    }
    
    private void initGame() {
        ChessGame game = new ChessGame(this);
        chessBoardPanel.setGame(game);
    }
    
    
    public TextureManager getTextureManager() {
        return textureManager;
    }
    
    
    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }
}
