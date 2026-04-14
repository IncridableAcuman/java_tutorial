public class Variables {
    public static void main(String[] args) {
        int age = 22;
        System.out.println(age);
        {
            age = 23;
            System.out.println(age);
        }
        System.out.println(age);
    }
}