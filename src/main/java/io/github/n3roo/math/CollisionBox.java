package io.github.n3roo.math;

public class CollisionBox {

    private Vec2f position;
    private Vec2f dimensions;

    /**
     * It creates a collision box. It is a square, with the (x, y) position being the top left corner.
     * @param x x position (top left corner)
     * @param y y position (top left corner)
     * @param width width of the collision box
     * @param height width of the collision box
     */
    public CollisionBox(float x, float y, float width, float height){
        this.position = new Vec2f(x, y);
        this.dimensions = new Vec2f(width, height);
    }

    public CollisionBox(Vec2f position, Vec2f dimensions){
        this.position = position;
        this.dimensions = dimensions;
    }

    public float getX(){
        return position.x;
    }

    public float getY(){
        return position.y;
    }

    public float getWidth(){
        return dimensions.x;
    }

    public float getHeight(){
        return dimensions.y;
    }

    public Vec2f getPosition(){
        return position;
    }

    public Vec2f getDimensions(){
        return dimensions;
    }
}
