// javac Pair.java && java Pair

public class Pair {

    private Object car, cdr;

    public Pair(Object car, Object cdr) { this.car=car; this.cdr=cdr; }

    public Object car() { return this.car; }
    public Object cdr() { return this.cdr; }

    public static void main(String[] args) {
	Pair p=new Pair(2,3);
	System.out.println(p.car());
	System.out.println(p.cdr());
    }

}
