/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Services.LabelFormatService;
import entities.Device;
import entities.LabelFormat;
import entities.Size;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Media Markt
 */
public class DAlabelformat implements IDAlabelformat{

    

    @Override
    public List<LabelFormat> findAllFormats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LabelFormat findBySelection(Device device, Size size, String labelFormatCode) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("libLabelFormatsPU");
    EntityManager em = emf.createEntityManager();
    LabelFormatService service = new LabelFormatService(em);

    em.getTransaction().begin();
    em.getTransaction().commit();

     
    LabelFormat emps = service.findLabelFormat(device, size, labelFormatCode);
   

    em.close();
    emf.close();
        return emps; }
    
}
