/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Media Markt
 */
@Entity
public class Device implements Serializable {
    
    @Id
    private int id;

    public Device() {
    }
    public Device(int id)
    {
        this.id = id;
    }
    
    private String deviceName;

   
    @Override
    public String toString() {
        return getDeviceName();
    }
   

    /**
     * @return the deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName the deviceName to set
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
}
