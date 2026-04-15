public class TypeCasting {
    public static void main(String[] args) {
//        Widening Casting(Automatic)
        int x = 5;
        double t = x; // automatic casting
        System.out.println(t);

//        Narrowing Casting(Manual)
        double h = 12.5d;
        int y = (int) h; // manual casting
        System.out.println(y);
    }
}