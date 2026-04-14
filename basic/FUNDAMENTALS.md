## Learning Java Basic
** *
### Java Haqida:
Java - mashxur va kuchli dasturlash tili hisoblanadi.U 1995-yilda yaratilgan.
Hozirgi kunda Java Oracle kampaniyasiga tegishli va 3 milliarddan ortiq
qurilmalarda ishlaydi.U quyidagi holatlarda keng foydalaniladi.

* Mobile Application
* Web Application
* Desktop Application
* Web servers and application servers
* Games 
* Database connections
** *
### Nega Java foydali?
* Ochiq kodli(Open Source)
* Bepul(Freee)
* Turli platforma(Windows,Linux,MacOS) larda ishlash imkoniyati
* O'rganish oson
* Xavfsiz va kuchli

### Sytaksis
```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

```
* The main Method
```
public static void main(String[] args)
```
** *
public static void main(String[] args)
— bu Java dasturining boshlang‘ich nuqtasi (entry point) hisoblanadi. Java Virtual Mashinasi (JVM) dasturni ishga tushirganda aynan shu metodni qidiradi va birinchi bo'lib uni bajaradi. 
U dastur kodini ishga tushirish uchun zarur bo'lgan asosiy boshqaruvchi funksiya vazifasini bajaradi.
Asosiy qismlarning vazifalari:

* **public**: Metodga JVM (tashqi jarayon) tomonidan istalgan joydan kirish mumkinligini ta'minlaydi.
* **static**: Metod sinfga tegishli bo'lib, uni ishga tushirish uchun obyekt yaratish shart emasligini bildiradi.
* **void**: Metod hech qanday qiymat qaytarmasligini anglatadi.
* **main**: JVM tomonidan taniladigan maxsus metod nomi.
* **String[] args**: Dastur ishga tushayotganda buyruqlar satridan (terminaldan) argumentlar qabul qilish uchun xizmat qiladigan Stringlar massivi. 

## **Output**
Ushbu metodsiz mustaqil Java ilovalarini ishga tushirib bo'lmaydi.
** *
```
System.out.println()
```
* System - O'rnatilgan java classi
* out - System a'zosi output'ning qisqartmasi
* println() - print line qisqartmasi bo'lgan method
###### Print Text:
```java
public class Output {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("Hello World");
    }
}
```
```plantuml
Hello, Java!
Hello World
```
* println() - da qiymatlar yangi qatordan chiqadi.

```java
public class Output {
    public static void main(String[] args) {
        System.out.print("Hello, Java!");
        System.out.print("Hello World");
    }
}
```
```plantuml
Hello, Java!Hello World
```
* print() - da qiymatlar bir qatorda chiqadi yangi qator tashlanmaydi.

###### Print Numbers:
```java
public class Output {
    public static void main(String[] args) {
        System.out.println("Single: " + 12345);
        System.out.println("Addition: " + (1+2));
        System.out.println("Subtraction: " + (5-1));
        System.out.println("Multiplication: " + (2*3));
        System.out.println("Division: " + (4/2));
    }
}
```
```plantuml
Single: 12345
Addition: 3
Subtraction: 4
Multiplication: 6
Division: 2
```

### Java Comments
Javada commentlar kodni o'qishni va tushintirishni osonlashtirish
uchun foydalaniladi.
Javada commentlar ikki xil bo'ladi:
1. Single Line Comment
2. Multi Line Comment

###### Single Line Comment:
```java
public class Main {
    static void main() {
        System.out.println("Hello World"); // This is single line comment
    }
}
```
###### Multi Line Comment:
```java
public class Main{
    static void main() {
        /*
         * This is multi line comment
         * 
         * */
        System.out.println("Hello world");
    }
}
```
### Variables(O'zgaruvchilar)
O'zgaruvchilar - bu kompyuter xoturasida ma'lumotlarni
saqlash uchun mo'ljallangan joylardir.O'zgaruvchilarni 
asosiy xususiyati quyidagilar hisoblanadi:
* Data type() - o'zgaruvchi biror turga tegishli bo'lishi kerak
masalan (int,float,String)
* Variable Name - o'zgaruvchini  yagona nom bilan e'lon qilish kerak bo'ladi.
albatta maxsus java uchun olinganlardan tashqari
* Qiymat - albatta shu o'zgaruvchi o'zida qiymat saqlashi kerak bo'ladi.
* Xotira - Kompyuter xotirasidagi o'rni

```plantuml
String email = "example@gmail.com"
String password = "1234_code_three"
int age = 12
```
###### O'zgaruvchilar turlari:
O'zgaruvchilar 3 xil turda bo'ladi:
1. Local variables
2. Instance variables
3. Static variables

* **Local Variable** - biror blok yoki methodni tanasida elon
qilingan o'zgaruvchi hisoblanadi.Bu o'zgaruvchi shu methodni
ichida bo'ladi va hech qachon **static** kalit so'zi bilan
e'lon qilinmaydi.
* **Instance Variable** - sinf ichida biroq biror method yoki
blok ichida bo'lmagan o'zgaruvchi hisoblanadi.Sinfdan obyekt
yaratilganda bu o'zgaruvchi ham yaratiladi va xotiradan joy egallaydi.
**Instance** o'zgaruvchilar modificatorlar(pulic,private,protected)
bilan e'lon qilinishi kerak aks holda **default** modificator
default sifatida beriladi.
* **Static Variable** - static kalit so'zi bilan e'lon qilingan 
o'zgaruvchilar hisoblanadi u local o'zgaruvchi hisoblanmaydi.

```java
public class Main {
    static double pi = 3.14; // static variable
    
    void method(){
        int localVariable = 12345; // local variable
    }
    static void main() {
        int quantity = 100; // instance variable
    }
}
```