/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author Media Markt
 */
@Entity
public class LabelFormat implements Serializable {
    private static long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    //het gekozen formaatnummer moet niet mee in de database worden opgeslagen
    @Transient
    private String formatNumber;
    
    //een formaat heeft een opsomming van al zijn velden, dit komt niet in de database
    //doel is om een leesbaar overzicht van alle gebruikte velden weer te kunnen geven
    @Transient
    private String summary;
   
    private String labelFormatCode;
    @Column(columnDefinition="TEXT")
    private String DigiDriverCode;
    @ManyToOne
    private Size labelFormatSize;
    @ManyToOne
    private Device device;
   
    @OneToOne
    private ImageExample image;
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LabelFormat)) {
            return false;
        }
        LabelFormat other = (LabelFormat) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.formatNumber + ": " + this.device + "_" + this.getLabelFormatSize().getWidth() + "x" + this.getLabelFormatSize().getHeight() + "_" + this.labelFormatCode;
    }

    /**
     * @return the fields
     */
    

    /**
     * @return the image
     */
  

    /**
     * @return the labelFormatCode
     */
    public String getLabelFormatCode() {
        return labelFormatCode;
    }

    /**
     * @param labelFormatCode the labelFormatCode to set
     */
    public void setLabelFormatCode(String labelFormatCode) {
        this.labelFormatCode = labelFormatCode;
    }

    /**
     * @return the DigiDriverCode
     */
  

    /**
     * @return the labelFormatSize
     */
    public Size getLabelFormatSize() {
        return labelFormatSize;
    }

    /**
     * @param labelFormatSize the labelFormatSize to set
     */
    public void setLabelFormatSize(Size labelFormatSize) {
        this.labelFormatSize = labelFormatSize;
    }

    /**
     * @return the device
     */
    public Device getDevice() {
        return device;
    }

    /**
     * @param device the device to set
     */
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * @return the labelImage
     */
   

    /**
     * @return the labelimage
     */
 
   
    public ImageExample getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(ImageExample image) {
        this.image = image;
    }

    /**
     * @return the DigiDriverCode
     */
 

    /**
     * @param DigiDriverCode the DigiDriverCode to set
     */
    public void setDigiDriverCode(String DigiDriverCode) {
        this.DigiDriverCode = DigiDriverCode;
    }

    /**
     * @return the DigiDriverCode
     */
    public String getDigiDriverCode() {
        return DigiDriverCode;
    }

    /**
     * @return the formatNumber
     */
    public String getFormatNumber() {
        return formatNumber;
    }

    /**
     * @param formatNumber the formatNumber to set
     */
    public void setFormatNumber(String formatNumber) {
        this.formatNumber = formatNumber;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the fields
     */
  

    /**
     * @param labelimage the labelimage to set
     */
   
    
}
