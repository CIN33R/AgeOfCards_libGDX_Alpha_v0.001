package ageofcards.codingbat.com.gfx.assets.cards;

public abstract class Card {

    public static final int ON_SCREEN_DEFAULT_HEIGHT = 64, ON_SCREEN_DEFAULT_WIDTH = 64;

    private int defaultWorldTileHeight, defaultWorldTileWidth, id;
    private String name;

    public Card(int id, String name) {
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

}
