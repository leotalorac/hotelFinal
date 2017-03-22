/**
 * Created by lotalorafox on 3/21/2017.
 */
public class Datef {
    public int day;
    public int month;
    public int year;

    public Datef(int a,int b,int c){
        this.day = a;
        this.month = b;
        this.year = c;
    }

    public String DatePrint(){
        return day + "/" + month + "/" + year;
    }


}
