
package lab3p2_mariapadilla;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Lab3P2_MariaPadilla {
static Scanner leer=new Scanner (System.in);
static ArrayList <Pokemon> pokemon =new ArrayList();
static ArrayList <Pokeball> pokebola =new ArrayList();
static Random ran=new Random();
    
    public static void main(String[] args) {
       
        System.out.println(" GOTTO CATCH Em All ");
        System.out.println(" --- MENU PRINCIPAL --- ");
        System.out.println(" 1. Crear Pokemon: ");
        System.out.println(" 2. Crear Pokebola: ");
        System.out.println(" 3. Listar Pokemon: ");
        System.out.println(" 4. Eliminar Pokemon: ");
        System.out.println(" 5. Capturar Pokemon: ");
        System.out.println(" 6. Modificar Pokemon: ");
        System.out.println(" 7. Salir: ");
        int op=leer.nextInt();
        while (op>0 && op<7){
            switch (op){
                case 1:
                    crear();
                    break ;
                case 2:
                    pokebola();
                    break;
                case 3:
                    listar();
                    
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    simulacion();
                    
                    break;
                    
                   
                        
                 
            
                    
            
            
            
        
        
        
        
        
       
    }
        System.out.println(" GOTTO CATCH Em All ");
        System.out.println(" --- MENU PRINCIPAL --- ");
        System.out.println(" 1. Crear Pokemon: ");
        System.out.println(" 2. Crear Pokebola: ");
        System.out.println(" 3. Listar Pokemon: ");
        System.out.println(" 4. Eliminar Pokemon: ");
        System.out.println(" 5. Capturar Pokemon: ");
        System.out.println(" 6. Modificar Pokemon: ");
        System.out.println(" 7. Salir: ");
         op=leer.nextInt();
    
}// fin while 1
            }
    
    
    public static void crear (){
        int pok=0;
        while (pok!=4){
            System.out.println(" 1. [Fire type] ");
            System.out.println(" 2. [Water Type] ");
            System.out.println(" 3. [Grass Type] ");
            System.out.println(" 4. Salir ");
            System.out.println(" .Ingrese su opcion ");
            pok=leer.nextInt();
            
            switch (pok){
                case 1:
                     System.out.println(" Ingrese su nombre ");
                        String nombre=leer.next();
                        System.out.println(" Ingrese su numero de entrada en la pokedex ");
                        String numero=leer.next();
                        System.out.println(" Ingrese su naturaleza ");
                        String naturaleza=leer.next();
                        if (naturaleza.equalsIgnoreCase("Timido") || naturaleza.equalsIgnoreCase("Energetico ") || naturaleza.equalsIgnoreCase("Misterioso") ){

                         } else {

                         System.out.println(" Naturaleza no valida ");
                         System.out.println(" Ingrese su naturaleza ");
                         naturaleza=leer.next();
                         }
                         System.out.println(" Ingrese su potencia: ");
                         int potencia=leer.nextInt();
                         FireType fire=new FireType (potencia,nombre,numero,naturaleza,false);
                           pokemon.add(fire);
                    
                    
                    break;
                    
                case 2:
                     System.out.println(" Ingrese su nombre ");
                     nombre=leer.next();
                     System.out.println(" Ingrese su numero de entrada en la pokedex ");
                     numero=leer.next();
                     System.out.println(" Ingrese su naturaleza ");
                     naturaleza=leer.next();
                        if (naturaleza.equalsIgnoreCase("Timido") || naturaleza.equalsIgnoreCase("Energetico ") || naturaleza.equalsIgnoreCase("Misterioso") ){

                         } else {

                         System.out.println(" Naturaleza no valida ");
                         System.out.println(" Ingrese su naturaleza ");
                         naturaleza=leer.next();
                         }
                         System.out.println(" Ingrese la rapidez en el agua ");
                         int rapi=leer.nextInt();
                         WaterType water=new  WaterType(rapi,false,nombre,numero,naturaleza,false);
                         pokemon.add(water);
                        
                   
                    
                    break;
                case 3:
                      System.out.println(" Ingrese su nombre ");
                      nombre=leer.next();
                      System.out.println(" Ingrese su numero de entrada en la pokedex ");
                      numero=leer.next();
                     System.out.println(" Ingrese su naturaleza ");
                       naturaleza=leer.next();
                        if (naturaleza.equalsIgnoreCase("Timido") || naturaleza.equalsIgnoreCase("Energetico ") || naturaleza.equalsIgnoreCase("Misterioso") ){

                         } else {

                         System.out.println(" Naturaleza no valida ");
                         System.out.println(" Ingrese su naturaleza ");
                         naturaleza=leer.next();
                         }
                         System.out.println(" Ingrese su habitad: ");
                         String habitad=leer.next();
                         System.out.println(" Ingrese su dominio: ");
                         int dominio=leer.nextInt();
                         GrassType grass=new GrassType(habitad, dominio, nombre, numero, naturaleza, false);
                         pokemon.add(grass);
                   
                    
                    break;
            
            
            
            }
        
    
        }
    
    
    }
    public static void pokebola (){
            System.out.println(" Ingrese su color ");
            String color=leer.next();
            System.out.println(" Ingrese el numero de serie ");
            String serie=leer.next();
            System.out.println(" Ingres su eficiencia atrapando ");
            int efi=leer.nextInt();
            if (efi>= 1 && efi<=3){
                        
            }else {
            System.out.println(" Nivel de eficiencia no valido ");
            System.out.println(" Ingrese su eficiencia atrapando ");
            efi=leer.nextInt();
            }
             Pokeball pb=new Pokeball (color, serie, efi);  
             pokebola.add(pb);
    
    
    
    }
    
    
    public static void listar(){
        for (Pokemon pokem : pokemon) {
            System.out.println(pokem.toString());
            
        }
    
    }
    
    public static void eliminar (){
        int pok=0;
        while (pok!=4){
            System.out.println(" 1. [Fire type] ");
            System.out.println(" 2. [Water Type] ");
            System.out.println(" 3. [Grass Type] ");
            System.out.println(" 4. Salir ");
            System.out.println(" .Ingrese su opcion ");
            pok=leer.nextInt();
            switch (pok){
                case 1:
                    for (int i = 0; i < pokemon.size(); i++) {
                        if (pokemon.get(i) instanceof FireType) {
                             System.out.println(i+ "->"+pokemon.get(i).toString());
                        }     
                     }
                    
                    System.out.println(" Ingrese el indice:  ");
                    int index=leer.nextInt();
                     for (int i = 0; i < pokemon .size(); i++){
                         if (index>=0 && index<=pokemon.size()){
                             if (pokemon.get(index) instanceof FireType){
                                pokemon.remove(index);
                             
                             }
                         
                         }else {
                             System.out.println(" Indice fuera de rango ");
                         
                         }
                     
                     
                     }
                    
                    break;
                case 2:
                    for (int i = 0; i < pokemon.size(); i++) {
                        if (pokemon.get(i) instanceof WaterType) {
                             System.out.println(i+ "->"+pokemon.get(i).toString());
                        }     
                     }
                    
                    System.out.println(" Ingrese el indice:  ");
                    index=leer.nextInt();
                     for (int i = 0; i < pokemon .size(); i++){
                         if (index>=0 && index<=pokemon.size()){
                             if (pokemon.get(index) instanceof WaterType){
                                 pokemon.remove(index);
                             
                             }
                         
                         }else {
                             System.out.println(" Indice fuera de rango ");
                         
                         }
                     
                     
                     }
                    
                    break;
                case 3:
                    for (int i = 0; i < pokemon.size(); i++) {
                        if (pokemon.get(i) instanceof GrassType) {
                             System.out.println(i+ "->"+pokemon.get(i).toString());
                        }     
                     }
                    
                    System.out.println(" Ingrese el indice:  ");
                    index=leer.nextInt();
                     for (int i = 0; i < pokemon .size(); i++){
                         if (index>=0 && index<=pokemon.size()){
                             if (pokemon.get(index) instanceof GrassType){
                                 pokemon.remove(index);
                             
                             }
                         
                         }else {
                             System.out.println(" Indice fuera de rango ");
                         
                         }
                     
                     
                     }
                    
                    break;
                    
            
            }
        
        
        
        
        }
    
    
    }
    public static void simulacion (){
        //ArrayList<Pokemon> pokemonesDisponibles = new ArrayList<>();
        Pokemon p=new Pokemon();
        for (int i = 0; i < pokebola.size(); i++) {
            if (pokebola.get(i) instanceof Pokeball) {
                    System.out.println(i+ "->"+pokebola.get(i).toString());
                }     
           }
        
     
            System.out.println(" EL POKEMON HA APARECIDO ");
            System.out.println(" Desea utilizar la pokebola para capturar o huir [s/S]");
            char opcion = leer.next().charAt(0);
            if (opcion=='s' || opcion=='S'){
                System.out.println(" Ingrese el indice:  ");
                int index=leer.nextInt();
                 if (index >= 0 && index < pokebola.size()) {
                 Pokeball pok = pokebola.get(index);
                 int random = 1 + ran.nextInt(3);
             
        if (pok.eficiencia==2 ){
            random=ran.nextInt(3);
            if(random==1){
                p.setAtrapado(true);
                pokebola.remove(index);
                System.out.println(" Has atrapado a "+ pokemon.get(0).getNombre());
            }else if (random==2){
                 p.setAtrapado(true);
                  pokebola.remove(index);
            }else {
                System.out.println(" No has capturado a ninguno "+pokemon.get(0).getNombre());
                
            }
       
    
    } else if (pok.eficiencia==1 ){
            random=ran.nextInt(3);
            if(random==1){
                p.setAtrapado(true);
                pokebola.remove(index);
                System.out.println(" Has atrapado a "+pokemon.get(0).getNombre());
            }else if (random==2){
                System.out.println(" No has capturado a ninguno ");
            }else {
                System.out.println(" No has capturado a ninguno ");
                
            }
    }
        else if (pok.eficiencia==3 ){
            random=ran.nextInt(3);
            if(random==1){
                p.setAtrapado(true);
                pokebola.remove(index);
                System.out.println(" Has atrapado a "+pokemon.get(0).getNombre());
            }else if (random==2){
                 pokebola.remove(index);
                p.setAtrapado(true);
                System.out.println(" Has atrapado a "+pokemon.get(0).getNombre());
            }else {
                 pokebola.remove(index);
                p.setAtrapado(true);
                System.out.println(" Has atrapado a "+pokemon.get(0).getNombre());
                
            }
    }
}
            
            }else {
                System.out.println(" Has decidio huir del encuentro");
                System.out.println(" Option no valida ");
            
            
            }
        
      
        }
    
    
    }
           
        
 
            
        
