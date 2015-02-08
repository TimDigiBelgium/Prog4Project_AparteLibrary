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
public class CreateSummaryFile {
    private String completeSummary;
    private List<LabelFormat> labelformats;

    public CreateSummaryFile(List<LabelFormat> labelformats) {
        this.labelformats = labelformats;
        this.completeSummary = "";
        fillSummary();
        System.out.println(completeSummary);
    }
    
    private void fillSummary(){
        for (int i = 0; i < this.labelformats.size(); i++) {
            this.completeSummary = this.completeSummary + "\n" + this.labelformats.get(i).toString();
            this.completeSummary = this.completeSummary + "\n" + this.labelformats.get(i).getSummary() +"\n";
            
    
    }
    
    }

    /**
     * @return the completeSummary
     */
    public String getCompleteSummary() {
        return completeSummary;
    }
}
