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
public class Hurdle extends Entity{
    
    public Hurdle(float x, float y, int t) {
        super(x, y, true, false, true, false, Entity.AI.STATIC);
        // TODO: Add textures
    }
    
    public Hurdle(float x, float y){
        this(x, y, 1);
    }
    
}
