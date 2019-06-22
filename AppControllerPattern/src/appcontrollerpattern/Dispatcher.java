/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrollerpattern;

/**
 *
 * @author hiramtodd
 */
public class Dispatcher {
    private PeanutsReview Peanuts;
    private CreedReview Creed;
    private SpectreReview Spectre;
    
    public Dispatcher() {
        Peanuts = new PeanutsReview();
        Creed = new CreedReview();
        Spectre = new SpectreReview();
    }
    
    public void dispatch(String request) {
        if(request.equalsIgnoreCase("Peanuts")) {
            Peanuts.show();
        } else if(request.equalsIgnoreCase("Creed")) {
            Creed.show();
        } else {
            Spectre.show();
        }
    }
}
