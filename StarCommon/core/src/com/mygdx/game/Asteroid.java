package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by пк on 13.06.2017.
 */
public class Asteroid {
    static Texture texture;
    Vector2 position;
    float speed;

    public Asteroid(){
        if (texture == null) {
            texture = new Texture("asteroid64.png");
        }

        position = new Vector2(1280+(float)Math.random()*1280, (float)Math.random()*720);
        speed = 4.0f+ (float)Math.random() * 4.0f;
    }

    public void recreate() {
        position.x = 1280+(float)Math.random()*1280;
        position.y = (float)Math.random()*720;
        speed = 4.0f+ (float)Math.random() * 4.0f;
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x - 32, position.y - 32);
    }
    public void update(){
        position.x -= speed;
        if(position.x < -100){
            recreate();
        }
    }
}
