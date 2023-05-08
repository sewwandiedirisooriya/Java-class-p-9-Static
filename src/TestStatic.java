public class TestStatic {
    static int age;
    static void show(){
        System.out.println("'This is Static Method' ");
    }

    public static void main(String[] args) {
        age = 24;
        System.out.println("Age is : " + age);
        show();
    }

}
