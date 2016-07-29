/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.programacaovi;

import br.org.catolicasc.programacaovi.timeservice.TimeService;
import br.org.catolicasc.programacaovi.timeservice.TimeServiceImplService;

/**
 *
 * @author Rodrigo
 */
public class TimeClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeServiceImplService ts = new TimeServiceImplService();
        TimeService s = ts.getTimeServiceImplPort();
        System.out.println("Time elapsed: " + s.getTimeAsElapsed());
        System.out.println("Time string: " + s.getTimeAsString());
    }
    
}
