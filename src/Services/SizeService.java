/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.Device;
import entities.Size;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Media Markt
 */
public class SizeService {
    
    protected EntityManager em;
    public SizeService(EntityManager em) {
    this.em = em;
    }
    
     public List<Size> findAllSizes() {
    Query query = em.createQuery("SELECT e FROM Size e");
    return (List<Size>) query.getResultList();
  }
    
}
