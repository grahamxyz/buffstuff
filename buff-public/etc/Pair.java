// javac Pair.java && java Pair

public class Pair {

    private Object car, cdr;

    private Pair(Object car, Object cdr)
        { this.car=car; this.cdr=cdr; }

    public static Pair cons(Object car, Object cdr)
        { return new Pair(car,cdr); }

    public Object car() { return this.car; }
    public Object cdr() { return this.cdr; }

    public static void main(String[] args) {
	Pair p=cons(2,3);
	System.out.println(p.car());
	System.out.println(p.cdr());
    }

}
