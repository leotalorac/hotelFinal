/**
 * Created by lotalorafox on 3/21/2017.
 */
public class Person {
    String name;
    double doc;
    double tel;

    public Person(String n,double d,double t){
        this.name = n;
        this.doc = d;
        this.tel = t;

    }

    public String getName() {
        return name;
    }

    public double getDoc() {
        return doc;
    }

    public double getTel() {
        return tel;
    }
}
