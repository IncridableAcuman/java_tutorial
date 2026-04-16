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
###### Final keyword:
* **final** - kalit so'zi orqali konstanta qiymatlarni e'lom
qilishda foydalaniladi.
```java
public class Variables {
    static int m = 300; // static variable

    void method(){
        int t=200; // local variable
    }
    public static void main(String[] args) {
        int n = 20; // instance varaible

        String name = "John";
        System.out.println(name);

        final int x = 10;
        System.out.println(x);
        x = 20;
        System.out.println(x);
    }
}
```
```plantuml
Variables.java:13: error: <identifier> expected
    static m = 300; // static variable
            ^
1 error
```
```java
public class Variables {
    public static void main(String[] args) {
        String firstname = "John ";
        String lastname = "Doe";
        String fullname = firstname + lastname;
        System.out.println(firstname); // John
        System.out.println(lastname); // Doe
        System.out.println(fullname); // John Doe
//        For numbers
        int x = 5;
        int y = 15;
        System.out.println(x+y); // 20;

        System.out.println("My name is "+ firstname);
        System.out.println("My sourname is " +lastname);
        System.out.println("My fullname is " + fullname);

//        Mixing text and numbers

        System.out.println("The sum is " + x + y); // 515
        System.out.println("The sum is " + (x+y)); // 20
    }
}
```
```plantuml
Result:

John 
Doe
John Doe
20
My name is John 
My sourname is Doe
My fullname is John Doe
The sum is 515
The sum is 20
```
### Data Types

* **Ma'lumot turi ya'ni data type** - bu xotirada saqlanuvchi o'zgaruvchini
biror tur asosida saqlaymiz.Bir tur bilan e'lon qilingan o'zgaruvchini
javada boshqa turga o'zgartirib bo'lmaydi.Bu bizga xavfsizlik
uchun xizmat qiladi.
* **Data type** - ikkiga bo'linadi:
1. Primitive data type
2. Non-Primitive data type

* **Primitive data type:** - quyidagilar kiradi.
1. byte
2. short
3. int
4. long
5. float
6. double
7. boolean
8. char
* **Non-Primitive data type:** quyidaqgilar kiradi.
1. String
2. Class
3. Interface

###### Nima farqi bor bularni:
* Primitive data type bilan non-primitive data type'ni asosiy
farqi xotirada saqlanishi va qiymat turidadir.Primitive data type
to'g'ridan-to'g'ri haqiqiy qiymatni o'zini saqlaydi.Non-Primitive
data type esa obyektga ishora ya'ni manzilini saqlaydi.
Ma'lumotlar primitive da **Stack** xotirada saqlanadi.
Non=primitive data type da esa **Heap** xotirada saqlanadi.

#### Java Numbers
Javada numbers ikki turga bo'linadi:
1. Integer types
2. Floating point types

###### Integer Types:
1. byte
2. short
3. int
4. long

###### Floating point Type:
1. float
2. doublw

### Javada var kalit so'zi
* Javada var kalit so'zi biror o'zgaruvchini tipini o'zimiz kiritmasdan
kompyator ixtiyoriga topshirish uchun foydalaniladi ya'ni biror
o'zgaruvchini tipini kompplator o'zi actomatik aniqlaydi agar var bilan e'lon qilinsa
```plantuml
var x = 10;
var name = "John";
var arr = new ArrayList<String>();
var map = new HashMap<Integer>();
```
* var kalit so'zi kodni o'qilishini osonlashtirish va local 
o'zgaruvchilarni aniqlashdagina foydalaniladi.

### Type Casting in Java
* Type casting - bu bir turdagi o'zgaruvchini boshqa bir turga
o'tkazish jarayoni hisoblanadi.Type casting 2 xil bo'ladi:
1. Widening Casting(Automatic)
2. Narrowing Casting(Manual)

1. Widening Casting
```plantuml
int x = 5;
double t = x; // This is widening casting for example
```
2. Narrowing Casting
```plantuml
double y = 5.6;
int x = (int) y; // This is narrowing casting for example
```
### Operators in Java
* Operatorlar - o'zgaruvchilar va qiymarlar ustida matematik
yokida arifmetik amallar bajarish uchun foydalaniladigan
maxsus belgilar hisoblanadi.
###### Operatorlarning turlari:
1. Arifmetik
2. Solishtirish
3. Mantiqiy
4. O'zlashtirish
5. Shartli va Boshqaruv operatorlari

##### 1. Arifmetik operatorlar
* Matematik amallar bajarish uchun foydalaniladigan operatorlar hisoblanadi.
Ular quyidagilar hisoblanadi:
* qo'shish(+)
* ayirish(-)
* ko'paytirish(*)
* bo'lish(/)
* qoldiqli bo'lish(%)
###### 2. Solishtirish operatorlar
* Ikki qiymatni bir biri bilan solishtirish uchun foydalaniladigan
operatorlar hisoblanadi va ular true/false qitmat qaytaradi.
1. tenglik(==)
2. katta(>)
3. katta yoki teng(>=)
4. kichik(<)
5. kichik yoki teng(<=)
6. teng emas(!=)
###### Mantiqiy operatorlar
* murakkab shartlarni tekshirish uchun mantiqiy amallar bajaradi
1. and yokida va (&&)
2. or yokida yoki (||)
3. inkor (!)