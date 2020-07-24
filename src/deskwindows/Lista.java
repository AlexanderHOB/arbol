/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskwindows;

/**
 *
 * @author alexa
 */
class Lista{
    public Nodo inicio;
    private int elementos;
    public Lista(Nodo inicio){
        this.inicio = inicio;
        elementos = 0;
    }
    public void setTop(Nodo top){
        this.inicio = top;
    }
    public void insertar(String[] ruta){
        Nodo actual = inicio;
        for (int i = 0; i<ruta.length;i++) {
            if(i + 1 == ruta.length && actual.getNombre().equals( ruta[i])){
                break;
            }
            
            while(!ruta[i].equals(actual.getNombre())  && actual.getSiguiente()!=null ){
                actual = actual.getSiguiente();
            }
             if(ruta[i].equals(actual.getNombre()) ){

                 if (actual.getLista()!= null){
                     //System.out.println("Ingresando a la lista  " +ruta[i+1]);
                     actual= actual.getLista().inicio;                   
                 }else{
                    if(actual.getLista() == null){             
                        //System.out.println("Creando una lista  " +ruta[i]);
                        //System.out.println("Insetando  " +ruta[i+1]);

                        actual.setLista(new Lista(new Nodo(ruta[i+1],null)));
                        actual = actual.getLista().inicio;
                    }else{
                        //System.out.println("Insertando un nodo a la lista  " +ruta[i]);
                        actual.setSiguiente(new Nodo(ruta[i],null));
                        actual=actual.getSiguiente();
                    } 
                 }
            }else{
                //System.out.println("Insertando un nodo a la lista  " +ruta[i]);
                actual.setSiguiente(new Nodo(ruta[i],null));
                actual=actual.getSiguiente();
             }
                 
        }
    }    
        
    public void lineas(int nivel){
        for(int i=0;i<nivel;i++){
            System.out.print(' ');
        }

    }
    public void imprimirNodos(Nodo nodo,int nivel){
        System.out.println(nodo.getNombre());    
        if(nodo.getLista() != null){
            lineas(nivel);
            System.out.print("|-");
            imprimirNodos(nodo.getLista().inicio,(nivel+2));
        }
        
        if(nodo.getSiguiente() != null){
            lineas(nivel-2);
            System.out.print("|-");
            imprimirNodos(nodo.getSiguiente(),nivel);
          
        }


    }
    public void imprimir(){
       Nodo actual = inicio;
       imprimirNodos(actual,0);
        //System.out.println(actual.getLista());
        /*
        while(actual.getLista() != null){
            actual = imprimirNodos(actual);
        }
        /*
        while (actual.getSiguiente()!= null){
            System.out.println(actual.getNombre());
            actual = actual.getSiguiente();

        }*/
       
       

    }
}
 
