package io.github.n3roo.world;

import io.github.n3roo.graphics.Animation;
import io.github.n3roo.graphics.Graphics;
import io.github.n3roo.math.CollisionBox;

public abstract class GameObject {

    // The position of the entity
    public float x = 0;
    public float y = 0;

    // The site of the entity
    public float width = 1;
    public float height = 1;

    // The rotation (in degrees)
    public float rotation = 0;

    // Animations
    public Animation[] animations;
    public int currentAnimation = 0;

    public void update(){

    }

    public void render(){
        animations[currentAnimation].play();

        Graphics.setRotation(rotation);
        Graphics.setColor(1, 1, 1, 1);
        Graphics.drawImage(animations[currentAnimation].getImage(), x, y, width, height);
        Graphics.setRotation(0);

        Graphics.setColor(1, 0, 0, 1);
        Graphics.fillStrokeRect(getCollisionBox().getX(),getCollisionBox().getY(),
                getCollisionBox().getWidth(), getCollisionBox().getHeight(),
                0.05f);
    }

    abstract public CollisionBox getCollisionBox();
}
