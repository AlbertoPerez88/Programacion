/*
ENUMERADO QUE CONTIENE LOS CONTINENTES DE MI SISTEMA
 */
package enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    
    //CONSTRUCTOR   
    private int numPaises;              //status es por darle un nombre
    
    private Continentes(int numPaises){
        this.numPaises = numPaises;
    }

    public int numPaises() {
        return numPaises;
    }

    public int getNumPaises() {
        return numPaises;
    }

    public void setNumPaises(int numPaises) {
        this.numPaises = numPaises;
    }

}
/*

*/
