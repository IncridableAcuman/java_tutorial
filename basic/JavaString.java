
// Strings in Java
import  java.util.*;
public class JavaString {
    public static void main(String[] args) {
        /*
        *   Berilgan satr uzunligini aniqlang (length()).
            Satrni katta harflarga o‘tkazing (toUpperCase()).
            Satrni kichik harflarga o‘tkazing (toLowerCase()).
            Satr boshidagi va oxiridagi bo‘sh joylarni olib tashlang (trim()).
            Berilgan satr ichida ma’lum bir belgining nechta ekanini aniqlang.
            Satrni teskari qilib chiqaring (charAt() yordamida).
            Satr ichida berilgan so‘z bor-yo‘qligini tekshiring (contains()).
            Satrning boshidan ma’lum qismni ajratib oling (substring()).
            Satr oxiri berilgan so‘z bilan tugaydimi tekshiring (endsWith()).
            Satr boshida berilgan so‘z bormi tekshiring (startsWith()).
            Satr ichidagi barcha bo‘sh joylarni olib tashlang (replace()).
            Berilgan satrni vergul (,) bo‘yicha bo‘lib massivga ajrating (split()).
            Ikki satr teng yoki teng emasligini tekshiring (equals()).
            Ikki satrni katta-kichik harflarni hisobga olmasdan solishtiring (equalsIgnoreCase()).
            Satr ichida birinchi uchragan belgining indeksini toping (indexOf()).
            Oxirgi uchragan belgining indeksini toping (lastIndexOf()).
            Satrni belgilar massiviga aylantiring (toCharArray()).
            Satr ichidagi barcha raqamlarni olib tashlang (replaceAll()).
            Satr faqat harflardan iborat ekanligini tekshiring (matches() bilan regex ishlatib).
            Satrni berilgan belgiga qarab ikkiga bo‘ling va ikkala qismini alohida chiqarish.
        * */
        String username = " Incridable ";
//        string of size
        System.out.println(username.length());
//        to upper case
        System.out.println(username.toUpperCase());
//        to lower case
        System.out.println(username.toLowerCase());
//        remove space of string
        System.out.println(username.trim());
// counting some character of string
        char character = 'a';
        int count = 0;
        for (int i=0;i<username.length();i++){
            if (username.charAt(i) == character){
                count++;
            }
        }
        System.out.println(count);

        char searchChareacter = 'i';

        long  icount = username.chars().filter(c->c == searchChareacter).count();
        System.out.println(icount);
//      reverse string
        for (int i=0;i<username.length();i++){
            System.out.print(username.charAt(username.length()- i - 1));
        }
        System.out.println();
// containing something word of string
        String text = "Assalomu Aleykum barchaga sog'liq omonlik tilayman.";
        String text2 = text;
        String word = "al";
        System.out.println(text.toLowerCase().contains(word));
//        substring of string
        System.out.println(text2.substring(0,5));
//       ending with something word
        System.out.println(text2.endsWith("tilayman."));
//        starting with something word
        System.out.println(text2.startsWith("Assalomu"));
//        removing space with replace method
        System.out.println(text2.replace(" ",""));
//        spling with coma and pushing to array
        System.out.println(Arrays.toString(text.replace(" ",",").split(",")));
//      is equal two string
        System.out.println(text.equals(text2));
//        is equal ignore case two string
        System.out.println(text.equalsIgnoreCase(text2));
//        finding first  index of character
        System.out.println(text.indexOf(character));
//        finding last index of character
        System.out.println(text.lastIndexOf(character));
//       string to characters array
        System.out.println(text.toCharArray());
//        replaceAll()
        String matn = "qwerty1234";
        System.out.println(matn.replaceAll("[0-9]",""));
//        Checking string to only word
        String content = "qwerty";
        String regex = "[A-Za-z]+";
        System.out.println(content.matches(regex));
//      ikkiga bo'lish
        String fruits = "apple,banana,orage,peach";
        String symbol = ",";
        String [] qism = fruits.split(symbol,2);

        if (qism.length >=2){
            System.out.println("First: " + qism[0]);
            System.out.println("Second: " + qism[1]);
        }
    }
}