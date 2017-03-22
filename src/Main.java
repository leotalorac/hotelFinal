/**
 * Created by lotalorafox on 3/21/2017.
 */

import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        boolean f  = true;
        int a,b,c;
        System.out.println("Configura el hotel inicial");
        System.out.println("ingresa el numero de habitaciones del piso 1:");
        a = sc.nextInt();
        System.out.println("ingresa el numero de habitaciones del piso 2:");
        b = sc.nextInt();
        System.out.println("ingresa el numero de habitaciones del piso 3:");
        c = sc.nextInt();
        Hotel h = new Hotel(a,b,c);
        f = false;
        while(t){



            System.out.println("Que quieres realizar:");
            System.out.println("1: Rentar habitacion ");
            System.out.println("2: Listar personas en la habitacion ");
            System.out.println("3: salir");
            int o = sc.nextInt();
            switch(o){
                case 1:
                    System.out.println("ingresa la fecha de hoy");
                    int f1 = sc.nextInt();
                    int f2 = sc.nextInt();
                    int f3 = sc.nextInt();
                    Datef today = new Datef(f1,f2,f3);
                    h.Rent(today);
                    break;
                case 2:
                    h.list();
                    break;
                case 3:
                    t = false;
                    break;

            }
        }




    }
}

