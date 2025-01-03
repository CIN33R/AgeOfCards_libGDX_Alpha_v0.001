package ageofcards.codingbat.com.gfx.assets.cards.staticcards;

import ageofcards.codingbat.com.gfx.assets.cards.Card;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class StaticCard extends Card {

    private TextureRegion texture;

    public StaticCard(TextureRegion texture, int id, String name) {
        super(id, name);
        this.texture = texture;
    }

    public TextureRegion getTexture() {
        return texture;
    }

}
