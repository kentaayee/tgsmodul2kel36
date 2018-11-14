/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Kent
 */
@Stateless
@LocalBean
public class konversifrekuensi {
    
    String result;
    DecimalFormat a= new DecimalFormat("0.0");
    public String hertz_Kilohertz(double parameter) {
        return result = a.format((parameter)*1/1000);
    }
    public String hertz_Megahertz(double parameter) {
        return result = a.format((parameter)*1/1000000);
    }
    public String hertz_Gigahertz(double parameter) {
        return result = a.format((parameter)*1/1000000000);
    }
    public String kilohertz_Hertz(double parameter) {
        return result = a.format((parameter)*1000/1);
    }
    public String kilohertz_Megahertz(double parameter) {
        return result = a.format((parameter)*1000/1000000);
    }
    public String kilohertz_Gigahertz(double parameter) {
        return result = a.format((parameter)*1000/1000000000);
    }
    public String megahertz_Hertz(double parameter) {
        return result = a.format((parameter)*1000000/1);
    }
    public String megahertz_Kilohertz(double parameter) {
        return result = a.format((parameter)*1000000/1000);
    }
    public String megahertz_Gigahertz(double parameter) {
        return result = a.format((parameter)*1000000/1000000000);
    }
    public String gigahertz_Hertz(double parameter) {
        return result = a.format((parameter)*1000000000/1);
    }
    public String gigahertz_Kilohertz(double parameter) {
        return result = a.format((parameter)*1000000000/1000);
    }
    public String gigahertz_Megahertz(double parameter) {
        return result = a.format((parameter)*1000000000/1000000);
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
