//TRABAJANDO CON ENUMERACIONES
package com.ceep.principal;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Alumno Mañana
 */
//el metodo que implementamos lo pasamos al enumerado
public class Principal {
    public static void main(String[] args) {
        System.out.println("Mi primer ia de la semana es: " + Dias.LUNES);
        imprimirSemana(Dias.MARTES);
        
        //Asignacion directa a traves de enum
        Dias miDia = Dias.JUEVES;
        
        //Asignacion de un dia en base a un String a traves de valueOf()
        Dias miSegundoDia = Dias.valueOf("VIERNES");
        
        //Declaracion de un listado de dias inicializado con los values de mi Enum
        Dias [] todosMisDias = Dias.values();
        
        //Imprimo el contenido de mi listado de dias
        for(Dias d: todosMisDias){
            System.out.println("d = " + d);
        }
        
        //VISUALIZANDO UN PAIS
        System.out.println("Continente... " + Continentes.AMERICA);
        System.out.println("Numero de paises de AMERICA: " + Continentes.AMERICA.getNumPaises());
        
    }
    
    public static void imprimirSemana(Dias dias){
        switch (dias) {
            case LUNES:
                    System.out.println("PRIMER dia de la semana");
                break;
            case MARTES:
                    System.out.println("SEGUNDO dia de la semana");
                break;
            case MIERCOLES:
                    System.out.println("TERCERO dia de la semana");
                break;
            case JUEVES:
                    System.out.println("CUARTO dia de la semana");
                break;
            case VIERNES:
                    System.out.println("QUINTO dia de la semana");
                break;
            case SABADO:
                    System.out.println("SEXTO dia de la semana");
                break;
            case DOMINGO:
                    System.out.println("SEPTIMO dia de la semana");
                break;
            default:
                System.out.println("NO ES CORRECTO");
        }
    }
}
