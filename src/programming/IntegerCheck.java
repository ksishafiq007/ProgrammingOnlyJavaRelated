package programming;

public class IntegerCheck {
    public static void main(String[] args) {
        long l=5;
        Integer i=6;
        Double d=7.0;
        System.out.println("long= "+l+"\n"+"Integer= "+i+"\n"+"Double= "+d);
        Double d2= (double) l;
        Double d3=new Double(i);
        System.out.println("Double d2= "+d2+"\n"+"Double d3= "+d3);

    }
}
