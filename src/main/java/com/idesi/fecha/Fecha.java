package com.idesi.fecha;

import java.util.Scanner;


public class Fecha {
    public int dia;
    public int mes;
    public int año;
    
    
    
    
    public void leer_fecha(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa tu dia de nacimiento: ");
            dia=in.nextInt();
        System.out.println("Ingresa tu mes de nacimiento: ");
            mes=in.nextInt();
        System.out.println("Ingresa tu año de nacimiento: ");
            año=in.nextInt();
    }
    
    public int validar_fecha(){
        
        if (mes==1 || mes==3 || mes==5 || mes== 7 || mes== 8 || mes==10 || mes==12)
        { if (dia>=1 && dia<=31)
                return 1; 
        
          else
            System.out.println("El mes solo tiene 31 dias");
                return 0; 
        }
        else if (mes==4 || mes==6 || mes==9 || mes== 11)
        { if (dia>=1 && dia<=30)
                return 1; 
          else
            System.out.println("El mes solo tiene 30 dias");
                return 0; 
        }
        else if (mes==2){
            if (dia>=1 && dia<=28)
                return 1; 
            else if (dia == 29)
                    if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                        return 1;
                } else {
                    System.out.println("Fecha de febrero invalida");
                    return 0;    
                    }
            else
                System.out.println("El mes solo tiene 28 dias");
                return 0;
                
        }
            
        
        else {
            System.out.println("Solo existen 12 meses");
            return 0;
            
        }
        
    }
    
    public void imprimir_fecha_corta(){
       
        System.out.println("Tu fecha es:"+dia+"/"+mes+"/"+año);
           
    }
    
    public void imprimir_fecha_larga(){
        switch (mes){
            case 1: 
                System.out.println(dia+" de Enero de "+año);
            break;
            case 2: 
                System.out.println(dia+" de Febrero de "+año);
            break;
            case 3: 
                System.out.println(dia+" de Marzo de "+año);
            break;
            case 4: 
                System.out.println(dia+" de Abril de "+año);
            break;
            case 5: 
                System.out.println(dia+" de Mayo de "+año);
            break;
            case 6: 
                System.out.println(dia+" de Junio de "+año);
            break;
            case 7: 
                System.out.println(dia+" de Julio de "+año);
            break;
            case 8: 
                System.out.println(dia+" de Agosto de "+año);
            break;
            case 9: 
                System.out.println(dia+" de Septiembre de "+año);
            break;
            case 10: 
                System.out.println(dia+" de Octubre de "+año);
            break;
            case 11: 
                System.out.println(dia+" de Noviembre de "+año);
            break;
            case 12: 
                System.out.println(dia+" de Diciembre de "+año);
            break;
        }
    
    }
    
    public static void main(String[] args) {
        Fecha ObjFecha1 = new Fecha();
        
        ObjFecha1.leer_fecha();
        
         if(ObjFecha1.validar_fecha() == 1){
            ObjFecha1.imprimir_fecha_corta();
            ObjFecha1.imprimir_fecha_larga();
        } else {
             System.out.println("Por Favor Modifique su Fecha");
        }
    }
}
