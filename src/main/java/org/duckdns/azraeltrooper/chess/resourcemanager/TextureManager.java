package org.duckdns.azraeltrooper.chess.resourcemanager;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextureManager {
    public static final File SPRITE_TEXTURE_FILE = new File(TextureManager.class.getClassLoader()
            .getResource("textures/chessPieces.png").getFile());
    public static final File BOARD_TEXTURE_FILE = new File(TextureManager.class.getClassLoader()
            .getResource("textures/board.png").getFile());
    public static final int BOARD_TEXTURE_TILE_SIZE = 50;
    public static final int SPRITE_TEXTURE_TILE_SIZE = 50;

    
    
    private final static Logger LOG = LoggerFactory.getLogger(TextureManager.class);
    
    private BufferedImage loadedSpriteTexture;
    private BufferedImage loadedBoardTexture;
    
    public TextureManager() {
        try {
            loadedSpriteTexture = ImageIO.read(SPRITE_TEXTURE_FILE);
            loadedBoardTexture = ImageIO.read(BOARD_TEXTURE_FILE);

        } catch(IOException e) {
            LOG.info("An error occured while loading the textures", e);
        }
    }
    
    public BufferedImage getLoadedSpriteTexture() {
        return loadedSpriteTexture;
    }

    public BufferedImage getLoadedBoardTexture() {
        return loadedBoardTexture;
    }
}
