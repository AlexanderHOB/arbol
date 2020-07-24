/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskwindows;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class DeskWindows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] ruta_1 = {"c","a"};
        String[] ruta_2 = {"c","b"};
        String[] ruta_3 = {"c","a","e"};
        String[] ruta_4 = {"c","a","e","f"};
        String[] ruta_5 = {"c","b","d","e"};
        String[] ruta_6 = {"c","b","d","h"};
        String[] ruta_7 = {"c","u"};
        String[] ruta_8 = {"c","u","x"};

        

        Lista w = new Lista(new Nodo("c",null));
        w.insertar(ruta_1);
        w.insertar(ruta_2);
        w.insertar(ruta_3);
        w.insertar(ruta_4);
        w.insertar(ruta_5);
        w.insertar(ruta_6);
        w.insertar(ruta_7);
        w.insertar(ruta_8);
        w.imprimir();
        while(true){
            
            System.out.println("Inserte dato: ");
            String u;
            Scanner entrada  = new Scanner (System.in);
            u = entrada.nextLine();
            if(u == "fin"){
                break;
            }
            String[] ruta = u.split("/");
            
            w.insertar(ruta);
            w.imprimir();

        }
        
       
       
        
    }
    
}
