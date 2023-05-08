public class Static {
    int multifly(int a , int b )
    {
        return a * b ;
    }
    static int sum(int a , int b ){
        return a + b ;
    }
}
class Test {
    public static void main(String[] args) {
        Static s = new Static();
        System.out.println("4 x 8 = " + s.multifly(4,8));
        System.out.println( "4 + 8 = " + Static.sum(4,8));
    }
}
