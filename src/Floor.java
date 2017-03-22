import java.util.Scanner;

/**
 * Created by lotalorafox on 3/21/2017.
 */
public class Floor {
    Scanner sc = new Scanner(System.in);
    private Room[] H;
    private int id;

    public Floor(int n,int d){
        H = new Room[n];
        this.id = d;
        for (int i = 0 ;i<n;i++) {
            System.out.println("ingresa la capacidad de la habitacion " + id + "0" +(i+1));
            int c = sc.nextInt();
            String di = id + "0" + (i+1);
            H[i] = new Room(c,di);

        }
    }

    public void listRooms(){
        System.out.println("En el piso " + id + " hay " + H.length + " habitaciones");
        for (int i=0;i<H.length;i++){
            System.out.println("    la habitacion " + H[i].getCod() + " con capacidad para: " + H[i].getCapacity());
        }
    }
    public Room getRoom(int code){
        for (int i=0;i<H.length;i++){
            if((i+1) == code){
                return H[i];
            }
        }
        return null;
    }


}
