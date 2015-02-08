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
public class TemperatureFields implements Serializable {
    @Id
    private int id;

    public TemperatureFields() {
    }
    
    public TemperatureFields(int id)
    {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private String fieldName;
    private String fieldCode;


    

 

    @Override
    public String toString() {
        return getFieldName();
    }

    /**
     * @return the fieldName
     */
    public String isFieldName() {
        return getFieldName();
    }

    /**
     * @param fieldName the fieldName to set
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * @return the fieldCode
     */
    public String getFieldCode() {
        return fieldCode;
    }

    /**
     * @param fieldCode the fieldCode to set
     */
    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    /**
     * @return the fieldName
     */
    public String getFieldName() {
        return fieldName;
    }
 
}
