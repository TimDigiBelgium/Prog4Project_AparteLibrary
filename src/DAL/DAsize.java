/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Services.SizeService;
import entities.Size;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAsize implements IDAsize {

    @Override
    public Size findBySizeNumber(int deviceNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Size> findAllSizes() {


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("libLabelFormatsPU");
    EntityManager em = emf.createEntityManager();
    SizeService service = new SizeService(em);

    em.getTransaction().begin();
    em.getTransaction().commit();

     
    List<Size> emps = service.findAllSizes();
   

    em.close();
    emf.close();
        return emps;
    }
    
}
