/**
 * Created by lotalorafox on 3/21/2017.
 */
public class Room {
    private float Price;
    private String cod;
    private int capacity;
    private int avaible;

    public Room(int c,String d){
        this.capacity = c;
        this.cod = d;
        this.Price = 100/c;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public String getCod(){
        return this.cod;
    }
    public void setPrice(int p){
        this.Price = p;
    }
    public void setAvaible(int c){
        this.avaible =c;
    }
    public float getPrice(){
        return this.Price;
    }

}
