/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import viewmodel.Game;
import model.GameObject;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author cacan
 */
public class TouchMe extends GameObject
{
    public TouchMe()
    {
        super(0, 0, "TouchMe");
    }
    
    // Constructor with player position.
    public TouchMe(int x, int y)
    {
        super(x, y, "TouchMe");
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set player shape.
        object.setColor(Color.decode("#ffff99"));
        object.fillRect(x, y, 30, 30);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize player bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
