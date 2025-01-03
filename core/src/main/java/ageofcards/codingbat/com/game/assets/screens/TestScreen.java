package ageofcards.codingbat.com.game.assets.screens;

import ageofcards.codingbat.com.game.utils.GameHandler;
import ageofcards.codingbat.com.gfx.utils.CardHandler;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class TestScreen implements Screen{

    GameHandler game;
    Screen parent;
    Stage stage;

    public TestScreen(GameHandler game) {
        this.game = game;
        this.parent = this;
        stage = new Stage();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float v) {
        game.getBatch().begin();
        game.getBatch().draw(CardHandler.getCardHandler().getTestCardArray().get(0).getTexture(), 100, 100);
        game.getBatch().end();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
