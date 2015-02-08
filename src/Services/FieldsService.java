/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.Fields;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Media Markt
 */
public class FieldsService {
     protected EntityManager em;
    public FieldsService(EntityManager em) {
    this.em = em;
    }
    
    
    public List<Fields> findAllFields() {
    Query query = em.createQuery("SELECT e FROM Fields e");
    return (List<Fields>) query.getResultList();}
    
    public Fields findField(int id){
    return em.find(Fields.class, id);
    }
//    return (List<Size>) query.getResultList();
  }

