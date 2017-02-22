package com.textinput.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MytextinputGame extends ApplicationAdapter implements Input.TextInputListener {
	SpriteBatch batch;
	Texture img;
    String testisana;
    String nimi;
	@Override
	public void create () {

		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		Gdx.input.getTextInput(this, "Testi", "", "jotain tekstiä tahan");
        System.out.println(getSana());


    }

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

    @Override
    public void input(String text) {
        testisana = text;
        //pref.putString ("nimi", playername);
        System.out.println(testisana);
    }
    public String getSana() {
        return testisana;
    }


    @Override
    public void canceled() {

    }
}
