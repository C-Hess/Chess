package org.duckdns.azraeltrooper.chess;

import java.awt.Color;
import java.awt.Graphics2D;

import org.duckdns.azraeltrooper.chess.resourcemanager.TextureManager;
import org.duckdns.azraeltrooper.gui.ChessBoardPanel;

public class ChessGame {

    private Main mainApp;
    
    public ChessGame(Main application) {
        mainApp = application;
    }
    
    public void renderState(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, ChessBoardPanel.CANVAS_DIM.width, ChessBoardPanel.CANVAS_DIM.height);
        g.setColor(Color.WHITE);
        g.fillPolygon(new int[] {
                0,0,ChessBoardPanel.CANVAS_DIM.width
        }, new int[] {
                0, ChessBoardPanel.CANVAS_DIM.height, ChessBoardPanel.CANVAS_DIM.height
        }, 3);
        for(int y = 0; y < 8; y ++) {
            for(int x = 0; x < 8; x ++) {
                if(x % 2 == y % 2) {
                    g.drawImage(mainApp.getTextureManager().getLoadedBoardTexture(),
                            ChessBoardPanel.TOPLEFT_BOARD_POINT.x + ChessBoardPanel.BOARD_TILE_SIZE * x,
                            ChessBoardPanel.TOPLEFT_BOARD_POINT.y + ChessBoardPanel.BOARD_TILE_SIZE * y,
                            ChessBoardPanel.TOPLEFT_BOARD_POINT.x + ChessBoardPanel.BOARD_TILE_SIZE * (x+1),
                            ChessBoardPanel.TOPLEFT_BOARD_POINT.y + ChessBoardPanel.BOARD_TILE_SIZE * (y+1),
                            0,
                            0,
                            TextureManager.BOARD_TEXTURE_TILE_SIZE,
                            TextureManager.BOARD_TEXTURE_TILE_SIZE,
                            null);
                } else {
                    g.drawImage(mainApp.getTextureManager().getLoadedBoardTexture(),
                            ChessBoardPanel.TOPLEFT_BOARD_POINT.x + ChessBoardPanel.BOARD_TILE_SIZE * x,
                            ChessBoardPanel.TOPLEFT_BOARD_POINT.y + ChessBoardPanel.BOARD_TILE_SIZE * y,
                            ChessBoardPanel.TOPLEFT_BOARD_POINT.x + ChessBoardPanel.BOARD_TILE_SIZE * (x+1),
                            ChessBoardPanel.TOPLEFT_BOARD_POINT.y + ChessBoardPanel.BOARD_TILE_SIZE * (y+1),
                            TextureManager.BOARD_TEXTURE_TILE_SIZE,
                            0,
                            TextureManager.BOARD_TEXTURE_TILE_SIZE * 2,
                            TextureManager.BOARD_TEXTURE_TILE_SIZE,
                            null);
                }
            }
        }
        
    }

}
