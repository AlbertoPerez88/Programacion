/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum modelosBMW {
    //nºcilindros y nºcaballos
    SERIE1(3, 130),
    SERIE2(4, 150),
    SERIE3(4, 150),
    SERIE4(4, 170),
    SERIE5(4, 200),
    SERIE6(6, 220),
    SERIE7(6, 270);
    
    private int numCilindros; 
    private int numCaballos; 
    
    private modelosBMW(int numCilindros, int numCaballos){
        this.numCilindros = numCilindros;
        this.numCaballos = numCaballos;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public int getNumCaballos() {
        return numCaballos;
    }
    
}
