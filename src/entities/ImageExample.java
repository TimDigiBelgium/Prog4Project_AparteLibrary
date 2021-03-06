/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author Media Markt
 */
@Entity
public class ImageExample implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String MimeType;  // Useful to store the mime type incase you want to send it back via a servlet.
 
  // We mark up the byte array with a long object datatype, setting the fetch type to lazy.
  @Lob
  @Basic(fetch=FetchType.LAZY) // this gets ignored anyway, but it is recommended for blobs
  private  byte[]  imageFile;     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageExample)) {
            return false;
        }
        ImageExample other = (ImageExample) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ImageExample[ id=" + id + " ]";
    }

   

   

    /**
     * @return the MimeType
     */
    public String getMimeType() {
        return MimeType;
    }

    /**
     * @return the imageFile
     */
    public byte[] getImageFile() {
        return imageFile;
    }

    /**
     * @param imageFile the imageFile to set
     */
    public void setImageFile(byte[] imageFile) {
        this.imageFile = imageFile;
    }
    
    
    
}
