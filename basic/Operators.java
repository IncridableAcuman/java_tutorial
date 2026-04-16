public class Operators {
    public static void main(String[] args) {
//        1. Arifmetik Operatorlar

        int a = 10;
        int b = 5;
        System.out.println("Arifmetic Operators:");
        System.out.println(a - b);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


//        2. Assigment yoki O'zlashtirish Operatorlari
        System.out.println("Assigment Operators");
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
        System.out.println(a=b);

//        3. Mantiqiy Logical Operatorlari
        System.out.println("Logical Operators");
        System.out.println(a>8 && (a%b==0));
        System.out.println(a>=10  || b>=10);

//        4. Solishitish yoki Comparasion Operatorlari
        System.out.println("Comparision Operators");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a!=b);
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }
}