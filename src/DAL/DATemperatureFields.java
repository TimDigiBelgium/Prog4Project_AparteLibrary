/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Services.TemperatureFieldsService;
import entities.TemperatureFields;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DATemperatureFields implements IDATemperatureFields {

    @Override
    public TemperatureFields findByFieldNumber(int temperatureFieldNumber) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("libLabelFormatsPU");
    EntityManager em = emf.createEntityManager();
    TemperatureFieldsService service = new TemperatureFieldsService(em);

    em.getTransaction().begin();
    em.getTransaction().commit();

     
    TemperatureFields emps = service.findField(temperatureFieldNumber);
   

    em.close();
    emf.close();
        return emps;  }

    @Override
    public List<TemperatureFields> findAllTemperatureFields() {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("libLabelFormatsPU");
    EntityManager em = emf.createEntityManager();
    TemperatureFieldsService service = new TemperatureFieldsService(em);

    em.getTransaction().begin();
    em.getTransaction().commit();

     
    List<TemperatureFields> emps = service.findAllFields();
   

    em.close();
    emf.close();
        return emps;   }
    
}
