/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Allister
 */
public class Player extends Entity{
    private boolean jumping = false;
    private int weapon;     // TODO: Enumerate weapons
    
    public Player(float x, float y, int t) {
        super(x, y, true, false, false, true, AI.PLAYER);
        addSprite(new String[]{"Slope"});
        setTexture(t, 0);
    }
    
    public Player(float x, float y){
        this(x, y, 1);
    }
    
    public void setJumping(boolean j){
        jumping = j;
    }
    
    public void jump(){
        if(!jumping){
            setVY(.2f);
            setY(getY()+.4f);
            jumping = true;
        }
    }
}
