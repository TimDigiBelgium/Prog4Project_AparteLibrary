/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Media Markt
 */
public class ReadFromFile {
    
    private String digiDriverText;
    
    public ReadFromFile(String filename) throws FileNotFoundException
    {
      //  char US;
    //    US = 0x1F;
//String s = "hello" + record_separator + "world"
    
    digiDriverText = new Scanner(new File(filename)).useDelimiter("\\Z").next();
  // digiDriverText = digiDriverText.replace(Character.toString(US),"$");
    }

    /**
     * @return the digiDriverText
     */
    public  String getDigiDriverText() {
        return digiDriverText;
    }

    /**
     * @param digiDriverText the digiDriverText to set
     */
    public void setDigiDriverText(String digiDriverText) {
        this.digiDriverText = digiDriverText;
    }
}
