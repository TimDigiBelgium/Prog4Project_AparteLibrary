/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import entities.Size;
import java.util.List;

/**
 *
 * @author Media Markt
 */
public interface IDAsize {
     //  public void save(Device device);
  // public boolean update(Account account);
    public Size findBySizeNumber(int deviceNumber);
   //public boolean delete(Account account);
    public List<Size> findAllSizes();
}
