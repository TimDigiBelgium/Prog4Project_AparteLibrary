/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import DAL.DAFields;
import DAL.DATemperatureFields;

/**
 *
 * @author Media Markt
 */
public class GenerateFormatCode {

    public GenerateFormatCode(int[] lstFields, int temperatureField) {
        this.lstFields = lstFields;
        this.temperatureField = temperatureField;
    }
    
    private int[] lstFields;
    private int temperatureField;
    
    
       public String GetlabelFormatCode()
      {
          String labelCode = "";
          
          if (lstFields!=null) {
               DAFields dbfields = new DAFields();
          for (int i = 0; i < lstFields.length; i++) {
              labelCode += dbfields.findByFieldNumber(lstFields[i]+1).getFieldCode();
          }
          }
         
          
          if (temperatureField!=-1) {
          DATemperatureFields dbtempfields = new DATemperatureFields();
          labelCode += dbtempfields.findByFieldNumber(temperatureField + 1).getFieldCode();
          }
          
        return labelCode;
          
      }
       
          public String GetlabelFormatSummary()
      {
          String summary = "";
          
          if (lstFields!=null) {
               DAFields dbfields = new DAFields();
          for (int i = 0; i < lstFields.length; i++) {
              summary += "\n" + dbfields.findByFieldNumber(lstFields[i]+1).getFieldName();
          }
          }
         
          
          if (temperatureField!=-1) {
          DATemperatureFields dbtempfields = new DATemperatureFields();
          summary += "\n" + dbtempfields.findByFieldNumber(temperatureField + 1).getFieldName();
          }
          
        return summary;
          
      }

    
}
