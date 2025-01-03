package ageofcards.codingbat.com.gfx.utils;

import ageofcards.codingbat.com.gfx.assets.cards.Card;
import ageofcards.codingbat.com.gfx.assets.cards.CardActor;
import ageofcards.codingbat.com.gfx.assets.cards.staticcards.TestCard;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class CardHandler {

    public static CardHandler cardHandler = null;

    private int spriteSheetHeight, spriteSheetWidth, spriteOnSheetHeight, spriteOnSheetWidth;

    private final String primaryColorSheetPath = "primaryColorSheet.png";

    private Array<CardActor> testCardArray;

    private CardHandler() {
        spriteOnSheetHeight = Card.ON_SCREEN_DEFAULT_HEIGHT;
        spriteOnSheetWidth = Card.ON_SCREEN_DEFAULT_WIDTH;
        spriteSheetHeight = 640;
        spriteSheetWidth = 640;

        testCardArray = new Array<>();
        createTestCardArray(primaryColorSheetPath, "primary color", testCardArray);
    }

    public static CardHandler getCardHandler() {
        if (cardHandler == null) {
            cardHandler = new CardHandler();
        }
        return cardHandler;
    }

    private void createTestCardArray(String path, String imageNamePrefix, Array<CardActor> testCardArray) {
        Texture sheet = new Texture(Gdx.files.internal(path));
        Pixmap pixmap = new Pixmap(Gdx.files.internal(path));

        int count = 0;

        for(int r = 0; r < sheet.getHeight(); r+=spriteOnSheetHeight) {
            for(int c = 0; c < sheet.getWidth(); c+=spriteOnSheetWidth) {
                boolean solidFound = false;
                for(int pixelR = 0; pixelR < Card.ON_SCREEN_DEFAULT_HEIGHT; pixelR++) {
                    for(int pixelC = 0; pixelC < Card.ON_SCREEN_DEFAULT_WIDTH; pixelC++) {
                        if(pixmap.getPixel(c+pixelC, r+pixelR) != 0) {
                            solidFound = true;
                        }
                    }
                }
                if(solidFound) {
                    testCardArray.add(new CardActor(new TextureRegion(sheet, c, r, spriteOnSheetWidth, spriteOnSheetHeight), count++, (imageNamePrefix+"_"+count)));
                }
            }
        }
    }

    public Array<CardActor> getTestCardActorArray() {
        return testCardArray;
    }
}
