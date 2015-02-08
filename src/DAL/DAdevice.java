/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Services.DeviceService;
import entities.Device;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DAdevice implements IDAdevice {

//    @Override
//    public void save(Device device) {
//        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AddLabelFormatsPU");
//        EntityManager entityManager = emf.createEntityManager();
//        
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.persist(device);
//        transaction.commit();
//        emf.close();
//      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     *
     * @param deviceNumber
     * @return
     */
    @Override
    public Device findByDeviceNumber(int deviceNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public List<Device> findAllDevices() {


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("libLabelFormatsPU");
    EntityManager em = emf.createEntityManager();
    DeviceService service = new DeviceService(em);

    em.getTransaction().begin();
    em.getTransaction().commit();

     
    List<Device> emps = service.findAllDevices();
   

    em.close();
    emf.close();
        return emps;
    }
    
}
