import java.util.Scanner;

/**
 * Created by lotalorafox on 3/21/2017.
 */
public class Rental {
    Scanner sc = new Scanner(System.in);
    private Person[] Occupants;
    private  Person Responsable;
    private Datef f;
    private Room R;
    private float Pricef;
    private int avaible;
    private int ocupated;
    private int registrated=0;
    boolean print = false;


    public Rental(Room h,Datef fa){
        R = h;
        this.f =fa;
        this.avaible = this.R.getCapacity();
        this.ocupated = 0;
    }

    public void PersonData(){
        System.out.println("ingresa el numero de ocupantes :");
        int oc = sc.nextInt();
        registrated+=oc;

        if(avaible !=0) {
            this.Occupants = new Person[oc];
            System.out.println("ingresa los datos del ocupante responsable, nombre: ");
            String n = sc.next();
            System.out.println("ingresa la cedula: ");
            double c = sc.nextDouble();
            System.out.println("ingresa el telefono: ");
            double t = sc.nextDouble();
            Occupants[ocupated] = new Person(n, c, t);
            Responsable = Occupants[0];
            for (int i = (ocupated) + 1; i < registrated; i++) {
                System.out.println("ingresa el nombre del ocupante " + (i + 1) + " :");
                n = sc.next();
                System.out.println("ingresa la cedula: ");
                c = sc.nextDouble();
                System.out.println("ingresa el telefono: ");
                t = sc.nextDouble();
                Occupants[i] = new Person(n, c, t);
            }
            ocupated += oc;
            this.avaible = this.avaible-oc;
            this.print = true;
        }else{
            System.out.println("la habitacion " + R.getCod() + " no esta disponible");
        }
    }

    public void checkIn(){
        if((this.f.month == 6) ||(this.f.month == 7)||(this.f.month ==12 )||(this.f.month == 1)){
            if(print) {
                System.out.println("es temporada alta asi que la habitacion vale el doble");
                System.out.println("el precio por ocuopante es de: ");
                float p = R.getPrice() * 2;
                System.out.print(p);
                this.Pricef = p * this.Occupants.length;
                System.out.println("Precio total: " + Pricef);
                this.print = false;
            }
        }else{
            if(print) {
                System.out.println("el precio por ocuopante es de: ");
                float p = R.getPrice();
                System.out.print(p);
                this.Pricef = p * this.Occupants.length;
                System.out.println(" Precio total: " + Pricef);
                this.print = false;
            }
        }
    }

    public Datef getF() {
        return f;
    }

    public Person getResponsable() {
        return Responsable;
    }

    public Person[] getOccupants() {
        return Occupants;
    }

    public Room getR() {
        return R;
    }

    public float getPricef() {
        return Pricef;
    }
    public void getOcupantslist(){
        for (int i=0;i<this.getOccupants().length;i++){
            System.out.println("la persona: " + this.Occupants[i].getName() + " documento: " + this.Occupants[i].getDoc() + " telefono: " + this.Occupants[i].getTel()) ;
        }
    }
}
