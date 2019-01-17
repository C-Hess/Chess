package org.duckdns.azraeltrooper.gui;

import java.awt.Color;
import java.awt.Graphics;

public class DrawStringUtils {
	public static final Color DEFAULT_COLOR = Color.WHITE;
	
	public static void drawStringMiddle(Graphics g, String string) {
	    drawStringMiddle(g, string, DEFAULT_COLOR);
	}
	
    public static void drawStringMiddle(Graphics g, String string, Color color) {
        g.setColor(color);
        g.drawString(string, ChessBoardPanel.CANVAS_DIM.width/2 - g.getFontMetrics().stringWidth(string)/2,  ChessBoardPanel.CANVAS_DIM.height/2 - g.getFontMetrics().getHeight()/2);
    }
}
