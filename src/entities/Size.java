/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Media Markt
 */
@Entity
public class Size implements Serializable {   
    @Id
    private int id;
    
    public Size()
    {}
    
    public Size(int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private int width;
    private int height;

   
    @Override
    public String toString() {
        return width + "x" + height;
    }

    /**
     * @return the Width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(int Width) {
        this.width = Width;
    }

    /**
     * @return the Height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param Height the Height to set
     */
    public void setHeight(int Height) {
        this.height = Height;
    }
    
}
