package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by пк on 13.06.2017.
 */
public class Asteroid {
    static Texture texture;
    Vector2 position;
    float speed;
    float angle;
    float scale;
    Circle circle;

    public Asteroid(){
        if (texture == null) {
            texture = new Texture("asteroid64.png");
        }

        position = new Vector2(1280+(float)Math.random()*1280, (float)Math.random()*720);
        speed = 4.0f+ (float)Math.random() * 4.0f;
        angle = (float)Math.random()*360;
        scale = 0.5f + (float)Math.random() * 2.0f;
        circle = new Circle(position.x, position.y, 32*scale);
    }

    public void recreate() {
        position.x = 1280+(float)Math.random()*1280;
        position.y = (float)Math.random()*720;
        speed = 4.0f+ (float)Math.random() * 4.0f;
        angle = (float)Math.random()*360;
        scale = 0.5f + (float)Math.random() * 2.0f;
        circle.radius = 32 * scale;

    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x - 32, position.y - 32, 32, 32, 64, 64, scale,
                scale, angle, 0,0, 64, 64, false, false);

    }
    public void update(){
        position.x -= speed;
        circle.x = position.x;
        circle.y = position.y;
        angle += speed / 2;
        if(position.x < -100){
            recreate();
        }
    }
}
