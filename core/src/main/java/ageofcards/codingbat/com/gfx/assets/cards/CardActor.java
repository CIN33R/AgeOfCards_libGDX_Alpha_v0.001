package ageofcards.codingbat.com.gfx.assets.cards;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class CardActor extends Actor {

    public static final int ON_SCREEN_DEFAULT_HEIGHT = 64, ON_SCREEN_DEFAULT_WIDTH = 64;
    private int defaultWorldTileHeight, defaultWorldTileWidth, id;
    private String name;
    private TextureRegion texture;

    public CardActor(TextureRegion texture, int id, String name) {
        this.texture = texture;
        this.id = id;
        this.name = name;

        defaultWorldTileHeight = ON_SCREEN_DEFAULT_HEIGHT;
        defaultWorldTileWidth = ON_SCREEN_DEFAULT_WIDTH;
    }

    public int getDefaultWorldTileHeight() {
        return defaultWorldTileHeight;
    }

    public int getDefaultWorldTileWidth() {
        return defaultWorldTileWidth;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TextureRegion getTexture() {
        return texture;
    }
}
