
// Strings in Java

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
        System.out.println(username.length());
        System.out.println(username.toUpperCase());
        System.out.println(username.toLowerCase());
        System.out.println(username.trim());

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
    }
}