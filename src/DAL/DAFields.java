/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Services.FieldsService;
import entities.Fields;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAFields implements IDAfields {

    @Override
    public Fields findByFieldNumber(int fieldNumber) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("libLabelFormatsPU");
    EntityManager em = emf.createEntityManager();
    FieldsService service = new FieldsService(em);

    em.getTransaction().begin();
    em.getTransaction().commit();

     
    Fields emps = service.findField(fieldNumber);
   

    em.close();
    emf.close();
        return emps;      }

    @Override
    public List<Fields> findAllFields() {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("libLabelFormatsPU");
    EntityManager em = emf.createEntityManager();
    FieldsService service = new FieldsService(em);

    em.getTransaction().begin();
    em.getTransaction().commit();

     
    List<Fields> emps = service.findAllFields();
   

    em.close();
    emf.close();
        return emps;   }

   

    }
    
    

