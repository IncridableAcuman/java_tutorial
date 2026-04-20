import java.util.*;
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

            /*
    Ikki sonni qo‘shish va natijani chiqarish
    Ikki sonning ayirmasini hisoblash
    Uchta sonning ko‘paytmasini topish
    Ikki sonni bo‘lish va butun qismini aniqlash
    Sonning qoldig‘ini (%) topish
    Berilgan sonning kvadratini va kubini hisoblash
    Ikki sonning o‘rtacha qiymatini topish
    Sonni 10 ga bo‘lgandagi oxirgi raqamini aniqlash
    Ikki xonali sonning raqamlar yig‘indisini topish
    Berilgan sekundni soat, minut va sekundga ajratish
    * */

        // -----------------------------------------------
        //  Ikki sonni qo‘shish va natijani chiqarish

        int x = 5;
        int y = 25;
        int z = x + y;
        System.out.println(z);
        // -----------------------------------------------
        //  Ikki sonning ayirmasini hisoblash
        if (x>y){
            System.out.println(x - y);
        } else {
            System.out.println( y - x);
        }
        // -----------------------------------------------
        //  Uchta sonning ko‘paytmasini topish
        int result = x * y * z;
        System.out.println(result);
        //  Ikki sonni bo‘lish va butun qismini aniqlash
        // -----------------------------------------------
        //     Ikki sonni bo‘lish va butun qismini aniqlash
        int natija = z/x;
        System.out.println(natija);
        // -----------------------------------------------
        //     Sonning qoldig‘ini (%) topish
        int mod = y % z;
        System.out.println(mod);
        // -----------------------------------------------
        //     Berilgan sonning kvadratini va kubini hisoblash
        int kvadrat = x * x;
        int kub = x * x * x;
        System.out.println(kvadrat);
        System.out.println(kub);
        // -----------------------------------------------
        //     Ikki sonning o‘rtacha qiymatini topish
        int urtacha = (x + y) / 2;
        System.out.println(urtacha);
        // -----------------------------------------------
        // Sonni 10 ga bo‘lgandagi oxirgi raqamini aniqlash
        int rst = 12345 % 10;
        System.out.println("Natija:" + rst);
        // -----------------------------------------------
        // Ikki xonali sonning raqamlar yig‘indisini topish
        int d = 21;
        System.out.println(sumDigit(d));
        // -----------------------------------------------
        //Berilgan sekundni soat, minut va sekundga ajratish
        int totalSeconds = 3665;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(" Total seconds: " + totalSeconds + " second= " + seconds + " minute= " + minutes + " hour= " + hours);
    }
    public static int sumDigit(int n){
        int s = 0;
        while (n>0){
            s += n % 10;
            n/=10;
        }
        return s;
    }
}