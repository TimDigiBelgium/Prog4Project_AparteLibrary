/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import entities.LabelFormat;
import java.util.List;

/**
 *
 * @author Media Markt
 */
public class CreateFormatFile {
    
    private String digidriverTextCombined;
    private List<LabelFormat> labelformats;
    
    public CreateFormatFile(List<LabelFormat> labelformats){
        this.labelformats = labelformats;
        this.digidriverTextCombined = "";
        ChangeFormatNumbers();
    }
        
        //loop door de labelformats
        
        
        
    private void ChangeFormatNumbers(){

        
        for (int i = 0; i < this.labelformats.size(); i++) {
            //de formaatnummers in de digidrivertext aanpassen zodat het correct kan geinterpreteerd worden door de weegschaal
            String digidriverText;
            String oldFormatNumber;
            String newFormatNumber;
            if(this.labelformats.get(i)!=null) {
                
            
        
            digidriverText = this.labelformats.get(i).getDigiDriverCode();

            newFormatNumber = changeTargetFormat(this.labelformats.get(i).getFormatNumber());
        
            digidriverText = digidriverText.replace("AA0070", newFormatNumber);
            //toevoegen aan de gecombineerde tekst
            this.digidriverTextCombined = this.getDigidriverTextCombined()  + digidriverText + "\n";
            }
        }
    }
    
     private String changeTargetFormat(String targetFormat)
        {

           //de "F" uit de nummer halen
           targetFormat = targetFormat.substring(1);
         

            int targetNumber;
            targetNumber = 69 + Integer.parseInt(targetFormat);

            String targetFormatCode; 
             
            targetFormatCode = "0000".substring(targetFormat.length()) + targetNumber;
            targetFormatCode = "AA" + targetFormatCode;
            return targetFormatCode;
        }

    /**
     * @return the digidriverTextCombined
     */
    public String getDigidriverTextCombined() {
        return digidriverTextCombined;
    }
    
}
