package io.github.asteroids;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import io.github.managers.GameInputProcessor;
import io.github.managers.GameKeys;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private int Width;
    private int Height;
    private OrthographicCamera camera;

    @Override
    public void create() {
        Width = Gdx.graphics.getWidth();
        Height = Gdx.graphics.getHeight();
        camera = new OrthographicCamera(Width, Height);
        camera.translate(Width/2, Height/2);
        camera.update();

        Gdx.input.setInputProcessor(
            new GameInputProcessor()
        );

    }


    @Override
    public void resize(int width, int height) {}



    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        GameKeys.update();

    }

    @Override
    public void dispose() {
    }
}
