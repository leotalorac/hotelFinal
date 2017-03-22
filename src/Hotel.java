import java.util.Scanner;

/**
 * Created by lotalorafox on 3/21/2017.
 */
public class Hotel {
    Scanner sc = new Scanner(System.in);
    Floor[] F = new Floor[3];
    Rental[] R = new Rental[50];
    int rented = 0;
    int totalr;

    public Hotel(int a,int b,int c){
        F[0] = new Floor(a,1);
        F[1] = new Floor(b,2);
        F[2] = new Floor(c,3);
        this.totalr = a+b+c;
    }

    public void Rent(Datef fa){
        //no es total r ahy que cambiarlo
        //if(rented<totalr) {
            for (int i = 0; i < 3; i++) {
                F[i].listRooms();
            }
            System.out.println("ingresa el piso y el numero despues del 0 de la habitacion que escogiste: ");
            int p = sc.nextInt();
            int h = sc.nextInt();
            R[rented] = new Rental(F[p - 1].getRoom(h),fa);
            R[rented].PersonData();
            R[rented].checkIn();
            rented++;
        //}
    }

    public void list(){
        for (int i =0;i<rented;i++){
            System.out.println("la habitacion: " + R[i].getR().getCod() + " tiene " + R[i].getOccupants().length + " ocupantes");
            System.out.println("el precio por ocupante es: " +(R[i].getPricef()/R[i].getOccupants().length) + " el precio total: " + R[i].getPricef());
            System.out.println(" se registraron el dia " + R[i].getF().DatePrint() );
            R[i].getOcupantslist();
        }
    }
}
