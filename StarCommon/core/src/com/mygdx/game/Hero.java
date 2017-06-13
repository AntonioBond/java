package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by пк on 13.06.2017.
 */
public class Hero {
    Texture texture;
    Vector2 position;
    float speed;

    public Hero(){
        texture = new Texture("ship64.png");
        speed = 8.0f;
        position = new Vector2(100,328);

    }

    public void render(SpriteBatch batch){
        batch.draw(texture, position.x, position.y);
    }

    public void update(){

    }
}
