package ageofcards.codingbat.com.game.assets.screens;

import ageofcards.codingbat.com.game.utils.GameHandler;
import ageofcards.codingbat.com.gfx.assets.cards.CardActor;
import ageofcards.codingbat.com.gfx.utils.CardHandler;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class TestScreen implements Screen{

    GameHandler game;
    Screen parent;
    Stage stage;

    CardActor testCard;

    public TestScreen(GameHandler game) {
        this.game = game;
        this.parent = this;
        stage = new Stage(new ScreenViewport());
        testCard = CardHandler.getCardHandler().getTestCardActorArray().get(0);
        testCard.setPosition(100, 100);

        stage.addActor(testCard);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(delta);
        stage.draw();
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
