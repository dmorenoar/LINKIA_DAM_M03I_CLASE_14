/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c14;
import linkia_dami_c14.Utilidades;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Crear un control en el setter

        Utilidades.pideEntero("Intro opción");
        
        //Crear un array en frío
        String[] poderes = new String[3];
        poderes[0] = "Kamehameha";
        poderes[1] = "Técnica de Kaito";
        poderes[2] = "Bola Universal";
                
        String[] poderes2 = new String[]{"Kamehameha","Técnica de Kaito", "Ataque de energia"};

        //Crear array en caliente
        
        Heroe goku = new Heroe("Son Goku", new String[]{"Kamehameha","Técnica de Kaito", "Bola Universal"});
        
        Heroe vegetta = new Heroe("Vegetta", poderes2);
        
        /*Creamos un heroe recibiendo otro heroe, es como decir que goku es en quien debe fijarse Krilin
        para ser un heroe*/
        /*Heroe krilin = new Heroe(goku);
        
        System.out.println("Dime toda la info de Krilin:" + krilin.toString());*/
        
      
        System.out.println("Dime toda la info de Goku:" + goku.toString());
        
        //System.out.println("Son iguales los heroes:" + goku.equals(vegetta));
       
        goku.setPoder("Kamehameha ULTRA", 0);
        
        System.out.println("Dime toda la info de Goku:" + goku.toString());
        
        goku.resetPoder(0);
        
     
        System.out.println("Dime toda la info de Goku:" + goku.toString());
        
        
        System.out.println("MOSTRAR PODERES DE FORMA 1");
        goku.mostrarPoderesHeroeForma1(goku);
        
        System.out.println("PODERES DE GOKU");
        System.out.println(goku.mostrarPoder(0, goku.getPoderes()));
        
        System.out.println("MOSTRAR PODERES DE FORMA 2");
        goku.mostrarPoderesHeroeForma1(goku);
        
        
    }
    
    
}
