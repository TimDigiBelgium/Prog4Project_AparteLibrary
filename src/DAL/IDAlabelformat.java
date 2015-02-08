/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import entities.Device;
import entities.LabelFormat;
import entities.Size;
import java.util.List;

/**
 *
 * @author Media Markt
 */
public interface IDAlabelformat {
   
    
    public LabelFormat findBySelection(Device device, Size size, String labelFormatCode);
  
    public List<LabelFormat> findAllFormats();
    
}
