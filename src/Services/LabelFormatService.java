/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.Device;
import entities.LabelFormat;
import entities.Size;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Media Markt
 */
public class LabelFormatService {
     protected EntityManager em;
    public LabelFormatService(EntityManager em) {
    this.em = em;
  }
    
     public LabelFormat findLabelFormat(Device device, Size size, String labelformatcode) {
    Query query = em.createQuery("SELECT e FROM LabelFormat e Where e.device=:devicenr AND e.labelFormatSize=:sizenr AND e.labelFormatCode=:labelformatcode");
    query.setParameter("devicenr", device);
    query.setParameter("sizenr", size);
    query.setParameter("labelformatcode", labelformatcode);
    
    List<LabelFormat> results = query.getResultList();
    LabelFormat foundEntity = null;
    if(!results.isEmpty()){
    // ignores multiple results
    foundEntity = results.get(0);
    }
    
    return foundEntity;}
    
}
