/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.TemperatureFields;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Media Markt
 */
public class TemperatureFieldsService {
     protected EntityManager em;
    public TemperatureFieldsService(EntityManager em) {
    this.em = em;
    }
    
    
    public List<TemperatureFields> findAllFields() {
    Query query = em.createQuery("SELECT e FROM TemperatureFields e");
    return (List<TemperatureFields>) query.getResultList();}

    
    public TemperatureFields findField(int id){
    return em.find(TemperatureFields.class, id);
    }
  }

