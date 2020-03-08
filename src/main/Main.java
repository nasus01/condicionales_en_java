package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner teclado =new Scanner(System.in);

        System.out.println("selecciona una opcion:");
        System.out.println("");
        System.out.println("1. desayuno 4.000");
        System.out.println("2. almuerzo 10.000");
        System.out.println("3. cena 8.000");

        int opcion=teclado.nextInt();

        if(opcion==1){
            System.out.print("paga 4000 por el desayuno.");

        }else if(opcion==2){
            System.out.print("paga 10.000 por el almuerzo.");

        }else  if(opcion==3){
            System.out.print("paga 8.000 por la cena.");

        }else {
            System.out.println("opcion incorrecta.");

        }

        switch (opcion){
            case 1:
                System.out.println("paga 4000 por el desayuno.");
                break;
            case 2:
                System.out.println("paga 10.000 por el almuerzo.");
                break;
            case 3:
                System.out.println("paga 8.000 por el cena.");
                break;

            default:
                System.out.println("opcion incorrecta.");

                break;

        }

        System.out.println("ingresa tu edad");
        int edad = teclado.nextInt();

        if(edad >=0 && edad <=3){
            System.out.println("es un bebe");

        }else  if(edad >=4 && edad <=7){
            System.out.println("es un niño");

        }else   if(edad >=8 && edad <=14){
            System.out.println("es un adolecente");

        }else   if(edad >=15 && edad <=20){
            System.out.println("es un joven");

        }else   if(edad >=21 && edad <=40){
            System.out.println("es un adulto");

        }else   if(edad >=41 ){
            System.out.println("es un anciono");

        }else {
            System.out.println("edad icorrecta");

        }






    }
}
