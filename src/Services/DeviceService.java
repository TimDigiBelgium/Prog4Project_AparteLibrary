/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entities.Device;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Media Markt
 */
public class DeviceService {
    protected EntityManager em;
    public DeviceService(EntityManager em) {
    this.em = em;
  }
    public void createDevice(String name) {
    Device dev = new Device();
    dev.setDeviceName(name);
    em.persist(dev);
  }

  public void removeDevice(int id) {
    Device emp = findDevice(id);
    if (emp != null) {
      em.remove(emp);
    }
  }

 

  public Device findDevice(int id) {
    return em.find(Device.class, id);
  }

  public List<Device> findAllDevices() {
    Query query = em.createQuery("SELECT e FROM Device e");
    return (List<Device>) query.getResultList();
  }

    
}
